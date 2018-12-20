/**
 * 进件审核管理初始化
 */
var RiskApprove = {
    id: "RiskApproveTable",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1
};

/**
 * 初始化表格的列
 */
RiskApprove.initColumn = function () {
    return [
        {field: 'selectItem', radio: true},
        {title: 'id', field: 'id', visible: false, align: 'center', valign: 'middle'},
        {title: '进件编号', field: 'orderid', align: 'center', valign: 'middle', sortable: true},
        {title: '身份证号', field: 'idcardNo', align: 'center', valign: 'middle', sortable: true},
        {title: '进件时间', field: 'creatTime', align: 'center', valign: 'middle', sortable: true},
        {title: '姓名', field: 'username', align: 'center', valign: 'middle', sortable: true},
        {title: '手机号', field: 'tel', align: 'center', valign: 'middle', sortable: true},
        {title: '指导价', field: 'guidePrice', align: 'center', valign: 'middle', sortable: true},
        {title: '免押方式', field: 'guaranteeName', align: 'center', valign: 'middle', sortable: true},
        {title: '总押金', field: 'totaldePosit', align: 'center', valign: 'middle', sortable: true},
        {title: '比例减免', field: 'reductionRatio', align: 'center', valign: 'middle', sortable: true},
        {title: '免押金额', field: 'creditCost', align: 'center', valign: 'middle', sortable: true},
        {title: '冻结押金', field: 'money', align: 'center', valign: 'middle', sortable: true},
        {title: '期数', field: 'periods', align: 'center', valign: 'middle', sortable: true},
        {title: '状态', field: 'statusName', align: 'center', valign: 'middle', sortable: true}
    ];
};

/**
 * 检查是否选中
 */
RiskApprove.check = function () {
    var selected = $('#' + this.id).bootstrapTable('getSelections');
    if(selected.length == 0){
        Feng.info("请先选中表格中的某一记录！");
        return false;
    }else{
        RiskApprove.seItem = selected[0];
        return true;
    }
};

/**
 * 点击添加进件审核
 */
RiskApprove.openAddRiskApprove = function () {
    var index = layer.open({
        type: 2,
        title: '添加进件审核',
        area: ['800px', '420px'], //宽高
        fix: false, //不固定
        maxmin: true,
        content: Feng.ctxPath + '/riskApprove/riskApprove_add'
    });
    this.layerIndex = index;
};

/**
 * 打开查看进件审核详情
 */
RiskApprove.openRiskApproveDetail = function () {
    if (this.check()) {
        var index = layer.open({
            type: 2,
            title: '进件审核详情',
            area: ['800px', '420px'], //宽高
            fix: false, //不固定
            maxmin: true,
            content: Feng.ctxPath + '/riskApprove/riskApprove_update/' + RiskApprove.seItem.id
        });
        this.layerIndex = index;
    }
};

/**
 * 删除进件审核
 */
RiskApprove.delete = function () {
    if (this.check()) {
        var ajax = new $ax(Feng.ctxPath + "/riskApprove/delete", function (data) {
            Feng.success("删除成功!");
            RiskApprove.table.refresh();
        }, function (data) {
            Feng.error("删除失败!" + data.responseJSON.message + "!");
        });
        ajax.set("riskApproveId",this.seItem.id);
        ajax.start();
    }
};

/**
 * 查询进件审核列表
 */
RiskApprove.search = function () {
    var queryData = {};
    queryData['condition'] = $("#condition").val();
    RiskApprove.table.refresh({query: queryData});
};

$(function () {
    var defaultColunms = RiskApprove.initColumn();
    var table = new BSTable(RiskApprove.id, "/riskApprove/list", defaultColunms);
    table.setPaginationType("client");
    RiskApprove.table = table.init();
});
