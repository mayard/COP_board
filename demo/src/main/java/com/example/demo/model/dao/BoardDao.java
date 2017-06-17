package com.example.demo.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDao<T> {

    @Autowired
    @Qualifier("firstSqlSessionTemplate")
    private SqlSession sqlSession;

    public List<T> selectList(String statement, Object param) {
        return sqlSession.selectList(statement, param);
    }

    public int insert(String statement, Object param) {
        return sqlSession.insert(statement, param);
    }
    
    public int delete(String statement, Object param) {
        return sqlSession.delete(statement, param);
    }
    
    public int update(String statement, Object param) {
        return sqlSession.update(statement, param);
    } 
}
