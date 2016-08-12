package com.hot.datacenter.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by allan on 8/1/16.
 */
@Entity
@Table(name = "SSQV2")
@Setter
@Getter
@Cacheable(false)
public class MallAreaData {
    @Id
    @Column(name = "ssqId")
    private String id;
    @Column(name = "ssqName")
    private String name;
    @Column(name = "parentId")
    private String parentId;
    @Column(name = "ssqLevel")
    private int level;
    @Column(name = "type")
    private String type;
}
