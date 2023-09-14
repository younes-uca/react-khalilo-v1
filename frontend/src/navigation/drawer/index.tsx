import CustomDrawer from "../../zynerator/CustomDrawer/CustomDrawer";
import HomeScreen from "../../component/HomeScreen";
import Ionicons from "react-native-vector-icons/Ionicons";
import ProductsAdmin from "../../component/admin/view/commun/products/container/products-container-admin.component";
import CategoriesAdmin from "../../component/admin/view/commun/categories/container/categories-container-admin.component";
import BrandsAdmin from "../../component/admin/view/commun/brands/container/brands-container-admin.component";
import AboutScreen from "../../component/AboutScreen";
import {createDrawerNavigator} from "@react-navigation/drawer";

const Drawer = createDrawerNavigator();

function DrawerNavigation() {
    return (

        <Drawer.Navigator
            drawerContent={props => <CustomDrawer {...props} />}
            screenOptions={{
                drawerActiveBackgroundColor: '#ffa500',
                drawerActiveTintColor: '#fff',
                drawerInactiveTintColor: '#333',
                drawerLabelStyle: {
                    marginLeft: -25,
                    fontWeight: 'bold',
                    fontSize: 15,
                },
            }}>
            <Drawer.Screen
                name="Home"
                component={HomeScreen}
                options={{
                    drawerIcon: ({ color }) => (
                        <Ionicons name="home-outline" size={22} color={color} />
                    ),
                }}
            />
            <Drawer.Screen
                name="Products"
                component={ProductsAdmin}
                options={{
                    drawerIcon: ({ color }) => (
                        <Ionicons name="cart-outline" size={22} color={color} />
                    ),
                }}
            />
            <Drawer.Screen
                name="Categories"
                component={CategoriesAdmin}
                options={{
                    drawerIcon: ({ color }) => (
                        <Ionicons name="cart-outline" size={22} color={color} />
                    ),
                }}
            />
            <Drawer.Screen
                name="Brands"
                component={BrandsAdmin}
                options={{
                    drawerIcon: ({ color }) => (
                        <Ionicons name="cart-outline" size={22} color={color} />
                    ),
                }}
            />
        </Drawer.Navigator>

    );
}

export default DrawerNavigation;
