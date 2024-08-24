package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.GaojianfenleiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.GaojianfenleiView;


/**
 * 稿件分类
 *
 * @author 
 * @email 
 * @date 2024-03-14 21:07:54
 */
public interface GaojianfenleiService extends IService<GaojianfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GaojianfenleiView> selectListView(Wrapper<GaojianfenleiEntity> wrapper);
   	
   	GaojianfenleiView selectView(@Param("ew") Wrapper<GaojianfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GaojianfenleiEntity> wrapper);
   	

}

