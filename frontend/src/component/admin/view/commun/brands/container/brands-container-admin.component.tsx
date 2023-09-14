import React from 'react';
import { SafeAreaView, StyleSheet, TouchableOpacity, View, KeyboardAvoidingView, Platform } from 'react-native';
import BrandsTabNavigation from "../../../../../../navigation/drawer/elements/commun/BrandsTabNavigation";
//import BrandsTabNavigation from "../../../../../../navigation/drawer/commun/BrandsTabNavigation";

const BrandsAdmin = () => {
  return (
    <SafeAreaView style={styles.container}>

      <KeyboardAvoidingView
        behavior={Platform.OS === 'ios' ? 'padding' : 'height'}
        style={{ flex: 1 }} >
        <BrandsTabNavigation />
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

export default BrandsAdmin;
