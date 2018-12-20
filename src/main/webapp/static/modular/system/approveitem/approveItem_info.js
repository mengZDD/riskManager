/**
 * 初始化进件详情详情对话框
 */
var ApproveItemInfoDlg = {
    approveItemInfoData : {}
};

/**
 * 清除数据
 */
ApproveItemInfoDlg.clearData = function() {
    this.approveItemInfoData = {};
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
ApproveItemInfoDlg.set = function(key, val) {
    this.approveItemInfoData[key] = (typeof value == "undefined") ? $("#" + key).val() : value;
    return this;
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
ApproveItemInfoDlg.get = function(key) {
    return $("#" + key).val();
}

/**
 * 关闭此对话框
 */
ApproveItemInfoDlg.close = function() {
    parent.layer.close(window.parent.ApproveItem.layerIndex);
}

/**
 * 收集数据
 */
ApproveItemInfoDlg.collectData = function() {
    this.set('id');
}

/**
 * 提交添加
 */
ApproveItemInfoDlg.addSubmit = function() {

    this.clearData();
    this.collectData();

    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/approveItem/add", function(data){
        Feng.success("添加成功!");
        window.parent.ApproveItem.table.refresh();
        ApproveItemInfoDlg.close();
    },function(data){
        Feng.error("添加失败!" + data.responseJSON.message + "!");
    });
    ajax.set(this.approveItemInfoData);
    ajax.start();
}

/**
 * 提交修改
 */
ApproveItemInfoDlg.editSubmit = function() {

    this.clearData();
    this.collectData();

    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/approveItem/update", function(data){
        Feng.success("修改成功!");
        window.parent.ApproveItem.table.refresh();
        ApproveItemInfoDlg.close();
    },function(data){
        Feng.error("修改失败!" + data.responseJSON.message + "!");
    });
    ajax.set(this.approveItemInfoData);
    ajax.start();
}

$(function() {

});
