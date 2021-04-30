package com.denny.t5.handson.app.emp.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.inject.Inject;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.denny.t5.handson.app.emp.form.EmpEditForm;
import com.denny.t5.handson.domain.blogic.emp.EmpBLogic;
import com.denny.t5.handson.domain.model.dto.EmpInfoDTO;
import com.denny.t5.handson.domain.model.entity.Emp;

/**
 * Handles requests for the application home page.
 */
@Controller
public class EmpController {

    @Inject
    private EmpBLogic empBLogic;

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    @ModelAttribute
    public EmpEditForm setUpForm(EmpEditForm empEditForm) {

        if (empEditForm == null) {
            empEditForm = new EmpEditForm();
        }

        return empEditForm;
    }

    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/emps")
    public String showEmpList(Model model, @RequestParam("deptId") String deptId) {

        model.addAttribute("empInfoList", empBLogic.getEmpList(deptId));

        return "handson/empList";
    }

    /**
     * 社員情報確認処理
     *
     * @param model モデル
     * @param empId 社員ID
     * @return
     */
    @RequestMapping(value = "/empInfo")
    public String showEmpInfo(Model model, @RequestParam("empId") String empId) {

        model.addAttribute("empInfo", empBLogic.getEmpDetailInfo(empId));

        return "handson/empInfo";
    }

    @RequestMapping(value = "/newEmp")
    public String createNewEmp(EmpEditForm empEditForm) {

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
        convertString2Date(empInfo.getHiredDate(), empEditForm);

        return "handson/empEdit";
    }

    @RequestMapping(value = "/empConfirm")
    public String updateEmp(Model model, @Validated EmpEditForm empEditForm, BindingResult result) throws ParseException {

        if (result.hasErrors()) {
            return "handson/empEdit";
        }

        Emp emp = new Emp();
        BeanUtils.copyProperties(empEditForm, emp);
        emp.setHiredDate(sdf.parse(empEditForm.getHiredDate()));

        String updatedEmpId = empBLogic.updateEmpInfo(emp);
        model.addAttribute("empId", updatedEmpId);

        return "redirect:/empInfo";
    }

    private void convertString2Date(Date date, EmpEditForm empEditForm) {
        empEditForm.setHiredDate(sdf.format(date));
    }
}
