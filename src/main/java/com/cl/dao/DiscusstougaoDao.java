package com.cl.dao;

import com.cl.entity.DiscusstougaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscusstougaoView;


/**
 * 投稿评论表
 * 
 * @author 
 * @email 
 * @date 2024-03-14 21:07:54
 */
public interface DiscusstougaoDao extends BaseMapper<DiscusstougaoEntity> {
	
	List<DiscusstougaoView> selectListView(@Param("ew") Wrapper<DiscusstougaoEntity> wrapper);

	List<DiscusstougaoView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusstougaoEntity> wrapper);
	
	DiscusstougaoView selectView(@Param("ew") Wrapper<DiscusstougaoEntity> wrapper);
	

}
