import {BaseCriteria} from "../../../zynerator/criteria/BaseCriteria.model";





export class BrandsCriteria  extends  BaseCriteria {

    public id: number;

    public name: string;
    public nameLike: string;

    constructor() {
        super();
        this.name = '';
        this.nameLike = '';
    }

}
