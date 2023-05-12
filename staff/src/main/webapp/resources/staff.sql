DROP TABLE STAFF;
CREATE TABLE STAFF(
    SNO     VARCHAR2(5 BYTE) NOT NULL PRIMARY KEY,
    NAME    VARCHAR2(32 BYTE) NULL,
    DEPT    VARCHAR2(20 BYTE) NOT NULL,
    SALARY  NUMBER            NOT NULL
);

INSERT INTO STAFF VALUES('11111', '설경구', '기획부', 5000);
INSERT INTO STAFF VALUES('22222', '전지현', '개발부', 6000);
INSERT INTO STAFF VALUES('33333', '정우성', '영업부', 7000);
COMMIT;