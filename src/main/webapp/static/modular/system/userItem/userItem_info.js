/**
 * 初始化用户详情对话框
 */
var UserItemInfoDlg = {
    userItemInfoData : {}
};

/**
 * 清除数据
 */
UserItemInfoDlg.clearData = function() {
    this.userItemInfoData = {};
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
UserItemInfoDlg.set = function(key, val) {
    this.userItemInfoData[key] = (typeof value == "undefined") ? $("#" + key).val() : value;
    return this;
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
UserItemInfoDlg.get = function(key) {
    return $("#" + key).val();
}

/**
 * 关闭此对话框
 */
UserItemInfoDlg.close = function() {
    parent.layer.close(window.parent.UserItem.layerIndex);
}

/**
 * 收集数据
 */
UserItemInfoDlg.collectData = function() {
    this.set('id');
}

/**
 * 提交添加
 */
UserItemInfoDlg.addSubmit = function() {

    this.clearData();
    this.collectData();

    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/userItem/add", function(data){
        Feng.success("添加成功!");
        window.parent.UserItem.table.refresh();
        UserItemInfoDlg.close();
    },function(data){
        Feng.error("添加失败!" + data.responseJSON.message + "!");
    });
    ajax.set(this.userItemInfoData);
    ajax.start();
}

/**
 * 提交修改
 */
UserItemInfoDlg.editSubmit = function() {

    this.clearData();
    this.collectData();

    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/userItem/update", function(data){
        Feng.success("修改成功!");
        window.parent.UserItem.table.refresh();
        UserItemInfoDlg.close();
    },function(data){
        Feng.error("修改失败!" + data.responseJSON.message + "!");
    });
    ajax.set(this.userItemInfoData);
    ajax.start();
}

$(function() {

});
