package org.neuedu.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class DBUtils {

    static SqlSessionFactory sf;

    static{

        try{
            String resource="mybatis-config.xml";
            InputStream is= Resources.getResourceAsStream(resource);
            sf=new SqlSessionFactoryBuilder().build(is);
        }catch(Exception e){
            e.printStackTrace();
        }

    }


    public static SqlSession getSqlSession(){
        SqlSession sqlsession=sf.openSession();

        return sqlsession;
    }

    public static void close(SqlSession sqlSession){
        sqlSession.close();
    }

}
