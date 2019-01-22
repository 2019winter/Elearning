package cn.java.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * collection
 * @author 
 */
public class Collection implements Serializable {
    /**
     * colid
     */
    private Integer colid;

    /**
     * 所属段落,对应节id
     */
    private Integer collectionPara;

    /**
     * 所属用户,对应用户id
     */
    private Integer collectionUser;

    /**
     * 收藏时间,收藏的时间
     */
    private Date collectionDate;

    private static final long serialVersionUID = 1L;

    public Integer getColid() {
        return colid;
    }

    public void setColid(Integer colid) {
        this.colid = colid;
    }

    public Integer getCollectionPara() {
        return collectionPara;
    }

    public void setCollectionPara(Integer collectionPara) {
        this.collectionPara = collectionPara;
    }

    public Integer getCollectionUser() {
        return collectionUser;
    }

    public void setCollectionUser(Integer collectionUser) {
        this.collectionUser = collectionUser;
    }

    public Date getCollectionDate() {
        return collectionDate;
    }

    public void setCollectionDate(Date collectionDate) {
        this.collectionDate = collectionDate;
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
        Collection other = (Collection) that;
        return (this.getColid() == null ? other.getColid() == null : this.getColid().equals(other.getColid()))
            && (this.getCollectionPara() == null ? other.getCollectionPara() == null : this.getCollectionPara().equals(other.getCollectionPara()))
            && (this.getCollectionUser() == null ? other.getCollectionUser() == null : this.getCollectionUser().equals(other.getCollectionUser()))
            && (this.getCollectionDate() == null ? other.getCollectionDate() == null : this.getCollectionDate().equals(other.getCollectionDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getColid() == null) ? 0 : getColid().hashCode());
        result = prime * result + ((getCollectionPara() == null) ? 0 : getCollectionPara().hashCode());
        result = prime * result + ((getCollectionUser() == null) ? 0 : getCollectionUser().hashCode());
        result = prime * result + ((getCollectionDate() == null) ? 0 : getCollectionDate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", colid=").append(colid);
        sb.append(", collectionPara=").append(collectionPara);
        sb.append(", collectionUser=").append(collectionUser);
        sb.append(", collectionDate=").append(collectionDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}