import { ADMIN_URL } from '../../../../../config/AppConfig';
import AbstractService from "../../../../zynerator/service/AbstractService";

import {BrandsDto} from '../../../model/commun/Brands.model';
import {BrandsCriteria} from '../../../criteria/commun/BrandsCriteria.model';

export class BrandsAdminService extends AbstractService<BrandsDto, BrandsCriteria>{

    constructor() {
        super(ADMIN_URL , 'brands/');
    }

};
