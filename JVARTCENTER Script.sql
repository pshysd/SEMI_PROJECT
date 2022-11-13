-- 회원, 등급, 전시, 장소, 북마크, 리뷰, 예매결제, 1대1문의,
-- 첨부파일, 뉴스레터, 공지사항
-- MEMBER, GRADE, EXHIBITION, LOCATION, BOOKMARK, REVIEW, RESERVATION, QNA,
-- ATTACHMENT, NEWSLETTER, NOTICE

DROP TABLE ATTACHMENT;
DROP TABLE NOTICE;
DROP TABLE NEWSLETTER;
DROP TABLE RESERVATION;

DROP TABLE QNA;
DROP TABLE BOOKMARK;
DROP TABLE REVIEW;

DROP TABLE EXHIBITION;
DROP TABLE LOCATION;
DROP TABLE MEMBER;
DROP TABLE GRADE;


DROP SEQUENCE SEQ_MEM_NO;   -- 회원번호
DROP SEQUENCE SEQ_EX_NO;    -- 전시번호
DROP SEQUENCE SEQ_RESV_NO;  -- 예매번호
DROP SEQUENCE SEQ_QNA_NO;   -- 1대1문의 게시글번호
DROP SEQUENCE SEQ_NEWS_NO;  -- 뉴스레터 게시글번호
DROP SEQUENCE SEQ_REVIEW_NO;    -- 리뷰 게시글번호
DROP SEQUENCE SEQ_NOTICE_NO;    -- 공지사항 게시글번호
DROP SEQUENCE SEQ_FILE_NO;  -- 첨부파일번호


------------------------------------------------
-------------------- GRADE --------------------
------------------------------------------------

CREATE TABLE GRADE (
 GR_CODE CHAR(3) PRIMARY KEY,
 GR_NAME VARCHAR2(10) NOT NULL UNIQUE,
 DISCOUNT NUMBER NOT NULL
);

COMMENT ON COLUMN GRADE.GR_CODE IS '등급코드';
COMMENT ON COLUMN GRADE.GR_NAME IS '등급명';
COMMENT ON COLUMN GRADE.DISCOUNT IS '할인율';

INSERT INTO GRADE VALUES('GR1', '일반', 0.01);
INSERT INTO GRADE VALUES('GR2', 'VIP', 0.03);
INSERT INTO GRADE VALUES('GR3', 'VVIP', 0.05);

------------------------------------------------
-------------------- MEMBER --------------------
------------------------------------------------

CREATE TABLE MEMBER (
 MEM_NO NUMBER PRIMARY KEY,
 GR_CODE CHAR(3) DEFAULT 'GR1' NOT NULL,
 MEM_ID VARCHAR2(12) NOT NULL UNIQUE,
 MEM_PWD VARCHAR2(15) NOT NULL,
 MEM_NAME VARCHAR2(20) NOT NULL,
 GENDER CHAR(1) NOT NULL CHECK (GENDER IN ('M', 'F')),
 EMAIL VARCHAR2(30) NOT NULL,
 BIRTH_DATE DATE,
 PHONE CHAR(13),
 ENROLL_DATE DATE DEFAULT SYSDATE NOT NULL,
 MEM_STATUS CHAR(1) DEFAULT 'N' NOT NULL CHECK(MEM_STATUS IN ('Y', 'N')),
 FOREIGN KEY(GR_CODE) REFERENCES GRADE(GR_CODE)
);

COMMENT ON COLUMN MEMBER.MEM_NO IS '회원번호';
COMMENT ON COLUMN MEMBER.GR_CODE IS '등급코드';
COMMENT ON COLUMN MEMBER.MEM_ID IS '아이디';
COMMENT ON COLUMN MEMBER.MEM_PWD IS '비밀번호';
COMMENT ON COLUMN MEMBER.MEM_NAME IS '이름';
COMMENT ON COLUMN MEMBER.GENDER IS '성별';
COMMENT ON COLUMN MEMBER.EMAIL IS '이메일';
COMMENT ON COLUMN MEMBER.BIRTH_DATE IS '생년월일';
COMMENT ON COLUMN MEMBER.PHONE IS '휴대폰번호';
COMMENT ON COLUMN MEMBER.ENROLL_DATE IS '가입일';
COMMENT ON COLUMN MEMBER.MEM_STATUS IS '탈퇴여부';

CREATE SEQUENCE SEQ_MEM_NO
NOCACHE;


------------------------------------------------
------------------- LOCATION -------------------
------------------------------------------------

