package com.kh.member.model.service;

import static com.kh.common.JDBCTemplate.close;
import static com.kh.common.JDBCTemplate.commit;
import static com.kh.common.JDBCTemplate.getConnection;
import static com.kh.common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.ArrayList;

import com.kh.common.model.vo.PageInfo;
import com.kh.member.model.dao.MemberDao;
import com.kh.member.model.vo.Grade;
import com.kh.member.model.vo.Member;

public class MemberService {

    public Member loginMember(Member m) {

        Connection conn = getConnection();

        Member loginUser = new MemberDao().loginMember(conn, m);

        close(conn);

        return loginUser;
    }

    // 회원 등급명 가져오기
    public Grade selectGrade(String grCode) {

        Connection conn = getConnection();

        Grade g = new MemberDao().selectGrade(conn, grCode);

        close(conn);

        return g;
    }

    // 회원가입용 서비스
    public int insertMember(Member m) {
        Connection conn = getConnection();

        int result = new MemberDao().insertMember(conn, m);

        if (result > 0) { // 성공시
            commit(conn);
        } else { // 실패시
            rollback(conn);
        }

        close(conn);

        return result;

    }

    // 회원 아이디 찾기
    public String findId(Member m) {

        Connection conn = getConnection();

        String memId = new MemberDao().findId(conn, m);

        close(conn);

        return memId;

    }

    // 회원 비밀번호 찾기
    public Member findPwd(Member m) {

        Connection conn = getConnection();

        Member findUserPwd = new MemberDao().findPwd(conn, m);

        close(conn);

        return findUserPwd;
    }

    public int selectListCount() {

        Connection conn = getConnection();

        int listCount = new MemberDao().selectListCount(conn);

        close(conn);

        return listCount;
    }

    // 아이디 중복체크
    public int idCheck(String checkId) {

        Connection conn = getConnection();

        int count = new MemberDao().idCheck(conn, checkId);

        close(conn);

        return count;
    }

    public ArrayList<Member> selectMemberList(PageInfo pi) {

        Connection conn = getConnection();

        ArrayList<Member> list = new MemberDao().selectMemberList(conn, pi);

        close(conn);

        return list;
    }

    public Member selectMember(int memNo) {
        Connection conn = getConnection();

        Member m = new MemberDao().selectMember(conn, memNo);

        close(conn);

        return m;
    }

    public int updateMember(Member m) {
        Connection conn = getConnection();

        int result = new MemberDao().updateMember(conn, m);

        if (result > 0) {
            commit(conn);
        } else {
            rollback(conn);
        }

        close(conn);

        return result;
    }

    public int deleteMember(int memNo) {

        Connection conn = getConnection();

        int result = new MemberDao().deleteMember(conn, memNo);

        if (result > 0) {
            commit(conn);
        } else {
            rollback(conn);
        }
        close(conn);

        return result;
    }
     //북마크 서비스
    public ArrayList<Member> selectBookMarkList(Member m) {
            
            
        Connection conn = getConnection();
            
            ArrayList<Member> list = new MemberDao().selectBookMarkList(conn, m);
            
            close(conn);
            
            return list;
        }
}
