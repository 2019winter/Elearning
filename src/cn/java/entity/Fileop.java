package cn.java.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * fileop
 * @author 
 */
public class Fileop implements Serializable {
    /**
     * fopid
     */
    private Integer fopid;

    /**
     * 操作者
     */
    private Integer fopUser;

    /**
     * 操作文件
     */
    private Integer fopFile;

    /**
     * 操作时间
     */
    private Date fopDate;

    /**
     * 操作ip
     */
    private String fopIp;

    /**
     * 操作类型,操作的类型：1表示上传，2表示下载
     */
    private Integer fopType;

    /**
     * 操作说明
     */
    private String fopDesc;

    private static final long serialVersionUID = 1L;

    public Integer getFopid() {
        return fopid;
    }

    public void setFopid(Integer fopid) {
        this.fopid = fopid;
    }

    public Integer getFopUser() {
        return fopUser;
    }

    public void setFopUser(Integer fopUser) {
        this.fopUser = fopUser;
    }

    public Integer getFopFile() {
        return fopFile;
    }

    public void setFopFile(Integer fopFile) {
        this.fopFile = fopFile;
    }

    public Date getFopDate() {
        return fopDate;
    }

    public void setFopDate(Date fopDate) {
        this.fopDate = fopDate;
    }

    public String getFopIp() {
        return fopIp;
    }

    public void setFopIp(String fopIp) {
        this.fopIp = fopIp;
    }

    public Integer getFopType() {
        return fopType;
    }

    public void setFopType(Integer fopType) {
        this.fopType = fopType;
    }

    public String getFopDesc() {
        return fopDesc;
    }

    public void setFopDesc(String fopDesc) {
        this.fopDesc = fopDesc;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Fileop other = (Fileop) that;
        return (this.getFopid() == null ? other.getFopid() == null : this.getFopid().equals(other.getFopid()))
            && (this.getFopUser() == null ? other.getFopUser() == null : this.getFopUser().equals(other.getFopUser()))
            && (this.getFopFile() == null ? other.getFopFile() == null : this.getFopFile().equals(other.getFopFile()))
            && (this.getFopDate() == null ? other.getFopDate() == null : this.getFopDate().equals(other.getFopDate()))
            && (this.getFopIp() == null ? other.getFopIp() == null : this.getFopIp().equals(other.getFopIp()))
            && (this.getFopType() == null ? other.getFopType() == null : this.getFopType().equals(other.getFopType()))
            && (this.getFopDesc() == null ? other.getFopDesc() == null : this.getFopDesc().equals(other.getFopDesc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFopid() == null) ? 0 : getFopid().hashCode());
        result = prime * result + ((getFopUser() == null) ? 0 : getFopUser().hashCode());
        result = prime * result + ((getFopFile() == null) ? 0 : getFopFile().hashCode());
        result = prime * result + ((getFopDate() == null) ? 0 : getFopDate().hashCode());
        result = prime * result + ((getFopIp() == null) ? 0 : getFopIp().hashCode());
        result = prime * result + ((getFopType() == null) ? 0 : getFopType().hashCode());
        result = prime * result + ((getFopDesc() == null) ? 0 : getFopDesc().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fopid=").append(fopid);
        sb.append(", fopUser=").append(fopUser);
        sb.append(", fopFile=").append(fopFile);
        sb.append(", fopDate=").append(fopDate);
        sb.append(", fopIp=").append(fopIp);
        sb.append(", fopType=").append(fopType);
        sb.append(", fopDesc=").append(fopDesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}