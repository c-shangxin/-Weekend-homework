package com.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by csx on 2017/12/22.
 */
@Entity
@Table(name = "TBStu")
public class TbStu implements Serializable{
    private int sno;
    private String sname;
    private String ssex;
    private int sage;

    public TbStu() {

    }

    public TbStu(int sno, String sname, String ssex, int sage) {
        this.sno = sno;
        this.sname = sname;
        this.ssex = ssex;
        this.sage = sage;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public int getSage() {
        return sage;
    }

    public void setSage(int sage) {
        this.sage = sage;
    }
}
