package com.hot.datacenter.entity.customer;

import com.hot.datacenter.entity.client.User;
import com.hot.datacenter.ienum.AgentStatusEnum;
import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

import javax.persistence.*;
import java.util.Date;

/**
 * 代理商
 * Created by allan on 7/18/16.
 */
@Entity
@Table(name = "Agt_Agent")
@Cacheable(value = false)
@Getter
@Setter
public class MallAgent {
    @Id
    @Column(name = "Agent_ID")
    private Integer id;

    @Column(name = "Login_Name")
    private String username;

    /**
     * 登录密码(用来传递数据)
     */
    @Transient
    private String password;
    /**
     * 平台方
     */
    @Column(name = "Customer_Id")
    private Integer customerId;

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
    @Column(name = "Address")
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
     * 上级代理商
     *
     * @return
     */
    @JoinColumn(name = "Parent_Agent_Id")
    @ManyToOne
    private MallAgent parentAgent;

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
     * 审核状态
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
     * 图标
     */
    @Column(name = "Logo")
    private String logo;

    /**
     * 代理商等级
     */
    @JoinColumn(name = "Level_Id")
    @ManyToOne
    private AgentLevel agentLevel;

    public boolean isAgent() {
        return true;
    }

    public boolean hasAccountInfo() {
        return !StringUtils.isEmpty(bankName) && !StringUtils.isEmpty(accountName) && !StringUtils.isEmpty(accountNo);
    }
}
