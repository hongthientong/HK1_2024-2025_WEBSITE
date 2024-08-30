<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Document</title>
    <script language="javascript" type="text/javascript">
        function kiemTraTamGiac() {
            var a = parseFloat(prompt("Nhập vào cạnh a:"));
            var b = parseFloat(prompt("Nhập vào cạnh b:"));
            var c = parseFloat(prompt("Nhập vào cạnh c:"));
            if (a + b > c && a + c > b && b + c > a) {
                document.writeln("Các cạnh tạo thành tam giác.<br>");
                if (a === b && b === c) {
                    document.writeln("Tam giác ABC đều.");
                } else if (a === b || a === c || b === c) {
                    document.writeln("Tam giác ABC cân.");
                } else {
                    document.writeln("Tam giác ABC là tam giác thường.");
                }
            } else {
                document.writeln("Không phải là tam giác.");
            }
        }
        window.onload = kiemTraTamGiac;
    </script>
</head>
<body>
</body>
</html>