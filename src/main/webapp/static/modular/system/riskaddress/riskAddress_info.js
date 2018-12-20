/**
 * 初始化风控通讯录详情对话框
 */
var RiskAddressInfoDlg = {
    riskAddressInfoData : {}
};

/**
 * 清除数据
 */
RiskAddressInfoDlg.clearData = function() {
    this.riskAddressInfoData = {};
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
RiskAddressInfoDlg.set = function(key, val) {
    this.riskAddressInfoData[key] = (typeof value == "undefined") ? $("#" + key).val() : value;
    return this;
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
RiskAddressInfoDlg.get = function(key) {
    return $("#" + key).val();
}

/**
 * 关闭此对话框
 */
RiskAddressInfoDlg.close = function() {
    parent.layer.close(window.parent.RiskAddress.layerIndex);
}

/**
 * 收集数据
 */
RiskAddressInfoDlg.collectData = function() {
    this.set('id');
}

/**
 * 提交添加
 */
RiskAddressInfoDlg.addSubmit = function() {

    this.clearData();
    this.collectData();

    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/riskAddress/add", function(data){
        Feng.success("添加成功!");
        window.parent.RiskAddress.table.refresh();
        RiskAddressInfoDlg.close();
    },function(data){
        Feng.error("添加失败!" + data.responseJSON.message + "!");
    });
    ajax.set(this.riskAddressInfoData);
    ajax.start();
}

/**
 * 提交修改
 */
RiskAddressInfoDlg.editSubmit = function() {

    this.clearData();
    this.collectData();

    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/riskAddress/update", function(data){
        Feng.success("修改成功!");
        window.parent.RiskAddress.table.refresh();
        RiskAddressInfoDlg.close();
    },function(data){
        Feng.error("修改失败!" + data.responseJSON.message + "!");
    });
    ajax.set(this.riskAddressInfoData);
    ajax.start();
}

$(function() {

});
