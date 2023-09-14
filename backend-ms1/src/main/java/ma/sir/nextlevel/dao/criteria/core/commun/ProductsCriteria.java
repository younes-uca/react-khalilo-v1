package  ma.sir.nextlevel.dao.criteria.core.commun;



import ma.sir.nextlevel.zynerator.criteria.BaseCriteria;
import java.util.List;

public class ProductsCriteria extends  BaseCriteria  {

    private String productId;
    private String productIdMin;
    private String productIdMax;
    private String prixVente;
    private String prixVenteMin;
    private String prixVenteMax;
    private String name;
    private String nameLike;
    private String image;
    private String imageLike;
    private String commentaire;
    private String commentaireLike;
    private String code;
    private String codeLike;
    private String quantite;
    private String quantiteMin;
    private String quantiteMax;
    private String prixPromo;
    private String prixPromoMin;
    private String prixPromoMax;
    private String prixRevendeur;
    private String prixRevendeurMin;
    private String prixRevendeurMax;
    private String quantiteMarrakech;
    private String quantiteMarrakechMin;
    private String quantiteMarrakechMax;
    private String quantiteRabat;
    private String quantiteRabatMin;
    private String quantiteRabatMax;
    private String barCode;
    private String barCodeLike;

    private CategoriesCriteria categories ;
    private List<CategoriesCriteria> categoriess ;
    private BrandsCriteria brands ;
    private List<BrandsCriteria> brandss ;


    public ProductsCriteria(){}

    public String getProductId(){
        return this.productId;
    }
    public void setProductId(String productId){
        this.productId = productId;
    }   
    public String getProductIdMin(){
        return this.productIdMin;
    }
    public void setProductIdMin(String productIdMin){
        this.productIdMin = productIdMin;
    }
    public String getProductIdMax(){
        return this.productIdMax;
    }
    public void setProductIdMax(String productIdMax){
        this.productIdMax = productIdMax;
    }
      
    public String getPrixVente(){
        return this.prixVente;
    }
    public void setPrixVente(String prixVente){
        this.prixVente = prixVente;
    }   
    public String getPrixVenteMin(){
        return this.prixVenteMin;
    }
    public void setPrixVenteMin(String prixVenteMin){
        this.prixVenteMin = prixVenteMin;
    }
    public String getPrixVenteMax(){
        return this.prixVenteMax;
    }
    public void setPrixVenteMax(String prixVenteMax){
        this.prixVenteMax = prixVenteMax;
    }
      
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

    public String getImage(){
        return this.image;
    }
    public void setImage(String image){
        this.image = image;
    }
    public String getImageLike(){
        return this.imageLike;
    }
    public void setImageLike(String imageLike){
        this.imageLike = imageLike;
    }

    public String getCommentaire(){
        return this.commentaire;
    }
    public void setCommentaire(String commentaire){
        this.commentaire = commentaire;
    }
    public String getCommentaireLike(){
        return this.commentaireLike;
    }
    public void setCommentaireLike(String commentaireLike){
        this.commentaireLike = commentaireLike;
    }

    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getCodeLike(){
        return this.codeLike;
    }
    public void setCodeLike(String codeLike){
        this.codeLike = codeLike;
    }

    public String getQuantite(){
        return this.quantite;
    }
    public void setQuantite(String quantite){
        this.quantite = quantite;
    }   
    public String getQuantiteMin(){
        return this.quantiteMin;
    }
    public void setQuantiteMin(String quantiteMin){
        this.quantiteMin = quantiteMin;
    }
    public String getQuantiteMax(){
        return this.quantiteMax;
    }
    public void setQuantiteMax(String quantiteMax){
        this.quantiteMax = quantiteMax;
    }
      
    public String getPrixPromo(){
        return this.prixPromo;
    }
    public void setPrixPromo(String prixPromo){
        this.prixPromo = prixPromo;
    }   
    public String getPrixPromoMin(){
        return this.prixPromoMin;
    }
    public void setPrixPromoMin(String prixPromoMin){
        this.prixPromoMin = prixPromoMin;
    }
    public String getPrixPromoMax(){
        return this.prixPromoMax;
    }
    public void setPrixPromoMax(String prixPromoMax){
        this.prixPromoMax = prixPromoMax;
    }
      
    public String getPrixRevendeur(){
        return this.prixRevendeur;
    }
    public void setPrixRevendeur(String prixRevendeur){
        this.prixRevendeur = prixRevendeur;
    }   
    public String getPrixRevendeurMin(){
        return this.prixRevendeurMin;
    }
    public void setPrixRevendeurMin(String prixRevendeurMin){
        this.prixRevendeurMin = prixRevendeurMin;
    }
    public String getPrixRevendeurMax(){
        return this.prixRevendeurMax;
    }
    public void setPrixRevendeurMax(String prixRevendeurMax){
        this.prixRevendeurMax = prixRevendeurMax;
    }
      
    public String getQuantiteMarrakech(){
        return this.quantiteMarrakech;
    }
    public void setQuantiteMarrakech(String quantiteMarrakech){
        this.quantiteMarrakech = quantiteMarrakech;
    }   
    public String getQuantiteMarrakechMin(){
        return this.quantiteMarrakechMin;
    }
    public void setQuantiteMarrakechMin(String quantiteMarrakechMin){
        this.quantiteMarrakechMin = quantiteMarrakechMin;
    }
    public String getQuantiteMarrakechMax(){
        return this.quantiteMarrakechMax;
    }
    public void setQuantiteMarrakechMax(String quantiteMarrakechMax){
        this.quantiteMarrakechMax = quantiteMarrakechMax;
    }
      
    public String getQuantiteRabat(){
        return this.quantiteRabat;
    }
    public void setQuantiteRabat(String quantiteRabat){
        this.quantiteRabat = quantiteRabat;
    }   
    public String getQuantiteRabatMin(){
        return this.quantiteRabatMin;
    }
    public void setQuantiteRabatMin(String quantiteRabatMin){
        this.quantiteRabatMin = quantiteRabatMin;
    }
    public String getQuantiteRabatMax(){
        return this.quantiteRabatMax;
    }
    public void setQuantiteRabatMax(String quantiteRabatMax){
        this.quantiteRabatMax = quantiteRabatMax;
    }
      
    public String getBarCode(){
        return this.barCode;
    }
    public void setBarCode(String barCode){
        this.barCode = barCode;
    }
    public String getBarCodeLike(){
        return this.barCodeLike;
    }
    public void setBarCodeLike(String barCodeLike){
        this.barCodeLike = barCodeLike;
    }


    public CategoriesCriteria getCategories(){
        return this.categories;
    }

    public void setCategories(CategoriesCriteria categories){
        this.categories = categories;
    }
    public List<CategoriesCriteria> getCategoriess(){
        return this.categoriess;
    }

    public void setCategoriess(List<CategoriesCriteria> categoriess){
        this.categoriess = categoriess;
    }
    public BrandsCriteria getBrands(){
        return this.brands;
    }

    public void setBrands(BrandsCriteria brands){
        this.brands = brands;
    }
    public List<BrandsCriteria> getBrandss(){
        return this.brandss;
    }

    public void setBrandss(List<BrandsCriteria> brandss){
        this.brandss = brandss;
    }
}
