package cn.cherzing.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * @author Cherzing
 * @date 2024/10/24 0024 16:15
 * @description Mybatis
 */
public class MybatisUtils {
    private static final SqlSessionFactory sqlSessionFactory;
    static Reader reader;

    static {

        try {
            reader = Resources.getResourceAsReader("mybatis-config.xml");

            sqlSessionFactory =
                    new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static SqlSession getSqlSession()
    {
        return sqlSessionFactory.openSession();
    }

}
