package com.kh.member.model.service;

import static com.kh.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import com.kh.common.model.vo.PageInfo;
import com.kh.member.model.dao.MemberDao;
import com.kh.member.model.vo.Member;

public class MemberService {
    
    public int selectListCount() {
        
        Connection conn = getConnection();
        
        int listCount = new MemberDao().selectListCount(conn);
        
        close(conn);
        
        return listCount;
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

    


    
}
