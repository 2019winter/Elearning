package cn.java.entity;

import java.io.Serializable;

/**
 * knowledge
 * @author 
 */
public class Knowledge implements Serializable {
    /**
     * kid
     */
    private Integer kid;

    /**
     * 知识点序号,对应三级标题的序号，作为排序的依据
     */
    private Integer knowledgeNumber;

    /**
     * 知识点名称
     */
    private String knowledgeName;

    /**
     * 所属小节,对应节id
     */
    private Integer knowledgeSection;

    private static final long serialVersionUID = 1L;

    public Integer getKid() {
        return kid;
    }

    public void setKid(Integer kid) {
        this.kid = kid;
    }

    public Integer getKnowledgeNumber() {
        return knowledgeNumber;
    }

    public void setKnowledgeNumber(Integer knowledgeNumber) {
        this.knowledgeNumber = knowledgeNumber;
    }

    public String getKnowledgeName() {
        return knowledgeName;
    }

    public void setKnowledgeName(String knowledgeName) {
        this.knowledgeName = knowledgeName;
    }

    public Integer getKnowledgeSection() {
        return knowledgeSection;
    }

    public void setKnowledgeSection(Integer knowledgeSection) {
        this.knowledgeSection = knowledgeSection;
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
        Knowledge other = (Knowledge) that;
        return (this.getKid() == null ? other.getKid() == null : this.getKid().equals(other.getKid()))
            && (this.getKnowledgeNumber() == null ? other.getKnowledgeNumber() == null : this.getKnowledgeNumber().equals(other.getKnowledgeNumber()))
            && (this.getKnowledgeName() == null ? other.getKnowledgeName() == null : this.getKnowledgeName().equals(other.getKnowledgeName()))
            && (this.getKnowledgeSection() == null ? other.getKnowledgeSection() == null : this.getKnowledgeSection().equals(other.getKnowledgeSection()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getKid() == null) ? 0 : getKid().hashCode());
        result = prime * result + ((getKnowledgeNumber() == null) ? 0 : getKnowledgeNumber().hashCode());
        result = prime * result + ((getKnowledgeName() == null) ? 0 : getKnowledgeName().hashCode());
        result = prime * result + ((getKnowledgeSection() == null) ? 0 : getKnowledgeSection().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", kid=").append(kid);
        sb.append(", knowledgeNumber=").append(knowledgeNumber);
        sb.append(", knowledgeName=").append(knowledgeName);
        sb.append(", knowledgeSection=").append(knowledgeSection);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}