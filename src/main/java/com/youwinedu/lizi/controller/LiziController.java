package com.youwinedu.lizi.controller;

import com.youwinedu.lizi.controller.struct.WebResponse;
import com.youwinedu.lizi.controller.struct.WebResponseStatus;
import com.youwinedu.lizi.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Author : Lance lance7in_gmail_com
 * Date   : 21/09/15 22:40
 * Since  :
 */
@Controller
@RequestMapping("/lizi")
public class LiziController {

    @Autowired
    IUserService service;

    @RequestMapping(value = "")
    public WebResponse save(@RequestBody Map<String, String> params) {
        //TODO create lizi
        return new WebResponse().setStatus(WebResponseStatus.SUCCESS);

    }

    //TODO Controller get lizi by user

    //TODO  create lizi                           /new
}
