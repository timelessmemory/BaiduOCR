<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8"/>
<title>OCR登录</title>
<link rel="stylesheet" type="text/css" href="/baiduOCR/static_login/css/login.css" />
<style>
body{height:100%;background:#16a085;overflow:hidden;}
canvas{z-index:-1;position:absolute;}
</style>
<script src="/baiduOCR/static_login/js/jquery.js"></script>
<script src="/baiduOCR/static_login/js/Particleground.js"></script>
<script>
$(document).ready(function() {
  //粒子背景特效
  $('body').particleground({
    dotColor: '#5cbdaa',
    lineColor: '#5cbdaa'
  });
});
</script>
</head>
<body>
<dl class="admin_login">
 <dt>
  <h2></h2>
  <em></em>
 </dt>
 <form action="/baiduOCR/login" method="post">
 <dd class="user_icon">
  <input type="text" placeholder="姓名" class="login_txtbx" name="name"/>
 </dd>
 <dd class="pwd_icon">
  <input type="text" placeholder="身份证号" class="login_txtbx" name="code"/>
 </dd>
 <dd>
  <input type="submit" value="验证" class="submit_btn"/>
 </dd>
 </form>
 <dd>
  <p></p>
  
 </dd>
</dl>
</body>
</html>
