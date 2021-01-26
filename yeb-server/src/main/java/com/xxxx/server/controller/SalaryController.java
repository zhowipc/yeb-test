package com.xxxx.server.controller;


import com.xxxx.server.pojo.RespBean;
import com.xxxx.server.pojo.Salary;
import com.xxxx.server.service.ISalaryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhanglishen
 * @since 2020-11-14
 */
@Api(tags = "SalaryController")
@RestController
@RequestMapping("/salary/sob")
public class SalaryController {

    @Autowired
    private ISalaryService salaryService;

    @ApiOperation(value = "获取所有工资套账")
    @GetMapping("/")
    public List<Salary> getAllSalary(){
        return salaryService.list();
    }


}
