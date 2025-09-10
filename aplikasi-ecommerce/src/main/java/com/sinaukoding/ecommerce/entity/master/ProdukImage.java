package com.sinaukoding.ecommerce.entity.master;

import com.sinaukoding.ecommerce.entity.app.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "m_produk_image", indexes = {
        @Index(name = "idx_produk_image_created_date", columnList = "createdDate"),
        @Index(name = "idx_produk_image_modified_date", columnList = "modifiedDate"),
        @Index(name = "idx_produk_image_id_produk", columnList = "id_produk"),
        @Index(name = "idx_produk_image_path", columnList = "path")
})
public class ProdukImage extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_produk", nullable = false)
    private Produk produk;

    @Column(nullable = false)
    private String path;

}
