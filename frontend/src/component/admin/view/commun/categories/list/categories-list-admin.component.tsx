import { View, Text, ScrollView } from 'react-native';
import React, { useCallback, useState } from 'react';
import { useFocusEffect } from '@react-navigation/native';
import { useNavigation, NavigationProp } from '@react-navigation/native';
import ConfirmDeleteModal from '../../../../../../zynerator/ConfirmDeleteModal';
import { AxiosResponse } from 'axios';

import {CategoriesAdminService} from '../../../../../../controller/service/admin/commun/CategoriesAdminService.service';
import  {CategoriesDto}  from '../../../../../../controller/model/commun/Categories.model';
import CategoriesAdminCard from "../card/categories-card-admin.component";


const CategoriesAdminList: React.FC = () =>  {

    const [categoriess, setCategoriess] = useState<CategoriesDto[]>([]);
    const navigation = useNavigation<NavigationProp<any>>();
    type CategoriesResponse = AxiosResponse<CategoriesDto[]>;
    const [isDeleteModalVisible, setIsDeleteModalVisible] = useState(false);
    const [categoriesId, setCategoriesId] = useState(0);

    const service = new CategoriesAdminService();

    const handleDeletePress = (id: number) => {
        setCategoriesId(id);
        setIsDeleteModalVisible(true);
    };

    const handleCancelDelete = () => {
        setIsDeleteModalVisible(false);
    };

    const handleConfirmDelete = async () => {
        try {
            await service.delete(categoriesId);
            setCategoriess((prevCategoriess) => prevCategoriess.filter((categories) => categories.id !== categoriesId));
            setIsDeleteModalVisible(false);
        } catch (error) {
            console.error('Error deleting categories:', error);
            setIsDeleteModalVisible(false);
        }
    };

    const fetchData = async () => {
        try {
            const [categoriesResponse] = await Promise.all<CategoriesResponse>([
            service.getList(),
            ]);
            setCategoriess(categoriesResponse.data);
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
            const categoriesResponse = await service.find(id);
            const categoriesData = categoriesResponse.data;
            navigation.navigate('CategoriesUpdate', { categories: categoriesData });
        } catch (error) {
            console.error('Error fetching categories data:', error);
        }
    };

    const handleFetchAndDetails = async (id: number) => {
        try {
            const categoriesResponse = await service.find(id);
            const categoriesData = categoriesResponse.data;
            navigation.navigate('CategoriesDetails', { categories: categoriesData });
        } catch (error) {
            console.error('Error fetching categories data:', error);
        }
    };

return(
    <ScrollView showsVerticalScrollIndicator={false} style={{ paddingHorizontal: 10, backgroundColor: '#e6e8fa' }}>

        <Text style={{ fontSize: 30, fontWeight: 'bold', alignSelf: 'center', marginVertical: 10, }} >Categories List</Text>

        <View style={{ marginBottom: 100 }}>
            {categoriess && categoriess.length > 0 ? ( categoriess.map((categories) => (
                <CategoriesAdminCard key={categories.id}
                    name = {categories.name}
                    sortby = {categories.sortby}
                    categorieId = {categories.categorieId}
                    onPressDelete={() => handleDeletePress(categories.id)}
                    onUpdate={() => handleFetchAndUpdate(categories.id)}
                    onDetails={() => handleFetchAndDetails(categories.id)}
                />
                )) ) : (
                <Text style={{ fontSize: 20, textAlign: 'center', color: 'red', marginTop: 20 }}>No categoriess found.</Text>
            )}
        </View>

        <ConfirmDeleteModal isVisible={isDeleteModalVisible} handleConfirmDelete={handleConfirmDelete} handleCancelDelete={handleCancelDelete} name={'Categories'} />

    </ScrollView>

);
};

export default CategoriesAdminList;
