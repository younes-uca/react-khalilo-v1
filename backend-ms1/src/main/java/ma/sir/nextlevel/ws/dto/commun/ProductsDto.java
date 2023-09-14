package  ma.sir.nextlevel.ws.dto.commun;

import ma.sir.nextlevel.zynerator.audit.Log;
import ma.sir.nextlevel.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;




@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductsDto  extends AuditBaseDto {

    private Integer productId  = 0 ;
    private Integer prixVente  = 0 ;
    private String name  ;
    private String image  ;
    private String commentaire  ;
    private String code  ;
    private BigDecimal quantite  ;
    private Integer prixPromo  = 0 ;
    private Integer prixRevendeur  = 0 ;
    private BigDecimal quantiteMarrakech  ;
    private BigDecimal quantiteRabat  ;
    private String barCode  ;

    private CategoriesDto categories ;
    private BrandsDto brands ;



    public ProductsDto(){
        super();
    }



    @Log
    public Integer getProductId(){
        return this.productId;
    }
    public void setProductId(Integer productId){
        this.productId = productId;
    }

    @Log
    public Integer getPrixVente(){
        return this.prixVente;
    }
    public void setPrixVente(Integer prixVente){
        this.prixVente = prixVente;
    }

    @Log
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    @Log
    public String getImage(){
        return this.image;
    }
    public void setImage(String image){
        this.image = image;
    }

    @Log
    public String getCommentaire(){
        return this.commentaire;
    }
    public void setCommentaire(String commentaire){
        this.commentaire = commentaire;
    }

    @Log
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }

    @Log
    public BigDecimal getQuantite(){
        return this.quantite;
    }
    public void setQuantite(BigDecimal quantite){
        this.quantite = quantite;
    }

    @Log
    public Integer getPrixPromo(){
        return this.prixPromo;
    }
    public void setPrixPromo(Integer prixPromo){
        this.prixPromo = prixPromo;
    }

    @Log
    public Integer getPrixRevendeur(){
        return this.prixRevendeur;
    }
    public void setPrixRevendeur(Integer prixRevendeur){
        this.prixRevendeur = prixRevendeur;
    }

    @Log
    public BigDecimal getQuantiteMarrakech(){
        return this.quantiteMarrakech;
    }
    public void setQuantiteMarrakech(BigDecimal quantiteMarrakech){
        this.quantiteMarrakech = quantiteMarrakech;
    }

    @Log
    public BigDecimal getQuantiteRabat(){
        return this.quantiteRabat;
    }
    public void setQuantiteRabat(BigDecimal quantiteRabat){
        this.quantiteRabat = quantiteRabat;
    }

    @Log
    public String getBarCode(){
        return this.barCode;
    }
    public void setBarCode(String barCode){
        this.barCode = barCode;
    }


    public CategoriesDto getCategories(){
        return this.categories;
    }

    public void setCategories(CategoriesDto categories){
        this.categories = categories;
    }
    public BrandsDto getBrands(){
        return this.brands;
    }

    public void setBrands(BrandsDto brands){
        this.brands = brands;
    }






}
