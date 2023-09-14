import { View, Text, StyleSheet, SafeAreaView, TouchableOpacity, Keyboard } from 'react-native';
import React, { useEffect, useState } from 'react';
import { RouteProp } from '@react-navigation/native';
import { useForm } from 'react-hook-form';
import CustomInput from '../../../../../../zynerator/CustomInput';
import CustomButton from '../../../../../../zynerator/CustomButton';
import { ScrollView, TextInput } from 'react-native-gesture-handler';
import { useNavigation, NavigationProp } from '@react-navigation/native';
import { AxiosResponse } from 'axios';
import SaveFeedbackModal from '../../../../../../zynerator/SaveFeedbackModal';
import FilterModal from '../../../../../../zynerator/FilterModal';
import Ionicons from 'react-native-vector-icons/Ionicons';

import {ProductsAdminService} from '../../../../../../controller/service/admin/commun/ProductsAdminService.service';
import  {ProductsDto}  from '../../../../../../controller/model/commun/Products.model';

import {CategoriesDto} from '../../../../../../controller/model/commun/Categories.model';
import {CategoriesAdminService} from '../../../../../../controller/service/admin/commun/CategoriesAdminService.service';
import {BrandsDto} from '../../../../../../controller/model/commun/Brands.model';
import {BrandsAdminService} from '../../../../../../controller/service/admin/commun/BrandsAdminService.service';

type ProductsUpdateScreenRouteProp = RouteProp<{ ProductsUpdate: { products: ProductsDto } }, 'ProductsUpdate'>;

type Props = { route: ProductsUpdateScreenRouteProp; };

const ProductsAdminEdit: React.FC<Props> = ({ route }) => {

    const navigation = useNavigation<NavigationProp<any>>();
    const [showErrorModal, setShowErrorModal] = useState(false);
    const { products } = route.params;


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


    const { control, handleSubmit } = useForm<ProductsDto>({
        defaultValues: {
            id: products.id ,
            productId: products.productId ,
            prixVente: products.prixVente ,
            name: products.name ,
            image: products.image ,
            commentaire: products.commentaire ,
            code: products.code ,
            quantite: products.quantite ,
            prixPromo: products.prixPromo ,
            prixRevendeur: products.prixRevendeur ,
            quantiteMarrakech: products.quantiteMarrakech ,
            quantiteRabat: products.quantiteRabat ,
            barCode: products.barCode ,
        },
    });



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



    const handleUpdate = async (item: ProductsDto) => {
        item.categories = selectedCategories;
        item.brands = selectedBrands;
        Keyboard.dismiss();
        console.log('Data to be updated:', item);
        try {
            await service.update(item);
            navigation.navigate('Products');
        } catch (error) {
            console.error('Error saving products:', error);
            setShowErrorModal(true);
            setTimeout(() => setShowErrorModal(false), 1500);
        }
    };

return(
    <SafeAreaView style={{ flex: 1, backgroundColor: '#e6e8fa' }}>

        <ScrollView style={{ margin: 20 }} showsVerticalScrollIndicator={false} keyboardShouldPersistTaps="handled">

            <Text style={{ fontSize: 30, fontWeight: 'bold', alignSelf: 'center', marginBottom: 10 }} >Update Products</Text>


            <TouchableOpacity onPress={() => setCategoriesModalVisible(true)} style={styles.placeHolder} >

                <View style={{ flexDirection: 'row', justifyContent: 'space-between', alignItems: 'center' }}>
                    <Text>{selectedCategories?.name}</Text>
                    <Ionicons name="caret-down-outline" size={22} color={'black'} />
                </View>

            </TouchableOpacity>

            <TouchableOpacity onPress={() => setBrandsModalVisible(true)} style={styles.placeHolder} >

                <View style={{ flexDirection: 'row', justifyContent: 'space-between', alignItems: 'center' }}>
                    <Text>{selectedBrands?.name}</Text>
                    <Ionicons name="caret-down-outline" size={22} color={'black'} />
                </View>

            </TouchableOpacity>
            <CustomInput control={control} name={'name'} placeholder={'Name'} keyboardT="default" />
            <CustomInput control={control} name={'image'} placeholder={'Image'} keyboardT="default" />
            <CustomInput control={control} name={'commentaire'} placeholder={'Commentaire'} keyboardT="default" />
            <CustomInput control={control} name={'code'} placeholder={'Code'} keyboardT="default" />
            <CustomInput control={control} name={'barCode'} placeholder={'Bar code'} keyboardT="default" />

            <CustomButton onPress={handleSubmit(handleUpdate)} text={"Update Products"} bgColor={'#ffa500'} fgColor={'white'} />

        </ScrollView>

        <SaveFeedbackModal isVisible={showErrorModal} icon={'close-sharp'} message={'Error on updating'} iconColor={'red'} />

        {categoriess &&
            <FilterModal visibility={categoriesModalVisible} placeholder={"Select a Categories"} onItemSelect={onCategoriesSelect} items={categoriess} onClose={handleCloseCategoriesModal} variable={'name'} />
        }
        {brandss &&
            <FilterModal visibility={brandsModalVisible} placeholder={"Select a Brands"} onItemSelect={onBrandsSelect} items={brandss} onClose={handleCloseBrandsModal} variable={'name'} />
        }

    </SafeAreaView>
);
};

const styles = StyleSheet.create({

    container: {
        backgroundColor: 'white',
        width: '100%',
        borderColor: '#e8e8e8',
        borderWidth: 1,
        borderRadius: 7,
        paddingHorizontal: 15,
        marginTop: 15
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
    },

    modalText: {
        fontSize: 18,
        fontWeight: 'bold',
        textAlign: 'center',
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
        marginBottom: 10,
    }

});

export default ProductsAdminEdit;
