package com.kh.exhibition.model.vo;

import java.sql.Date;

public class Exhibition {
    
    private int exNo;
    private String lcCode;
    private String exTitle;
    private String exContent;
    private Date startDate;
    private Date endDate;
    private int price;
    private String artists;
    private String exThumbnail;
    private String exImage;
    private String exStatus;
    
    public Exhibition() {}
    public Exhibition(int exNo, String lcCode, String exTitle, String exContent, Date startDate, Date endDate,
            int price, String artists, String exThumbnail, String exImage, String exStatus) {
        super();
        this.exNo = exNo;
        this.lcCode = lcCode;
        this.exTitle = exTitle;
        this.exContent = exContent;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
        this.artists = artists;
        this.exThumbnail = exThumbnail;
        this.exImage = exImage;
        this.exStatus = exStatus;
    }
    
    public int getExNo() {
        return exNo;
    }
    public void setExNo(int exNo) {
        this.exNo = exNo;
    }
    public String getLcCode() {
        return lcCode;
    }
    public void setLcCode(String lcCode) {
        this.lcCode = lcCode;
    }
    public String getExTitle() {
        return exTitle;
    }
    public void setExTitle(String exTitle) {
        this.exTitle = exTitle;
    }
    public String getExContent() {
        return exContent;
    }
    public void setExContent(String exContent) {
        this.exContent = exContent;
    }
    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getEndDate() {
        return endDate;
    }
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getArtists() {
        return artists;
    }
    public void setArtists(String artists) {
        this.artists = artists;
    }
    public String getExThumbnail() {
        return exThumbnail;
    }
    public void setExThumbnail(String exThumbnail) {
        this.exThumbnail = exThumbnail;
    }
    public String getExImage() {
        return exImage;
    }
    public void setExImage(String exImage) {
        this.exImage = exImage;
    }
    public String getExStatus() {
        return exStatus;
    }
    public void setExStatus(String exStatus) {
        this.exStatus = exStatus;
    }
    
    @Override
    public String toString() {
        return "Exhibition [exNo=" + exNo + ", lcCode=" + lcCode + ", exTitle=" + exTitle + ", exContent=" + exContent
                + ", startDate=" + startDate + ", endDate=" + endDate + ", price=" + price + ", artists=" + artists
                + ", exThumbnail=" + exThumbnail + ", exImage=" + exImage + ", exStatus=" + exStatus + "]";
    }
}
