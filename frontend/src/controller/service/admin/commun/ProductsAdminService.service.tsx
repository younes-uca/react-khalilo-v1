import { ADMIN_URL } from '../../../../../config/AppConfig';
import AbstractService from "../../../../zynerator/service/AbstractService";

import {ProductsDto} from '../../../model/commun/Products.model';
import {ProductsCriteria} from '../../../criteria/commun/ProductsCriteria.model';

export class ProductsAdminService extends AbstractService<ProductsDto, ProductsCriteria>{

    constructor() {
        super(ADMIN_URL , 'products/');
    }

};
