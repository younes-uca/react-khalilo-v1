import {BaseDto} from "../../../zynerator/dto/BaseDto.model";

import {CategoriesDto} from '../commun/Categories.model';
import {BrandsDto} from '../commun/Brands.model';

export class ProductsDto extends BaseDto{

    public productId: null | number;

    public prixVente: null | number;

    public name: string;

    public image: string;

    public commentaire: string;

    public code: string;

    public quantite: null | number;

    public prixPromo: null | number;

    public prixRevendeur: null | number;

    public quantiteMarrakech: null | number;

    public quantiteRabat: null | number;

    public barCode: string;

    public categories: CategoriesDto ;
    public brands: BrandsDto ;


    constructor() {
        super();
        this.productId = null;
        this.prixVente = null;
        this.name = 'select a products';
        this.image = '';
        this.commentaire = '';
        this.code = '';
        this.quantite = null;
        this.prixPromo = null;
        this.prixRevendeur = null;
        this.quantiteMarrakech = null;
        this.quantiteRabat = null;
        this.barCode = '';
        this.categories = new CategoriesDto() ;
        this.brands = new BrandsDto() ;
        }

}
