import {createNativeStackNavigator} from '@react-navigation/native-stack';

import BrandsAdminView from "../../../../component/admin/view/commun/brands/view/brands-view-admin.component";
import BrandsAdminList from "../../../../component/admin/view/commun/brands/list/brands-list-admin.component";
import BrandsAdminEdit from "../../../../component/admin/view/commun/brands/edit/brands-edit-admin.component";


const Stack = createNativeStackNavigator();

function StackBrandsAdmin() {
    return (
        <Stack.Navigator>
            <Stack.Screen
                name="BrandsAdminList"
                component={BrandsAdminList}
                options={{ headerShown: false }}
            />
            <Stack.Screen
                name="BrandsAdminUpdate"
                component={BrandsAdminEdit}
            />
            <Stack.Screen
                name="BrandsAdminDetails"
                component={BrandsAdminView}
            />
        </Stack.Navigator>
    );
}

export default StackBrandsAdmin;
