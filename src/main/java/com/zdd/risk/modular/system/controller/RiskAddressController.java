package com.zdd.risk.modular.system.controller;

import com.zdd.risk.common.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 风控通讯录控制器
 *
 * @author fengshuonan
 * @Date 2018-12-17 17:11:07
 */
@Controller
@RequestMapping("/riskAddress")
public class RiskAddressController extends BaseController {

    private String PREFIX = "/system/riskAddress/";

    /**
     * 跳转到风控通讯录首页
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "riskAddress.html";
    }

    /**
     * 跳转到添加风控通讯录
     */
    @RequestMapping("/riskAddress_add")
    public String riskAddressAdd() {
        return PREFIX + "riskAddress_add.html";
    }

    /**
     * 跳转到修改风控通讯录
     */
    @RequestMapping("/riskAddress_update/{riskAddressId}")
    public String riskAddressUpdate(@PathVariable Integer riskAddressId, Model model) {
        return PREFIX + "riskAddress_edit.html";
    }

    /**
     * 获取风控通讯录列表
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Object list(String condition) {
        return null;
    }

    /**
     * 新增风控通讯录
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public Object add() {
        return super.SUCCESS_TIP;
    }

    /**
     * 删除风控通讯录
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Object delete() {
        return SUCCESS_TIP;
    }


    /**
     * 修改风控通讯录
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public Object update() {
        return super.SUCCESS_TIP;
    }

    /**
     * 风控通讯录详情
     */
    @RequestMapping(value = "/detail")
    @ResponseBody
    public Object detail() {
        return null;
    }
}
