package com.mr.dzh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName RediRectController
 * @Description: TODO
 * @Author
 * @date 2020/1/6
 * @Version V1.0
 **/
@Controller
public class RediRectController {

    public static void main(String[] args) {
        System.out.println("hhkhkhkhk");
    }

    @GetMapping(value = "/")
    public String toIndex(){

        return "index";
    }

}
