import {BaseCriteria} from "../../../zynerator/criteria/BaseCriteria.model";


import {CategoriesCriteria} from '../commun/CategoriesCriteria';
import {BrandsCriteria} from '../commun/BrandsCriteria';



export class ProductsCriteria  extends  BaseCriteria {

    public id: number;

     public productId: null | number;
     public productIdMin: null | number;
     public productIdMax: null | number;
     public prixVente: null | number;
     public prixVenteMin: null | number;
     public prixVenteMax: null | number;
    public name: string;
    public nameLike: string;
    public image: string;
    public imageLike: string;
    public commentaire: string;
    public commentaireLike: string;
    public code: string;
    public codeLike: string;
     public quantite: null | number;
     public quantiteMin: null | number;
     public quantiteMax: null | number;
     public prixPromo: null | number;
     public prixPromoMin: null | number;
     public prixPromoMax: null | number;
     public prixRevendeur: null | number;
     public prixRevendeurMin: null | number;
     public prixRevendeurMax: null | number;
     public quantiteMarrakech: null | number;
     public quantiteMarrakechMin: null | number;
     public quantiteMarrakechMax: null | number;
     public quantiteRabat: null | number;
     public quantiteRabatMin: null | number;
     public quantiteRabatMax: null | number;
    public barCode: string;
    public barCodeLike: string;
  public categories: CategoriesCriteria ;
  public categoriess: Array<CategoriesCriteria> ;
  public brands: BrandsCriteria ;
  public brandss: Array<BrandsCriteria> ;

    constructor() {
        super();
        this.productId = null;
        this.productIdMin = null;
        this.productIdMax = null;
        this.prixVente = null;
        this.prixVenteMin = null;
        this.prixVenteMax = null;
        this.name = '';
        this.nameLike = '';
        this.image = '';
        this.imageLike = '';
        this.commentaire = '';
        this.commentaireLike = '';
        this.code = '';
        this.codeLike = '';
        this.quantite = null;
        this.quantiteMin = null;
        this.quantiteMax = null;
        this.prixPromo = null;
        this.prixPromoMin = null;
        this.prixPromoMax = null;
        this.prixRevendeur = null;
        this.prixRevendeurMin = null;
        this.prixRevendeurMax = null;
        this.quantiteMarrakech = null;
        this.quantiteMarrakechMin = null;
        this.quantiteMarrakechMax = null;
        this.quantiteRabat = null;
        this.quantiteRabatMin = null;
        this.quantiteRabatMax = null;
        this.barCode = '';
        this.barCodeLike = '';
        this.categories = new CategoriesCriteria() ;
        this.categoriess = new Array<CategoriesCriteria>() ;
        this.brands = new BrandsCriteria() ;
        this.brandss = new Array<BrandsCriteria>() ;
    }

}
