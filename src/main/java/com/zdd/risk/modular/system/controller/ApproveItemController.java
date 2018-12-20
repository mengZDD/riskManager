package com.zdd.risk.modular.system.controller;

import com.zdd.risk.common.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 进件详情控制器
 *
 * @author fengshuonan
 * @Date 2018-12-17 17:09:55
 */
@Controller
@RequestMapping("/approveItem")
public class ApproveItemController extends BaseController {

    private String PREFIX = "/system/approveItem/";

    /**
     * 跳转到进件详情首页
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "approveItem.html";
    }

    /**
     * 跳转到添加进件详情
     */
    @RequestMapping("/approveItem_add")
    public String approveItemAdd() {
        return PREFIX + "approveItem_add.html";
    }

    /**
     * 跳转到修改进件详情
     */
    @RequestMapping("/approveItem_update/{approveItemId}")
    public String approveItemUpdate(@PathVariable Integer approveItemId, Model model) {
        return PREFIX + "approveItem_edit.html";
    }

    /**
     * 获取进件详情列表
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Object list(String condition) {
        return null;
    }

    /**
     * 新增进件详情
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public Object add() {
        return super.SUCCESS_TIP;
    }

    /**
     * 删除进件详情
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Object delete() {
        return SUCCESS_TIP;
    }


    /**
     * 修改进件详情
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public Object update() {
        return super.SUCCESS_TIP;
    }

    /**
     * 进件详情详情
     */
    @RequestMapping(value = "/detail")
    @ResponseBody
    public Object detail() {
        return null;
    }
}
