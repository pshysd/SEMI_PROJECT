package com.kh.member.model.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;
import static com.kh.common.JDBCTemplate.*;

import com.kh.common.model.vo.PageInfo;
import com.kh.member.model.vo.Member;

public class MemberDao {

    private Properties prop = new Properties();

    public MemberDao() {
        String fileName = MemberDao.class.getResource("/sql/member/member-mapper.xml").getPath();
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
                System.out.println(listCount);
                listCount = rset.getInt("COUNT");
                System.out.println(listCount);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            close(rset);
            close(pstmt);
        }
        return listCount;
    }

    public ArrayList<Member> selectMemberList(Connection conn, PageInfo pi) {
        PreparedStatement pstmt = null;
        ResultSet rset = null;
        String sql = prop.getProperty("selectMemberList");
        ArrayList<Member> list = new ArrayList<>();

        try {
            pstmt = conn.prepareStatement(sql);

            int startRow = (pi.getCurrentPage() - 1) * pi.getBoardLimit() + 1;
            int endRow = startRow + pi.getBoardLimit() - 1;

            pstmt.setInt(1, startRow);
            pstmt.setInt(2, endRow);

            rset = pstmt.executeQuery();

            while (rset.next()) {

                list.add(new Member(rset.getInt("MEM_NO"),
                        rset.getString("GR_NAME"),
                        rset.getString("MEM_ID"),
                        rset.getString("MEM_NAME"),
                        rset.getString("GENDER"),
                        rset.getString("EMAIL"),
                        rset.getDate("BIRTH_DATE"),
                        rset.getString("PHONE"),
                        rset.getDate("ENROLL_DATE"),
                        rset.getString("MEM_STATUS")));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            close(rset);
            close(pstmt);
        }
        return list;
    }

    public Member updateMember(Connection conn, int memNo) {
        PreparedStatement pstmt = null;
        String sql = prop.getProperty("updateMember");
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, memNo);

            int result = pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            close(pstmt);
        }
        return null;
    }

    public Member selectMember(Connection conn, int memNo) {
        PreparedStatement pstmt = null;
        ResultSet rset = null;
        String sql = prop.getProperty("selectMember");
        Member m = null;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, memNo);

            rset = pstmt.executeQuery();
            if (rset.next()) {
                m = new Member(rset.getInt("MEM_NO"),
                        rset.getString("GR_CODE"),
                        rset.getString("MEM_ID"),
                        rset.getString("MEM_NAME"),
                        rset.getString("GENDER"),
                        rset.getString("EMAIL"),
                        rset.getDate("BIRTH_DATE"),
                        rset.getString("PHONE"),
                        rset.getString("MEM_STATUS"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            close(rset);
            close(pstmt);
        }
        return m;
    }

}
