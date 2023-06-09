DROP TABLE STAFF;
CREATE TABLE STAFF
(
    SNO VARCHAR2(5 BYTE) NOT NULL,       /* 사원번호 */
    NAME VARCHAR2(32 BYTE),              /* 사원명   */
    DEPT VARCHAR2(20 BYTE) NOT NULL,     /* 부서명   */
    SALARY NUMBER NOT NULL,              /* 급여     */
    CONSTRAINT PK_STAFF PRIMARY KEY(SNO) /* 기본키   */
);

INSERT INTO STAFF VALUES ('11111', '설경구', '기획부', 5000);
INSERT INTO STAFF VALUES ('22222', '전지현', '개발부', 6000);
INSERT INTO STAFF VALUES ('33333', '정우성', '영업부', 7000);
COMMIT;