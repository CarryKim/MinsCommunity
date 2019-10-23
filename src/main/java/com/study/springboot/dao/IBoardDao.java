package com.study.springboot.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IBoardDao {

	List<Map<String, Object>> writeList(@Param("writer") String user) throws Exception;

}