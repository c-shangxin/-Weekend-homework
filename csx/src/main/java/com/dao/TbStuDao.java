package com.dao;

import com.entity.TbStu;

import java.util.List;

/**
 * Created by csx on 2017/12/22.
 */
public interface TbStuDao {
    //添加
    public boolean addStu(TbStu stu);

    //查询
    public List findStuList(String hql);

    //查ID
    public TbStu getstuListById(int id);

    //修改
    public boolean updateStu(TbStu stu);
}
