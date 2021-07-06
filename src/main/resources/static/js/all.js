window.onscroll = function() {
    var topScroll=document.body.scrollTop||document.documentElement.scrollTop;
    var bignav = document.getElementById("nav");
    if (topScroll >50) {
        bignav.style.position = 'fixed';
        bignav.style.top = '0';
        bignav.style.zIndex = '9999';
    } else {
        bignav.style.position = 'static';
    }
}
$(function(){
    $(".container #kehuduan").mouseenter(function() {
        $("#header .container .col-md-2 img").show();
        $("#nav").css("z-index","-1")
    })
    $("#kehuduan").mouseleave(function() {
        $("#header .container .col-md-2 img").hide()
        $("#nav").css("z-index","999")
    })
    $("#Username>ul>li").hover(function(){
        $(this).children("ul").fadeIn(2000)
    },function(){
        $(this).children("ul").fadeOut(2000)

    })
    $("#Username ul ul").mouseenter(function(){
        $(this).stop()
    })
})