package com.service;

import com.entity.TbStu;

import java.util.List;

/**
 * Created by csx on 2017/12/22.
 */
public interface TbStuService {
    //添加
    public boolean addStu(TbStu stu);
    //查询
    public List findStuList();
    //查ID
    public TbStu fandStuById(int id);
    //修改
    public boolean updateStu(TbStu stu);
}
