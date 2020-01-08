package com.mr.dzh.user.controller;

import com.mr.dzh.entity.DemoEntity;
import com.mr.dzh.service.DemoService;
import com.mr.dzh.utils.ExcelUtiles;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @ClassName UserController
 * @Description: TODO
 * @Author douzhihong
 * @Date 2020/1/4
 * @Version v1.0
 */
@RestController
@Api
@RequestMapping(value = "demo")
public class UserController {

    @Autowired
    private DemoService demoService;

    @GetMapping
    @RequestMapping("/exportExcel")
    public void exportExcel(HttpServletResponse response) throws IOException {
        //查询数据库t_demo 的数据
        List demoList = demoService.getDemoList();
        //将查询出的list放入easypoi工具类导出
        ExcelUtiles.exportExcel(demoList, "测试信息表", "测试信息", DemoEntity.class, "hh", response);
    }
    @PostMapping
    public String importExcel(@RequestBody @RequestParam("file") MultipartFile file) throws IOException {

        List<DemoEntity> personVoList = ExcelUtiles.importExcel(file, DemoEntity.class);

        demoService.demoSave(personVoList);

        return  "导入成功";
    }
}
 
