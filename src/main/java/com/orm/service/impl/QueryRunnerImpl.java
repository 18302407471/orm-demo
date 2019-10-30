package com.orm.service.impl;

import com.orm.service.QueryRunner;
import com.orm.util.GetConnection;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ：dhl
 * @date ： 2019/10/29 15:03
 * @description：
 * @version:
 */
public class QueryRunnerImpl implements QueryRunner {

    @Override
    public <T> List<T> queryAsList(String sql, Class<T> t) {
        Connection connection = GetConnection.getConnect();
        Field[] fields = t.getDeclaredFields();
        List<T> list = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Object object = t.newInstance();
                for (Field field : fields) {
                    field.setAccessible(true);
                    System.out.println(field.getName().replaceAll("[A-Z]", "_$0").toLowerCase());
                    Object value = resultSet.getObject(field.getName().replaceAll("[A-Z]", "_$0").toLowerCase());
                    field.set(object, value);
                }
                list.add((T) object);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
}
