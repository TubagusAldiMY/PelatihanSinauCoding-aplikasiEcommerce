package com.sinaukoding.ecommerce.service.master;

import com.sinaukoding.ecommerce.model.app.SimpleMap;
import com.sinaukoding.ecommerce.model.filter.ProdukFilterRecord;
import com.sinaukoding.ecommerce.model.request.ProdukRequestRecord;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProdukService {

    void add(ProdukRequestRecord request);

    void edit(ProdukRequestRecord request);

    Page<SimpleMap> findAll(ProdukFilterRecord filterRequest, Pageable pageable);

    SimpleMap findById(String id);

}
