package com.example.security.demo.controller;

import com.example.security.demo.common.ResponseResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Mao.Zeng@MG
 * @date 2018/3/22 16:14
 */
@Controller
public class UserController {

    @RequestMapping("/test")
    public ResponseEntity<ResponseResult> test(){
        ResponseResult result = new ResponseResult();
        return ResponseEntity.ok(result);
    }

    @RequestMapping("/user/index")
    public String index(){
        return "user/index";
    }

}
