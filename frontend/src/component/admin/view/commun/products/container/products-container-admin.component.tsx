import React from 'react';
import { SafeAreaView, StyleSheet, TouchableOpacity, View, KeyboardAvoidingView, Platform } from 'react-native';
import ProductsTabNavigation from "../../../../../../navigation/drawer/elements/commun/ProductsTabNavigation";

const ProductsAdmin = () => {
  return (
    <SafeAreaView style={styles.container}>

      <KeyboardAvoidingView
        behavior={Platform.OS === 'ios' ? 'padding' : 'height'}
        style={{ flex: 1 }} >
        <ProductsTabNavigation />
      </KeyboardAvoidingView>
    </SafeAreaView>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
  },
  buttonContainer: {
    position: 'absolute',
    bottom: 50, 
    alignSelf: 'center',
    width: 60,
    height: 60,
    backgroundColor: 'orange',
    alignItems: 'center',
    justifyContent: 'center',
    borderRadius: 30,
  },
});

export default ProductsAdmin;
