var timer;
//启动跳转的定时器
function startTimes() {
    timer = window.setInterval(showSecondes,1000);
}

var i = 10;
function showSecondes() {
    if (i > 0) {
        i--;
        document.getElementById("secondes").innerHTML = i;
    }
    else {
        window.clearInterval(timer);
        location.href ="/log";
    }
}

//取消跳转
function resetTimer() {
    if (timer != null && timer != undefined) {
        window.clearInterval(timer);
        location.href = "/log";
    }
}