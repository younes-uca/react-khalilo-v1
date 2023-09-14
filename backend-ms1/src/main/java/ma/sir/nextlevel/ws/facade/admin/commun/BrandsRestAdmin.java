package  ma.sir.nextlevel.ws.facade.admin.commun;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import ma.sir.nextlevel.bean.core.commun.Brands;
import ma.sir.nextlevel.bean.history.commun.BrandsHistory;
import ma.sir.nextlevel.dao.criteria.core.commun.BrandsCriteria;
import ma.sir.nextlevel.dao.criteria.history.commun.BrandsHistoryCriteria;
import ma.sir.nextlevel.service.facade.admin.commun.BrandsAdminService;
import ma.sir.nextlevel.ws.converter.commun.BrandsConverter;
import ma.sir.nextlevel.ws.dto.commun.BrandsDto;
import ma.sir.nextlevel.zynerator.controller.AbstractController;
import ma.sir.nextlevel.zynerator.dto.AuditEntityDto;
import ma.sir.nextlevel.zynerator.util.PaginatedList;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.sir.nextlevel.zynerator.process.Result;


import org.springframework.web.multipart.MultipartFile;
import ma.sir.nextlevel.zynerator.dto.FileTempDto;

@RestController
@RequestMapping("/api/admin/brands/")
public class BrandsRestAdmin  extends AbstractController<Brands, BrandsDto, BrandsHistory, BrandsCriteria, BrandsHistoryCriteria, BrandsAdminService, BrandsConverter> {



    @Operation(summary = "upload one brands")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @Operation(summary = "upload multiple brandss")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @Operation(summary = "Finds a list of all brandss")
    @GetMapping("")
    public ResponseEntity<List<BrandsDto>> findAll() throws Exception {
        return super.findAll();
    }

    @Operation(summary = "Finds an optimized list of all brandss")
    @GetMapping("optimized")
    public ResponseEntity<List<BrandsDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @Operation(summary = "Finds a brands by id")
    @GetMapping("id/{id}")
    public ResponseEntity<BrandsDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @Operation(summary = "Saves the specified  brands")
    @PostMapping("")
    public ResponseEntity<BrandsDto> save(@RequestBody BrandsDto dto) throws Exception {
        return super.save(dto);
    }

    @Operation(summary = "Updates the specified  brands")
    @PutMapping("")
    public ResponseEntity<BrandsDto> update(@RequestBody BrandsDto dto) throws Exception {
        return super.update(dto);
    }

    @Operation(summary = "Delete list of brands")
    @PostMapping("multiple")
    public ResponseEntity<List<BrandsDto>> delete(@RequestBody List<BrandsDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @Operation(summary = "Delete the specified brands")
    @DeleteMapping("")
    public ResponseEntity<BrandsDto> delete(@RequestBody BrandsDto dto) throws Exception {
            return super.delete(dto);
    }

    @Operation(summary = "Delete the specified brands")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @Operation(summary = "Delete multiple brandss by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @Operation(summary = "Finds brandss by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<BrandsDto>> findByCriteria(@RequestBody BrandsCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @Operation(summary = "Finds paginated brandss by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody BrandsCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @Operation(summary = "Exports brandss by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody BrandsCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @Operation(summary = "Gets brands data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody BrandsCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @Operation(summary = "Gets brands history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @Operation(summary = "Gets brands paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody BrandsHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @Operation(summary = "Exports brands history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody BrandsHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @Operation(summary = "Gets brands history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody BrandsHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }

    public BrandsRestAdmin (BrandsAdminService service, BrandsConverter converter) {
        super(service, converter);
    }




}