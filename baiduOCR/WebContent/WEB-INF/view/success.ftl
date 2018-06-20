
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>身份证信息</title>
<link rel="stylesheet" type="text/css" href="/baiduOCR/static_login/css/style.css" />
<script src="/baiduOCR/static_login/js/jquery.js"></script>
</head>
<body>

	<div class="place">
    <span>你的身份证信息如下：</span>
    <a style="position: absolute;top: 12px;right: 17px;" href="/baiduOCR/view/login">退出</a>
    </div>
    
    <div class="rightinfo" style="margin-bottom:30px;">
    
    <table class="tablelist">
    	<tr>
	        <th>姓名</th>
	        <th>性别</th>
	        <th>民族</th>
	        <th>生日</th>
	        <th>住址</th>
	        <th>身份证号</th>
        </tr>
        <tr>
	        <td>${user['name']}</td>
	        <td>${user['gender']}</td>
	        <td>${user['nation']}</td>
	        <td>${user['birthday']}</td>
	        <td>${user['address']}</td>
	        <td>${user['code']}</td>
        </tr>
    </table>
    </div>
</body>
</html>
