package com.example.security.demo.controller;

import com.example.security.demo.common.ResponseResult;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

@Controller
public class DashboardController {

    @RequestMapping(value = "")
    public String loginView(){
        return "index";
    }

    @RequestMapping("/unauthorized")
    public void unAuthorized(HttpServletResponse response) throws IOException {
        response.setContentType("application/json;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        Writer out = response.getWriter();
        out.write("{\"status\": \"error\", \"msg\": \"未登录！\"}");
        out.flush();
        out.close();
    }

}
