<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Untitled Document</title>
    <script language="javascript" type="text/javascript">
        function checkDaysInMonth() {
            var t = prompt("Nhập vào một tháng của năm không nhuận: ");
            var month = parseInt(t);
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    alert("Tháng " + month + " có 31 ngày");
                    break;
                case 2:
                    alert("Tháng " + month + " có 28 ngày");
                    break;
                case 4: case 6: case 9: case 11:
                    alert("Tháng " + month + " có 30 ngày");
                    break;
                default:
                    alert("Không phải là tháng của năm");
            }
        }
        window.onload = checkDaysInMonth;
    </script>
</head>
<body>
</body>
</html>