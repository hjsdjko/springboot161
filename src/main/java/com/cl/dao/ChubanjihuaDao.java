package com.cl.dao;

import com.cl.entity.ChubanjihuaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ChubanjihuaView;


/**
 * 出版计划
 * 
 * @author 
 * @email 
 * @date 2024-03-14 21:07:54
 */
public interface ChubanjihuaDao extends BaseMapper<ChubanjihuaEntity> {
	
	List<ChubanjihuaView> selectListView(@Param("ew") Wrapper<ChubanjihuaEntity> wrapper);

	List<ChubanjihuaView> selectListView(Pagination page,@Param("ew") Wrapper<ChubanjihuaEntity> wrapper);
	
	ChubanjihuaView selectView(@Param("ew") Wrapper<ChubanjihuaEntity> wrapper);
	

}
