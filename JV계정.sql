SELECT * FROM RESERVATION;

SELECT SUM((PAYMENT*COUNT)-(PAYMENT*COUNT*DISCOUNT)) "TOTAL"
FROM RESERVATION R, MEMBER M, GRADE G
WHERE R.MEM_NO = M.MEM_NO
AND M.GR_CODE = G.GR_CODE
AND PAY_STATUS = 'Y'
AND TO_CHAR(PAY_DATE,'YYYYMMDD') = TO_CHAR(SYSDATE,'YYYYMMDD');