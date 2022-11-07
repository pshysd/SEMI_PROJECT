package com.kh.review.model.service;

import static com.kh.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import com.kh.common.model.vo.PageInfo;
import com.kh.review.model.dao.ReviewDao;
import com.kh.review.model.vo.Review;

public class ReviewService {

    public int selectListCount() {
        Connection conn = getConnection();

        int listCount = new ReviewDao().selectListCount(conn);

        close(conn);

        return listCount;
    }

    public ArrayList<Review> selectReviewList(PageInfo pi) {

        Connection conn = getConnection();

        ArrayList<Review> list = new ReviewDao().selectReviewList(conn, pi);

        close(conn);

        return list;
    }

    //상세 폼 서비스
    public Review selectReview(int reviewNo) {
        
        // 1) Connection 생성
        Connection conn = getConnection();
        
        // 2) conn, reviewNo 을 넘기면서  DAO 에 요청처리 후 결과받기
//        Review n = new ReviewDao().selectReview(conn, reviewNo);
        
        // 3) 트랜잭션 처리 => 패스
        
        // 4) conn 반납
        close(conn);
        
        // 5) 결과 리턴
//        return n;
        return null;
    }

    //리뷰상세 수정용 서비스
    public int updateReview(Review n ) {
        
        Connection conn = getConnection();
        
        int result = new ReviewDao().updateReview(conn,n);
        
        if(result > 0) {
            commit(conn);
            
        }
        else {
            rollback(conn);
        }
        close(conn);
        
        return result;
    }

    //리뷰상세 삭제용 서비스
    
    public int deleteReview(int reviewNo) {
        
        Connection conn = getConnection();
        
        int result = new ReviewDao().deleteReview(conn,reviewNo);
        
        if(result > 0) {
            commit(conn);
        }
        else {
            rollback(conn);
        }
        close(conn);
        
        return result;
    }
}
