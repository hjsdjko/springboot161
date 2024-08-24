package com.cl.dao;

import com.cl.entity.TougaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.TougaoView;


/**
 * 投稿
 * 
 * @author 
 * @email 
 * @date 2024-03-14 21:07:54
 */
public interface TougaoDao extends BaseMapper<TougaoEntity> {
	
	List<TougaoView> selectListView(@Param("ew") Wrapper<TougaoEntity> wrapper);

	List<TougaoView> selectListView(Pagination page,@Param("ew") Wrapper<TougaoEntity> wrapper);
	
	TougaoView selectView(@Param("ew") Wrapper<TougaoEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<TougaoEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<TougaoEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<TougaoEntity> wrapper);



}
