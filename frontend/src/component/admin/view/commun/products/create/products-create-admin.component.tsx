import { View, Text, StyleSheet, SafeAreaView, Keyboard, TouchableOpacity } from 'react-native';
import React, { useEffect, useState } from 'react';
import { useForm } from 'react-hook-form';
import CustomInput from '../../../../../../zynerator/CustomInput';
import CustomButton from '../../../../../../zynerator/CustomButton';
import { ScrollView } from 'react-native-gesture-handler';
import { AxiosResponse } from 'axios';
import SaveFeedbackModal from '../../../../../../zynerator/SaveFeedbackModal';
import Collapsible from 'react-native-collapsible';
import FilterModal from '../../../../../../zynerator/FilterModal';
import Ionicons from 'react-native-vector-icons/Ionicons';

import {ProductsAdminService} from '../../../../../../controller/service/admin/commun/ProductsAdminService.service';
import  {ProductsDto}  from '../../../../../../controller/model/commun/Products.model';

import {CategoriesDto} from '../../../../../../controller/model/commun/Categories.model';
import {CategoriesAdminService} from '../../../../../../controller/service/admin/commun/CategoriesAdminService.service';
import {BrandsDto} from '../../../../../../controller/model/commun/Brands.model';
import {BrandsAdminService} from '../../../../../../controller/service/admin/commun/BrandsAdminService.service';

const ProductsAdminCreate = () => {

    const [showSavedModal, setShowSavedModal] = useState(false);
    const [showErrorModal, setShowErrorModal] = useState(false);
    const [isProductsCollapsed, setIsProductsCollapsed] = useState(true);


    const emptyBrands = new BrandsDto();
    const [brandss, setBrandss] = useState<BrandsDto[]>([]);
    const [brandsModalVisible, setBrandsModalVisible] = useState(false);
    const [selectedBrands, setSelectedBrands] = useState<BrandsDto>(emptyBrands);

    const emptyCategories = new CategoriesDto();
    const [categoriess, setCategoriess] = useState<CategoriesDto[]>([]);
    const [categoriesModalVisible, setCategoriesModalVisible] = useState(false);
    const [selectedCategories, setSelectedCategories] = useState<CategoriesDto>(emptyCategories);


    const service = new ProductsAdminService();
    const categoriesAdminService = new CategoriesAdminService();
    const brandsAdminService = new BrandsAdminService();


    const { control, handleSubmit, reset } = useForm<ProductsDto>({
        defaultValues: {
        productId: null ,
        categories: undefined,
        brands: undefined,
        prixVente: null ,
        name: '' ,
        image: '' ,
        commentaire: '' ,
        code: '' ,
        quantite: null ,
        prixPromo: null ,
        prixRevendeur: null ,
        quantiteMarrakech: null ,
        quantiteRabat: null ,
        barCode: '' ,
        },
    });

    const productsCollapsible = () => {
        setIsProductsCollapsed(!isProductsCollapsed);
    };

    const handleCloseBrandsModal = () => {
        setBrandsModalVisible(false);
    };

    const onBrandsSelect = (item) => {
        console.log('Selected Item:', item);
        setSelectedBrands(item);
        setBrandsModalVisible(false);
    };
    const handleCloseCategoriesModal = () => {
        setCategoriesModalVisible(false);
    };

    const onCategoriesSelect = (item) => {
        console.log('Selected Item:', item);
        setSelectedCategories(item);
        setCategoriesModalVisible(false);
    };


    useEffect(() => {
        categoriesAdminService.getList().then(({data}) => setCategoriess(data)).catch(error => console.log(error));
        brandsAdminService.getList().then(({data}) => setBrandss(data)).catch(error => console.log(error));
    }, []);




    const handleSave = async (item: ProductsDto) => {
        item.categories = selectedCategories;
        item.brands = selectedBrands;
        Keyboard.dismiss();
        try {
            await service.save( item );
            reset();
            setSelectedCategories(emptyCategories);
            setSelectedBrands(emptyBrands);
            setShowSavedModal(true);
            setTimeout(() => setShowSavedModal(false), 1500);
        } catch (error) {
            console.error('Error saving products:', error);
            setShowErrorModal(true);
            setTimeout(() => setShowErrorModal(false), 1500);
        }
    };

return(
    <SafeAreaView style={{ flex: 1, backgroundColor: '#e6e8fa' }} >
        <ScrollView style={{ margin: 20, marginBottom: 80 }} showsVerticalScrollIndicator={false} keyboardShouldPersistTaps="handled" >
            <Text style={{ fontSize: 30, fontWeight: 'bold', alignSelf: 'center', marginBottom: 10 }} >Create Products</Text>

            <TouchableOpacity onPress={productsCollapsible} style={{ backgroundColor: 'orange', padding: 10, borderRadius: 10, marginVertical: 5 }}>
                <Text style={{ textAlign: 'center', fontWeight: 'bold', fontSize: 20 }}>Products</Text>
            </TouchableOpacity>

            <Collapsible collapsed={isProductsCollapsed}>
                        <TouchableOpacity onPress={() => setCategoriesModalVisible(true)} style={styles.placeHolder} >
                            <View style={{ flexDirection: 'row', justifyContent: 'space-between', alignItems: 'center' }}>
                                <Text>{selectedCategories.name}</Text>
                                <Ionicons name="caret-down-outline" size={22} color={'black'} />
                            </View>
                        </TouchableOpacity>
                        <TouchableOpacity onPress={() => setBrandsModalVisible(true)} style={styles.placeHolder} >
                            <View style={{ flexDirection: 'row', justifyContent: 'space-between', alignItems: 'center' }}>
                                <Text>{selectedBrands.name}</Text>
                                <Ionicons name="caret-down-outline" size={22} color={'black'} />
                            </View>
                        </TouchableOpacity>
                            <CustomInput control={control} name={'name'} placeholder={'Name'} keyboardT="default" />
                            <CustomInput control={control} name={'image'} placeholder={'Image'} keyboardT="default" />
                            <CustomInput control={control} name={'commentaire'} placeholder={'Commentaire'} keyboardT="default" />
                            <CustomInput control={control} name={'code'} placeholder={'Code'} keyboardT="default" />
                            <CustomInput control={control} name={'barCode'} placeholder={'Bar code'} keyboardT="default" />
            </Collapsible>
        <CustomButton onPress={handleSubmit(handleSave)} text={"Save Products"} bgColor={'#000080'} fgColor={'white'} />
        </ScrollView>
        <SaveFeedbackModal isVisible={showSavedModal} icon={'checkmark-done-sharp'} message={'saved successfully'} iconColor={'#32cd32'} />
        <SaveFeedbackModal isVisible={showErrorModal} icon={'close-sharp'} message={'Error on saving'} iconColor={'red'} />
        {brandss !== null && brandss.length > 0 ? ( <FilterModal visibility={brandsModalVisible} placeholder={"Select a Brands"} onItemSelect={onBrandsSelect} items={brandss} onClose={handleCloseBrandsModal} variable={'name'} /> ) : null}
        {categoriess !== null && categoriess.length > 0 ? ( <FilterModal visibility={categoriesModalVisible} placeholder={"Select a Categories"} onItemSelect={onCategoriesSelect} items={categoriess} onClose={handleCloseCategoriesModal} variable={'name'} /> ) : null}
    </SafeAreaView>
);
};

