package com.kh.reservation.model.service;

import static com.kh.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import com.kh.reservation.model.dao.ReservationDao;
import com.kh.reservation.model.vo.Sales;

public class ReservationService {

    public Sales selectTodaySales() {
        
        Connection conn = getConnection();
        
        Sales todaySales = new ReservationDao().selectTodaySales(conn);
        
        close(conn);
        
        return todaySales;
    }

    public Sales selectWeekSales() {
        
        Connection conn = getConnection();
        
        Sales weekSales = new ReservationDao().selectWeekSales(conn);
        
        close(conn);
        
        return weekSales;
    }

    public ArrayList<Sales> selectSalesPerMonth() {
        
        Connection conn = getConnection();
                
        ArrayList<Sales> list = new ReservationDao().selectSalesPerMonth(conn);
        
        close(conn);
        
        return list;
    }
    
    
}
