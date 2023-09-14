package  ma.sir.nextlevel.ws.converter.commun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;




import ma.sir.nextlevel.zynerator.util.StringUtil;
import ma.sir.nextlevel.zynerator.converter.AbstractConverter;
import ma.sir.nextlevel.zynerator.util.DateUtil;
import ma.sir.nextlevel.bean.history.commun.BrandsHistory;
import ma.sir.nextlevel.bean.core.commun.Brands;
import ma.sir.nextlevel.ws.dto.commun.BrandsDto;

@Component
public class BrandsConverter extends AbstractConverter<Brands, BrandsDto, BrandsHistory> {


    public  BrandsConverter(){
        super(Brands.class, BrandsDto.class, BrandsHistory.class);
    }

    @Override
    public Brands toItem(BrandsDto dto) {
        if (dto == null) {
            return null;
        } else {
        Brands item = new Brands();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getName()))
                item.setName(dto.getName());



        return item;
        }
    }

    @Override
    public BrandsDto toDto(Brands item) {
        if (item == null) {
            return null;
        } else {
            BrandsDto dto = new BrandsDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getName()))
                dto.setName(item.getName());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
