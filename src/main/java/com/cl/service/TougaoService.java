package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.TougaoEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.TougaoView;


/**
 * 投稿
 *
 * @author 
 * @email 
 * @date 2024-03-14 21:07:54
 */
public interface TougaoService extends IService<TougaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TougaoView> selectListView(Wrapper<TougaoEntity> wrapper);
   	
   	TougaoView selectView(@Param("ew") Wrapper<TougaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TougaoEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<TougaoEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<TougaoEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<TougaoEntity> wrapper);



}

