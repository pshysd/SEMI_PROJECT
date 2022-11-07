package com.kh.exhibition.model.service;

import static com.kh.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import com.kh.common.model.vo.Attachment;
import com.kh.common.model.vo.PageInfo;
import com.kh.exhibition.model.dao.ExhibitionDao;
import com.kh.exhibition.model.vo.Exhibition;
import com.kh.review.model.vo.Review;

public class ExhibitionService {

    public int selectListCount(String exlist) {

        Connection conn = getConnection();

        int listCount = new ExhibitionDao().selectListCount(conn, exlist);

        close(conn);

        return listCount;
    }

    public ArrayList<Exhibition> selectExhibitionList(String exlist, PageInfo pi) {
        Connection conn = getConnection();

        ArrayList<Exhibition> list = new ExhibitionDao().selectExhibitionList(conn, exlist, pi);

        close(conn);

        return list;
    }

    public Exhibition selectExhibitionDetail(int exNo) {
        Connection conn = getConnection();
        Exhibition ex = new ExhibitionDao().selectExhibitionDetail(conn, exNo);

        close(conn);

        return ex;
    }

    // 관리자
    public int selectAllCount() {

        Connection conn = getConnection();

        int count = new ExhibitionDao().selectAllCount(conn);

        close(conn);

        return count;
    }

    public ArrayList<Exhibition> selectExhibitionListAll(PageInfo pi) {

        Connection conn = getConnection();

        ArrayList<Exhibition> list = new ExhibitionDao().selectExhibitionListAll(conn, pi);

        close(conn);

        return list;
    }

    public int insertExhibition(Exhibition ex) {

        Connection conn = getConnection();

        int result = new ExhibitionDao().insertExhibition(conn, ex);

        if (result > 0) {
            commit(conn);
        } else {
            rollback(conn);
        }

        return result;
    }

    public Exhibition selectExhibition(int eno) {
        return null;
    }

    public ArrayList<Attachment> selectAttachmentList(int eno) {
        return null;
    }

}
