package com.hot.datacenter.entity.customer;

import com.hot.datacenter.entity.client.User;
import com.hot.datacenter.ienum.AgentStatusEnum;
import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

import javax.persistence.*;
import java.util.Date;


/**
 * 代理商门店
 * Created by helloztt on 2016/5/9.
 */
@Entity
@Table(name = "Agt_Shop")
@Cacheable(value = false)
@Getter
@Setter
public class AgentShop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Shop_ID")
    private Integer id;
    /**
     * 平台方
     */
    @Column(name = "Customer_Id")
    private Integer customerId;

    /**
     * 登录名
     */
    @Column(name = "LoginName")
    private String username;
    /**
     * 登录密码
     */
    @Column(name = "LoginPwd")
    private String password;

    /**
     * 名称
     */
    @Column(name = "Name")
    private String name;

    /**
     * 联系人
     */
    @Column(name = "Contact")
    private String contact;

    /**
     * 手机号码
     */
    @Column(name = "Mobile")
    private String mobile;

    /**
     * 电话号码
     */
    @Column(name = "Telephone")
    private String telephone;

    /**
     * 地址
     */
    @Column(name = "address")
    private String address;

    /**
     * 是否冻结
     */
    @Column(name = "Disabled")
    private boolean isDisabled;

    /**
     * 是否删除
     */
    @Column(name = "Deleted")
    private boolean isDeleted;

    /**
     * 所属代理商
     *
     * @return
     */
    @JoinColumn(name = "Agent_Id")
    @ManyToOne
    private MallAgent agent;

    /**
     * 小伙伴
     */
    @OneToOne
    @JoinColumn(name = "UB_UserID")
    private User user;

    /**
     * 省code
     *
     * @return
     */
    @Column(name = "ProvinceCode")
    private String provinceCode;

    /**
     * 市code
     *
     * @return
     */
    @Column(name = "CityCode")
    private String cityCode;

    /**
     * 区code
     *
     * @return
     */
    @Column(name = "DistrictCode")
    private String districtCode;

    /**
     * 省市区
     *
     * @return
     */
    @Column(name = "Address_Area")
    private String address_Area;

    /**
     * 门店审核状态
     * 代理商添加时审核状态默认为 审核通过
     */
    @Column(name = "Status")
    private AgentStatusEnum status;

    /**
     * 备注
     *
     * @return
     */
    @Column(name = "Comment")
    private String comment;

    /**
     * 创建时间
     */
    @Column(name = "CreateTime")
    private Date createTime;


    /**
     * 开户银行名称
     */
    @Column(name = "BankName")
    private String bankName;

    /**
     * 账户名
     */
    @Column(name = "AccountName")
    private String accountName;

    /**
     * 银行账号
     */
    @Column(name = "AccountNo")
    private String accountNo;

    /**
     * 邮箱
     */
    @Column(name = "Email")
    private String email;

    /**
     * 经度
     */
    @Column(name = "Lan")
    private Double lan;

    /**
     * 纬度
     */
    @Column(name = "Lat")
    private Double lat;

    /**
     * 客服电话
     */
    @Column(name = "Service_Tel")
    private String serveiceTel;

    /**
     * 售后电话
     */
    @Column(name = "AfterSal_Tel")
    private String afterSalTel;

    /**
     * 售后QQ
     */
    @Column(name = "AfterSal_QQ")
    private String afterSalQQ;

    /**
     * 审核备注
     */
    @Column(name = "Audit_Comment")
    private String auditComment;

    /**
     * 图标
     */
    @Column(name = "Logo")
    private String logo;

    /**
     * 工作日
     */
    @Column(name = "Workday")
    private String workday;

    /**
     * 营业开始时间
     */
    @Temporal(TemporalType.TIME)
    @Column(name = "OpenTime")
    private Date openTime;

    /**
     * 营业结束时间
     */
    @Temporal(TemporalType.TIME)
    @Column(name = "CloseTime")
    private Date closeTime;

    public boolean hasAccountInfo() {
        return !StringUtils.isEmpty(bankName) && !StringUtils.isEmpty(bankName) && !StringUtils.isEmpty(bankName);
    }
}
