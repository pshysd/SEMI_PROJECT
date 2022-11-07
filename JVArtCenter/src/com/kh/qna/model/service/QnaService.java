package com.kh.qna.model.service;

import static com.kh.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import com.kh.common.model.vo.PageInfo;
import com.kh.notice.model.dao.NoticeDao;
import com.kh.notice.model.vo.Notice;
import com.kh.qna.model.dao.QnaDao;
import com.kh.qna.model.vo.Qna;

public class QnaService {
    
    public int selectListCount() {
        
        Connection conn = getConnection();
        
        int listCount = new QnaDao().selectListCount(conn);
        
        close(conn);
        
        return listCount;
    }
    
    public int selectCateListCount(String searchword) {
        
        Connection conn = getConnection();
        
        int listCount = new QnaDao().selectCateListCount(conn, searchword);
        
        close(conn);
        
        return listCount;
    }
    
    public int selectMemIdListCount(String searchword) {
        
        Connection conn = getConnection();
        
        int listCount = new QnaDao().selectMemIdListCount(conn, searchword);
        
        close(conn);
        
        return listCount;
    }
    
    public int selectTitleListCount(String searchword) {
        
        Connection conn = getConnection();
        
        int listCount = new QnaDao().selectTitleListCount(conn, searchword);
        
        close(conn);
        
        return listCount;
    }
    
    public ArrayList<Qna> selectList(PageInfo pi) {
        
        Connection conn = getConnection();
        
        ArrayList<Qna> list = new QnaDao().selectList(conn, pi);
        
        close(conn);
        
        return list;
    }
    
    public ArrayList<Qna> selectList(PageInfo pi, String keyword, String searchword) {
        
        Connection conn = getConnection();
        
        ArrayList<Qna> list = new QnaDao().selectList(conn, pi, keyword, searchword);
        
        close(conn);
        
        return list;
    }
    
    public int insertQna(Qna q) {
        
        Connection conn = getConnection();
        
        int result = new QnaDao().insertQna(conn, q);
        
        if(result > 0) {
            commit(conn);
        } else {
            rollback(conn);
        }
        
        close(conn);
        
        return result; 
    }
    
    public Qna selectQna(int qnaNo) {
        
        Connection conn = getConnection();
        
        Qna q = new QnaDao().selectQna(conn, qnaNo);
        
        close(conn);
        
        return q;
    }
    
    public int updateQna(Qna q) {
        
        Connection conn = getConnection();
        
        int result = new QnaDao().updateQna(conn, q);
        
        if(result > 0) {
            commit(conn);
        } else {
            rollback(conn);
        }
        
        close(conn);
        
        return result; 
    }
    
    public int deleteQna(int qnaNo) {
        
        Connection conn = getConnection();
        
        int result = new QnaDao().deleteQna(conn, qnaNo);
        
        if(result > 0) {
            commit(conn);
        } else {
            rollback(conn);
        }
        
        close(conn);
        
        return result;
    }
    
    public int insertQnaAnswer(Qna q) {
        
        Connection conn = getConnection();
        
        int result = new QnaDao().insertQnaAnswer(conn, q);
        
        if(result > 0) {
            commit(conn);
        } else {
            rollback(conn);
        }
        
        close(conn);
        
        return result;
    }
    
    public int updateQnaAnswer(Qna q) {
        
        Connection conn = getConnection();
        
        int result = new QnaDao().updateQnaAnswer(conn, q);
        
        if(result > 0) {
            commit(conn);
        } else {
            rollback(conn);
        }
        
        close(conn);
        
        return result;
    }
    
    public int deleteQnaAnswer(int qnaNo) {
        
        Connection conn = getConnection();
        
        int result = new QnaDao().deleteQnaAnswer(conn, qnaNo);
        
        if(result > 0) {
            commit(conn);
        } else {
            rollback(conn);
        }
        
        close(conn);
        
        return result;
    }

    public ArrayList<Qna> selectMainList() {
        Connection conn = getConnection();
        
        ArrayList<Qna> list = new QnaDao().selectMainList(conn);
        
        close(conn);
        
        return list;
    }
}
