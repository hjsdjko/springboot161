package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ChubanjihuaEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ChubanjihuaView;


/**
 * 出版计划
 *
 * @author 
 * @email 
 * @date 2024-03-14 21:07:54
 */
public interface ChubanjihuaService extends IService<ChubanjihuaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChubanjihuaView> selectListView(Wrapper<ChubanjihuaEntity> wrapper);
   	
   	ChubanjihuaView selectView(@Param("ew") Wrapper<ChubanjihuaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChubanjihuaEntity> wrapper);
   	

}

