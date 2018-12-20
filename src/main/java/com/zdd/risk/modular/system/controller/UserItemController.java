package com.zdd.risk.modular.system.controller;

import com.zdd.risk.common.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 用户控制器
 *
 * @author fengshuonan
 * @Date 2018-12-18 14:27:23
 */
@Controller
@RequestMapping("/userItem")
public class UserItemController extends BaseController {

    private String PREFIX = "/system/userItem/";

    /**
     * 跳转到用户首页
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "userItem.html";
    }

    /**
     * 跳转到添加用户
     */
    @RequestMapping("/userItem_add")
    public String userItemAdd() {
        return PREFIX + "userItem_add.html";
    }

    /**
     * 跳转到修改用户
     */
    @RequestMapping("/userItem_update/{userItemId}")
    public String userItemUpdate(@PathVariable Integer userItemId, Model model) {
        return PREFIX + "userItem_edit.html";
    }

    /**
     * 获取用户列表
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Object list(String condition) {
        return null;
    }

    /**
     * 新增用户
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public Object add() {
        return super.SUCCESS_TIP;
    }

    /**
     * 删除用户
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Object delete() {
        return SUCCESS_TIP;
    }


    /**
     * 修改用户
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public Object update() {
        return super.SUCCESS_TIP;
    }

    /**
     * 用户详情
     */
    @RequestMapping(value = "/detail")
    @ResponseBody
    public Object detail() {
        return null;
    }
}
