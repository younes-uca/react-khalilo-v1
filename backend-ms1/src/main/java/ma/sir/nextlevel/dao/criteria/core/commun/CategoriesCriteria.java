package  ma.sir.nextlevel.dao.criteria.core.commun;



import ma.sir.nextlevel.zynerator.criteria.BaseCriteria;
import java.util.List;

public class CategoriesCriteria extends  BaseCriteria  {

    private String name;
    private String nameLike;
    private String sortby;
    private String sortbyMin;
    private String sortbyMax;
    private String categorieId;
    private String categorieIdMin;
    private String categorieIdMax;



    public CategoriesCriteria(){}

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

    public String getSortby(){
        return this.sortby;
    }
    public void setSortby(String sortby){
        this.sortby = sortby;
    }   
    public String getSortbyMin(){
        return this.sortbyMin;
    }
    public void setSortbyMin(String sortbyMin){
        this.sortbyMin = sortbyMin;
    }
    public String getSortbyMax(){
        return this.sortbyMax;
    }
    public void setSortbyMax(String sortbyMax){
        this.sortbyMax = sortbyMax;
    }
      
    public String getCategorieId(){
        return this.categorieId;
    }
    public void setCategorieId(String categorieId){
        this.categorieId = categorieId;
    }   
    public String getCategorieIdMin(){
        return this.categorieIdMin;
    }
    public void setCategorieIdMin(String categorieIdMin){
        this.categorieIdMin = categorieIdMin;
    }
    public String getCategorieIdMax(){
        return this.categorieIdMax;
    }
    public void setCategorieIdMax(String categorieIdMax){
        this.categorieIdMax = categorieIdMax;
    }
      

}
