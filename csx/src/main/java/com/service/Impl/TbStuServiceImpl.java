package com.service.Impl;

import com.dao.TbStuDao;
import com.entity.TbStu;
import com.service.TbStuService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by csx on 2017/12/22.
 */
@Service("stuService")
@Transactional(propagation = Propagation.REQUIRED)
public class TbStuServiceImpl implements TbStuService{
    @Resource(name = "stuDao")
    private TbStuDao stuDao;

    @Override
    public boolean addStu(TbStu stu) {
        return stuDao.addStu(stu);
    }

    @Override
    public List findStuList() {
        return stuDao.findStuList("from TbStu");
    }

    @Override
    public TbStu fandStuById(int id) {
        return stuDao.getstuListById(id);
    }

    public void setStuDao(TbStuDao stuDao) {
        this.stuDao = stuDao;
    }
}
