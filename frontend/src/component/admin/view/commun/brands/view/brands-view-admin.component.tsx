import { View, Text, StyleSheet, TouchableOpacity } from 'react-native';
import React, { useState } from 'react';
import { RouteProp } from '@react-navigation/native';
import Collapsible from 'react-native-collapsible';
import { ScrollView } from 'react-native-gesture-handler';

import  {BrandsDto}  from '../../../../../../controller/model/commun/Brands.model';

type BrandsViewScreenRouteProp = RouteProp<{ BrandsDetails: { brands : BrandsDto } }, 'BrandsDetails'>;

type Props = { route: BrandsViewScreenRouteProp; };

const BrandsAdminView: React.FC<Props> = ({ route }) => {

    const { brands } = route.params;
    const [isBrandsCollapsed, setIsBrandsCollapsed] = useState(false);



    const brandsCollapsible = () => {
        setIsBrandsCollapsed(!isBrandsCollapsed);
    };

return(
    <View style={{ padding: 20 }}>

        <ScrollView>

            <TouchableOpacity onPress={brandsCollapsible} style={{ backgroundColor: '#ffd700', padding: 10, borderRadius: 10, marginVertical: 5 }}>
                <Text style={{ textAlign: 'center', fontWeight: 'bold', fontSize: 20 }}>Brands</Text>
            </TouchableOpacity>

            <Collapsible collapsed={isBrandsCollapsed}>

                <View style={styles.itemCard}>

                    <View>

                        <Text style={styles.infos}>Id: {brands.id}</Text>
                        <Text style={styles.infos}>Name: {brands.name}</Text>

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

export default BrandsAdminView;
