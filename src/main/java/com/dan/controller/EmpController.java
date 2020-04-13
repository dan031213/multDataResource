package com.dan.controller;

import com.dan.dao.EmpDao;
import com.dan.entity.Emp;
import com.dan.mult.DataSource;
import com.dan.mult.DataSourceType;
import com.dan.mult.DynamicDataSource;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@Log4j
public class EmpController {

    @Autowired
    EmpDao empDao;

    @Autowired
    DynamicDataSource dynamicDataSource;

    @GetMapping("/selectEmp")
    @DataSource(value = DataSourceType.LOCAL)
    public String selectEmp() {
        return "ok";
    }

    @RequestMapping("selectAll")
    @DataSource(value = DataSourceType.LOCAL)
    public List<Emp> selectAll() {
        List<Emp> emps = empDao.selectList(null);
        return emps;
    }

    @RequestMapping("selectAll2")
    @DataSource
    public List<Emp> selectAll2() {
        List<Emp> emps = empDao.selectList(null);
        return emps;
    }

    @RequestMapping("selectAll3")
    public List<Emp> selectAll3() {
        List<Emp> emps = empDao.selectList(null);
        return emps;
    }
}