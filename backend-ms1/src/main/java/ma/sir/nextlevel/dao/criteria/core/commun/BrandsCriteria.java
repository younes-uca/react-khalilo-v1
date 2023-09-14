package  ma.sir.nextlevel.dao.criteria.core.commun;



import ma.sir.nextlevel.zynerator.criteria.BaseCriteria;
import java.util.List;

public class BrandsCriteria extends  BaseCriteria  {

    private String name;
    private String nameLike;



    public BrandsCriteria(){}

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getNameLike(){
        return this.nameLike;
    }
    public void setNameLike(String nameLike){
        this.nameLike = nameLike;
    }


}