CREATE TABLE LOCATION (
 LC_CODE CHAR(2) PRIMARY KEY,
 LC_NAME VARCHAR2(15) NOT NULL UNIQUE,
 FLOOR NUMBER
);

COMMENT ON COLUMN LOCATION.LC_CODE IS '장소코드';
COMMENT ON COLUMN LOCATION.LC_NAME IS '장소명';
COMMENT ON COLUMN LOCATION.FLOOR IS '층수';

INSERT INTO LOCATION VALUES ('J1', 'J관', 1);
INSERT INTO LOCATION VALUES ('J2', 'V관', 2);
INSERT INTO LOCATION VALUES ('J3', 'A관', 3);
INSERT INTO LOCATION VALUES ('J4', 'C관', 3);

------------------------------------------------
------------------ EXHIBITION ------------------
------------------------------------------------

CREATE TABLE EXHIBITION (
 EX_NO NUMBER PRIMARY KEY,
 LC_CODE CHAR(2) NOT NULL,
 EX_TITLE VARCHAR2(1000) NOT NULL UNIQUE,
 EX_CONTENT VARCHAR2(4000),
 START_DATE DATE NOT NULL,
 END_DATE DATE NOT NULL,
 PRICE NUMBER NOT NULL,
 ARTISTS VARCHAR2(100),
 EX_THUMBNAIL VARCHAR2(1000) NOT NULL,
 EX_IMAGE VARCHAR2(1000),
 EX_STATUS CHAR(1) DEFAULT 'N' NOT NULL CHECK(EX_STATUS IN ('Y', 'N')),
 FOREIGN KEY(LC_CODE) REFERENCES LOCATION(LC_CODE)
);

COMMENT ON COLUMN EXHIBITION.EX_NO IS '전시번호';
COMMENT ON COLUMN EXHIBITION.LC_CODE IS '장소코드';
COMMENT ON COLUMN EXHIBITION.EX_TITLE IS '전시명';
COMMENT ON COLUMN EXHIBITION.EX_CONTENT IS '전시설명';
COMMENT ON COLUMN EXHIBITION.START_DATE IS '시작일';
COMMENT ON COLUMN EXHIBITION.END_DATE IS '종료일';
COMMENT ON COLUMN EXHIBITION.PRICE IS '금액';
COMMENT ON COLUMN EXHIBITION.ARTISTS IS '참여작가';
COMMENT ON COLUMN EXHIBITION.EX_THUMBNAIL IS '썸네일이미지';
COMMENT ON COLUMN EXHIBITION.EX_IMAGE IS '상세이미지';
COMMENT ON COLUMN EXHIBITION.EX_STATUS IS '삭제여부';

CREATE SEQUENCE SEQ_EX_NO
START WITH 1234
NOCACHE;


------------------------------------------------
----------------- RESERVATION -----------------
------------------------------------------------

CREATE TABLE RESERVATION (
 RESV_NO NUMBER PRIMARY KEY,
 MEM_NO NUMBER NOT NULL,
 EX_NO NUMBER NOT NULL,
 RESV_DATE DATE NOT NULL,
 COUNT NUMBER NOT NULL CHECK(COUNT > 0),
 PAYMENT NUMBER,
 IMP_UID VARCHAR2(20) UNIQUE,
 PAY_DATE DATE DEFAULT SYSDATE, 
 PAY_STATUS CHAR(1) DEFAULT 'N' NOT NULL CHECK(PAY_STATUS IN ('Y', 'N', 'C')),
 RECEIPT VARCHAR2(1000),
 FOREIGN KEY(MEM_NO) REFERENCES MEMBER(MEM_NO),
 FOREIGN KEY(EX_NO) REFERENCES EXHIBITION(EX_NO)
);

COMMENT ON COLUMN RESERVATION.RESV_NO IS '예매번호';
COMMENT ON COLUMN RESERVATION.MEM_NO IS '회원번호';
COMMENT ON COLUMN RESERVATION.EX_NO IS '전시번호';
COMMENT ON COLUMN RESERVATION.RESV_DATE IS '관람예정일';
COMMENT ON COLUMN RESERVATION.COUNT IS '인원수';
COMMENT ON COLUMN RESERVATION.PAYMENT IS '결제금액';
COMMENT ON COLUMN RESERVATION.IMP_UID IS '결제번호';
COMMENT ON COLUMN RESERVATION.PAY_DATE IS '결제일시';
COMMENT ON COLUMN RESERVATION.PAY_STATUS IS '결제여부';
COMMENT ON COLUMN RESERVATION.RECEIPT IS '결제영수증';


