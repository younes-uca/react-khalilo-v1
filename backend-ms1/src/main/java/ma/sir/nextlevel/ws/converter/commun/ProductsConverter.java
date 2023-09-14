package  ma.sir.nextlevel.ws.converter.commun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.sir.nextlevel.ws.converter.commun.BrandsConverter;
import ma.sir.nextlevel.ws.converter.commun.CategoriesConverter;



import ma.sir.nextlevel.zynerator.util.StringUtil;
import ma.sir.nextlevel.zynerator.converter.AbstractConverter;
import ma.sir.nextlevel.zynerator.util.DateUtil;
import ma.sir.nextlevel.bean.history.commun.ProductsHistory;
import ma.sir.nextlevel.bean.core.commun.Products;
import ma.sir.nextlevel.ws.dto.commun.ProductsDto;

@Component
public class ProductsConverter extends AbstractConverter<Products, ProductsDto, ProductsHistory> {

    @Autowired
    private BrandsConverter brandsConverter ;
    @Autowired
    private CategoriesConverter categoriesConverter ;
    private boolean categories;
    private boolean brands;

    public  ProductsConverter(){
        super(Products.class, ProductsDto.class, ProductsHistory.class);
    }

    @Override
    public Products toItem(ProductsDto dto) {
        if (dto == null) {
            return null;
        } else {
        Products item = new Products();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getProductId()))
                item.setProductId(dto.getProductId());
            if(StringUtil.isNotEmpty(dto.getPrixVente()))
                item.setPrixVente(dto.getPrixVente());
            if(StringUtil.isNotEmpty(dto.getName()))
                item.setName(dto.getName());
            if(StringUtil.isNotEmpty(dto.getImage()))
                item.setImage(dto.getImage());
            if(StringUtil.isNotEmpty(dto.getCommentaire()))
                item.setCommentaire(dto.getCommentaire());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getQuantite()))
                item.setQuantite(dto.getQuantite());
            if(StringUtil.isNotEmpty(dto.getPrixPromo()))
                item.setPrixPromo(dto.getPrixPromo());
            if(StringUtil.isNotEmpty(dto.getPrixRevendeur()))
                item.setPrixRevendeur(dto.getPrixRevendeur());
            if(StringUtil.isNotEmpty(dto.getQuantiteMarrakech()))
                item.setQuantiteMarrakech(dto.getQuantiteMarrakech());
            if(StringUtil.isNotEmpty(dto.getQuantiteRabat()))
                item.setQuantiteRabat(dto.getQuantiteRabat());
            if(StringUtil.isNotEmpty(dto.getBarCode()))
                item.setBarCode(dto.getBarCode());
            if(this.categories && dto.getCategories()!=null &&  dto.getCategories().getId() != null)
                item.setCategories(categoriesConverter.toItem(dto.getCategories())) ;

            if(this.brands && dto.getBrands()!=null &&  dto.getBrands().getId() != null)
                item.setBrands(brandsConverter.toItem(dto.getBrands())) ;




        return item;
        }
    }

    @Override
    public ProductsDto toDto(Products item) {
        if (item == null) {
            return null;
        } else {
            ProductsDto dto = new ProductsDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getProductId()))
                dto.setProductId(item.getProductId());
            if(StringUtil.isNotEmpty(item.getPrixVente()))
                dto.setPrixVente(item.getPrixVente());
            if(StringUtil.isNotEmpty(item.getName()))
                dto.setName(item.getName());
            if(StringUtil.isNotEmpty(item.getImage()))
                dto.setImage(item.getImage());
            if(StringUtil.isNotEmpty(item.getCommentaire()))
                dto.setCommentaire(item.getCommentaire());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getQuantite()))
                dto.setQuantite(item.getQuantite());
            if(StringUtil.isNotEmpty(item.getPrixPromo()))
                dto.setPrixPromo(item.getPrixPromo());
            if(StringUtil.isNotEmpty(item.getPrixRevendeur()))
                dto.setPrixRevendeur(item.getPrixRevendeur());
            if(StringUtil.isNotEmpty(item.getQuantiteMarrakech()))
                dto.setQuantiteMarrakech(item.getQuantiteMarrakech());
            if(StringUtil.isNotEmpty(item.getQuantiteRabat()))
                dto.setQuantiteRabat(item.getQuantiteRabat());
            if(StringUtil.isNotEmpty(item.getBarCode()))
                dto.setBarCode(item.getBarCode());
        if(this.categories && item.getCategories()!=null) {
            dto.setCategories(categoriesConverter.toDto(item.getCategories())) ;
        }
        if(this.brands && item.getBrands()!=null) {
            dto.setBrands(brandsConverter.toDto(item.getBrands())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.categories = value;
        this.brands = value;
    }


    public BrandsConverter getBrandsConverter(){
        return this.brandsConverter;
    }
    public void setBrandsConverter(BrandsConverter brandsConverter ){
        this.brandsConverter = brandsConverter;
    }
    public CategoriesConverter getCategoriesConverter(){
        return this.categoriesConverter;
    }
    public void setCategoriesConverter(CategoriesConverter categoriesConverter ){
        this.categoriesConverter = categoriesConverter;
    }
    public boolean  isCategories(){
        return this.categories;
    }
    public void  setCategories(boolean categories){
        this.categories = categories;
    }
    public boolean  isBrands(){
        return this.brands;
    }
    public void  setBrands(boolean brands){
        this.brands = brands;
    }
}
