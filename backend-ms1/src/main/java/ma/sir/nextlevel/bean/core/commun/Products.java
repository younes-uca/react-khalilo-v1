package ma.sir.nextlevel.bean.core.commun;

import java.util.Objects;







import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.nextlevel.zynerator.audit.AuditBusinessObject;
import jakarta.persistence.*;
import java.util.Objects;


import java.math.BigDecimal;


@Entity
@Table(name = "products")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="products_seq",sequenceName="products_seq",allocationSize=1, initialValue = 1)
public class Products   extends AuditBusinessObject     {

    private Long id;

    private Integer productId = 0;
    private Integer prixVente = 0;
    @Column(length = 500)
    private String name;
    @Column(length = 500)
    private String image;
    @Column(length = 500)
    private String commentaire;
    @Column(length = 500)
    private String code;
    private BigDecimal quantite = BigDecimal.ZERO;
    private Integer prixPromo = 0;
    private Integer prixRevendeur = 0;
    private BigDecimal quantiteMarrakech = BigDecimal.ZERO;
    private BigDecimal quantiteRabat = BigDecimal.ZERO;
    @Column(length = 500)
    private String barCode;

    private Categories categories ;
    private Brands brands ;


    public Products(){
        super();
    }

    public Products(Long id,String name){
        this.id = id;
        this.name = name ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="products_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public Integer getProductId(){
        return this.productId;
    }
    public void setProductId(Integer productId){
        this.productId = productId;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Categories getCategories(){
        return this.categories;
    }
    public void setCategories(Categories categories){
        this.categories = categories;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Brands getBrands(){
        return this.brands;
    }
    public void setBrands(Brands brands){
        this.brands = brands;
    }
    public Integer getPrixVente(){
        return this.prixVente;
    }
    public void setPrixVente(Integer prixVente){
        this.prixVente = prixVente;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getImage(){
        return this.image;
    }
    public void setImage(String image){
        this.image = image;
    }
    public String getCommentaire(){
        return this.commentaire;
    }
    public void setCommentaire(String commentaire){
        this.commentaire = commentaire;
    }
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public BigDecimal getQuantite(){
        return this.quantite;
    }
    public void setQuantite(BigDecimal quantite){
        this.quantite = quantite;
    }
    public Integer getPrixPromo(){
        return this.prixPromo;
    }
    public void setPrixPromo(Integer prixPromo){
        this.prixPromo = prixPromo;
    }
    public Integer getPrixRevendeur(){
        return this.prixRevendeur;
    }
    public void setPrixRevendeur(Integer prixRevendeur){
        this.prixRevendeur = prixRevendeur;
    }
    public BigDecimal getQuantiteMarrakech(){
        return this.quantiteMarrakech;
    }
    public void setQuantiteMarrakech(BigDecimal quantiteMarrakech){
        this.quantiteMarrakech = quantiteMarrakech;
    }
    public BigDecimal getQuantiteRabat(){
        return this.quantiteRabat;
    }
    public void setQuantiteRabat(BigDecimal quantiteRabat){
        this.quantiteRabat = quantiteRabat;
    }
    public String getBarCode(){
        return this.barCode;
    }
    public void setBarCode(String barCode){
        this.barCode = barCode;
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
        Products products = (Products) o;
        return id != null && id.equals(products.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

