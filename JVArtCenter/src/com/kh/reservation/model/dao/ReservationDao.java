package com.kh.reservation.model.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import static com.kh.common.JDBCTemplate.*;

import com.kh.review.model.dao.ReviewDao;

public class ReservationDao {

    Properties prop = new Properties();

    public ReservationDao() {
        String fileName = ReviewDao.class.getResource("/sql/reservation/reservation-mapper.xml").getPath();
        try {
            prop.loadFromXML(new FileInputStream(fileName));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public int selectTodaySales(Connection conn) {
        PreparedStatement pstmt = null;
        ResultSet rset = null;
        String sql = prop.getProperty("selectTodaySales");
        int todaySales = 0;
        
        try {
            pstmt = conn.prepareStatement(sql);
            rset = pstmt.executeQuery();
            
            if(rset.next()) {
                todaySales = rset.getInt("TOTAL");
            }
        }catch(SQLException e) {
            System.out.println(e.getMessage());
        }finally{
            close(rset);
            close(pstmt);
        }
        return todaySales;
    }
    
    
}
