package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.DiscusstougaoEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscusstougaoView;


/**
 * 投稿评论表
 *
 * @author 
 * @email 
 * @date 2024-03-14 21:07:54
 */
public interface DiscusstougaoService extends IService<DiscusstougaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusstougaoView> selectListView(Wrapper<DiscusstougaoEntity> wrapper);
   	
   	DiscusstougaoView selectView(@Param("ew") Wrapper<DiscusstougaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusstougaoEntity> wrapper);
   	

}

