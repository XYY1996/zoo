package com.xux.zoo.elephant.repo.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class MsgMedia implements Serializable {
    @ApiModelProperty(value = "媒体id")
    private Long mediaId;

    @ApiModelProperty(value = "媒体名称")
    private String mediaName;

    @ApiModelProperty(value = "媒体链接")
    private String mediaUrl;

    @ApiModelProperty(value = "媒体图标")
    private String mediaIcon;

    @ApiModelProperty(value = "父媒体id")
    private Integer parentMediaId;

    @ApiModelProperty(value = "父媒体名称")
    private String parentMediaName;

    @ApiModelProperty(value = "所属平台id")
    private Integer belongPlatfromId;

    @ApiModelProperty(value = "所属平台名称")
    private String belongPlatfromName;

    @ApiModelProperty(value = "所属平台类型")
    private String belongPlatfromType;

    @ApiModelProperty(value = "媒体类型")
    private String mediaType;

    @ApiModelProperty(value = "媒体类型名称")
    private String mediaTypeName;

    private Date createTime;

    private Date updateTime;

    private String desc;

    private static final long serialVersionUID = 1L;

    public Long getMediaId() {
        return mediaId;
    }

    public void setMediaId(Long mediaId) {
        this.mediaId = mediaId;
    }

    public String getMediaName() {
        return mediaName;
    }

    public void setMediaName(String mediaName) {
        this.mediaName = mediaName;
    }

    public String getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public String getMediaIcon() {
        return mediaIcon;
    }

    public void setMediaIcon(String mediaIcon) {
        this.mediaIcon = mediaIcon;
    }

    public Integer getParentMediaId() {
        return parentMediaId;
    }

    public void setParentMediaId(Integer parentMediaId) {
        this.parentMediaId = parentMediaId;
    }

    public String getParentMediaName() {
        return parentMediaName;
    }

    public void setParentMediaName(String parentMediaName) {
        this.parentMediaName = parentMediaName;
    }

    public Integer getBelongPlatfromId() {
        return belongPlatfromId;
    }

    public void setBelongPlatfromId(Integer belongPlatfromId) {
        this.belongPlatfromId = belongPlatfromId;
    }

    public String getBelongPlatfromName() {
        return belongPlatfromName;
    }

    public void setBelongPlatfromName(String belongPlatfromName) {
        this.belongPlatfromName = belongPlatfromName;
    }

    public String getBelongPlatfromType() {
        return belongPlatfromType;
    }

    public void setBelongPlatfromType(String belongPlatfromType) {
        this.belongPlatfromType = belongPlatfromType;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public String getMediaTypeName() {
        return mediaTypeName;
    }

    public void setMediaTypeName(String mediaTypeName) {
        this.mediaTypeName = mediaTypeName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mediaId=").append(mediaId);
        sb.append(", mediaName=").append(mediaName);
        sb.append(", mediaUrl=").append(mediaUrl);
        sb.append(", mediaIcon=").append(mediaIcon);
        sb.append(", parentMediaId=").append(parentMediaId);
        sb.append(", parentMediaName=").append(parentMediaName);
        sb.append(", belongPlatfromId=").append(belongPlatfromId);
        sb.append(", belongPlatfromName=").append(belongPlatfromName);
        sb.append(", belongPlatfromType=").append(belongPlatfromType);
        sb.append(", mediaType=").append(mediaType);
        sb.append(", mediaTypeName=").append(mediaTypeName);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", desc=").append(desc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}