package cn.java.entity;

import java.io.Serializable;

/**
 * recommend
 * @author 
 */
public class Recommend implements Serializable {
    /**
     * rid
     */
    private Integer rid;

    /**
     * 推荐内容路径
     */
    private String recommendPath;

    /**
     * 推荐所属小节,对应节id
     */
    private Integer recommendSection;

    private static final long serialVersionUID = 1L;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRecommendPath() {
        return recommendPath;
    }

    public void setRecommendPath(String recommendPath) {
        this.recommendPath = recommendPath;
    }

    public Integer getRecommendSection() {
        return recommendSection;
    }

    public void setRecommendSection(Integer recommendSection) {
        this.recommendSection = recommendSection;
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
        Recommend other = (Recommend) that;
        return (this.getRid() == null ? other.getRid() == null : this.getRid().equals(other.getRid()))
            && (this.getRecommendPath() == null ? other.getRecommendPath() == null : this.getRecommendPath().equals(other.getRecommendPath()))
            && (this.getRecommendSection() == null ? other.getRecommendSection() == null : this.getRecommendSection().equals(other.getRecommendSection()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRid() == null) ? 0 : getRid().hashCode());
        result = prime * result + ((getRecommendPath() == null) ? 0 : getRecommendPath().hashCode());
        result = prime * result + ((getRecommendSection() == null) ? 0 : getRecommendSection().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rid=").append(rid);
        sb.append(", recommendPath=").append(recommendPath);
        sb.append(", recommendSection=").append(recommendSection);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}