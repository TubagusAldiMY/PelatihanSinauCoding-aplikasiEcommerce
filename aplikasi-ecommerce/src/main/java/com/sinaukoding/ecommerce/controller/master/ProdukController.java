package com.sinaukoding.ecommerce.controller.master;

import com.sinaukoding.ecommerce.model.filter.ProdukFilterRecord;
import com.sinaukoding.ecommerce.model.request.ProdukRequestRecord;
import com.sinaukoding.ecommerce.model.response.BaseResponse;
import com.sinaukoding.ecommerce.service.master.ProdukService;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("produk")
@RequiredArgsConstructor
@Tag(name = "Produk API")
public class ProdukController {

    private final ProdukService produkService;

    @PostMapping("save")
    @PreAuthorize("hasRole('PENJUAL')")
    public BaseResponse<?> save(@RequestBody ProdukRequestRecord request) {
        produkService.add(request);
        return BaseResponse.ok("Data berhasil disimpan", null);
    }

    @PostMapping("edit")
    @PreAuthorize("hasRole('PENJUAL')")
    public BaseResponse<?> edit(@RequestBody ProdukRequestRecord request) {
        produkService.edit(request);
        return BaseResponse.ok("Data berhasil diubah", null);
    }

    @PostMapping("find-all")
    @Parameters({
            @Parameter(name = "page", description = "Page Number", in = ParameterIn.QUERY, schema = @Schema(type = "integer", defaultValue = "0"), required = true),
            @Parameter(name = "size", description = "Size Per Page", in = ParameterIn.QUERY, schema = @Schema(type = "integer", defaultValue = "10"), required = true),
            @Parameter(name = "sort", description = "Sorting Data", in = ParameterIn.QUERY, schema = @Schema(type = "string", defaultValue = "modifiedDate,desc"), required = true)
    })
    public BaseResponse<?> findAll(@PageableDefault(direction = Sort.Direction.DESC, sort = "modifiedDate") Pageable pageable,
                                   @RequestBody ProdukFilterRecord filterRequest) {
        return BaseResponse.ok(null, produkService.findAll(filterRequest, pageable));
    }

    @GetMapping("find-by-id/{id}")
    public BaseResponse<?> findById(@PathVariable String id) {
        return BaseResponse.ok(null, produkService.findById(id));
    }

}
