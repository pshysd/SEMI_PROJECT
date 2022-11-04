package com.kh.reservation.model.service;

import static com.kh.common.JDBCTemplate.*;

import java.sql.Connection;

import com.kh.reservation.model.dao.ReservationDao;

public class ReservationService {

    public int selectTodaySales() {
        
        Connection conn = getConnection();
        
        int todaySales = new ReservationDao().selectTodaySales(conn);
        
        close(conn);
        
        return todaySales;
    }

    public int selectWeekSales() {
        return 0;
    }
    
    
}
