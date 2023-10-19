package com.app.sikolam.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_nilai")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NilaiEntity {
    @Id
    @Column(name = "nilai_id", length = 36, unique = true)
    private String id;

    @Column(name = "nilai_code", length = 64, unique = true)
    private String code;

    @Column(name = "nilai_name", length = 128)
    private String name;

    @Column(name = "category", length = 64)
    private String category;

    @Column(name = "position")
    private Integer positon;
}
