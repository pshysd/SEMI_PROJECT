package com.kh.qna.model.vo;

import java.sql.Date;

public class Qna {
    
    private int qnaNo;
    private String memNo;
    private String qnaCategory;
    private String qnaTitle;
    private String qnaContent;
    private Date qnaDate;
    private String answer;
    private String answerDate;
    private String qnaStatus;
    
    public Qna() {}
    public Qna(int qnaNo, String memNo, String qnaCategory, String qnaTitle, String qnaContent, Date qnaDate,
            String answer, String answerDate, String qnaStatus) {
        super();
        this.qnaNo = qnaNo;
        this.memNo = memNo;
        this.qnaCategory = qnaCategory;
        this.qnaTitle = qnaTitle;
        this.qnaContent = qnaContent;
        this.qnaDate = qnaDate;
        this.answer = answer;
        this.answerDate = answerDate;
        this.qnaStatus = qnaStatus;
    }
    
    public int getQnaNo() {
        return qnaNo;
    }
    public void setQnaNo(int qnaNo) {
        this.qnaNo = qnaNo;
    }
    public String getMemNo() {
        return memNo;
    }
    public void setMemNo(String memNo) {
        this.memNo = memNo;
    }
    public String getQnaCategory() {
        return qnaCategory;
    }
    public void setQnaCategory(String qnaCategory) {
        this.qnaCategory = qnaCategory;
    }
    public String getQnaTitle() {
        return qnaTitle;
    }
    public void setQnaTitle(String qnaTitle) {
        this.qnaTitle = qnaTitle;
    }
    public String getQnaContent() {
        return qnaContent;
    }
    public void setQnaContent(String qnaContent) {
        this.qnaContent = qnaContent;
    }
    public Date getQnaDate() {
        return qnaDate;
    }
    public void setQnaDate(Date qnaDate) {
        this.qnaDate = qnaDate;
    }
    public String getAnswer() {
        return answer;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    public String getAnswerDate() {
        return answerDate;
    }
    public void setAnswerDate(String answerDate) {
        this.answerDate = answerDate;
    }
    public String getQnaStatus() {
        return qnaStatus;
    }
    public void setQnaStatus(String qnaStatus) {
        this.qnaStatus = qnaStatus;
    }
    
    @Override
    public String toString() {
        return "Qna [qnaNo=" + qnaNo + ", memNo=" + memNo + ", qnaCategory=" + qnaCategory + ", qnaTitle=" + qnaTitle
                + ", qnaContent=" + qnaContent + ", qnaDate=" + qnaDate + ", answer=" + answer + ", answerDate="
                + answerDate + ", qnaStatus=" + qnaStatus + "]";
    }
}
