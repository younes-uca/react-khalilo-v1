import {createNativeStackNavigator} from '@react-navigation/native-stack';

import ProductsAdminView from "../../../../component/admin/view/commun/products/view/products-view-admin.component";
import ProductsAdminList from "../../../../component/admin/view/commun/products/list/products-list-admin.component";
import ProductsAdminEdit from "../../../../component/admin/view/commun/products/edit/products-edit-admin.component";


const Stack = createNativeStackNavigator();

function StackProductsAdmin() {
    return (
        <Stack.Navigator>
            <Stack.Screen
                name="ProductsAdminList"
                component={ProductsAdminList}
                options={{ headerShown: false }}
            />
            <Stack.Screen
                name="ProductsAdminUpdate"
                component={ProductsAdminEdit}
            />
            <Stack.Screen
                name="ProductsAdminDetails"
                component={ProductsAdminView}
            />
        </Stack.Navigator>
    );
}

export default StackProductsAdmin;
