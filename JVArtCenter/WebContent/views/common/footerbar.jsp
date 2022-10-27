<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>footerbar</title>
  </head>
  <style>

    /* ---------- footer ---------- */
    #footer {
      height: 225px;
      background-color: black;
      color: white;
      padding-left: 20px;
      padding-top: 25px;;
    }
    #footer>p {
        padding: 10px;
        box-sizing: border-box;
    }
    #footer_etc {
      padding: 10px;
    }
    #footer_etc a {
      text-decoration: none;
      color: white;
    }

  </style>
  <body>
    <div class="wrap">
      <!--전체를 감싸는 wrap영역-->

      <div id="footer">
        <!--푸터-->
        <div id="footer_etc">
            <a href="" >개인정보처리방침</a> |
            <a href="" >이용약관</a>
        </div>
        <p>
          JV ART CENTER<br />
          서울특별시 영등포구 선유동2로 57 <br /><br />

          Tel 1544-9970<br />

          © 2022 JV Arts Center All right reserved.
        </p>
      </div>
    </div>
  </body>
</html>
    