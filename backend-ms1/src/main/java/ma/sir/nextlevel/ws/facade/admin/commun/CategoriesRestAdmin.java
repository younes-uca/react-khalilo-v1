package  ma.sir.nextlevel.ws.facade.admin.commun;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import ma.sir.nextlevel.bean.core.commun.Categories;
import ma.sir.nextlevel.bean.history.commun.CategoriesHistory;
import ma.sir.nextlevel.dao.criteria.core.commun.CategoriesCriteria;
import ma.sir.nextlevel.dao.criteria.history.commun.CategoriesHistoryCriteria;
import ma.sir.nextlevel.service.facade.admin.commun.CategoriesAdminService;
import ma.sir.nextlevel.ws.converter.commun.CategoriesConverter;
import ma.sir.nextlevel.ws.dto.commun.CategoriesDto;
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
@RequestMapping("/api/admin/categories/")
public class CategoriesRestAdmin  extends AbstractController<Categories, CategoriesDto, CategoriesHistory, CategoriesCriteria, CategoriesHistoryCriteria, CategoriesAdminService, CategoriesConverter> {



    @Operation(summary = "upload one categories")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @Operation(summary = "upload multiple categoriess")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @Operation(summary = "Finds a list of all categoriess")
    @GetMapping("")
    public ResponseEntity<List<CategoriesDto>> findAll() throws Exception {
        return super.findAll();
    }

    @Operation(summary = "Finds an optimized list of all categoriess")
    @GetMapping("optimized")
    public ResponseEntity<List<CategoriesDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @Operation(summary = "Finds a categories by id")
    @GetMapping("id/{id}")
    public ResponseEntity<CategoriesDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @Operation(summary = "Saves the specified  categories")
    @PostMapping("")
    public ResponseEntity<CategoriesDto> save(@RequestBody CategoriesDto dto) throws Exception {
        return super.save(dto);
    }

    @Operation(summary = "Updates the specified  categories")
    @PutMapping("")
    public ResponseEntity<CategoriesDto> update(@RequestBody CategoriesDto dto) throws Exception {
        return super.update(dto);
    }

    @Operation(summary = "Delete list of categories")
    @PostMapping("multiple")
    public ResponseEntity<List<CategoriesDto>> delete(@RequestBody List<CategoriesDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @Operation(summary = "Delete the specified categories")
    @DeleteMapping("")
    public ResponseEntity<CategoriesDto> delete(@RequestBody CategoriesDto dto) throws Exception {
            return super.delete(dto);
    }

    @Operation(summary = "Delete the specified categories")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @Operation(summary = "Delete multiple categoriess by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @Operation(summary = "Finds categoriess by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<CategoriesDto>> findByCriteria(@RequestBody CategoriesCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @Operation(summary = "Finds paginated categoriess by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody CategoriesCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @Operation(summary = "Exports categoriess by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody CategoriesCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @Operation(summary = "Gets categories data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody CategoriesCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @Operation(summary = "Gets categories history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @Operation(summary = "Gets categories paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody CategoriesHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @Operation(summary = "Exports categories history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody CategoriesHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @Operation(summary = "Gets categories history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody CategoriesHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }

    public CategoriesRestAdmin (CategoriesAdminService service, CategoriesConverter converter) {
        super(service, converter);
    }




}