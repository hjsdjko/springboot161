package com.cl.dao;

import com.cl.entity.GaojianfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.GaojianfenleiView;


/**
 * 稿件分类
 * 
 * @author 
 * @email 
 * @date 2024-03-14 21:07:54
 */
public interface GaojianfenleiDao extends BaseMapper<GaojianfenleiEntity> {
	
	List<GaojianfenleiView> selectListView(@Param("ew") Wrapper<GaojianfenleiEntity> wrapper);

	List<GaojianfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<GaojianfenleiEntity> wrapper);
	
	GaojianfenleiView selectView(@Param("ew") Wrapper<GaojianfenleiEntity> wrapper);
	

}
