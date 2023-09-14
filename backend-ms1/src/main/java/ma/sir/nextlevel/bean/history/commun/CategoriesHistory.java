package ma.sir.nextlevel.bean.history.commun;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.nextlevel.zynerator.history.HistBusinessObject;
import jakarta.persistence.*;


@Entity
@Table(name = "categories")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="categories_seq",sequenceName="categories_seq",allocationSize=1, initialValue = 1)
public class CategoriesHistory extends HistBusinessObject  {


    public CategoriesHistory() {
    super();
    }

    public CategoriesHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="categories_seq")
    public Long getId() {
    return id;
    }
}

