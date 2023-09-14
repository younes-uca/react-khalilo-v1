import { View, Text, StyleSheet, TouchableOpacity } from 'react-native';
import React, { useState } from 'react';
import { RouteProp } from '@react-navigation/native';
import Collapsible from 'react-native-collapsible';
import { ScrollView } from 'react-native-gesture-handler';

import  {CategoriesDto}  from '../../../../../../controller/model/commun/Categories.model';

type CategoriesViewScreenRouteProp = RouteProp<{ CategoriesDetails: { categories : CategoriesDto } }, 'CategoriesDetails'>;

type Props = { route: CategoriesViewScreenRouteProp; };

const CategoriesAdminView: React.FC<Props> = ({ route }) => {

    const { categories } = route.params;
    const [isCategoriesCollapsed, setIsCategoriesCollapsed] = useState(false);



    const categoriesCollapsible = () => {
        setIsCategoriesCollapsed(!isCategoriesCollapsed);
    };

return(
    <View style={{ padding: 20 }}>

        <ScrollView>

            <TouchableOpacity onPress={categoriesCollapsible} style={{ backgroundColor: '#ffd700', padding: 10, borderRadius: 10, marginVertical: 5 }}>
                <Text style={{ textAlign: 'center', fontWeight: 'bold', fontSize: 20 }}>Categories</Text>
            </TouchableOpacity>

            <Collapsible collapsed={isCategoriesCollapsed}>

                <View style={styles.itemCard}>

                    <View>

                        <Text style={styles.infos}>Id: {categories.id}</Text>
                        <Text style={styles.infos}>Name: {categories.name}</Text>
                        <Text style={styles.infos}>Sortby: {categories.sortby}</Text>
                        <Text style={styles.infos}>Categorie id: {categories.categorieId}</Text>

                    </View>

                </View>

            </Collapsible>


        </ScrollView>

    </View>
);
};

const styles = StyleSheet.create({
    infos: {
        flexDirection: 'row',
        alignItems: 'baseline',
        marginVertical: 6.5,
        fontSize: 15,
        fontWeight: 'bold',
    },

    itemCard: {
        marginVertical: 5,
        backgroundColor: '#f8f8ff',
        borderRadius: 10,
        padding: 10,
        flexDirection: 'row',
        justifyContent: 'space-between',
    },
});

export default CategoriesAdminView;
