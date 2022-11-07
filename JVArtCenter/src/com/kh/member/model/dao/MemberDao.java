package com.kh.member.model.dao;

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
import com.kh.member.model.vo.Grade;
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

    // 북마크
    public ArrayList<Member> selectBookMarkList(Connection conn, Member m) {

        // SELECT 문 => ResultSet 객체 (여러행)

        ArrayList<Member> list = new ArrayList<>();
        PreparedStatement pstmt = null;
        ResultSet rset = null;

        String sql = prop.getProperty("selectBookMarkList");

        try {

            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, m.getMemNo());
            rset = pstmt.executeQuery();

            while (rset.next()) {

                Member m2 = new Member();
                m2.setMemNo(rset.getInt("MEM_NO"));
                m2.setExNo(rset.getInt("EX_NO"));
                m2.setExTitle(rset.getString("EX_TITLE"));
                m2.setExThumbnail(rset.getString("EX_THUMBNAIL"));
                m2.setExImage(rset.getString("EX_IMAGE"));

                list.add(m2);
                /*
                 * Integer.parseInt
                 * 
                 * (request.getParameter("mno"));
                 */
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            close(rset);
            close(pstmt);
        }

        return list;
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
                        rset.getString("BIRTH_DATE"),
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

    // 아이디 찾기

    public String findId(Connection conn, Member m) {

        String memId = "";
        PreparedStatement pstmt = null;
        ResultSet rset = null;

        String sql = prop.getProperty("findUserId");

        try {
            pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, m.getMemName());
            pstmt.setString(2, m.getPhone());

            rset = pstmt.executeQuery();

            if (rset.next()) {

                memId = rset.getString("MEM_ID");

            }

        } catch (SQLException e) {

            e.printStackTrace();
        } finally {
            close(rset);
            close(pstmt);
        }
        return memId;
    }

    // 비밀번호 찾기
    public Member findPwd(Connection conn, Member m) {

        Member findPwd = null;
        PreparedStatement pstmt = null;
        ResultSet rset = null;

        String sql = prop.getProperty("findPwd");

        try {
            pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, m.getMemId());
            pstmt.setString(2, m.getMemName());
            pstmt.setString(3, m.getPhone());

            rset = pstmt.executeQuery();
            if (rset.next()) {
                findPwd = new Member(rset.getString("MEM_PWD"));
            }

        } catch (SQLException e) {

            e.printStackTrace();
        } finally {
            close(rset);
            close(pstmt);
        }

        return findPwd;
    }

    // 회원가입 서비스
    public int insertMember(Connection conn, Member m) {

        int result = 0;
        PreparedStatement pstmt = null;
        String sql = prop.getProperty("insertMember");

        try {
            pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, m.getMemId());
            pstmt.setString(2, m.getMemPwd());
            pstmt.setString(3, m.getMemName());
            pstmt.setString(4, m.getPhone());
            pstmt.setString(5, m.getEmail());
            pstmt.setString(6, m.getGender());
            pstmt.setString(7, m.getBirthDate());

            result = pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
        return result;

    }

    public Grade selectGrade(Connection conn, String grCode) {

        Grade g = null;
        PreparedStatement pstmt = null;
        ResultSet rset = null;

        String sql = prop.getProperty("selectGrade");

        try {
            pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, grCode);

            rset = pstmt.executeQuery();

            if (rset.next()) {

                g = new Grade(rset.getString("GR_CODE"), rset.getString("GR_NAME"), rset.getInt("DISCOUNT"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(rset);
            close(pstmt);
        }

        return g;
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

    public int idCheck(Connection conn, String checkId) {

        // SELECT 문 => ResultSet 객체 (숫자 하나)

        int count = 0;
        PreparedStatement pstmt = null;
        ResultSet rset = null;

        String sql = prop.getProperty("idCheck");

        try {
            pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, checkId);

            rset = pstmt.executeQuery();

            if (rset.next()) {
                count = rset.getInt("COUNT(*)");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            close(rset);
            close(pstmt);
        }

        return count; // 중복된 아이디가 있다면 1, 없다면 0
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
                        rset.getString("BIRTH_DATE"),
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
                        rset.getString("BIRTH_DATE"),
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
            pstmt.setString(5, m.getBirthDate());
            pstmt.setString(6, m.getMemId());
            pstmt.setString(7, m.getEmail());
            pstmt.setString(8, m.getMemStatus());
            pstmt.setInt(9, m.getMemNo());

            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            close(pstmt);
        }
        return result;
    }

    public int deleteMember(Connection conn, int memNo) {

        int result = 0;
        PreparedStatement pstmt = null;

        String sql = prop.getProperty("deleteMember");

        try {
            pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, memNo);

            result = pstmt.executeUpdate();

        } catch (SQLException e) {

            e.printStackTrace();
        } finally {
            close(pstmt);
        }
        return result;
    }
}
