package com.zdd.risk.modular.system.controller;

import com.zdd.risk.common.controller.BaseController;
import com.zdd.risk.common.persistence.model.RiskApprove;
import com.zdd.risk.modular.system.service.RiskApproveService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;

/**
 * 进件审核控制器
 *
 * @author fengshuonan
 * @Date 2018-12-20 16:21:38
 */
@Controller
@RequestMapping("/riskApprove")
public class RiskApproveController extends BaseController {

    private String PREFIX = "/system/riskApprove/";

    @Autowired
    private RiskApproveService riskApproveService;

    /**
     * 跳转到进件审核首页
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "riskApprove.html";
    }

    /**
     * 跳转到添加进件审核
     */
    @RequestMapping("/riskApprove_add")
    public String riskApproveAdd() {
        return PREFIX + "riskApprove_add.html";
    }

    /**
     * 跳转到修改进件审核
     */
    @RequestMapping("/riskApprove_update/{riskApproveId}")
    public String riskApproveUpdate(@PathVariable Integer riskApproveId, Model model) {
        return PREFIX + "riskApprove_edit.html";
    }

    /**
     * 获取进件审核列表
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Object list(String condition) {

        //List<Map<String,Object>> mapList=riskApproveService.selectAll();
        List<RiskApprove> maplist=riskApproveService.selectAll();

        return maplist;


    }

    /**
     * 新增进件审核
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public Object add() {
        return super.SUCCESS_TIP;
    }

    /**
     * 删除进件审核
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Object delete() {
        return SUCCESS_TIP;
    }


    /**
     * 修改进件审核
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public Object update() {
        return super.SUCCESS_TIP;
    }

    /**
     * 进件审核详情
     */
    @RequestMapping(value = "/detail")
    @ResponseBody
    public Object detail() {
        return null;
    }
}
