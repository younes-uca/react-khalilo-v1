import {BaseDto} from "../../../zynerator/dto/BaseDto.model";


export class CategoriesDto extends BaseDto{

    public name: string;

    public sortby: null | number;

    public categorieId: null | number;



    constructor() {
        super();
        this.name = 'select a categories';
        this.sortby = null;
        this.categorieId = null;
        }

}
