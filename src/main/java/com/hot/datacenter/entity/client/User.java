package com.hot.datacenter.entity.client;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by allan on 7/15/16.
 */
@Entity
@Table(name = "Hot_UserBaseInfo")
@Setter
@Getter
@Cacheable(false)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UB_UserID")
    private Long userId;
    /**
     * 用户登录名（手机）
     */
    @Column(name = "UB_UserLoginName")
    private String loginName;
    /**
     * 用户等级
     */
    @ManyToOne
    @JoinColumn(name = "UB_LevelID", referencedColumnName = "UL_ID")
    private UserLevel userLevel;
    /**
     * 用户昵称
     */
    @Column(name = "UB_UserNickName")
    private String nickname;
    /**
     * 用户真实姓名
     */
    @Column(name = "UB_UserRealName")
    private String realName;
    /**
     * 手机号码
     */
    @Column(name = "UB_UserMobile")
    private String mobile;

    /**
     * 商户id
     */
    @Column(name = "UB_CustomerID")
    private int customerId;
}
