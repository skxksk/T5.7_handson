package com.denny.t5.handson.app.dept.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.denny.t5.handson.domain.blogic.emp.EmpConfirmBLogic;
import com.denny.t5.handson.domain.model.dto.EmpInfoDTO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class EmpConfirmController {

    private static final Logger logger = LoggerFactory.getLogger(EmpConfirmController.class);

    @Inject
    private EmpConfirmBLogic empConfirmBLogic;

//    @ModelAttribute
//    public EmpConfirmForm setUpForm() {
//        return new EmpConfirmForm();
//    }

    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/emps")
    public String showEmpInfoList(Model model, @RequestParam("deptId") String deptId) {

        List<EmpInfoDTO> empInfoList = empConfirmBLogic.getEmpList(deptId);

        if (empInfoList.isEmpty()) {
            logger.warn("社員情報が存在しません。");
        }

        model.addAttribute("empInfoList", empInfoList);

        return "handson/empListConfirm";
    }

}
