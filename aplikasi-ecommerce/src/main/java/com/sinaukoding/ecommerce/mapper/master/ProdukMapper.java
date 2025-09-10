package com.sinaukoding.ecommerce.mapper.master;

import com.sinaukoding.ecommerce.entity.master.Produk;
import com.sinaukoding.ecommerce.entity.master.ProdukImage;
import com.sinaukoding.ecommerce.model.request.ProdukRequestRecord;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class ProdukMapper {

    public Produk requestToEntity(ProdukRequestRecord request) {
        Produk produk = Produk.builder()
                .nama(request.nama().toUpperCase())
                .deskripsi(request.deskripsi())
                .harga(request.harga())
                .stok(request.stok())
                .status(request.status())
                .build();

        produk.setListImage(request.listImage().stream()
                .map(path -> ProdukImage.builder()
                        .path(path)
                        .produk(produk)
                        .build())
                .collect(Collectors.toSet()));

        return produk;
    }

}
