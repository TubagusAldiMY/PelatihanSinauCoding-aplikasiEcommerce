package com.sinaukoding.ecommerce.model.filter;

import com.sinaukoding.ecommerce.model.enums.Status;

public record ProdukFilterRecord(
        String nama,
        Status status,
        Integer stok,
        Double hargaBawah,
        Double hargaAtas
) {
}
