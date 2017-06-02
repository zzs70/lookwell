// JavaScript Document
$(function () {
    //头部导航效果
    //点击登录
    $('.Nh_loginif,.Login_back,.Login_regist,.Login_fp,.Nh_rigest').click(function () {
        var num = parseInt($(this).attr("turn"))
        $('.Login_con').eq(num).show().siblings('.Login_con').hide();
        $('.head_mask').show()
    })
    $('.Login_close').click(function () {
        $(this).parent().hide();
        $('.head_mask').hide()
    })
    $('.Login_logbtn').click(function () {
        $('.Nh_login').show();
        //$('.head_mask').hide()
        //$('.Nh_nologin').hide()
    })
    //点击退出登录
    $('.Nh_off').click(function () {
        $('.Nh_nologin').show()
        $('.Nh_login').hide()
    })
    //屏幕滚动时的效果
    $(window).scroll(function () {
        var top = $(window).scrollTop()
        var pos = $('.head_fixed').css('position')
        //返回顶部
        if (top > 0) {
            $('.back_top').css({ 'visibility': 'visible' })
        } else if (top == 0) {
            $('.back_top').css({ 'visibility': 'hidden' })
        }
        if (top >= 70 && pos != 'fixed') {
            $('.head_fixed').css({ 'position': 'fixed', 'top': '0', 'left': '0' })
            $('.head_fixed').hide().fadeIn(200)
        } else if (top <= 70 && pos == 'fixed') {
            $('.head_fixed').css({ 'position': '', 'top': '', 'left': '' })
            $('.head_fixed').hide().fadeIn(200)
        }
    })
    //右边导航
    $('.Nh_Rnav_bg01').mouseover(function () {
        var $this = $(this), arr = [-3, 3, -2, 2, -1, 1, 0], len = 0
        $this.stop()
        $(this).animate({ 'top': '-3px' }, 150, shake)
        function shake() {
            if (len >= arr.length) {
                return
            } else {
                len++
                $(this).animate({ 'top': arr[len] + 'px' }, 150, shake)
            }
        }
    })
    $('.back_top').click(function () {
        $(window).scrollTop(0)
    })


    //yijin
    $('.Nh_Rnav_bg03').click(function () {
        $('#dialogFeedback2').show()
    })
    $('.dialog-close-button').click(function () {
        $('#dialogFeedback2,#dialogFeedback_success2').hide()

    })
    $('#feedbackBtn').click(function () {
        $('#dialogFeedback2').hide()
        $('#dialogFeedback_success2').show()
    })

})
