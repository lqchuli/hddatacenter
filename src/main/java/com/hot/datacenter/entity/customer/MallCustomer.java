package com.hot.datacenter.entity.customer;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * 商户表
 * Created by allan on 3/22/16.
 */
@Entity
@Table(name = "Swt_CustomerManage")
@Setter
@Getter
@Cacheable(false)
public class MallCustomer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SC_UserID")
    private Integer customerId;

    /**
     * 登录名
     */
    @Column(name = "SC_UserLoginName")
    private String username;
    /**
     * 商户昵称
     */
    @Column(name = "SC_UserNickName")
    private String nickName;
    /**
     * 登录密码
     */
    @Column(name = "SC_UserLoginPassword")
    private String password;
    /**
     *
     */
    @Column(name = "SC_IndustryType")
    private Integer industryType;

    @Column(name = "SC_UserActivate")
    private Integer userActivate;

    @Column(name = "SC_RoleID")
    private Integer roleID;

    @Column(name = "SC_BelongManagerID")
    private Integer belongManagerID;

    @Column(name = "SC_Email")
    private String email;

    @Column(name = "SC_IsOld")
    private Integer isOld;

    @Column(name = "SC_DeveloperUrl")
    private String developerUrl;

    @Column(name = "SC_developerToken")
    private String developerToken;

    @Column(name = "SC_TYPE")
    private Integer type;

    @Column(name = "SC_Score")
    private Double score;

    @Column(name = "SC_CityID")
    private Integer cityID;

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn(referencedColumnName = "Agent_ID")
    private MallAgent agent;
}
