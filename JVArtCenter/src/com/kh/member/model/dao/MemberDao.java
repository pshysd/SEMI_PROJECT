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

    public Member loginMember(Connection conn, Member m) {

        // 필요한 변수 셋팅
        Member loginUser = null;
        PreparedStatement pstmt = null;
        ResultSet rset = null;

        String sql = prop.getProperty("loginMember");

        try {
            // 쿼리문 실행에 필요한 객체 생성
            pstmt = conn.prepareStatement(sql);

            // 미완성 쿼리문 완성시키기
            pstmt.setString(1, m.getMemId());
            pstmt.setString(2, m.getMemPwd());

            // 쿼리문 실행 후 결과받기
            rset = pstmt.executeQuery();

            // rset으로 커서를 움직여가며 값 뽑기
            if (rset.next()) {

                loginUser = new Member(rset.getInt("MEM_NO"),
                        rset.getString("GR_CODE"),
                        rset.getString("MEM_ID"),
                        rset.getString("MEM_PWD"),
                        rset.getString("MEM_NAME"),
                        rset.getString("GENDER"),
                        rset.getString("EMAIL"),
                        rset.getDate("BIRTH_DATE"),
                        rset.getString("PHONE"),
                        rset.getDate("ENROLL_DATE"),
                        rset.getString("MEM_STATUS"));

            }
            // 이 시점 기준으로
            // 만약 일치하는 회원을 찾았다면 loginUser 에는 해당 회원의 정보가 다 담겨있을 것
            // 만약 일치하는 회원을 못찾았다면 loginUser 에는 null 값이 들어있을 것

        } catch (SQLException e) {

            e.printStackTrace();
        } finally {
            // 자원반납
            close(rset);
            close(pstmt);
        }

        // 결과리턴
        return loginUser;

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

    public int updateMember(Connection conn, Member m) {
        PreparedStatement pstmt = null;
        String sql = prop.getProperty("updateMember");
        int result = 0;
                try {
                    pstmt = conn.prepareStatement(sql);
                    pstmt.setString(1, m.getMemName());
                    pstmt.setString(2, m.getGrCode());
                    pstmt.setString(3, m.getGender());
                    pstmt.setString(4, m.getPhone());
                    pstmt.setDate(5, m.getBirthDate());
                    pstmt.setString(6, m.getMemId());
                    pstmt.setString(7, m.getEmail());
                    pstmt.setString(8, m.getMemStatus());
                    pstmt.setInt(9, m.getMemNo());
                    
                    result = pstmt.executeUpdate();
                }catch(SQLException e) {
                    System.out.println(e.getMessage());
                }finally {
                    close(pstmt);
                }
        return result;
   }

}
