package com.zdd.risk.modular.system.controller;

import com.zdd.risk.common.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 风控订单控制器
 *
 * @author fengshuonan
 * @Date 2018-12-17 17:09:22
 */
@Controller
@RequestMapping("/riskOrder")
public class RiskOrderController extends BaseController {

    private String PREFIX = "/system/riskOrder/";

    /**
     * 跳转到风控订单首页
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "riskOrder.html";
    }

    /**
     * 跳转到添加风控订单
     */
    @RequestMapping("/riskOrder_add")
    public String riskOrderAdd() {
        return PREFIX + "riskOrder_add.html";
    }

    /**
     * 跳转到修改风控订单
     */
    @RequestMapping("/riskOrder_update/{riskOrderId}")
    public String riskOrderUpdate(@PathVariable Integer riskOrderId, Model model) {
        return PREFIX + "riskOrder_edit.html";
    }

    /**
     * 获取风控订单列表
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Object list(String condition) {
        return null;
    }

    /**
     * 新增风控订单
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public Object add() {
        return super.SUCCESS_TIP;
    }

    /**
     * 删除风控订单
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Object delete() {
        return SUCCESS_TIP;
    }


    /**
     * 修改风控订单
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public Object update() {
        return super.SUCCESS_TIP;
    }

    /**
     * 风控订单详情
     */
    @RequestMapping(value = "/detail")
    @ResponseBody
    public Object detail() {
        return null;
    }
}
