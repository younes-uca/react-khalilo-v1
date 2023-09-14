import { ADMIN_URL } from '../../../../../config/AppConfig';
import AbstractService from "../../../../zynerator/service/AbstractService";

import {CategoriesDto} from '../../../model/commun/Categories.model';
import {CategoriesCriteria} from '../../../criteria/commun/CategoriesCriteria.model';

export class CategoriesAdminService extends AbstractService<CategoriesDto, CategoriesCriteria>{

    constructor() {
        super(ADMIN_URL , 'categories/');
    }

};
