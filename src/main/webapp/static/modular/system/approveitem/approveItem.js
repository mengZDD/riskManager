/**
 * 进件详情管理初始化
 */
var ApproveItem = {
    id: "ApproveItemTable",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1
};

/**
 * 初始化表格的列
 */
ApproveItem.initColumn = function () {
    return [
        {field: 'selectItem', radio: true},
        {title: 'id', field: 'id', visible: false, align: 'center', valign: 'middle'}
    ];
};

/**
 * 检查是否选中
 */
ApproveItem.check = function () {
    var selected = $('#' + this.id).bootstrapTable('getSelections');
    if(selected.length == 0){
        Feng.info("请先选中表格中的某一记录！");
        return false;
    }else{
        ApproveItem.seItem = selected[0];
        return true;
    }
};

/**
 * 点击添加进件详情
 */
ApproveItem.openAddApproveItem = function () {
    var index = layer.open({
        type: 2,
        title: '添加进件详情',
        area: ['800px', '420px'], //宽高
        fix: false, //不固定
        maxmin: true,
        content: Feng.ctxPath + '/approveItem/approveItem_add'
    });
    this.layerIndex = index;
};

/**
 * 打开查看进件详情详情
 */
ApproveItem.openApproveItemDetail = function () {
    if (this.check()) {
        var index = layer.open({
            type: 2,
            title: '进件详情详情',
            area: ['800px', '420px'], //宽高
            fix: false, //不固定
            maxmin: true,
            content: Feng.ctxPath + '/approveItem/approveItem_update/' + ApproveItem.seItem.id
        });
        this.layerIndex = index;
    }
};

/**
 * 删除进件详情
 */
ApproveItem.delete = function () {
    if (this.check()) {
        var ajax = new $ax(Feng.ctxPath + "/approveItem/delete", function (data) {
            Feng.success("删除成功!");
            ApproveItem.table.refresh();
        }, function (data) {
            Feng.error("删除失败!" + data.responseJSON.message + "!");
        });
        ajax.set("approveItemId",this.seItem.id);
        ajax.start();
    }
};

/**
 * 查询进件详情列表
 */
ApproveItem.search = function () {
    var queryData = {};
    queryData['condition'] = $("#condition").val();
    ApproveItem.table.refresh({query: queryData});
};

$(function () {
    var defaultColunms = ApproveItem.initColumn();
    var table = new BSTable(ApproveItem.id, "/approveItem/list", defaultColunms);
    table.setPaginationType("client");
    ApproveItem.table = table.init();
});
