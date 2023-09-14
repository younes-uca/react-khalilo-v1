import { View, Text, StyleSheet, TouchableOpacity } from 'react-native';
import React, { useState } from 'react';
import { RouteProp } from '@react-navigation/native';
import Collapsible from 'react-native-collapsible';
import { ScrollView } from 'react-native-gesture-handler';

import  {ProductsDto}  from '../../../../../../controller/model/commun/Products.model';

type ProductsViewScreenRouteProp = RouteProp<{ ProductsDetails: { products : ProductsDto } }, 'ProductsDetails'>;

type Props = { route: ProductsViewScreenRouteProp; };

const ProductsAdminView: React.FC<Props> = ({ route }) => {

    const { products } = route.params;
    const [isProductsCollapsed, setIsProductsCollapsed] = useState(false);



    const productsCollapsible = () => {
        setIsProductsCollapsed(!isProductsCollapsed);
    };

return(
    <View style={{ padding: 20 }}>

        <ScrollView>

            <TouchableOpacity onPress={productsCollapsible} style={{ backgroundColor: '#ffd700', padding: 10, borderRadius: 10, marginVertical: 5 }}>
                <Text style={{ textAlign: 'center', fontWeight: 'bold', fontSize: 20 }}>Products</Text>
            </TouchableOpacity>

            <Collapsible collapsed={isProductsCollapsed}>

                <View style={styles.itemCard}>

                    <View>

                        <Text style={styles.infos}>Id: {products.id}</Text>
                        <Text style={styles.infos}>Product id: {products.productId}</Text>
                        <Text style={styles.infos}>Categories: {products?.categories?.name}</Text>
                        <Text style={styles.infos}>Brands: {products?.brands?.name}</Text>
                        <Text style={styles.infos}>Prix vente: {products.prixVente}</Text>
                        <Text style={styles.infos}>Name: {products.name}</Text>
                        <Text style={styles.infos}>Image: {products.image}</Text>
                        <Text style={styles.infos}>Commentaire: {products.commentaire}</Text>
                        <Text style={styles.infos}>Code: {products.code}</Text>
                        <Text style={styles.infos}>Quantite: {products.quantite}</Text>
                        <Text style={styles.infos}>Prix promo: {products.prixPromo}</Text>
                        <Text style={styles.infos}>Prix revendeur: {products.prixRevendeur}</Text>
                        <Text style={styles.infos}>Quantite marrakech: {products.quantiteMarrakech}</Text>
                        <Text style={styles.infos}>Quantite rabat: {products.quantiteRabat}</Text>
                        <Text style={styles.infos}>Bar code: {products.barCode}</Text>

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

export default ProductsAdminView;
