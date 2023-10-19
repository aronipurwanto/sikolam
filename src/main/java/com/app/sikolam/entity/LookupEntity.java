package com.app.sikolam.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_lookup")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LookupEntity {
    @Id
    @Column(name = "lookup_id", length = 36, unique = true)
    private String id;
    @Column(name = "lookup_group", length = 64)
    private String group;
    @Column(name = "lookup_code", length = 64, unique = true)
    private String code;
    @Column(name = "lookup_name", length = 128)
    private String name;
    @Column(name = "position")
    private Integer position;
}
