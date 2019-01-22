package cn.java.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * note
 * @author 
 */
public class Note implements Serializable {
    /**
     * nid
     */
    private Integer nid;

    /**
     * 所属用户,对应用户id
     */
    private Integer noteUser;

    /**
     * 所属段落,对应段落id，当前版本暂不可对段落做笔记，故每节一个段落，以该节的第一个段落作为依据
     */
    private Integer notePara;

    /**
     * 笔记时间
     */
    private Date noteDate;

    /**
     * 笔记内容
     */
    private String noteContent;

    private static final long serialVersionUID = 1L;

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public Integer getNoteUser() {
        return noteUser;
    }

    public void setNoteUser(Integer noteUser) {
        this.noteUser = noteUser;
    }

    public Integer getNotePara() {
        return notePara;
    }

    public void setNotePara(Integer notePara) {
        this.notePara = notePara;
    }

    public Date getNoteDate() {
        return noteDate;
    }

    public void setNoteDate(Date noteDate) {
        this.noteDate = noteDate;
    }

    public String getNoteContent() {
        return noteContent;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
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
        Note other = (Note) that;
        return (this.getNid() == null ? other.getNid() == null : this.getNid().equals(other.getNid()))
            && (this.getNoteUser() == null ? other.getNoteUser() == null : this.getNoteUser().equals(other.getNoteUser()))
            && (this.getNotePara() == null ? other.getNotePara() == null : this.getNotePara().equals(other.getNotePara()))
            && (this.getNoteDate() == null ? other.getNoteDate() == null : this.getNoteDate().equals(other.getNoteDate()))
            && (this.getNoteContent() == null ? other.getNoteContent() == null : this.getNoteContent().equals(other.getNoteContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getNid() == null) ? 0 : getNid().hashCode());
        result = prime * result + ((getNoteUser() == null) ? 0 : getNoteUser().hashCode());
        result = prime * result + ((getNotePara() == null) ? 0 : getNotePara().hashCode());
        result = prime * result + ((getNoteDate() == null) ? 0 : getNoteDate().hashCode());
        result = prime * result + ((getNoteContent() == null) ? 0 : getNoteContent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", nid=").append(nid);
        sb.append(", noteUser=").append(noteUser);
        sb.append(", notePara=").append(notePara);
        sb.append(", noteDate=").append(noteDate);
        sb.append(", noteContent=").append(noteContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}