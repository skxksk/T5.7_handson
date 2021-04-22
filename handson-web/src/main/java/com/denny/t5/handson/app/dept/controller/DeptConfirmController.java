package com.denny.t5.handson.app.dept.controller;

import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.denny.t5.handson.app.dept.form.DeptConfirmForm;
import com.denny.t5.handson.domain.blogic.dept.DeptConfirmBLogic;
import com.denny.t5.handson.domain.model.entity.Dept;

/**
 * Handles requests for the application home page.
 */
@Controller
public class DeptConfirmController {

    private static final Logger logger = LoggerFactory.getLogger(DeptConfirmController.class);

    @Inject
    private DeptConfirmBLogic deptConfirmBLogic;

    @ModelAttribute
    public DeptConfirmForm setUpAbcForm() {
        return new DeptConfirmForm();
    }

    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/dept", method = {RequestMethod.GET, RequestMethod.POST})
    public String showDeptList(Locale locale, Model model) {
        logger.info("Welcome home! The client locale is {}.", locale);

//        Date date = new Date();
//        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//
//        String formattedDate = dateFormat.format(date);
//
//        model.addAttribute("serverTime", formattedDate);

        List<Dept> deptList = deptConfirmBLogic.getDeptList();

        model.addAttribute("deptList", deptList);

        return "handson/deptListConfirm";
    }

}
