package com.smacheng.domain;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.smacheng.commons.enums.Gender;
import com.smacheng.web.interceptor.MemberInterceptor;

/**
 * Entity - 会员
 *
 *
 *
 */
@Entity
@Table(name = "xx_member")
//@SequenceGenerator(name = "sequenceGenerator", sequenceName = "xx_member_sequence")
public class Member extends BaseEntity {

    private static final long serialVersionUID = 1533130686714725835L;
    /**
     * "身份信息"参数名称
     */
    public static final String PRINCIPAL_ATTRIBUTE_NAME = MemberInterceptor.class.getName() + ".PRINCIPAL";

    /**
     * "用户名"Cookie名称
     */
    public static final String USERNAME_COOKIE_NAME = "username";

    /**
     * 会员注册项值属性个数
     */
    public static final int ATTRIBUTE_VALUE_PROPERTY_COUNT = 10;

    /**
     * 会员注册项值属性名称前缀
     */
    public static final String ATTRIBUTE_VALUE_PROPERTY_NAME_PREFIX = "attributeValue";

    /**
     * 最大收藏商品数
     */
    public static final Integer MAX_FAVORITE_COUNT = 10;

    /**
     * 用户名
     */
    @NotEmpty(groups = Save.class)
    @Pattern(regexp = "^[0-9a-z_A-Z\\u4e00-\\u9fa5]+$")
    @Column(nullable = false, updatable = false, unique = true, length = 100)
    private String username;

    /**
     * 密码
     */
    @NotEmpty(groups = Save.class)
    @Pattern(regexp = "^[^\\s&\"<>]+$")
    @Column(nullable = false)
    private String password;

    /**
     * 安全密匙
     */
    private String salt;

    /**
     * @ 会员头像文件名
     * @ 这里虽然有Avatar 字段但只是保留上传的文件名 真正获取头像是跟会员id和s(大小)来确定
     */
    @Length(max = 120)
    @Column(length = 120)
    private String avatar;

    /**
     * 会员头像文件名
     */
    @Length(max = 10)
    @Column(length = 10)
    private String avatarType;

    /**
     * E-mail
     */
    @NotEmpty
    @Email
    @Length(max = 200)
    @Column(nullable = false, unique = true, length = 50)
    private String email;

    /**
     * 积分
     */
    @NotNull(groups = Save.class)
    @Min(0)
    @Column(nullable = false)
    private Long point;

    /**
     * 是否启用
     */
    @NotNull
    @Column(nullable = false)
    private Boolean isEnabled;

    /**
     * 是否锁定
     */
    @Column(nullable = false)
    private Boolean isLocked;

    /**
     * 连续登录失败次数
     */
    @Column(nullable = false)
    private Integer loginFailureCount;

    /**
     * 锁定日期
     */
    private Date lockedDate;

    /**
     * 注册IP
     */
    @Column(nullable = false, updatable = false)
    private String registerIp;

    /**
     * 最后登录IP
     */
    private String loginIp;

    /**
     * 最后登录日期
     */
    private Date loginDate;

    /**
     * 姓名
     */
    @Length(max = 200)
    private String name;

    /**
     * 性别
     */
    private Gender gender;

    /**
     * 出生日期
     */
    private Date birth;

    /**
     * 地址
     */
    @Length(max = 200)
    private String address;

    /**
     * 邮编
     */
    @Length(max = 200)
    private String zipCode;

    /**
     * 电话
     */
    @Length(max = 200)
    private String phone;

    /**
     * 手机
     */
    @Length(max = 200)
    private String mobile;

    /**
     * 地区
     */
    @ManyToOne(fetch = FetchType.LAZY)
    private Area area;

    /**
     * 会员等级
     */
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(nullable = false)
    private MemberRank memberRank;

    @OneToMany(mappedBy = "member", fetch = FetchType.LAZY)
    private Set<PhotosAlbum> photosAlbums;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAvatarType() {
        return avatarType;
    }

    public void setAvatarType(String avatarType) {
        this.avatarType = avatarType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPoint() {
        return point;
    }

    public void setPoint(Long point) {
        this.point = point;
    }

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Boolean getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
    }

    public Integer getLoginFailureCount() {
        return loginFailureCount;
    }

    public void setLoginFailureCount(Integer loginFailureCount) {
        this.loginFailureCount = loginFailureCount;
    }

    public Date getLockedDate() {
        return lockedDate;
    }

    public void setLockedDate(Date lockedDate) {
        this.lockedDate = lockedDate;
    }

    public String getRegisterIp() {
        return registerIp;
    }

    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Length(max = 200)
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public MemberRank getMemberRank() {
        return memberRank;
    }

    public void setMemberRank(MemberRank memberRank) {
        this.memberRank = memberRank;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Set<PhotosAlbum> getPhotosAlbums() {
        return photosAlbums;
    }

    public void setPhotosAlbums(Set<PhotosAlbum> photosAlbums) {
        this.photosAlbums = photosAlbums;
    }

    @Override
    public String toString() {
        return "Member{" + "username=" + username + ", password=" + password + ", salt=" + salt + ", avatar=" + avatar + ", avatarType=" + avatarType + ", email=" + email + ", point=" + point + ", isEnabled=" + isEnabled + ", isLocked=" + isLocked + ", loginFailureCount=" + loginFailureCount + ", lockedDate=" + lockedDate + ", registerIp=" + registerIp + ", loginIp=" + loginIp + ", loginDate=" + loginDate + ", name=" + name + ", gender=" + gender + ", birth=" + birth + ", address=" + address + ", zipCode=" + zipCode + ", phone=" + phone + ", mobile=" + mobile + ", area=" + area + ", memberRank=" + memberRank + ", photosAlbums=" + photosAlbums + '}';
    }

}
