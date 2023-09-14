import {BaseCriteria} from "../../../zynerator/criteria/BaseCriteria.model";





export class CategoriesCriteria  extends  BaseCriteria {

    public id: number;

    public name: string;
    public nameLike: string;
     public sortby: null | number;
     public sortbyMin: null | number;
     public sortbyMax: null | number;
     public categorieId: null | number;
     public categorieIdMin: null | number;
     public categorieIdMax: null | number;

    constructor() {
        super();
        this.name = '';
        this.nameLike = '';
        this.sortby = null;
        this.sortbyMin = null;
        this.sortbyMax = null;
        this.categorieId = null;
        this.categorieIdMin = null;
        this.categorieIdMax = null;
    }

}
