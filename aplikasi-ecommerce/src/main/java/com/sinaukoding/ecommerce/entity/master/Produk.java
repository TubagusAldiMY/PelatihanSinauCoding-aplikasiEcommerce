package com.sinaukoding.ecommerce.entity.master;

import com.sinaukoding.ecommerce.entity.app.BaseEntity;
import com.sinaukoding.ecommerce.model.enums.Status;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "m_produk", indexes = {
        @Index(name = "idx_produk_created_date", columnList = "createdDate"),
        @Index(name = "idx_produk_modified_date", columnList = "modifiedDate"),
        @Index(name = "idx_produk_status", columnList = "status"),
        @Index(name = "idx_produk_nama", columnList = "nama"),
        @Index(name = "idx_produk_harga", columnList = "harga")
})
public class Produk extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Size(max = 100, message = "Max karakter 100")
    @Column(nullable = false)
    private String nama;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String deskripsi;

    @Min(value = 0, message = "Harga tidak boleh negatif")
    @Column(nullable = false)
    private Double harga;

    @Min(value = 0, message = "Stok tidak boleh negatif")
    @Column(nullable = false)
    private Integer stok;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "produk", orphanRemoval = true, fetch = FetchType.LAZY)
    @Builder.Default
    private Set<ProdukImage> listImage = new HashSet<>();

}
