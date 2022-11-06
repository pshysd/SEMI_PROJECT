package com.kh.reservation.model.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.tomcat.dbcp.dbcp2.PStmtKey;

import static com.kh.common.JDBCTemplate.*;

import com.kh.reservation.model.vo.Rate;
import com.kh.reservation.model.vo.Sales;
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

    public Sales selectTodaySales(Connection conn) {
        PreparedStatement pstmt = null;
        ResultSet rset = null;
        String sql = prop.getProperty("selectTodaySales");
        Sales todaySales = new Sales();

        try {
            pstmt = conn.prepareStatement(sql);
            rset = pstmt.executeQuery();

            if (rset.next()) {
                todaySales.setTotal(rset.getInt("TOTAL"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            close(rset);
            close(pstmt);
        }
        return todaySales;
    }

    public Sales selectWeekSales(Connection conn) {
        PreparedStatement pstmt = null;
        ResultSet rset = null;
        Sales weekSales = new Sales();
        String sql = prop.getProperty("selectWeekSales");
        try {
            pstmt = conn.prepareStatement(sql);
            rset = pstmt.executeQuery();

            if (rset.next()) {
                weekSales.setTotal(rset.getInt("TOTAL"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            close(rset);
            close(pstmt);
        }
        return weekSales;
    }

    public ArrayList<Sales> selectSalesPerMonth(Connection conn) {
        PreparedStatement pstmt = null;
        ResultSet rset = null;
        ArrayList<Sales> list = new ArrayList<>();
        String sql = prop.getProperty("selectSalesPerMonth");

        try {
            pstmt = conn.prepareStatement(sql);
            rset = pstmt.executeQuery();
            while (rset.next()) {
                list.add(new Sales(rset.getInt("TOTAL"),
                        rset.getString("DATE_RANGE")));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            close(rset);
            close(pstmt);
        }
        return list;
    }

    public ArrayList<Rate> selectResvRatePerGen(Connection conn) {

        PreparedStatement pstmt = null;
        ResultSet rset = null;
        ArrayList<Rate> list = new ArrayList<>();
        String sql = prop.getProperty("selectResvRatePerGen");
        try {
            pstmt = conn.prepareStatement(sql);
            rset = pstmt.executeQuery();

            while (rset.next()) {
                list.add(new Rate(rset.getInt("RATE"),
                                  rset.getString("LABEL")));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            close(rset);
            close(pstmt);
        }
        return list;
    }

}
