<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Document</title>
    <script language="javascript">
        function cong2so() {
            var so1 = parseInt(document.myform.txtso1.value, 10);
            var so2 = parseInt(document.myform.txtso2.value, 10);
            var kq = so1 + so2;
            document.write('Kết quả: ' + kq);
        }
    </script>
</head>
<body>
    <form name="myform">
        <input type="text" name="txtso1" />
        <input type="text" name="txtso2" />
        <input type="button" value="Cộng" onclick="cong2so()" />
    </form>
</body>
</html>