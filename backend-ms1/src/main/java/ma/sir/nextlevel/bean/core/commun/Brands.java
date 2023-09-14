package ma.sir.nextlevel.bean.core.commun;

import java.util.Objects;







import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.nextlevel.zynerator.audit.AuditBusinessObject;
import jakarta.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "brands")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="brands_seq",sequenceName="brands_seq",allocationSize=1, initialValue = 1)
public class Brands   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String name;



    public Brands(){
        super();
    }

    public Brands(Long id,String name){
        this.id = id;
        this.name = name ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="brands_seq")
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

    @Transient
    public String getLabel() {
        label = name;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Brands brands = (Brands) o;
        return id != null && id.equals(brands.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

