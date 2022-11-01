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

    public int deleteReview(int reviewNo) {
        Connection conn = getConnection();

        int result = new ReviewDao().deleteReview(conn, reviewNo);

        if (result > 0) {
            commit(conn);
        } else {
            rollback(conn);
        }
        close(conn);
        return result;
    }

}
