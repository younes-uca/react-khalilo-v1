package  ma.sir.nextlevel.ws.dto.commun;

import ma.sir.nextlevel.zynerator.audit.Log;
import ma.sir.nextlevel.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;





@JsonInclude(JsonInclude.Include.NON_NULL)
public class CategoriesDto  extends AuditBaseDto {

    private String name  ;
    private Integer sortby  = 0 ;
    private Integer categorieId  = 0 ;




    public CategoriesDto(){
        super();
    }



    @Log
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    @Log
    public Integer getSortby(){
        return this.sortby;
    }
    public void setSortby(Integer sortby){
        this.sortby = sortby;
    }

    @Log
    public Integer getCategorieId(){
        return this.categorieId;
    }
    public void setCategorieId(Integer categorieId){
        this.categorieId = categorieId;
    }








}
