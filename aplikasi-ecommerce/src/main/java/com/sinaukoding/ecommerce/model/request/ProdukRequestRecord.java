package com.sinaukoding.ecommerce.model.request;

import com.sinaukoding.ecommerce.model.enums.Status;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.Set;

public record ProdukRequestRecord(String id,
                                  @NotBlank(message = "Nama tidak boleh kosong") String nama,
                                  @NotBlank(message = "Deskripsi tidak boleh kosong") String deskripsi,
                                  @NotNull(message = "Harga tidak boleh kosong") Double harga,
                                  @NotNull(message = "Stok tidak boleh kosong") Integer stok,
                                  @NotNull(message = "Status tidak boleh kosong") Status status,
                                  @NotEmpty(message = "Gambar tidak boleh kosong") Set<String> listImage) {
}