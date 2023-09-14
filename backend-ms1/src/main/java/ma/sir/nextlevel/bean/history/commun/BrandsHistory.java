package ma.sir.nextlevel.bean.history.commun;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.nextlevel.zynerator.history.HistBusinessObject;
import jakarta.persistence.*;


@Entity
@Table(name = "brands")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="brands_seq",sequenceName="brands_seq",allocationSize=1, initialValue = 1)
public class BrandsHistory extends HistBusinessObject  {


    public BrandsHistory() {
    super();
    }

    public BrandsHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="brands_seq")
    public Long getId() {
    return id;
    }
}