CREATE SEQUENCE SEQ_RESV_NO
START WITH 48125
NOCACHE;


------------------------------------------------
------------------- BOOKMARK -------------------
------------------------------------------------

CREATE TABLE BOOKMARK (
 MEM_NO NUMBER NOT NULL,
 EX_NO NUMBER NOT NULL,
 FOREIGN KEY(MEM_NO) REFERENCES MEMBER(MEM_NO),
 FOREIGN KEY(EX_NO) REFERENCES EXHIBITION(EX_NO)
);

COMMENT ON COLUMN BOOKMARK.MEM_NO IS '회원번호';
COMMENT ON COLUMN BOOKMARK.EX_NO IS '전시번호';


------------------------------------------------
-------------------- REVIEW --------------------
------------------------------------------------

CREATE TABLE REVIEW (
 REVIEW_NO NUMBER PRIMARY KEY,
 MEM_NO NUMBER NOT NULL,
 EX_NO NUMBER NOT NULL,
 REVIEW_CONTENT VARCHAR2(1000) NOT NULL,
 RATING NUMBER CHECK(RATING IN (1, 2, 3, 4, 5)),
 REVIEW_DATE DATE DEFAULT SYSDATE NOT NULL,
 REVIEW_STATUS CHAR(1) DEFAULT 'N' NOT NULL CHECK(REVIEW_STATUS IN ('Y', 'N')),
 FOREIGN KEY(MEM_NO) REFERENCES MEMBER(MEM_NO),
 FOREIGN KEY(EX_NO) REFERENCES EXHIBITION(EX_NO)
);

COMMENT ON COLUMN REVIEW.REVIEW_NO IS '리뷰번호';
COMMENT ON COLUMN REVIEW.MEM_NO IS '회원번호';
COMMENT ON COLUMN REVIEW.EX_NO IS '전시번호';
COMMENT ON COLUMN REVIEW.REVIEW_CONTENT IS '리뷰내용';
COMMENT ON COLUMN REVIEW.RATING IS '평점';
COMMENT ON COLUMN REVIEW.REVIEW_DATE IS '작성일';
COMMENT ON COLUMN REVIEW.REVIEW_STATUS IS '삭제여부';

CREATE SEQUENCE SEQ_REVIEW_NO
NOCACHE;


------------------------------------------------
--------------------- QNA ---------------------
------------------------------------------------

CREATE TABLE QNA (
 QNA_NO NUMBER PRIMARY KEY,
 MEM_NO NUMBER NOT NULL, 
 QNA_CATEGORY VARCHAR2(30) NOT NULL,
 QNA_TITLE VARCHAR2(200) NOT NULL,
 QNA_CONTENT VARCHAR2(3000) NOT NULL,
 QNA_DATE DATE DEFAULT SYSDATE NOT NULL,
 ANSWER VARCHAR2(3000),
 ANSWER_DATE DATE,
 QNA_STATUS CHAR(1) DEFAULT 'N' NOT NULL CHECK(QNA_STATUS IN ('Y', 'N')),
 FOREIGN KEY(MEM_NO) REFERENCES MEMBER(MEM_NO)
);

COMMENT ON COLUMN QNA.QNA_NO IS '게시글번호';
COMMENT ON COLUMN QNA.MEM_NO IS '회원번호';
COMMENT ON COLUMN QNA.QNA_CATEGORY IS '카테고리';
COMMENT ON COLUMN QNA.QNA_TITLE IS '제목';
COMMENT ON COLUMN QNA.QNA_CONTENT IS '내용';
COMMENT ON COLUMN QNA.QNA_DATE IS '작성일';
COMMENT ON COLUMN QNA.ANSWER IS '답변내용';
COMMENT ON COLUMN QNA.ANSWER_DATE IS '답변일';
COMMENT ON COLUMN QNA.QNA_STATUS IS '삭제여부';

CREATE SEQUENCE SEQ_QNA_NO
NOCACHE;


------------------------------------------------
------------------ NEWSLETTER ------------------
------------------------------------------------

CREATE TABLE NEWSLETTER (
 NEWS_NO NUMBER PRIMARY KEY,
 NEWS_CATEGORY VARCHAR2(30) NOT NULL,
 NEWS_TITLE VARCHAR2(200) NOT NULL,
 NEWS_CONTENT VARCHAR2(3000) NOT NULL,
 NEWS_DATE DATE DEFAULT SYSDATE NOT NULL,
 NEWS_COUNT NUMBER DEFAULT 0 NOT NULL,
 NEWS_STATUS CHAR(1) DEFAULT 'N' NOT NULL CHECK(NEWS_STATUS IN ('Y', 'N'))
);

