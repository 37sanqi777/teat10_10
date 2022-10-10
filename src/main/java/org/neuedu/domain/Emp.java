package org.neuedu.domain;

import java.util.Date;

public class Emp {  //多的一方

    private Integer empno;
    private String ename;
    private String job;
  //  private Integer deptno;  //外键的定义1
    private Dept dept;//外键的定义2  一的一方   多对一的一个属性
    private  Double sal;
    private Date hiredate;

    //lazy

    @Override
    public String toString() {
        return "Emp{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", dept=" + dept +
                ", sal=" + sal +
                ", hiredate=" + hiredate +
                '}';
    }

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

//com.mysql.cj.jdbc.Driver driver;
}
