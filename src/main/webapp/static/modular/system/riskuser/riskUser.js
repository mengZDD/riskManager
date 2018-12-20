/**
 * 用户管理初始化
 */
var RiskUser = {
    id: "RiskUserTable",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1
};

/**
 * 初始化表格的列
 */
RiskUser.initColumn = function () {
    return [
        {field: 'selectItem', radio: true},
        {title: 'id', field: 'id', visible: false, align: 'center', valign: 'middle'},
        {title: '姓名', field: 'name', align: 'center', valign: 'middle', sortable: true},
        {title: '手机号', field: 'tel', align: 'center', valign: 'middle', sortable: true},
        {title: '身份证号', field: 'idcardNo', align: 'center', valign: 'middle', sortable: true},
        {title: '客群标签', field: 'typeName', align: 'center', valign: 'middle', sortable: true},
        {title: '免押方式', field: 'sourceName', align: 'center', valign: 'middle', sortable: true},
        {title: '授权状态', field: 'accreditName', align: 'center', valign: 'middle', sortable: true},
        {title: '授信状态', field: 'creditName', align: 'center', valign: 'middle', sortable: true},
        {title: '最后更新时间', field: 'updateTime', align: 'center', valign: 'middle', sortable: true}
    ];
};

/**
 * 检查是否选中
 */
RiskUser.check = function () {
    var selected = $('#' + this.id).bootstrapTable('getSelections');
    if(selected.length == 0){
        Feng.info("请先选中表格中的某一记录！");
        return false;
    }else{
        RiskUser.seItem = selected[0];
        return true;
    }
};

/**
 * 点击添加用户
 */
RiskUser.openAddRiskUser = function () {
    var index = layer.open({
        type: 2,
        title: '添加用户',
        area: ['800px', '420px'], //宽高
        fix: false, //不固定
        maxmin: true,
        content: Feng.ctxPath + '/riskUser/riskUser_add'
    });
    this.layerIndex = index;
};

/**
 * 打开查看用户详情
 */
RiskUser.openRiskUserDetail = function () {
    if (this.check()) {
        var index = layer.open({
            type: 2,
            title: '用户详情',
            area: ['800px', '420px'], //宽高
            fix: false, //不固定
            maxmin: true,
            content: Feng.ctxPath + '/riskUser/riskUser_update/' + RiskUser.seItem.id
        });
        this.layerIndex = index;
    }
};

/**
 * 删除用户
 */
RiskUser.delete = function () {
    if (this.check()) {
        var ajax = new $ax(Feng.ctxPath + "/riskUser/delete", function (data) {
            Feng.success("删除成功!");
            RiskUser.table.refresh();
        }, function (data) {
            Feng.error("删除失败!" + data.responseJSON.message + "!");
        });
        ajax.set("riskUserId",this.seItem.id);
        ajax.start();
    }
};

/**
 * 查询用户列表
 */
RiskUser.search = function () {
    var queryData = {};
    queryData['condition'] = $("#condition").val();
    RiskUser.table.refresh({query: queryData});
};

$(function () {
    var defaultColunms = RiskUser.initColumn();
    var table = new BSTable(RiskUser.id, "/riskUser/list", defaultColunms);
    table.setPaginationType("client");
    RiskUser.table = table.init();
});
