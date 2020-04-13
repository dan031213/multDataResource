package com.dan.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;


@Data
public class Emp {

    @TableId(type = IdType.AUTO)
    private Integer empno;
    private String ename;
    private String job;
    private String mgr;
    private Date hiredate;
    private double sal;
    private double comm;
    private Integer depno;
}



