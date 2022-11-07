package com.kh.exhibition.model.dao;

import static com.kh.common.JDBCTemplate.close;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import com.kh.exhibition.model.vo.Exhibition;
import com.kh.review.model.vo.Review;

public class ExhibitionDao {    
    
    private Properties prop = new Properties();

    public ExhibitionDao() {
    
        String fileName = ExhibitionDao.class.getResource("/sql/exhibition/exhibition-mapper.xml").getPath();
        try {
            prop.loadFromXML(new FileInputStream(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Exhibition> selectExhibitionList(Connection conn, String exlist) {
        
        // SELECT 문 => ResultSet 객체 (여러행 조회)
        
        ArrayList<Exhibition> list = new ArrayList<>();
        PreparedStatement pstmt = null;
        ResultSet rset = null;
        
        String sql = null;
        System.out.println("dao : "+exlist);
        
        if (exlist.equals("P"))  sql = prop.getProperty("selectExhibitionList_P");     
        else if (exlist.equals("C")) sql = prop.getProperty("selectExhibitionList_C");
        else if (exlist.equals("F")) sql = prop.getProperty("selectExhibitionList_F");
       
        System.out.println("dao : "+sql);
        
        try {
            pstmt = conn.prepareStatement(sql);
            
            rset = pstmt.executeQuery();
            
            while(rset.next()) {
                
                list.add(new Exhibition(rset.getInt("ex_No"), rset.getString("lc_Code"), rset.getString("ex_Title"), rset.getString("ex_Content"), rset.getString("start_Date").substring(0,10), 
                           rset.getString("end_Date").substring(0,10), rset.getString("ex_Thumbnail"), rset.getString("Artists")));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            
            close(rset);
            close(pstmt);
        }
        
        return list;
    }
    
    public ArrayList<Exhibition> selectExhibitionDetail(Connection conn, int exNo) {
        
        ArrayList<Exhibition> list = new ArrayList<>();
        PreparedStatement pstmt = null;
        ResultSet rset = null;
        String sql = null;
        
        sql = prop.getProperty("selectExhibitionDetail");
             
        try {
            pstmt = conn.prepareStatement(sql);     
            pstmt.setInt(1, exNo);
            
            System.out.println("dao selectExhibitionDetail : "+exNo +" "+ sql); 
            
            rset = pstmt.executeQuery();
            
            while(rset.next()) {
                
                list.add(new Exhibition(rset.getInt("ex_No"), rset.getString("lc_Code"), rset.getString("ex_Title"), rset.getString("ex_Content"), rset.getString("start_Date").substring(0,10), 
                        rset.getString("end_Date").substring(0,10),  rset.getInt("Price"),rset.getString("Artists"),
                        rset.getString("ex_Thumbnail"),rset.getString("ex_Image"),rset.getString("ex_Status")));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            
            close(rset);
            close(pstmt);
        }
        return list;
    }
    
    public ArrayList<Exhibition> selectExhibitionSearch(Connection conn, String searchWord ) {
        
        ArrayList<Exhibition> list = new ArrayList<>();
        PreparedStatement pstmt = null;
        ResultSet rset = null;
        String sql = null;
        
        sql = prop.getProperty("selectExhibitionSearch");

        try {
            pstmt = conn.prepareStatement(sql);     
            pstmt.setString(1, searchWord);
            pstmt.setString(2, searchWord);
            
            System.out.println("dao : "+searchWord+" "+ sql);
            
            rset = pstmt.executeQuery();
            
            while(rset.next()) {
                
                list.add(new Exhibition(rset.getInt("ex_No"), rset.getString("lc_Code"), rset.getString("ex_Title"), rset.getString("ex_Content"), rset.getString("start_Date").substring(0,10), 
                        rset.getString("end_Date").substring(0,10), rset.getInt("Price"), rset.getString("Artists"), rset.getString("ex_Thumbnail"), rset.getString("ex_Image"),rset.getString("ex_Status")));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            
            close(rset);
            close(pstmt);
        }
        return list;
    }

    
    public boolean changeExhibitionBookmark(Connection conn, int memNo, int exNo) {
        
        boolean isChecked = false;
        PreparedStatement pstmt = null;
        ResultSet rset = null;
        String sql = null;
        
        try {
        //북마크 존재여부 확인
            sql = prop.getProperty("checkExhibitionBookmarked");
            pstmt = conn.prepareStatement(sql);     
            pstmt.setInt(1,memNo);
            pstmt.setInt(2,exNo);
            rset = pstmt.executeQuery();
        
            while(rset.next()) {            
                sql = prop.getProperty("deleteBookmark");     //하트가 눌러져 있으면 delete
                pstmt = conn.prepareStatement(sql);     
                pstmt.setInt(1,memNo);
                pstmt.setInt(2,exNo);
                System.out.println("dao changeExhibitionBookmark : "+" "+ sql);
                rset = pstmt.executeQuery();
                isChecked = false; //false 면 빈하트    
                return false;
            }
            
        //없으면 insert    
           sql = prop.getProperty("insertBookmark");     
           pstmt = conn.prepareStatement(sql);     
           pstmt.setInt(1,memNo);
           pstmt.setInt(2,exNo);
           System.out.println("dao changeExhibitionBookmark : "+" "+ sql);
           rset = pstmt.executeQuery();
           isChecked = false; //false 면 빈하트    
            return true;
                    
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
              
        close(pstmt);
        }
        return isChecked;
    }
    
    public boolean  checkExhibitionBookMarked(Connection conn, int memNo, int exNo) {

      PreparedStatement pstmt = null;
      ResultSet rset = null;
   
      String sql = prop.getProperty("checkExhibitionBookmarked");

        try {
            pstmt = conn.prepareStatement(sql);     
            pstmt.setInt(1,memNo);
            pstmt.setInt(2,exNo);
            rset = pstmt.executeQuery();
            
            System.out.println("dao checkExhibitionBookMarked : "+" "+ sql);
            
            while(rset.next()) {
                
               return true;  //while문 안에 들어왔다는 것은 북마크 번호가 있다
             
            }
                                     
         } catch (SQLException e) {
                e.printStackTrace();
         } finally {
                  
            close(pstmt);
         }
        return false; //북마크된 데이터가 하나도 없다
  }


    public ArrayList<Review> selectExhibitionReview(Connection conn, int exNo) {
        
        ArrayList<Review> list = new ArrayList<>();
        PreparedStatement pstmt = null;
        ResultSet rset = null;
        String sql = null;
        
        sql = prop.getProperty("selectExhibitionReview");
             
        try {
            pstmt = conn.prepareStatement(sql);     
            pstmt.setInt(1, exNo);
            
            System.out.println("dao selectExhibitionReview : "+exNo +" "+ sql);
            
            rset = pstmt.executeQuery();
            
            while(rset.next()) {   
                
                list.add(new Review(rset.getInt("review_No"), rset.getString("mem_No"), rset.getString("ex_No"), rset.getString("review_Content"), rset.getInt("rating"),  rset.getDate("review_Date"), rset.getString("review_Status")));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            
            close(rset);
            close(pstmt);
        }
        return list;
    }
    
}