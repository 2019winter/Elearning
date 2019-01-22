package cn.java.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * file
 * @author 
 */
public class File implements Serializable {
    /**
     * fid
     */
    private Integer fid;

    /**
     * 路径,存放用户上传文件的路径，不设置则默认路径
     */
    private String filePath;

    /**
     * 名称
     */
    private String fileName;

    /**
     * 所属课程,参照课程表id
     */
    private Integer fileCourse;

    /**
     * 老师
     */
    private String fileTeacher;

    /**
     * 文件类型
     */
    private String fileType;

    /**
     * 上传者,这里是用户名还是实名呢？长度暂设置为与用户名一致
     */
    private String fileUpper;

    /**
     * 上传时间
     */
    private Date fileUploadTime;

    /**
     * 下载次数
     */
    private Integer fileDownloadCount;

    /**
     * 描述,存放最大长度255，用户不输入则提供默认值
     */
    private String fileDescription;

    /**
     * 状态,0/1有效或者无效
     */
    private String fileStatus;

    /**
     * 评分
     */
    private Float fileScore;

    private Integer fileUpperid;

    /**
     * sha,我不知道sha有多长，text最长65535
     */
    private String fileSha;

    private static final long serialVersionUID = 1L;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Integer getFileCourse() {
        return fileCourse;
    }

    public void setFileCourse(Integer fileCourse) {
        this.fileCourse = fileCourse;
    }

    public String getFileTeacher() {
        return fileTeacher;
    }

    public void setFileTeacher(String fileTeacher) {
        this.fileTeacher = fileTeacher;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFileUpper() {
        return fileUpper;
    }

    public void setFileUpper(String fileUpper) {
        this.fileUpper = fileUpper;
    }

    public Date getFileUploadTime() {
        return fileUploadTime;
    }

    public void setFileUploadTime(Date fileUploadTime) {
        this.fileUploadTime = fileUploadTime;
    }

    public Integer getFileDownloadCount() {
        return fileDownloadCount;
    }

    public void setFileDownloadCount(Integer fileDownloadCount) {
        this.fileDownloadCount = fileDownloadCount;
    }

    public String getFileDescription() {
        return fileDescription;
    }

    public void setFileDescription(String fileDescription) {
        this.fileDescription = fileDescription;
    }

    public String getFileStatus() {
        return fileStatus;
    }

    public void setFileStatus(String fileStatus) {
        this.fileStatus = fileStatus;
    }

    public Float getFileScore() {
        return fileScore;
    }

    public void setFileScore(Float fileScore) {
        this.fileScore = fileScore;
    }

    public Integer getFileUpperid() {
        return fileUpperid;
    }

    public void setFileUpperid(Integer fileUpperid) {
        this.fileUpperid = fileUpperid;
    }

    public String getFileSha() {
        return fileSha;
    }

    public void setFileSha(String fileSha) {
        this.fileSha = fileSha;
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
        File other = (File) that;
        return (this.getFid() == null ? other.getFid() == null : this.getFid().equals(other.getFid()))
            && (this.getFilePath() == null ? other.getFilePath() == null : this.getFilePath().equals(other.getFilePath()))
            && (this.getFileName() == null ? other.getFileName() == null : this.getFileName().equals(other.getFileName()))
            && (this.getFileCourse() == null ? other.getFileCourse() == null : this.getFileCourse().equals(other.getFileCourse()))
            && (this.getFileTeacher() == null ? other.getFileTeacher() == null : this.getFileTeacher().equals(other.getFileTeacher()))
            && (this.getFileType() == null ? other.getFileType() == null : this.getFileType().equals(other.getFileType()))
            && (this.getFileUpper() == null ? other.getFileUpper() == null : this.getFileUpper().equals(other.getFileUpper()))
            && (this.getFileUploadTime() == null ? other.getFileUploadTime() == null : this.getFileUploadTime().equals(other.getFileUploadTime()))
            && (this.getFileDownloadCount() == null ? other.getFileDownloadCount() == null : this.getFileDownloadCount().equals(other.getFileDownloadCount()))
            && (this.getFileDescription() == null ? other.getFileDescription() == null : this.getFileDescription().equals(other.getFileDescription()))
            && (this.getFileStatus() == null ? other.getFileStatus() == null : this.getFileStatus().equals(other.getFileStatus()))
            && (this.getFileScore() == null ? other.getFileScore() == null : this.getFileScore().equals(other.getFileScore()))
            && (this.getFileUpperid() == null ? other.getFileUpperid() == null : this.getFileUpperid().equals(other.getFileUpperid()))
            && (this.getFileSha() == null ? other.getFileSha() == null : this.getFileSha().equals(other.getFileSha()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFid() == null) ? 0 : getFid().hashCode());
        result = prime * result + ((getFilePath() == null) ? 0 : getFilePath().hashCode());
        result = prime * result + ((getFileName() == null) ? 0 : getFileName().hashCode());
        result = prime * result + ((getFileCourse() == null) ? 0 : getFileCourse().hashCode());
        result = prime * result + ((getFileTeacher() == null) ? 0 : getFileTeacher().hashCode());
        result = prime * result + ((getFileType() == null) ? 0 : getFileType().hashCode());
        result = prime * result + ((getFileUpper() == null) ? 0 : getFileUpper().hashCode());
        result = prime * result + ((getFileUploadTime() == null) ? 0 : getFileUploadTime().hashCode());
        result = prime * result + ((getFileDownloadCount() == null) ? 0 : getFileDownloadCount().hashCode());
        result = prime * result + ((getFileDescription() == null) ? 0 : getFileDescription().hashCode());
        result = prime * result + ((getFileStatus() == null) ? 0 : getFileStatus().hashCode());
        result = prime * result + ((getFileScore() == null) ? 0 : getFileScore().hashCode());
        result = prime * result + ((getFileUpperid() == null) ? 0 : getFileUpperid().hashCode());
        result = prime * result + ((getFileSha() == null) ? 0 : getFileSha().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fid=").append(fid);
        sb.append(", filePath=").append(filePath);
        sb.append(", fileName=").append(fileName);
        sb.append(", fileCourse=").append(fileCourse);
        sb.append(", fileTeacher=").append(fileTeacher);
        sb.append(", fileType=").append(fileType);
        sb.append(", fileUpper=").append(fileUpper);
        sb.append(", fileUploadTime=").append(fileUploadTime);
        sb.append(", fileDownloadCount=").append(fileDownloadCount);
        sb.append(", fileDescription=").append(fileDescription);
        sb.append(", fileStatus=").append(fileStatus);
        sb.append(", fileScore=").append(fileScore);
        sb.append(", fileUpperid=").append(fileUpperid);
        sb.append(", fileSha=").append(fileSha);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}