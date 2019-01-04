package com.glut.xupk.multiple.service.impl;

import com.glut.xupk.multiple.dao.pgsql.DepartmentMapper;
import com.glut.xupk.multiple.pojo.pgsql.Department;
import com.glut.xupk.multiple.pojo.pgsql.DepartmentExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl {

    @Autowired
    DepartmentMapper departmentMapper;

    public List<Department> getAllDept(){
        DepartmentExample departmentExample = new DepartmentExample();
        departmentExample.createCriteria().andIdIsNotNull();
        List<Department> list = departmentMapper.selectByExample(departmentExample);
        return list;
    }
}
