import {BaseDto} from "../../../zynerator/dto/BaseDto.model";


export class BrandsDto extends BaseDto{

    public name: string;



    constructor() {
        super();
        this.name = 'select a brands';
        }

}
