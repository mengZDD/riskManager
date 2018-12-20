/**
 * 风控通讯录管理初始化
 */
var RiskAddress = {
    id: "RiskAddressTable",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1
};

/**
 * 初始化表格的列
 */
RiskAddress.initColumn = function () {
    return [
        {field: 'selectItem', radio: true},
        {title: 'id', field: 'id', visible: false, align: 'center', valign: 'middle'}
    ];
};

/**
 * 检查是否选中
 */
RiskAddress.check = function () {
    var selected = $('#' + this.id).bootstrapTable('getSelections');
    if(selected.length == 0){
        Feng.info("请先选中表格中的某一记录！");
        return false;
    }else{
        RiskAddress.seItem = selected[0];
        return true;
    }
};

/**
 * 点击添加风控通讯录
 */
RiskAddress.openAddRiskAddress = function () {
    var index = layer.open({
        type: 2,
        title: '添加风控通讯录',
        area: ['800px', '420px'], //宽高
        fix: false, //不固定
        maxmin: true,
        content: Feng.ctxPath + '/riskAddress/riskAddress_add'
    });
    this.layerIndex = index;
};

/**
 * 打开查看风控通讯录详情
 */
RiskAddress.openRiskAddressDetail = function () {
    if (this.check()) {
        var index = layer.open({
            type: 2,
            title: '风控通讯录详情',
            area: ['800px', '420px'], //宽高
            fix: false, //不固定
            maxmin: true,
            content: Feng.ctxPath + '/riskAddress/riskAddress_update/' + RiskAddress.seItem.id
        });
        this.layerIndex = index;
    }
};

/**
 * 删除风控通讯录
 */
RiskAddress.delete = function () {
    if (this.check()) {
        var ajax = new $ax(Feng.ctxPath + "/riskAddress/delete", function (data) {
            Feng.success("删除成功!");
            RiskAddress.table.refresh();
        }, function (data) {
            Feng.error("删除失败!" + data.responseJSON.message + "!");
        });
        ajax.set("riskAddressId",this.seItem.id);
        ajax.start();
    }
};

/**
 * 查询风控通讯录列表
 */
RiskAddress.search = function () {
    var queryData = {};
    queryData['condition'] = $("#condition").val();
    RiskAddress.table.refresh({query: queryData});
};

$(function () {
    var defaultColunms = RiskAddress.initColumn();
    var table = new BSTable(RiskAddress.id, "/riskAddress/list", defaultColunms);
    table.setPaginationType("client");
    RiskAddress.table = table.init();
});
