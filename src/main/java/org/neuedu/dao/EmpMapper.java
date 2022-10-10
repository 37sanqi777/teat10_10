package org.neuedu.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.neuedu.domain.Dept;
import org.neuedu.domain.Emp;

import java.io.InputStream;

public interface EmpMapper {
    @Select("select empno,ename,job,sal,hiredate from t_emp where empno=#{empno}")
    public Emp selectEmpByAnnotation(Integer empno);

    @Insert("insert into t_emp(empno,ename,job,sal,hiredate) values(#{empno},#{ename},#{job},#{sal},#{hiredate})")
    public void insertEmp(Emp emp);

    @Update("update t_emp set ename=#{ename},hiredate=#{hiredate} where empno=#{empno}")
    public void updateEmp(Emp emp);

    @Delete("delete  from t_emp where empno=#{empno}")
    public void deleteEmp(Emp emp);


    //查询员工信息，同时关联查询部门信息
    public Emp selectEmpById(Integer empno);

    public Emp selectEmpByIdLazy(Integer empno);

    //查询部门信息，同时关联查询员工信息
    public Dept selectDeptById(Integer deptno);


}
