package com.example.demo.model.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardDao<T> {

    @Autowired
    @Qualifier("firstSqlSessionTemplate")
    private SqlSession sqlSession;

    public List<T> selectList(String statement) {
        return sqlSession.selectList(statement);
    }

    public int insert(String statement, Object object) {
        return sqlSession.insert(statement, object);
    }
}