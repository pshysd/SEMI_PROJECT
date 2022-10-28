package com.kh.common.model.vo;

import java.sql.Date;

public class Attachment {
    
    private int fileNo;
    private int noticeNo;
    private int newsNo;
    private String originName;
    private String changeName;
    private String filePath;
    private Date uploadDate;
    private String fileStatus;
    
    public Attachment() {}
    public Attachment(int fileNo, int noticeNo, int newsNo, String originName, String changeName, String filePath,
            Date uploadDate, String fileStatus) {
        super();
        this.fileNo = fileNo;
        this.noticeNo = noticeNo;
        this.newsNo = newsNo;
        this.originName = originName;
        this.changeName = changeName;
        this.filePath = filePath;
        this.uploadDate = uploadDate;
        this.fileStatus = fileStatus;
    }
    
    public int getFileNo() {
        return fileNo;
    }
    public void setFileNo(int fileNo) {
        this.fileNo = fileNo;
    }
    public int getNoticeNo() {
        return noticeNo;
    }
    public void setNoticeNo(int noticeNo) {
        this.noticeNo = noticeNo;
    }
    public int getNewsNo() {
        return newsNo;
    }
    public void setNewsNo(int newsNo) {
        this.newsNo = newsNo;
    }
    public String getOriginName() {
        return originName;
    }
    public void setOriginName(String originName) {
        this.originName = originName;
    }
    public String getChangeName() {
        return changeName;
    }
    public void setChangeName(String changeName) {
        this.changeName = changeName;
    }
    public String getFilePath() {
        return filePath;
    }
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
    public Date getUploadDate() {
        return uploadDate;
    }
    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }
    public String getFileStatus() {
        return fileStatus;
    }
    public void setFileStatus(String fileStatus) {
        this.fileStatus = fileStatus;
    }
    
    @Override
    public String toString() {
        return "Attachment [fileNo=" + fileNo + ", noticeNo=" + noticeNo + ", newsNo=" + newsNo + ", originName="
                + originName + ", changeName=" + changeName + ", filePath=" + filePath + ", uploadDate=" + uploadDate
                + ", fileStatus=" + fileStatus + "]";
    }
}
