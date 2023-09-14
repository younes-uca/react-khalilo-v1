import { View, Text, ScrollView } from 'react-native';
import React, { useCallback, useState } from 'react';
import { useFocusEffect } from '@react-navigation/native';
import { useNavigation, NavigationProp } from '@react-navigation/native';
import ConfirmDeleteModal from '../../../../../../zynerator/ConfirmDeleteModal';
import { AxiosResponse } from 'axios';

import {BrandsAdminService} from '../../../../../../controller/service/admin/commun/BrandsAdminService.service';
import  {BrandsDto}  from '../../../../../../controller/model/commun/Brands.model';
import BrandsAdminCard from "../card/brands-card-admin.component";


const BrandsAdminList: React.FC = () =>  {

    const [brandss, setBrandss] = useState<BrandsDto[]>([]);
    const navigation = useNavigation<NavigationProp<any>>();
    type BrandsResponse = AxiosResponse<BrandsDto[]>;
    const [isDeleteModalVisible, setIsDeleteModalVisible] = useState(false);
    const [brandsId, setBrandsId] = useState(0);

    const service = new BrandsAdminService();

    const handleDeletePress = (id: number) => {
        setBrandsId(id);
        setIsDeleteModalVisible(true);
    };

    const handleCancelDelete = () => {
        setIsDeleteModalVisible(false);
    };

    const handleConfirmDelete = async () => {
        try {
            await service.delete(brandsId);
            setBrandss((prevBrandss) => prevBrandss.filter((brands) => brands.id !== brandsId));
            setIsDeleteModalVisible(false);
        } catch (error) {
            console.error('Error deleting brands:', error);
            setIsDeleteModalVisible(false);
        }
    };

    const fetchData = async () => {
        try {
            const [brandsResponse] = await Promise.all<BrandsResponse>([
            service.getList(),
            ]);
            setBrandss(brandsResponse.data);
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
            const brandsResponse = await service.find(id);
            const brandsData = brandsResponse.data;
            navigation.navigate('BrandsUpdate', { brands: brandsData });
        } catch (error) {
            console.error('Error fetching brands data:', error);
        }
    };

    const handleFetchAndDetails = async (id: number) => {
        try {
            const brandsResponse = await service.find(id);
            const brandsData = brandsResponse.data;
            navigation.navigate('BrandsDetails', { brands: brandsData });
        } catch (error) {
            console.error('Error fetching brands data:', error);
        }
    };

return(
    <ScrollView showsVerticalScrollIndicator={false} style={{ paddingHorizontal: 10, backgroundColor: '#e6e8fa' }}>

        <Text style={{ fontSize: 30, fontWeight: 'bold', alignSelf: 'center', marginVertical: 10, }} >Brands List</Text>

        <View style={{ marginBottom: 100 }}>
            {brandss && brandss.length > 0 ? ( brandss.map((brands) => (
                <BrandsAdminCard key={brands.id}
                    name = {brands.name}
                    onPressDelete={() => handleDeletePress(brands.id)}
                    onUpdate={() => handleFetchAndUpdate(brands.id)}
                    onDetails={() => handleFetchAndDetails(brands.id)}
                />
                )) ) : (
                <Text style={{ fontSize: 20, textAlign: 'center', color: 'red', marginTop: 20 }}>No brandss found.</Text>
            )}
        </View>

        <ConfirmDeleteModal isVisible={isDeleteModalVisible} handleConfirmDelete={handleConfirmDelete} handleCancelDelete={handleCancelDelete} name={'Brands'} />

    </ScrollView>

);
};

export default BrandsAdminList;
