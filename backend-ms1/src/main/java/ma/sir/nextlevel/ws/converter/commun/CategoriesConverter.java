package  ma.sir.nextlevel.ws.converter.commun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;




import ma.sir.nextlevel.zynerator.util.StringUtil;
import ma.sir.nextlevel.zynerator.converter.AbstractConverter;
import ma.sir.nextlevel.zynerator.util.DateUtil;
import ma.sir.nextlevel.bean.history.commun.CategoriesHistory;
import ma.sir.nextlevel.bean.core.commun.Categories;
import ma.sir.nextlevel.ws.dto.commun.CategoriesDto;

@Component
public class CategoriesConverter extends AbstractConverter<Categories, CategoriesDto, CategoriesHistory> {


    public  CategoriesConverter(){
        super(Categories.class, CategoriesDto.class, CategoriesHistory.class);
    }

    @Override
    public Categories toItem(CategoriesDto dto) {
        if (dto == null) {
            return null;
        } else {
        Categories item = new Categories();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getName()))
                item.setName(dto.getName());
            if(StringUtil.isNotEmpty(dto.getSortby()))
                item.setSortby(dto.getSortby());
            if(StringUtil.isNotEmpty(dto.getCategorieId()))
                item.setCategorieId(dto.getCategorieId());



        return item;
        }
    }

    @Override
    public CategoriesDto toDto(Categories item) {
        if (item == null) {
            return null;
        } else {
            CategoriesDto dto = new CategoriesDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getName()))
                dto.setName(item.getName());
            if(StringUtil.isNotEmpty(item.getSortby()))
                dto.setSortby(item.getSortby());
            if(StringUtil.isNotEmpty(item.getCategorieId()))
                dto.setCategorieId(item.getCategorieId());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
