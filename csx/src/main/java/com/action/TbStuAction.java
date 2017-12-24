package com.action;

import com.entity.TbStu;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.TbStuService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by csx on 2017/12/22.
 */
@Controller("stuAction")
@Scope("prototype")
public class TbStuAction extends ActionSupport{
    private TbStu stu;
    private List stuList;

    @Resource(name = "stuService")
    private TbStuService stuService;
    //添加
    public String addStu(){
       if (stuService.addStu(stu)){
           System.out.println("添加成功");
       }else {
           System.out.println("添加失败");
       }
        return "addstu";
    }

    //查询
    public String findStuList(){
        List stuList = stuService.findStuList();
        ActionContext.getContext().put("stuList",stuList);
        return "stulist";
    }


    public TbStu getStu() {
        return stu;
    }

    public void setStu(TbStu stu) {
        this.stu = stu;
    }

    public List getStuList() {
        return stuList;
    }

    public void setStuList(List stuList) {
        this.stuList = stuList;
    }

    public TbStuService getStuService() {
        return stuService;
    }

    public void setStuService(TbStuService stuService) {
        this.stuService = stuService;
    }
}
