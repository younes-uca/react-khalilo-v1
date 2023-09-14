package  ma.sir.nextlevel.ws.dto.commun;

import ma.sir.nextlevel.zynerator.audit.Log;
import ma.sir.nextlevel.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;





@JsonInclude(JsonInclude.Include.NON_NULL)
public class BrandsDto  extends AuditBaseDto {

    private String name  ;




    public BrandsDto(){
        super();
    }



    @Log
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }








}
