package ma.sir.nextlevel.bean.core.commun;

import java.util.Objects;







import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.nextlevel.zynerator.audit.AuditBusinessObject;
import jakarta.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "categories")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="categories_seq",sequenceName="categories_seq",allocationSize=1, initialValue = 1)
public class Categories   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String name;
    private Integer sortby = 0;
    private Integer categorieId = 0;



    public Categories(){
        super();
    }

    public Categories(Long id,String name){
        this.id = id;
        this.name = name ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="categories_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Integer getSortby(){
        return this.sortby;
    }
    public void setSortby(Integer sortby){
        this.sortby = sortby;
    }
    public Integer getCategorieId(){
        return this.categorieId;
    }
    public void setCategorieId(Integer categorieId){
        this.categorieId = categorieId;
    }

    @Transient
    public String getLabel() {
        label = name;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categories categories = (Categories) o;
        return id != null && id.equals(categories.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

