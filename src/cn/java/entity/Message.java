package cn.java.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * message
 * @author 
 */
public class Message implements Serializable {
    /**
     * mid
     */
    private Integer mid;

    /**
     * 消息发送者
     */
    private Integer messageFrom;

    /**
     * 消息接受者
     */
    private Integer messageTo;

    /**
     * 消息发送时间
     */
    private Date messageDate;

    /**
     * 消息是否已读
     */
    private Integer messageRead;

    /**
     * 消息内容
     */
    private String messageContent;

    private static final long serialVersionUID = 1L;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getMessageFrom() {
        return messageFrom;
    }

    public void setMessageFrom(Integer messageFrom) {
        this.messageFrom = messageFrom;
    }

    public Integer getMessageTo() {
        return messageTo;
    }

    public void setMessageTo(Integer messageTo) {
        this.messageTo = messageTo;
    }

    public Date getMessageDate() {
        return messageDate;
    }

    public void setMessageDate(Date messageDate) {
        this.messageDate = messageDate;
    }

    public Integer getMessageRead() {
        return messageRead;
    }

    public void setMessageRead(Integer messageRead) {
        this.messageRead = messageRead;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
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
        Message other = (Message) that;
        return (this.getMid() == null ? other.getMid() == null : this.getMid().equals(other.getMid()))
            && (this.getMessageFrom() == null ? other.getMessageFrom() == null : this.getMessageFrom().equals(other.getMessageFrom()))
            && (this.getMessageTo() == null ? other.getMessageTo() == null : this.getMessageTo().equals(other.getMessageTo()))
            && (this.getMessageDate() == null ? other.getMessageDate() == null : this.getMessageDate().equals(other.getMessageDate()))
            && (this.getMessageRead() == null ? other.getMessageRead() == null : this.getMessageRead().equals(other.getMessageRead()))
            && (this.getMessageContent() == null ? other.getMessageContent() == null : this.getMessageContent().equals(other.getMessageContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMid() == null) ? 0 : getMid().hashCode());
        result = prime * result + ((getMessageFrom() == null) ? 0 : getMessageFrom().hashCode());
        result = prime * result + ((getMessageTo() == null) ? 0 : getMessageTo().hashCode());
        result = prime * result + ((getMessageDate() == null) ? 0 : getMessageDate().hashCode());
        result = prime * result + ((getMessageRead() == null) ? 0 : getMessageRead().hashCode());
        result = prime * result + ((getMessageContent() == null) ? 0 : getMessageContent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mid=").append(mid);
        sb.append(", messageFrom=").append(messageFrom);
        sb.append(", messageTo=").append(messageTo);
        sb.append(", messageDate=").append(messageDate);
        sb.append(", messageRead=").append(messageRead);
        sb.append(", messageContent=").append(messageContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}