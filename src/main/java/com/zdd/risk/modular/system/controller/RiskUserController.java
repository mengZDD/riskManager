package com.zdd.risk.modular.system.controller;

import com.zdd.risk.common.controller.BaseController;
import com.zdd.risk.common.persistence.model.RiskUser;
import com.zdd.risk.common.utils.WarpperBasic;
import com.zdd.risk.modular.system.dao.RiskUserMapper;
import com.zdd.risk.modular.system.warpper.RiskUserWarpper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;

/**
 * 用户控制器
 *
 * @author fengshuonan
 * @Date 2018-12-17 17:08:30
 */
@Controller
@RequestMapping("/riskUser")
public class RiskUserController extends BaseController {

    private String PREFIX = "/system/riskUser/";

    @Autowired
    private RiskUserMapper riskUserMapper;

    /**
     * 跳转到用户首页
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "riskUser.html";
    }

    /**
     * 跳转到添加用户
     */
    @RequestMapping("/riskUser_add")
    public String riskUserAdd() {
        return PREFIX + "riskUser_add.html";
    }

    /**
     * 跳转到修改用户
     */
    @RequestMapping("/riskUser_update/{riskUserId}")
    public String riskUserUpdate(@PathVariable Integer riskUserId, Model model) {
        return PREFIX + "riskUser_edit.html";
    }

    /**
     * 获取用户列表
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Object list(String condition) {

        List<Map<String, Object>> mapList = riskUserMapper.selectAll();

        Object warp = new WarpperBasic(mapList).warp();
        return warp;
        //return new RiskUserWarpper(mapList);


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
