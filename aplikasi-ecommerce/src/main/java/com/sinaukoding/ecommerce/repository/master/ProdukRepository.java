package com.sinaukoding.ecommerce.repository.master;

import com.sinaukoding.ecommerce.entity.master.Produk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProdukRepository extends JpaRepository<Produk, String>, JpaSpecificationExecutor<Produk> {
}
