package com.xux.zoo.elephant.repo.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class FileMagnet implements Serializable {
    private Integer id;

    private String magnetName;

    private String magnetUrl;

    private Date createTime;

    private Date modifyTime;

    private byte[] preViewPic;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMagnetName() {
        return magnetName;
    }

    public void setMagnetName(String magnetName) {
        this.magnetName = magnetName;
    }

    public String getMagnetUrl() {
        return magnetUrl;
    }

    public void setMagnetUrl(String magnetUrl) {
        this.magnetUrl = magnetUrl;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public byte[] getPreViewPic() {
        return preViewPic;
    }

    public void setPreViewPic(byte[] preViewPic) {
        this.preViewPic = preViewPic;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", magnetName=").append(magnetName);
        sb.append(", magnetUrl=").append(magnetUrl);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", preViewPic=").append(preViewPic);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}