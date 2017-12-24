package com.dao.Impl;

import com.dao.TbStuDao;
import com.entity.TbStu;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by csx on 2017/12/22.
 */
@Repository("stuDao")
public class TbStuDaoImpl extends BaseDao implements TbStuDao {
    @Override
    public boolean addStu(TbStu stu) {
        try {
            getSession().save(stu);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List findStuList(String hql) {
        return getSession().createQuery(hql).list();
    }

    @Override
    public TbStu getstuListById(int id) {
        return getSession().get(TbStu.class,id);
    }

    @Override
    public boolean updateStu(TbStu stu) {
        getSession().update(stu);
        return true;
    }
}
