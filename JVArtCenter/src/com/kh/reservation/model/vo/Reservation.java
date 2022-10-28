package com.kh.reservation.model.vo;

import java.sql.Date;

public class Reservation {
    
    private int resvNo;
    private String memNo;
    private String exNo;
    private Date resvDate;
    private int count;
    private int payment;
    private String impUid;
    private Date payDate;
    private String payStatus;
    
    public Reservation() {}
    public Reservation(int resvNo, String memNo, String exNo, Date resvDate, int count, int payment, String impUid,
            Date payDate, String payStatus) {
        super();
        this.resvNo = resvNo;
        this.memNo = memNo;
        this.exNo = exNo;
        this.resvDate = resvDate;
        this.count = count;
        this.payment = payment;
        this.impUid = impUid;
        this.payDate = payDate;
        this.payStatus = payStatus;
    }
    
    public int getResvNo() {
        return resvNo;
    }
    public void setResvNo(int resvNo) {
        this.resvNo = resvNo;
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
    public Date getResvDate() {
        return resvDate;
    }
    public void setResvDate(Date resvDate) {
        this.resvDate = resvDate;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public int getPayment() {
        return payment;
    }
    public void setPayment(int payment) {
        this.payment = payment;
    }
    public String getImpUid() {
        return impUid;
    }
    public void setImpUid(String impUid) {
        this.impUid = impUid;
    }
    public Date getPayDate() {
        return payDate;
    }
    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }
    public String getPayStatus() {
        return payStatus;
    }
    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }
    
    @Override
    public String toString() {
        return "Reservation [resvNo=" + resvNo + ", memNo=" + memNo + ", exNo=" + exNo + ", resvDate=" + resvDate
                + ", count=" + count + ", payment=" + payment + ", impUid=" + impUid + ", payDate=" + payDate
                + ", payStatus=" + payStatus + "]";
    }
}
