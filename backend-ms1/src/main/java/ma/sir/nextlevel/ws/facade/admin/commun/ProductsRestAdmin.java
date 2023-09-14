package  ma.sir.nextlevel.ws.facade.admin.commun;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import ma.sir.nextlevel.bean.core.commun.Products;
import ma.sir.nextlevel.bean.history.commun.ProductsHistory;
import ma.sir.nextlevel.dao.criteria.core.commun.ProductsCriteria;
import ma.sir.nextlevel.dao.criteria.history.commun.ProductsHistoryCriteria;
import ma.sir.nextlevel.service.facade.admin.commun.ProductsAdminService;
import ma.sir.nextlevel.ws.converter.commun.ProductsConverter;
import ma.sir.nextlevel.ws.dto.commun.ProductsDto;
import ma.sir.nextlevel.zynerator.controller.AbstractController;
import ma.sir.nextlevel.zynerator.dto.AuditEntityDto;
import ma.sir.nextlevel.zynerator.util.PaginatedList;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.sir.nextlevel.zynerator.process.Result;

import org.springframework.http.HttpEntity;

import org.springframework.web.multipart.MultipartFile;
import ma.sir.nextlevel.zynerator.dto.FileTempDto;

@RestController
@RequestMapping("/api/admin/products/")
public class ProductsRestAdmin  extends AbstractController<Products, ProductsDto, ProductsHistory, ProductsCriteria, ProductsHistoryCriteria, ProductsAdminService, ProductsConverter> {


    @Operation(summary = "Import excel")
    @PostMapping("import-excel")
    public ResponseEntity<List<Products>> importExcel(@RequestParam("file") MultipartFile file){
        return super.importExcel(file);
    }

    @Operation(summary = "Exporte pdf")
    @PostMapping("exportPdf/")
    public HttpEntity<byte[]> createPdf(@RequestBody ProductsDto dto) throws Exception{
        return service.createPdf(dto);
    }
    @Operation(summary = "upload one products")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @Operation(summary = "upload multiple productss")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @Operation(summary = "Finds a list of all productss")
    @GetMapping("")
    public ResponseEntity<List<ProductsDto>> findAll() throws Exception {
        return super.findAll();
    }

    @Operation(summary = "Finds an optimized list of all productss")
    @GetMapping("optimized")
    public ResponseEntity<List<ProductsDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @Operation(summary = "Finds a products by id")
    @GetMapping("id/{id}")
    public ResponseEntity<ProductsDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @Operation(summary = "Saves the specified  products")
    @PostMapping("")
    public ResponseEntity<ProductsDto> save(@RequestBody ProductsDto dto) throws Exception {
        return super.save(dto);
    }

    @Operation(summary = "Updates the specified  products")
    @PutMapping("")
    public ResponseEntity<ProductsDto> update(@RequestBody ProductsDto dto) throws Exception {
        return super.update(dto);
    }

    @Operation(summary = "Delete list of products")
    @PostMapping("multiple")
    public ResponseEntity<List<ProductsDto>> delete(@RequestBody List<ProductsDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @Operation(summary = "Delete the specified products")
    @DeleteMapping("")
    public ResponseEntity<ProductsDto> delete(@RequestBody ProductsDto dto) throws Exception {
            return super.delete(dto);
    }

    @Operation(summary = "Delete the specified products")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @Operation(summary = "Delete multiple productss by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @Operation(summary = "find by categories id")
    @GetMapping("categories/id/{id}")
    public List<Products> findByCategoriesId(@PathVariable Long id){
        return service.findByCategoriesId(id);
    }
    @Operation(summary = "delete by categories id")
    @DeleteMapping("categories/id/{id}")
    public int deleteByCategoriesId(@PathVariable Long id){
        return service.deleteByCategoriesId(id);
    }
    @Operation(summary = "find by brands id")
    @GetMapping("brands/id/{id}")
    public List<Products> findByBrandsId(@PathVariable Long id){
        return service.findByBrandsId(id);
    }
    @Operation(summary = "delete by brands id")
    @DeleteMapping("brands/id/{id}")
    public int deleteByBrandsId(@PathVariable Long id){
        return service.deleteByBrandsId(id);
    }
    @Operation(summary = "Finds productss by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<ProductsDto>> findByCriteria(@RequestBody ProductsCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @Operation(summary = "Finds paginated productss by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody ProductsCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @Operation(summary = "Exports productss by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody ProductsCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @Operation(summary = "Gets products data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody ProductsCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @Operation(summary = "Gets products history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @Operation(summary = "Gets products paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody ProductsHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @Operation(summary = "Exports products history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody ProductsHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @Operation(summary = "Gets products history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody ProductsHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }

    public ProductsRestAdmin (ProductsAdminService service, ProductsConverter converter) {
        super(service, converter);
    }




}