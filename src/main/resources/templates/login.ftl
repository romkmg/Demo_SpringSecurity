<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <title>登录</title>
    <link href="/css/app.css" rel="stylesheet">
</head>
<body>
<div id="app">
    <form class="el-form login-container el-form--label-left">
        <h3 class="login_title">系统登录</h3>
        <div class="el-form-item is-required"><!---->
            <div class="el-form-item__content" style="margin-left: 0px;">
                <div class="el-input"><!---->
                    <input autocomplete="off" placeholder="账号" type="text" rows="2" validateevent="true" class="el-input__inner"><!----><!----><!---->
                </div><!---->
            </div>
        </div>
        <div class="el-form-item is-required"><!---->
            <div class="el-form-item__content" style="margin-left: 0px;">
                <div class="el-input"><!---->
                    <input autocomplete="off" placeholder="密码" type="password" rows="2" validateevent="true" class="el-input__inner"><!----><!----><!---->
                </div><!---->
            </div>
        </div>
        <label role="checkbox" aria-checked="true" class="el-checkbox login_remember is-checked" label-position="left">
            <span aria-checked="mixed" class="el-checkbox__input is-checked">
                <span class="el-checkbox__inner"></span>
                <input type="checkbox" class="el-checkbox__original" value="">
            </span>
            <span class="el-checkbox__label">记住密码</span>
        </label>
        <div class="el-form-item" style="width: 100%;">
            <div class="el-form-item__content" style="margin-left: 0px;">
                <button type="button" class="el-button el-button--primary" style="width: 100%;"><!----><!---->
                    <span>登录</span>
                </button><!---->
            </div>
        </div>
    </form>
</div>
<script type="text/javascript">

</script>
</body>
</html>