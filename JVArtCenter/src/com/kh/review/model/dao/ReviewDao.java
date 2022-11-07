package com.kh.review.model.dao;

import static com.kh.common.JDBCTemplate.close;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import com.kh.common.model.vo.PageInfo;
import com.kh.review.model.vo.Review;

public class ReviewDao {

    Properties prop = new Properties();

    public ReviewDao() {
        String fileName = ReviewDao.class.getResource("/sql/review/review-mapper.xml").getPath();
        try {
            prop.loadFromXML(new FileInputStream(fileName));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public int selectListCount(Connection conn) {
        PreparedStatement pstmt = null;
        ResultSet rset = null;
        String sql = prop.getProperty("selectListCount");
        int listCount = 0;
        try {
            pstmt = conn.prepareStatement(sql);
            rset = pstmt.executeQuery();

            if (rset.next()) {
                listCount = rset.getInt("COUNT");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            close(rset);
            close(pstmt);
        }
        return listCount;
    }

    public ArrayList<Review> selectReviewList(Connection conn, PageInfo pi) {

        ResultSet rset = null;
        PreparedStatement pstmt = null;
        String sql = prop.getProperty("selectReviewList");
        ArrayList<Review> list = new ArrayList<>();

        try {
            pstmt = conn.prepareStatement(sql);
            int startRow = (pi.getCurrentPage() - 1) * pi.getBoardLimit() + 1;
            int endRow = startRow + pi.getBoardLimit() - 1;
            pstmt.setInt(1, startRow);
            pstmt.setInt(2, endRow);

            rset = pstmt.executeQuery();

            while (rset.next()) {
                list.add(new Review(rset.getInt("REVIEW_NO"),
                        rset.getString("MEM_ID"),
                        rset.getString("EX_TITLE"),
                        rset.getString("REVIEW_CONTENT"),
                        rset.getInt("RATING"),
                        rset.getDate("REVIEW_DATE")));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            close(rset);
            close(pstmt);
        }
        return list;
    }

    public int deleteReview(Connection conn, int reviewNo) {
        PreparedStatement pstmt = null;
        String sql = prop.getProperty("deleteReview");
        int result = 0;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, reviewNo);

            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            close(pstmt);
        }
        return result;
    }

        //업데이트
        public int updateReview(Connection conn , Review n) {
            
            int result = 0;
            PreparedStatement pstmt = null;
            
            String sql = prop.getProperty("updateReview");
            
            try {
                pstmt = conn.prepareStatement(sql);
                
                pstmt.setString(1, n.getReviewContent());
                pstmt.setInt(2, n.getRating());
                pstmt.setInt(3, n.getReviewNo());
               
                result = pstmt.executeUpdate();
                
            } catch(SQLException e) {
                e.printStackTrace();
            }finally {
                close(pstmt);
            }
            
            return result;
            
    }
}
