package com.orm.test;

import com.orm.entity.TsRole;
import com.orm.service.QueryRunner;
import com.orm.service.impl.QueryRunnerImpl;
import com.orm.util.GetConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.List;

/**
 * @author ：dhl
 * @date ： 2019/10/29 14:17
 * @description：测试jdbc
 * @version:
 */
public class Test {

    public static void main(String[] args) {
        String sql = "select * from ts_role";
        List<TsRole> list = new QueryRunnerImpl().queryAsList(sql,TsRole.class);
        for (TsRole tsRole:list){
            System.out.println(tsRole.getCode());
        }
    }
}
