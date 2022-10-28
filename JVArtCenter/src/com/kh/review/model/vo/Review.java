package com.kh.review.model.vo;

import java.sql.Date;

public class Review {
    
    private int reviewNo;
    private String memNo;
    private String exNo;
    private String reviewContent;
    private int rating;
    private Date reviewDate;
    private String reviewStatus;
    
    public Review() {}
    public Review(int reviewNo, String memNo, String exNo, String reviewContent, int rating, Date reviewDate,
            String reviewStatus) {
        super();
        this.reviewNo = reviewNo;
        this.memNo = memNo;
        this.exNo = exNo;
        this.reviewContent = reviewContent;
        this.rating = rating;
        this.reviewDate = reviewDate;
        this.reviewStatus = reviewStatus;
    }
    
    public int getReviewNo() {
        return reviewNo;
    }
    public void setReviewNo(int reviewNo) {
        this.reviewNo = reviewNo;
    }
    public String getMemNo() {
        return memNo;
    }
    public void setMemNo(String memNo) {
        this.memNo = memNo;
    }
    public String getExNo() {
        return exNo;
    }
    public void setExNo(String exNo) {
        this.exNo = exNo;
    }
    public String getReviewContent() {
        return reviewContent;
    }
    public void setReviewContent(String reviewContent) {
        this.reviewContent = reviewContent;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public Date getReviewDate() {
        return reviewDate;
    }
    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }
    public String getReviewStatus() {
        return reviewStatus;
    }
    public void setReviewStatus(String reviewStatus) {
        this.reviewStatus = reviewStatus;
    }
    
    @Override
    public String toString() {
        return "Review [reviewNo=" + reviewNo + ", memNo=" + memNo + ", exNo=" + exNo + ", reviewContent="
                + reviewContent + ", rating=" + rating + ", reviewDate=" + reviewDate + ", reviewStatus=" + reviewStatus
                + "]";
    }
}
