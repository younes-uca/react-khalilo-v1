import { View, Text, SafeAreaView, StyleSheet, TouchableOpacity } from 'react-native';
import React from 'react';
import Ionicons from 'react-native-vector-icons/Ionicons';

const ProductsAdminCard = ({ productId ,categoriesName ,brandsName ,prixVente ,name ,image ,commentaire ,code ,quantite ,prixPromo ,prixRevendeur ,quantiteMarrakech ,quantiteRabat ,barCode , onPressDelete, onUpdate, onDetails }) =>{

return (

    <SafeAreaView>

        <View style={{ flexDirection: 'row', width: '100%' }} >

            <TouchableOpacity onPress={onDetails} style={{ height: 170, marginHorizontal: 10, borderRadius: 15, marginVertical: 10, elevation: 13, backgroundColor: 'white', width: '95%', flexDirection: 'row', justifyContent: 'space-between' }} >

                <View style={{ marginLeft: 15, marginVertical: 10 }}>

                    <View style={styles.infos}>
                        <Text style={{ fontSize: 18, fontWeight: 'bold' }}>- Product id: </Text>
                        <Text style={{ fontSize: 16, fontWeight: 'bold' }}>{productId}</Text>
                    </View>
                    <View style={styles.infos}>
                        <Text style={{ fontSize: 18, fontWeight: 'bold' }}>- Categories: </Text>
                        <Text style={{ fontSize: 14, fontWeight: 'bold' }}>{categoriesName}</Text>
                    </View>
                    <View style={styles.infos}>
                        <Text style={{ fontSize: 18, fontWeight: 'bold' }}>- Brands: </Text>
                        <Text style={{ fontSize: 14, fontWeight: 'bold' }}>{brandsName}</Text>
                    </View>
                    <View style={styles.infos}>
                        <Text style={{ fontSize: 18, fontWeight: 'bold' }}>- Prix vente: </Text>
                        <Text style={{ fontSize: 16, fontWeight: 'bold' }}>{prixVente}</Text>
                    </View>
                    <View style={styles.infos}>
                        <Text style={{ fontSize: 18, fontWeight: 'bold' }}>- Name: </Text>
                        <Text style={{ fontSize: 16, fontWeight: 'bold' }}>{name}</Text>
                    </View>
                    <View style={styles.infos}>
                        <Text style={{ fontSize: 18, fontWeight: 'bold' }}>- Image: </Text>
                        <Text style={{ fontSize: 16, fontWeight: 'bold' }}>{image}</Text>
                    </View>
                    <View style={styles.infos}>
                        <Text style={{ fontSize: 18, fontWeight: 'bold' }}>- Commentaire: </Text>
                        <Text style={{ fontSize: 16, fontWeight: 'bold' }}>{commentaire}</Text>
                    </View>
                    <View style={styles.infos}>
                        <Text style={{ fontSize: 18, fontWeight: 'bold' }}>- Code: </Text>
                        <Text style={{ fontSize: 16, fontWeight: 'bold' }}>{code}</Text>
                    </View>
                    <View style={styles.infos}>
                        <Text style={{ fontSize: 18, fontWeight: 'bold' }}>- Quantite: </Text>
                        <Text style={{ fontSize: 16, fontWeight: 'bold' }}>{quantite}</Text>
                    </View>
                    <View style={styles.infos}>
                        <Text style={{ fontSize: 18, fontWeight: 'bold' }}>- Prix promo: </Text>
                        <Text style={{ fontSize: 16, fontWeight: 'bold' }}>{prixPromo}</Text>
                    </View>
                    <View style={styles.infos}>
                        <Text style={{ fontSize: 18, fontWeight: 'bold' }}>- Prix revendeur: </Text>
                        <Text style={{ fontSize: 16, fontWeight: 'bold' }}>{prixRevendeur}</Text>
                    </View>
                    <View style={styles.infos}>
                        <Text style={{ fontSize: 18, fontWeight: 'bold' }}>- Quantite marrakech: </Text>
                        <Text style={{ fontSize: 16, fontWeight: 'bold' }}>{quantiteMarrakech}</Text>
                    </View>
                    <View style={styles.infos}>
                        <Text style={{ fontSize: 18, fontWeight: 'bold' }}>- Quantite rabat: </Text>
                        <Text style={{ fontSize: 16, fontWeight: 'bold' }}>{quantiteRabat}</Text>
                    </View>
                    <View style={styles.infos}>
                        <Text style={{ fontSize: 18, fontWeight: 'bold' }}>- Bar code: </Text>
                        <Text style={{ fontSize: 16, fontWeight: 'bold' }}>{barCode}</Text>
                    </View>

                </View>


                <View style={{ alignItems: 'center', flexDirection: 'column', justifyContent: 'space-between' }}>

                    <TouchableOpacity onPress={() => onPressDelete()} style={styles.deleteButton}>
                        <Ionicons name="trash-outline" size={25} color={'red'} />
                    </TouchableOpacity>

                    <TouchableOpacity onPress={() => onUpdate()} style={styles.updateButton}>
                        <Ionicons name="pencil-outline" size={25} color={'blue'} />
                    </TouchableOpacity>

                </View>

            </TouchableOpacity>

        </View>

    </SafeAreaView>
);
};

const styles = StyleSheet.create({
    card: {
        height: 170,
        marginHorizontal: 10,
        borderRadius: 15,
        marginVertical: 10,
        elevation: 13,
        backgroundColor: 'white',
        width: '90%',
        flexDirection: 'row',
        marginRight: '25%',
    },

    deleteButton: {
        margin: 15
    },

    updateButton: {
        margin: 15
    },

    buttons: {
        position: 'absolute',
        bottom: 10,
        flexDirection: 'row',
        right: '10%'
    },

    infos: {
        flexDirection: 'row',
        alignItems: 'baseline',
        marginVertical: 6.5
    }
});

export default ProductsAdminCard;
