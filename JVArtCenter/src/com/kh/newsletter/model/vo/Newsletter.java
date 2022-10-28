package com.kh.newsletter.model.vo;

import java.sql.Date;

public class Newsletter {
    
    private int newsNo;
    private String newsCategory;
    private String newsTitle;
    private String newsContent;
    private Date newsDate;
    private int newsCount;
    private String newsStatus;
    
    public Newsletter() {}
    public Newsletter(int newsNo, String newsCategory, String newsTitle, String newsContent, Date newsDate,
            int newsCount, String newsStatus) {
        super();
        this.newsNo = newsNo;
        this.newsCategory = newsCategory;
        this.newsTitle = newsTitle;
        this.newsContent = newsContent;
        this.newsDate = newsDate;
        this.newsCount = newsCount;
        this.newsStatus = newsStatus;
    }
    
    public int getNewsNo() {
        return newsNo;
    }
    public void setNewsNo(int newsNo) {
        this.newsNo = newsNo;
    }
    public String getNewsCategory() {
        return newsCategory;
    }
    public void setNewsCategory(String newsCategory) {
        this.newsCategory = newsCategory;
    }
    public String getNewsTitle() {
        return newsTitle;
    }
    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }
    public String getNewsContent() {
        return newsContent;
    }
    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }
    public Date getNewsDate() {
        return newsDate;
    }
    public void setNewsDate(Date newsDate) {
        this.newsDate = newsDate;
    }
    public int getNewsCount() {
        return newsCount;
    }
    public void setNewsCount(int newsCount) {
        this.newsCount = newsCount;
    }
    public String getNewsStatus() {
        return newsStatus;
    }
    public void setNewsStatus(String newsStatus) {
        this.newsStatus = newsStatus;
    }
    
    @Override
    public String toString() {
        return "Newsletter [newsNo=" + newsNo + ", newsCategory=" + newsCategory + ", newsTitle=" + newsTitle
                + ", newsContent=" + newsContent + ", newsDate=" + newsDate + ", newsCount=" + newsCount
                + ", newsStatus=" + newsStatus + "]";
    }
}
