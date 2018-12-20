/**
 * 风控订单管理初始化
 */
var RiskOrder = {
    id: "RiskOrderTable",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1
};

/**
 * 初始化表格的列
 */
RiskOrder.initColumn = function () {
    return [
        {field: 'selectItem', radio: true},
        {title: 'id', field: 'id', visible: false, align: 'center', valign: 'middle'}
    ];
};

/**
 * 检查是否选中
 */
RiskOrder.check = function () {
    var selected = $('#' + this.id).bootstrapTable('getSelections');
    if(selected.length == 0){
        Feng.info("请先选中表格中的某一记录！");
        return false;
    }else{
        RiskOrder.seItem = selected[0];
        return true;
    }
};

/**
 * 点击添加风控订单
 */
RiskOrder.openAddRiskOrder = function () {
    var index = layer.open({
        type: 2,
        title: '添加风控订单',
        area: ['800px', '420px'], //宽高
        fix: false, //不固定
        maxmin: true,
        content: Feng.ctxPath + '/riskOrder/riskOrder_add'
    });
    this.layerIndex = index;
};

/**
 * 打开查看风控订单详情
 */
RiskOrder.openRiskOrderDetail = function () {
    if (this.check()) {
        var index = layer.open({
            type: 2,
            title: '风控订单详情',
            area: ['800px', '420px'], //宽高
            fix: false, //不固定
            maxmin: true,
            content: Feng.ctxPath + '/riskOrder/riskOrder_update/' + RiskOrder.seItem.id
        });
        this.layerIndex = index;
    }
};

/**
 * 删除风控订单
 */
RiskOrder.delete = function () {
    if (this.check()) {
        var ajax = new $ax(Feng.ctxPath + "/riskOrder/delete", function (data) {
            Feng.success("删除成功!");
            RiskOrder.table.refresh();
        }, function (data) {
            Feng.error("删除失败!" + data.responseJSON.message + "!");
        });
        ajax.set("riskOrderId",this.seItem.id);
        ajax.start();
    }
};

/**
 * 查询风控订单列表
 */
RiskOrder.search = function () {
    var queryData = {};
    queryData['condition'] = $("#condition").val();
    RiskOrder.table.refresh({query: queryData});
};

$(function () {
    var defaultColunms = RiskOrder.initColumn();
    var table = new BSTable(RiskOrder.id, "/riskOrder/list", defaultColunms);
    table.setPaginationType("client");
    RiskOrder.table = table.init();
});
