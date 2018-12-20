/**
 * 初始化进件审核详情对话框
 */
var RiskApproveInfoDlg = {
    riskApproveInfoData : {}
};

/**
 * 清除数据
 */
RiskApproveInfoDlg.clearData = function() {
    this.riskApproveInfoData = {};
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
RiskApproveInfoDlg.set = function(key, val) {
    this.riskApproveInfoData[key] = (typeof value == "undefined") ? $("#" + key).val() : value;
    return this;
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
RiskApproveInfoDlg.get = function(key) {
    return $("#" + key).val();
}

/**
 * 关闭此对话框
 */
RiskApproveInfoDlg.close = function() {
    parent.layer.close(window.parent.RiskApprove.layerIndex);
}

/**
 * 收集数据
 */
RiskApproveInfoDlg.collectData = function() {
    this.set('id');
}

/**
 * 提交添加
 */
RiskApproveInfoDlg.addSubmit = function() {

    this.clearData();
    this.collectData();

    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/riskApprove/add", function(data){
        Feng.success("添加成功!");
        window.parent.RiskApprove.table.refresh();
        RiskApproveInfoDlg.close();
    },function(data){
        Feng.error("添加失败!" + data.responseJSON.message + "!");
    });
    ajax.set(this.riskApproveInfoData);
    ajax.start();
}

/**
 * 提交修改
 */
RiskApproveInfoDlg.editSubmit = function() {

    this.clearData();
    this.collectData();

    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/riskApprove/update", function(data){
        Feng.success("修改成功!");
        window.parent.RiskApprove.table.refresh();
        RiskApproveInfoDlg.close();
    },function(data){
        Feng.error("修改失败!" + data.responseJSON.message + "!");
    });
    ajax.set(this.riskApproveInfoData);
    ajax.start();
}

$(function() {

});
