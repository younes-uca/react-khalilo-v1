import {createNativeStackNavigator} from '@react-navigation/native-stack';

import CategoriesAdminView from "../../../../component/admin/view/commun/categories/view/categories-view-admin.component";
import CategoriesAdminList from "../../../../component/admin/view/commun/categories/list/categories-list-admin.component";
import CategoriesAdminEdit from "../../../../component/admin/view/commun/categories/edit/categories-edit-admin.component";


const Stack = createNativeStackNavigator();

function StackCategoriesAdmin() {
    return (
        <Stack.Navigator>
            <Stack.Screen
                name="CategoriesAdminList"
                component={CategoriesAdminList}
                options={{ headerShown: false }}
            />
            <Stack.Screen
                name="CategoriesAdminUpdate"
                component={CategoriesAdminEdit}
            />
            <Stack.Screen
                name="CategoriesAdminDetails"
                component={CategoriesAdminView}
            />
        </Stack.Navigator>
    );
}

export default StackCategoriesAdmin;
