package com.orm.service;

import java.util.List;

public interface QueryRunner {

    <T> List<T> queryAsList(String sql, Class<T> t);


}
