package com.youwinedu.lizi.controller;

import com.youwinedu.lizi.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Author : Lance lance7in_gmail_com
 * Date   : 21/09/15 22:40
 * Since  :
 */
@Controller
@RequestMapping("/")
public class LoginController {

    @Autowired
    IUserService service;

    @RequestMapping(value = "")
    public ModelAndView save(@RequestBody Map<String,String> params) {

        ModelAndView view = new ModelAndView();
        view.setViewName("/savesuccess.jsp");
        return view;
    }
}
