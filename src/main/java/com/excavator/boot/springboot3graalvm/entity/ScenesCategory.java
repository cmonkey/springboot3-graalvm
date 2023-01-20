package com.excavator.boot.springboot3graalvm.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 场景类目表，存储了各级场景类目，用parentId进行查找父级场景类目(ScenesCategory)实体类
 *
 * @author majiayong
 * @since 2022-11-25 10:35:17
 */
public class ScenesCategory implements Serializable {
    private static final long serialVersionUID = -72230708092700692L;
    /**
     * 主键
     */
    private Long              id;
    /**
     * 场景类目的标题
     */
    private String            title;
    /**
     * 场景类目的描述
     */
    private String            description;
    /**
     * 场景类目的父级类目的id
     */
    private Long              parentCategoryId;
    /**
     * 场景类目的根级类目的id
     */
    private Long              rootCategoryId;
    /**
     * 场景类目的层级，一级类目=1，二级类目=2，依此类推
     */
    private Integer           categoryLevel;
    /**
     * icon图片的url
     */
    private String            iconImageUrl;
    /**
     * 场景背景图片的url
     */
    private String            backgroundImageUrl;
    /**
     * 是否开启 0 = 不开启， 1= 开启
     */
    private Integer           enableStatus;
    /**
     * 排序号，按照自然数，1最优先。序号只在本级类目生效，本级类目中的序号不可重复，
     */
    private Integer           orderNum;
    /**
     * 开始时间-冗余字段
     */
    private Date              startTime;
    /**
     * 结束时间-冗余字段
     */
    private Date              endTime;
    /**
     * 创建时的时间
     */
    private Date              createdAt;
    /**
     * 修改者
     */
    private String            updateBy;
    /**
     * 修改时的时间
     */
    private Date              updateAt;
    /**
     * 创建者
     */
    private String            createdBy;
    /**
     * 专题id
     */
    private String            subscribeId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getParentCategoryId() {
        return parentCategoryId;
    }

    public void setParentCategoryId(Long parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
    }

    public Long getRootCategoryId() {
        return rootCategoryId;
    }

    public void setRootCategoryId(Long rootCategoryId) {
        this.rootCategoryId = rootCategoryId;
    }

    public Integer getCategoryLevel() {
        return categoryLevel;
    }

    public void setCategoryLevel(Integer categoryLevel) {
        this.categoryLevel = categoryLevel;
    }

    public Integer getEnableStatus() {
        return enableStatus;
    }

    public void setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getIconImageUrl() {
        return iconImageUrl;
    }

    public void setIconImageUrl(String iconImageUrl) {
        this.iconImageUrl = iconImageUrl;
    }

    public String getBackgroundImageUrl() {
        return backgroundImageUrl;
    }

    public void setBackgroundImageUrl(String backgroundImageUrl) {
        this.backgroundImageUrl = backgroundImageUrl;
    }

    public String getSubscribeId() {
        return subscribeId;
    }

    public void setSubscribeId(String subscribeId) {
        this.subscribeId = subscribeId;
    }
}
