package org.neuedu.dao;

import org.apache.ibatis.session.SqlSession;
import org.neuedu.domain.Emp;
import org.neuedu.util.DBUtils;

import java.util.Date;

public class TestEmpMapper {

    public static void main(String[] args) {
        SqlSession sqlSession= DBUtils.getSqlSession();
        EmpMapper empMapper=sqlSession.getMapper(EmpMapper.class);

        //Emp emp=empMapper.selectEmpById(7369);
        //System.out.println(emp.getEname());
        //System.out.println(emp.getDept());

        /**
         * 如何实现一种效果：关联查询时，需要一的一方，mybatis帮我们查，不需要就不帮我们查
         * 1.分开查询
         * 2.写两个sql语句
         Emp emp=empMapper.selectEmpByIdLazy(7369);
         System.out.println(emp.getEname());
         System.out.println(emp.getDept().getDname());
         */

        //System.out.println(emp.getDept().getDname());

//        Dept dept=empMapper.selectDeptById(20);
//        System.out.println(dept);
//        System.out.println(dept.getEmps().toString());

        Emp emp=empMapper.selectEmpByAnnotation(7369);
        System.out.println(emp);

//        Emp emp2=empMapper.updateEmpByename(7366,"SMITH");
//        System.out.println(emp2);

//        Emp emp3=empMapper.deleteEmpByall(7369);
//        System.out.println(emp3);
        Emp emp2=new Emp();
        emp2.setEmpno(7902);
        emp2.setEname("名字");
        emp2.setJob("ANALYST");
        emp2.setSal(11.00);
        emp2.setHiredate(new Date());

//        empMapper.insertEmp(emp2);
//        empMapper.updateEmp(emp2);
        empMapper.deleteEmp(emp2);

        sqlSession.commit();


    }
}
