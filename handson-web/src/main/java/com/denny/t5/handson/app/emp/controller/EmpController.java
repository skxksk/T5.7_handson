package com.denny.t5.handson.app.emp.controller;

import javax.inject.Inject;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.denny.t5.handson.app.emp.form.EmpEditForm;
import com.denny.t5.handson.domain.blogic.emp.EmpBLogic;
import com.denny.t5.handson.domain.model.dto.EmpInfoDTO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class EmpController {

    @Inject
    private EmpBLogic empBLogic;

    @ModelAttribute
    public EmpEditForm setUpForm() {
        return new EmpEditForm();
    }

    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/emps")
    public String showEmpList(Model model, @RequestParam("deptId") String deptId) {

        model.addAttribute("empInfoList", empBLogic.getEmpList(deptId));

        return "handson/empList";
    }

    @RequestMapping(value = "/empInfo")
    public String showEmpInfo(Model model, @RequestParam("empId") String empId) {

        model.addAttribute("empInfo", empBLogic.getEmpDetailInfo(empId));

        return "handson/empInfo";
    }

    @RequestMapping(value = "/newEmp")
    public String createNewEmp(EmpEditForm empEditForm) {

        empEditForm.setEmpId("社員IDは自動生成されます。");

        return "handson/empEdit";
    }

    @RequestMapping(value = "/mgr")
    public String selectMgr(Model model,
            @RequestParam("deptId") String deptId,
            @RequestParam("jobId") String jobId) {

        model.addAttribute("mgrInfoList", empBLogic.getMgrInfoList(deptId, jobId));

        return "common/selectMgr";
    }


    @RequestMapping(value = "/empEdit")
    public String editEmp(Model model, EmpEditForm empEditForm, @RequestParam("empId") String empId) {

        EmpInfoDTO empInfo = empBLogic.getEmpDetailInfo(empId);
        model.addAttribute(empInfo);

        BeanUtils.copyProperties(empInfo, empEditForm);

        return "handson/empEdit";
    }

    @RequestMapping(value = "/empConfirm")
    public String updateEmp(Model model, EmpEditForm empEditForm) {

//        EmpInfoDTO empInfo = empBLogic.getEmpDetailInfo(empId);
//        model.addAttribute(empInfo);
//
//        BeanUtils.copyProperties(empInfo, empEditForm);

        return "handson/empInfo";
    }

}
