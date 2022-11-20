package com.project30.demo31.entity;

import lombok.Data;
import org.hibernate.annotations.Table;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity(name = "lookup_code_t")
public class LookupCodeEntity {
    @Id
    private Long id;

    private String lookupCode;
    private String lookupCodeType;
    private String nameCn;
    private String nameEn;
    private String deleteFlag;
}
