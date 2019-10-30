package com.orm.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author ：dhl
 * @date ： 2019/10/29 13:51
 * @description：数据库连接
 * @version:
 */
public class GetConnection {

    private static final String driverClassName = "com.mysql.jdbc.Driver";

    public static Connection getConnect(){
        Connection connection = null;
        String url = "jdbc:mysql://10.11.1.5:3306/website?useUnicode=true&characterEncoding=utf-8";
        // 用户名和密码
        String username = "hejian";
        String password = "hejian@web";
        try {
            Class.forName(driverClassName);
            connection = DriverManager.getConnection(url,username,password);
        }catch (Exception e){
            e.printStackTrace();
        }
        return connection;
    }
}
