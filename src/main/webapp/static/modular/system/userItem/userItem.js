/**
 * 用户管理初始化
 */
var UserItem = {
    id: "UserItemTable",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1
};

/**
 * 初始化表格的列
 */
UserItem.initColumn = function () {
    return [
        {field: 'selectItem', radio: true},
        {title: 'id', field: 'id', visible: false, align: 'center', valign: 'middle'}
    ];
};

/**
 * 检查是否选中
 */
UserItem.check = function () {
    var selected = $('#' + this.id).bootstrapTable('getSelections');
    if(selected.length == 0){
        Feng.info("请先选中表格中的某一记录！");
        return false;
    }else{
        UserItem.seItem = selected[0];
        return true;
    }
};

/**
 * 点击添加用户
 */
UserItem.openAddUserItem = function () {
    var index = layer.open({
        type: 2,
        title: '添加用户',
        area: ['800px', '420px'], //宽高
        fix: false, //不固定
        maxmin: true,
        content: Feng.ctxPath + '/userItem/userItem_add'
    });
    this.layerIndex = index;
};

/**
 * 打开查看用户详情
 */
UserItem.openUserItemDetail = function () {
    if (this.check()) {
        var index = layer.open({
            type: 2,
            title: '用户详情',
            area: ['800px', '420px'], //宽高
            fix: false, //不固定
            maxmin: true,
            content: Feng.ctxPath + '/userItem/userItem_update/' + UserItem.seItem.id
        });
        this.layerIndex = index;
    }
};

/**
 * 删除用户
 */
UserItem.delete = function () {
    if (this.check()) {
        var ajax = new $ax(Feng.ctxPath + "/userItem/delete", function (data) {
            Feng.success("删除成功!");
            UserItem.table.refresh();
        }, function (data) {
            Feng.error("删除失败!" + data.responseJSON.message + "!");
        });
        ajax.set("userItemId",this.seItem.id);
        ajax.start();
    }
};

/**
 * 查询用户列表
 */
UserItem.search = function () {
    var queryData = {};
    queryData['condition'] = $("#condition").val();
    UserItem.table.refresh({query: queryData});
};

$(function () {
    var defaultColunms = UserItem.initColumn();
    var table = new BSTable(UserItem.id, "/userItem/list", defaultColunms);
    table.setPaginationType("client");
    UserItem.table = table.init();
});
