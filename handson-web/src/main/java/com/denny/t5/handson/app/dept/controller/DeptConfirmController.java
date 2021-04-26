package com.denny.t5.handson.app.dept.controller;

import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.denny.t5.handson.domain.blogic.dept.DeptConfirmBLogic;

/**
 * Handles requests for the application home page.
 */
@Controller
public class DeptConfirmController {

    private static final Logger logger = LoggerFactory.getLogger(DeptConfirmController.class);

    @Inject
    private DeptConfirmBLogic deptConfirmBLogic;

//    @ModelAttribute
//    public DeptConfirmForm setUpForm() {
//        return new DeptConfirmForm();
//    }

    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = {"/", "/dept"})
    public String showDeptList(Locale locale, Model model) {
        logger.info("Welcome home! The client locale is {}.", locale);

        model.addAttribute("deptList", deptConfirmBLogic.getDeptList());

        return "handson/deptList";
    }

}
