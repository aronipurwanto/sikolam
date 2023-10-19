package com.app.sikolam.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_config")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConfigEntity {
    @Id
    @Column(name = "config_id", length = 36, unique = true)
    private String id;

    @Column(name = "config_name", length = 128)
    private String name;

    @Column(name = "config_value")
    private String value;

    @Column(name = "range_time")
    private Boolean rangeTime;

    @Column(name = "start_date")
    private LocalDateTime startDate;

    @Column(name = "end_date")
    private LocalDateTime endDate;

    @Column(name = "is_active")
    private Boolean isActive;
}
