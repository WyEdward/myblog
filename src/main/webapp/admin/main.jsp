<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>个人博客后台管理</title>
    <%@include file="./common/head.jspf" %>
    <style type="text/css">
        body {
            font-family: microsoft yahei;
        }
    </style>
</head>
<body class="easyui-layout">
    <div region="north" style="height: 78px; background-color: #E0ECFF">
    </div>
    <div region="west" style="width: 200px" title="导航菜单" split="true">
        <div class="easyui-accordion" data-options="fit:true,border:false">
            <div title="常用操作" data-options="selected:true,iconCls:'icon-item'" style="padding: 10px">
                <a href="#" class="easyui-linkbutton"
                   data-options="plain:true,iconCls:'icon-writeblog'" style="width: 150px">写博客</a>
                <a href="#" class="easyui-linkbutton"
                   data-options="plain:true,iconCls:'icon-review'" style="width: 150px">评论审核</a>
            </div>
            <div title="博客管理" data-options="iconCls:'icon-bkgl'" style="padding:10px;">
                <a href="#" class="easyui-linkbutton"
                   data-options="plain:true,iconCls:'icon-writeblog'" style="width: 150px;">写博客</a>
                <a href="#" class="easyui-linkbutton"
                   data-options="plain:true,iconCls:'icon-bkgl'" style="width: 150px;">博客信息管理</a>
            </div>
            <div title="博客类别管理" data-options="iconCls:'icon-bklb'" style="padding:10px">
                <a href="#" class="easyui-linkbutton"
                   data-options="plain:true,iconCls:'icon-bklb'" style="width: 150px;">博客类别信息管理</a>
            </div>
            <div title="评论管理" data-options="iconCls:'icon-plgl'" style="padding:10px">
                <a href="#" class="easyui-linkbutton"
                   data-options="plain:true,iconCls:'icon-review'" style="width: 150px">评论审核</a>
                <a href="#" class="easyui-linkbutton"
                   data-options="plain:true,iconCls:'icon-plgl'" style="width: 150px;">评论信息管理</a>
            </div>
            <div title="个人信息管理" data-options="iconCls:'icon-grxx'" style="padding:10px">
                <a href="#" class="easyui-linkbutton"
                   data-options="plain:true,iconCls:'icon-grxxxg'" style="width: 150px;">修改个人信息</a>
            </div>
            <div title="系统管理" data-options="iconCls:'icon-system'" style="padding:10px">
                <a href="#" class="easyui-linkbutton"
                   data-options="plain:true,iconCls:'icon-link'" style="width: 150px">友情链接管理</a>
                <a href="#" class="easyui-linkbutton"
                   data-options="plain:true,iconCls:'icon-modifyPassword'" style="width: 150px;">修改密码</a>
                <a href="#" class="easyui-linkbutton"
                   data-options="plain:true,iconCls:'icon-refresh'" style="width: 150px;">刷新系统缓存</a>
                <a href="#" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-exit'"
                   style="width: 150px;">安全退出</a>
            </div>
        </div>
    </div>
    <div data-options="region:'center'" style="background:#eee;">
        <div id="tt" class="easyui-tabs" style="width:500px;height:250px;">
            <div title="Tab1" style="padding:20px;display:none;">
                tab1
            </div>
            <div title="Tab2" data-options="closable:true" style="overflow:auto;padding:20px;display:none;">
                tab2
            </div>
            <div title="Tab3" data-options="iconCls:'icon-reload',closable:true" style="padding:20px;display:none;">
                tab3
            </div>
        </div>
    </div>
    <div region="south" style="height: 25px;padding: 5px" align="center">
    </div>
</body>
</html>