COMMENT ON COLUMN NEWSLETTER.NEWS_NO IS '게시글번호';
COMMENT ON COLUMN NEWSLETTER.NEWS_CATEGORY IS '카테고리';
COMMENT ON COLUMN NEWSLETTER.NEWS_TITLE IS '제목';
COMMENT ON COLUMN NEWSLETTER.NEWS_CONTENT IS '내용';
COMMENT ON COLUMN NEWSLETTER.NEWS_DATE IS '작성일';
COMMENT ON COLUMN NEWSLETTER.NEWS_COUNT IS '조회수';
COMMENT ON COLUMN NEWSLETTER.NEWS_STATUS IS '삭제여부';

CREATE SEQUENCE SEQ_NEWS_NO
NOCACHE;


------------------------------------------------
-------------------- NOTICE --------------------
------------------------------------------------

CREATE TABLE NOTICE (
 NOTICE_NO NUMBER PRIMARY KEY,
 NOTICE_CATEGORY VARCHAR2(30) NOT NULL,
 NOTICE_TITLE VARCHAR2(200) NOT NULL,
 NOTICE_CONTENT VARCHAR2(3000) NOT NULL,
 NOTICE_DATE DATE DEFAULT SYSDATE NOT NULL,
 NOTICE_COUNT NUMBER DEFAULT 0 NOT NULL,
 NOTICE_STATUS CHAR(1) DEFAULT 'N' NOT NULL CHECK(NOTICE_STATUS IN ('Y', 'N'))
);

COMMENT ON COLUMN NOTICE.NOTICE_NO IS '게시글번호';
COMMENT ON COLUMN NOTICE.NOTICE_CATEGORY IS '카테고리';
COMMENT ON COLUMN NOTICE.NOTICE_TITLE IS '제목';
COMMENT ON COLUMN NOTICE.NOTICE_CONTENT IS '내용';
COMMENT ON COLUMN NOTICE.NOTICE_DATE IS '작성일';
COMMENT ON COLUMN NOTICE.NOTICE_COUNT IS '조회수';
COMMENT ON COLUMN NOTICE.NOTICE_STATUS IS '삭제여부';

CREATE SEQUENCE SEQ_NOTICE_NO
NOCACHE;


------------------------------------------------
------------------ ATTACHMENT ------------------
------------------------------------------------

CREATE TABLE ATTACHMENT (
 FILE_NO NUMBER PRIMARY KEY,
 NOTICE_NO NUMBER,
 NEWS_NO NUMBER,
 ORIGIN_NAME VARCHAR2(255) NOT NULL,
 CHANGE_NAME VARCHAR2(255) NOT NULL,
 FILE_PATH VARCHAR2(1000),
 FILE_LEVEL CHAR(1),
 UPLOAD_DATE DATE DEFAULT SYSDATE NOT NULL,
 FILE_STATUS CHAR(1) DEFAULT 'N' NOT NULL CHECK(FILE_STATUS IN ('Y', 'N')),
 FOREIGN KEY(NOTICE_NO) REFERENCES NOTICE(NOTICE_NO),
 FOREIGN KEY(NEWS_NO) REFERENCES NEWSLETTER(NEWS_NO)
);

COMMENT ON COLUMN ATTACHMENT.FILE_NO IS '파일번호';
COMMENT ON COLUMN ATTACHMENT.NOTICE_NO IS '참조공지사항글번호';
COMMENT ON COLUMN ATTACHMENT.NEWS_NO IS '참조뉴스레터글번호';
COMMENT ON COLUMN ATTACHMENT.ORIGIN_NAME IS '원본파일명';
COMMENT ON COLUMN ATTACHMENT.CHANGE_NAME IS '수정파일명';
COMMENT ON COLUMN ATTACHMENT.FILE_PATH IS '저장폴더경로';
COMMENT ON COLUMN ATTACHMENT.FILE_LEVEL IS '파일레벨';
COMMENT ON COLUMN ATTACHMENT.UPLOAD_DATE IS '업로드일';
COMMENT ON COLUMN ATTACHMENT.FILE_STATUS IS '삭제여부';

CREATE SEQUENCE SEQ_FILE_NO
NOCACHE;


COMMIT;
