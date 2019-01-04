package com.glut.xupk.multiple.controller;

import com.glut.xupk.multiple.pojo.pgsql.Department;
import com.glut.xupk.multiple.service.impl.DeptServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("department")
public class DepartmentController {

    @Autowired
    DeptServiceImpl deptService;

    @RequestMapping("getAllDept")
    @ResponseBody
    public Map<String,Object> getAllDept(){
        List<Department> list = deptService.getAllDept();
        Map<String,Object> result = new HashMap<>();
        result.put("result",list);
        result.put("msg","success");
        return result;
    }
}
