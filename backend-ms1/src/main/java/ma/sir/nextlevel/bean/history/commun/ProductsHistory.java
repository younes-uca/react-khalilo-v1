package ma.sir.nextlevel.bean.history.commun;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.nextlevel.zynerator.history.HistBusinessObject;
import jakarta.persistence.*;


@Entity
@Table(name = "products")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="products_seq",sequenceName="products_seq",allocationSize=1, initialValue = 1)
public class ProductsHistory extends HistBusinessObject  {


    public ProductsHistory() {
    super();
    }

    public ProductsHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="products_seq")
    public Long getId() {
    return id;
    }
}

