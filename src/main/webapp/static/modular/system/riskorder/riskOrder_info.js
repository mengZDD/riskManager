/**
 * 初始化风控订单详情对话框
 */
var RiskOrderInfoDlg = {
    riskOrderInfoData : {}
};

/**
 * 清除数据
 */
RiskOrderInfoDlg.clearData = function() {
    this.riskOrderInfoData = {};
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
RiskOrderInfoDlg.set = function(key, val) {
    this.riskOrderInfoData[key] = (typeof value == "undefined") ? $("#" + key).val() : value;
    return this;
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
RiskOrderInfoDlg.get = function(key) {
    return $("#" + key).val();
}

/**
 * 关闭此对话框
 */
RiskOrderInfoDlg.close = function() {
    parent.layer.close(window.parent.RiskOrder.layerIndex);
}

/**
 * 收集数据
 */
RiskOrderInfoDlg.collectData = function() {
    this.set('id');
}

/**
 * 提交添加
 */
RiskOrderInfoDlg.addSubmit = function() {

    this.clearData();
    this.collectData();

    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/riskOrder/add", function(data){
        Feng.success("添加成功!");
        window.parent.RiskOrder.table.refresh();
        RiskOrderInfoDlg.close();
    },function(data){
        Feng.error("添加失败!" + data.responseJSON.message + "!");
    });
    ajax.set(this.riskOrderInfoData);
    ajax.start();
}

/**
 * 提交修改
 */
RiskOrderInfoDlg.editSubmit = function() {

    this.clearData();
    this.collectData();

    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/riskOrder/update", function(data){
        Feng.success("修改成功!");
        window.parent.RiskOrder.table.refresh();
        RiskOrderInfoDlg.close();
    },function(data){
        Feng.error("修改失败!" + data.responseJSON.message + "!");
    });
    ajax.set(this.riskOrderInfoData);
    ajax.start();
}

$(function() {

});
