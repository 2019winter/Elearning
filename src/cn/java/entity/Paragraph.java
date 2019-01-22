package cn.java.entity;

import java.io.Serializable;

/**
 * paragraph
 * @author 
 */
public class Paragraph implements Serializable {
    /**
     * pid
     */
    private Integer pid;

    /**
     * 段落序号,段落排序的依据
     */
    private Integer paragraphNumber;

    /**
     * 所属知识点
     */
    private Integer paragraphKnowledge;

    /**
     * 段落类型,标志段落的类型：0表示文本，1表示图片，2表示表格，3表示公式。
     */
    private Integer paragraphType;

    /**
     * 段落内容
     */
    private String paragraphContent;

    private static final long serialVersionUID = 1L;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getParagraphNumber() {
        return paragraphNumber;
    }

    public void setParagraphNumber(Integer paragraphNumber) {
        this.paragraphNumber = paragraphNumber;
    }

    public Integer getParagraphKnowledge() {
        return paragraphKnowledge;
    }

    public void setParagraphKnowledge(Integer paragraphKnowledge) {
        this.paragraphKnowledge = paragraphKnowledge;
    }

    public Integer getParagraphType() {
        return paragraphType;
    }

    public void setParagraphType(Integer paragraphType) {
        this.paragraphType = paragraphType;
    }

    public String getParagraphContent() {
        return paragraphContent;
    }

    public void setParagraphContent(String paragraphContent) {
        this.paragraphContent = paragraphContent;
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
        Paragraph other = (Paragraph) that;
        return (this.getPid() == null ? other.getPid() == null : this.getPid().equals(other.getPid()))
            && (this.getParagraphNumber() == null ? other.getParagraphNumber() == null : this.getParagraphNumber().equals(other.getParagraphNumber()))
            && (this.getParagraphKnowledge() == null ? other.getParagraphKnowledge() == null : this.getParagraphKnowledge().equals(other.getParagraphKnowledge()))
            && (this.getParagraphType() == null ? other.getParagraphType() == null : this.getParagraphType().equals(other.getParagraphType()))
            && (this.getParagraphContent() == null ? other.getParagraphContent() == null : this.getParagraphContent().equals(other.getParagraphContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPid() == null) ? 0 : getPid().hashCode());
        result = prime * result + ((getParagraphNumber() == null) ? 0 : getParagraphNumber().hashCode());
        result = prime * result + ((getParagraphKnowledge() == null) ? 0 : getParagraphKnowledge().hashCode());
        result = prime * result + ((getParagraphType() == null) ? 0 : getParagraphType().hashCode());
        result = prime * result + ((getParagraphContent() == null) ? 0 : getParagraphContent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pid=").append(pid);
        sb.append(", paragraphNumber=").append(paragraphNumber);
        sb.append(", paragraphKnowledge=").append(paragraphKnowledge);
        sb.append(", paragraphType=").append(paragraphType);
        sb.append(", paragraphContent=").append(paragraphContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}