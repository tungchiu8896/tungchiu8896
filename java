<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<!--敘述結尾加上分號  -->

<!-- alert() 訊息視窗 -->
<!-- onclick=> 左鍵下的事件行為 -->
<!-- 所以任意一個事件行為下可以直接使用js -->
    <button onclick="alert('i hate rain');">下大雨</button>
    <button onclick="alert('really hate it');">下大雨2</button>
<!-- 超連結按a 然後一定要打javascript -->
    <a href="javascript:alert('sad');">下大雨3</a>

<!-- 自行撰寫js在目前檔案中 -->
<!-- 單行註解://註解內容 多行註解:/*註解內容*/ -->
    <script>
        //console.log(123);
        console.log(456);
        document.write('gogo');
        document.write('i love you');

    </script>

<!-- 載入專案中的外部檔案 -->
    <!-- 由內往外一層 ../ -->
    <!-- 由內往外兩層 ../../ -->
    <!-- 由外往內 ./ 順著資料夾名稱走 -->
    <script src='./ja0618-1.js'></script>

<!-- 載入模組化的檔案 -->
    <!-- <script type="module" src=""></script> -->
</body>
</html>
