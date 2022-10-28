package com.kh.notice.model.vo;

import java.sql.Date;

public class Notice {
    
    private int noticeNo;
    private String noticeCategory;
    private String noticeTitle;
    private String noticeContent;
    private Date noticeDate;
    private int noticeCount;
    private String noticeStatus;
    
    public Notice() {}
    public Notice(int noticeNo, String noticeCategory, String noticeTitle, String noticeContent, Date noticeDate,
            int noticeCount, String noticeStatus) {
        super();
        this.noticeNo = noticeNo;
        this.noticeCategory = noticeCategory;
        this.noticeTitle = noticeTitle;
        this.noticeContent = noticeContent;
        this.noticeDate = noticeDate;
        this.noticeCount = noticeCount;
        this.noticeStatus = noticeStatus;
    }
    
    public int getNoticeNo() {
        return noticeNo;
    }
    public void setNoticeNo(int noticeNo) {
        this.noticeNo = noticeNo;
    }
    public String getNoticeCategory() {
        return noticeCategory;
    }
    public void setNoticeCategory(String noticeCategory) {
        this.noticeCategory = noticeCategory;
    }
    public String getNoticeTitle() {
        return noticeTitle;
    }
    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
    }
    public String getNoticeContent() {
        return noticeContent;
    }
    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }
    public Date getNoticeDate() {
        return noticeDate;
    }
    public void setNoticeDate(Date noticeDate) {
        this.noticeDate = noticeDate;
    }
    public int getNoticeCount() {
        return noticeCount;
    }
    public void setNoticeCount(int noticeCount) {
        this.noticeCount = noticeCount;
    }
    public String getNoticeStatus() {
        return noticeStatus;
    }
    public void setNoticeStatus(String noticeStatus) {
        this.noticeStatus = noticeStatus;
    }
    
    @Override
    public String toString() {
        return "Notice [noticeNo=" + noticeNo + ", noticeCategory=" + noticeCategory + ", noticeTitle=" + noticeTitle
                + ", noticeContent=" + noticeContent + ", noticeDate=" + noticeDate + ", noticeCount=" + noticeCount
                + ", noticeStatus=" + noticeStatus + "]";
    }
}
