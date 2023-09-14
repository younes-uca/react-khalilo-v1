import { View, Text, ScrollView } from 'react-native';
import React, { useCallback, useState } from 'react';
import { useFocusEffect } from '@react-navigation/native';
import { useNavigation, NavigationProp } from '@react-navigation/native';
import ConfirmDeleteModal from '../../../../../../zynerator/ConfirmDeleteModal';
import { AxiosResponse } from 'axios';

import {ProductsAdminService} from '../../../../../../controller/service/admin/commun/ProductsAdminService.service';
import  {ProductsDto}  from '../../../../../../controller/model/commun/Products.model';
import ProductsAdminCard from "../card/products-card-admin.component";


const ProductsAdminList: React.FC = () =>  {

    const [productss, setProductss] = useState<ProductsDto[]>([]);
    const navigation = useNavigation<NavigationProp<any>>();
    type ProductsResponse = AxiosResponse<ProductsDto[]>;
    const [isDeleteModalVisible, setIsDeleteModalVisible] = useState(false);
    const [productsId, setProductsId] = useState(0);

    const service = new ProductsAdminService();

    const handleDeletePress = (id: number) => {
        setProductsId(id);
        setIsDeleteModalVisible(true);
    };

    const handleCancelDelete = () => {
        setIsDeleteModalVisible(false);
    };

    const handleConfirmDelete = async () => {
        try {
            await service.delete(productsId);
            setProductss((prevProductss) => prevProductss.filter((products) => products.id !== productsId));
            setIsDeleteModalVisible(false);
        } catch (error) {
            console.error('Error deleting products:', error);
            setIsDeleteModalVisible(false);
        }
    };

    const fetchData = async () => {
        try {
            const [productsResponse] = await Promise.all<ProductsResponse>([
            service.getList(),
            ]);
            setProductss(productsResponse.data);
        } catch (error) {
            console.error(error);
        }
    };

    useFocusEffect(
        useCallback(() => {
            fetchData();
        }, [])
    );

    const handleFetchAndUpdate = async (id: number) => {
        try {
            const productsResponse = await service.find(id);
            const productsData = productsResponse.data;
            navigation.navigate('ProductsUpdate', { products: productsData });
        } catch (error) {
            console.error('Error fetching products data:', error);
        }
    };

    const handleFetchAndDetails = async (id: number) => {
        try {
            const productsResponse = await service.find(id);
            const productsData = productsResponse.data;
            navigation.navigate('ProductsDetails', { products: productsData });
        } catch (error) {
            console.error('Error fetching products data:', error);
        }
    };

return(
    <ScrollView showsVerticalScrollIndicator={false} style={{ paddingHorizontal: 10, backgroundColor: '#e6e8fa' }}>

        <Text style={{ fontSize: 30, fontWeight: 'bold', alignSelf: 'center', marginVertical: 10, }} >Products List</Text>

        <View style={{ marginBottom: 100 }}>
            {productss && productss.length > 0 ? ( productss.map((products) => (
                <ProductsAdminCard key={products.id}
                    productId = {products.productId}
                    categoriesName = {products.categories.name}
                    brandsName = {products.brands.name}
                    prixVente = {products.prixVente}
                    name = {products.name}
                    image = {products.image}
                    commentaire = {products.commentaire}
                    code = {products.code}
                    quantite = {products.quantite}
                    prixPromo = {products.prixPromo}
                    prixRevendeur = {products.prixRevendeur}
                    quantiteMarrakech = {products.quantiteMarrakech}
                    quantiteRabat = {products.quantiteRabat}
                    barCode = {products.barCode}
                    onPressDelete={() => handleDeletePress(products.id)}
                    onUpdate={() => handleFetchAndUpdate(products.id)}
                    onDetails={() => handleFetchAndDetails(products.id)}
                />
                )) ) : (
                <Text style={{ fontSize: 20, textAlign: 'center', color: 'red', marginTop: 20 }}>No productss found.</Text>
            )}
        </View>

        <ConfirmDeleteModal isVisible={isDeleteModalVisible} handleConfirmDelete={handleConfirmDelete} handleCancelDelete={handleCancelDelete} name={'Products'} />

    </ScrollView>

);
};

export default ProductsAdminList;
