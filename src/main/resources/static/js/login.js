window.onload = function() {
    createCode()
}
var code;
function createCode() {
    code = "";
    var codeLength = 4;
    var checkCode = document.getElementById("code");
    var random = new Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
        'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z');
    for(var i = 0; i < codeLength; i++) {
        var index = Math.floor(Math.random() * 36);
        code += random[index];
    }
    checkCode.value = code;
}
function sub(){
    admincode=$("#admincode").val();
    password=$("#password").val();
    var inputCode = document.getElementById("ctl00_txtcode").value.toUpperCase();
    if(admincode==""||password==""||inputCode.length <= 0){
        alert("用户名和密码和验证码不能为空！");

    }else if(inputCode != code) {
        alert("验证码输入错误!");
        createCode();
        document.getElementById("ctl00_txtcode").value = "";
    }else{
        $("#form").submit();
    }
}