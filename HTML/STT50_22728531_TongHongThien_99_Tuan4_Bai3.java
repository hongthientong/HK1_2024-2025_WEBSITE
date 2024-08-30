<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <p>Nhập năm cần kiểm tra:</p>
    <input type="text" name="txtName" id="txtName">
    <input type="button" value="Kiểm tra" onclick="kiemTraNamNhuan()" />

    <script language="javascript">
        function kiemTraNamNhuan() {
            var nam = parseInt(document.getElementById("txtName").value, 10);

            if (isNaN(nam)) {
                alert('Vui lòng nhập một số hợp lệ.');
                return;
            }

            if (nam % 400 === 0) {
                alert('Năm ' + nam + ' là năm nhuận.');
            } else if (nam % 100 === 0) {
                alert('Năm ' + nam + ' không phải là năm nhuận.');
            } else if (nam % 4 === 0) {
                alert('Năm ' + nam + ' là năm nhuận.');
            } else {
                alert('Năm ' + nam + ' không phải là năm nhuận.');
            }
        }
    </script>
</body>
</html>
