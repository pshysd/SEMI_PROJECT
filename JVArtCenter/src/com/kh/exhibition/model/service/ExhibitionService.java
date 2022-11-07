package com.kh.exhibition.model.service;

import static com.kh.common.JDBCTemplate.close;
import static com.kh.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.ArrayList;

import com.kh.exhibition.model.dao.ExhibitionDao;
import com.kh.exhibition.model.vo.Exhibition;
import com.kh.review.model.vo.Review;

public class ExhibitionService {
    
        public ArrayList<Exhibition> selectExhibitionList(String exlist) {
            Connection conn = getConnection();
            
             ArrayList<Exhibition> list  =  new ExhibitionDao().selectExhibitionList(conn, exlist);
            
            close(conn);
            
            return list;
        }
       
        public ArrayList<Exhibition> selectExhibitionDetail(int exNo) {
            Connection conn = getConnection();
            System.out.println("svc : "+exNo );
             ArrayList<Exhibition> list  =  new ExhibitionDao().selectExhibitionDetail(conn, exNo);
            
            close(conn);
            
            return list;
        }
        

        public ArrayList<Exhibition> selectExhibitionSearch(String searchWord) {
            Connection conn = getConnection();
            System.out.println("svc selectExhibitionSearch : "+searchWord );
             ArrayList<Exhibition> list  =  new ExhibitionDao().selectExhibitionSearch(conn, searchWord);
            
            close(conn);
            
            return list;
        }

        public boolean changeExhibitionBookmark(int memNo, int exNo) {
            Connection conn = getConnection();
            boolean isChecked = new ExhibitionDao().changeExhibitionBookmark(conn, memNo, exNo);
            
            close(conn);
            
            return isChecked;
        }
        
        //checked bookmark
       public boolean checkExhibitionBookMarked(int memNo, int exNo) { //북마크를 받았으면 리턴
           Connection conn = getConnection();
           

           boolean  isBM = new ExhibitionDao().checkExhibitionBookMarked(conn, memNo, exNo);
           
           System.out.println("svc : checkExhibitionBookMarked"+ memNo + " " + exNo+ " = " + isBM);

           return isBM;

         }

        public ArrayList<Review> selectExhibitionReview(int exNo) {
            Connection conn = getConnection();
            
             ArrayList<Review> list  =  new ExhibitionDao().selectExhibitionReview(conn, exNo);
            
            close(conn);
            
            return list;
        }
      }  



