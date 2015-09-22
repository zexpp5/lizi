package com.youwinedu.lizi.controller;

import com.youwinedu.lizi.controller.struct.WebResponse;
import com.youwinedu.lizi.controller.struct.WebResponseStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Author : Lance lance7in_gmail_com
 * Date   : 21/09/15 22:40
 * Since  :
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "", method = RequestMethod.POST)
    public
    @ResponseBody
    WebResponse create(@RequestBody Map<String, String> params) {
        //TODO create
        return new WebResponse().setStatus(WebResponseStatus.SUCCESS);
    }

    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public
    @ResponseBody
    WebResponse ban(@RequestBody Map<String, String> params) {
        //TODO create
        return new WebResponse().setStatus(WebResponseStatus.SUCCESS);
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    public
    @ResponseBody
    WebResponse update(@RequestBody Map<String, String> params) {
        //TODO create
        return new WebResponse().setStatus(WebResponseStatus.SUCCESS);
    }

    //TODO 查看专职下面的兼职

}
