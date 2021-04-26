package com.denny.t5.handson.app.dept.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.denny.t5.handson.domain.blogic.emp.EmpBLogic;

/**
 * Handles requests for the application home page.
 */
@Controller
public class EmpController {

    @Inject
    private EmpBLogic empConfirmBLogic;

//    @ModelAttribute
//    public EmpSearchForm setUpForm() {
//        return new EmpSearchForm();
//    }

    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/emps")
    public String showEmpList(Model model, @RequestParam("deptId") String deptId) {

        model.addAttribute("empInfoList", empConfirmBLogic.getEmpList(deptId));

        return "handson/empList";
    }

    @RequestMapping(value = "/empInfo")
    public String showEmpInfo(Model model, @RequestParam("empId") String empId) {

        model.addAttribute("empInfo", empConfirmBLogic.getEmpDetailInfo(empId));

        return "handson/empInfo";
    }

}
