/**
 * ajax 默认配置
 */
$.ajaxSetup({
    statusCode: {403: function() {
            // var layer = layui.layer;
            // layer.open({
            //     type: 2,
            //     title: '用户登录',
            //     area:['70%','70%'],
            //     skin:'layui-layer-molv',
            //     closeBtn: 0,
            //     shadeClose: false,
            //     content: ['/login.html']
            // });
        }
}});

/**
 * 视图跳转
 * @type {{goto: view.goto, openNew: view.openNew}}
 */
var view = {
    goto:function (url) {
        window.location.href = url;
    },
    openNew:function (url) {
        window.open(url,"_blank");
    }
}