const styles = StyleSheet.create({
    container: {
        backgroundColor: '#f5f5f5',
        width: '100%',
        borderColor: '#e8e8e8',
        borderWidth: 1,
        borderRadius: 7,
        //paddingHorizontal: 5,
        marginTop: 15,
        marginBottom: 10
    },

    input: {
        height: 50,
    },

    modalBackground: {
        flex: 1,
        justifyContent: 'center',
        alignItems: 'center',
        backgroundColor: 'rgba(0, 0, 0, 0.5)',
    },

    modalContent: {
        backgroundColor: 'white',
        padding: 20,
        borderRadius: 8,
        flexDirection: 'row'
    },

    modalText: {
        fontSize: 18,
        fontWeight: 'bold',
        textAlign: 'center',
        marginHorizontal: 10
    },

    itemInput: {
        backgroundColor: '#f5f5f5',
        width: '100%',
        borderColor: '#e8e8e8',
        borderWidth: 1,
        borderRadius: 7,
        paddingHorizontal: 15,
        marginTop: 15,
        height: 50,
    },

    infos: {
        flexDirection: 'row',
        alignItems: 'baseline',
        marginVertical: 6.5,
        fontSize: 15,
        fontWeight: 'bold'
    },

    itemCard: {
        marginVertical: 5,
        backgroundColor: '#f8f8ff',
        borderRadius: 10,
        padding: 10,
        flexDirection: 'row',
        justifyContent: 'space-between'
    },

    placeHolder: {
        backgroundColor: '#f5f5f5',
        width: '100%',
        borderColor: '#e8e8e8',
        borderWidth: 1,
        borderRadius: 7,
        paddingHorizontal: 15,
        padding: 15,
        marginTop: 15,
    }
});

export default ProductsAdminCreate;
