package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.TougaoDao;
import com.cl.entity.TougaoEntity;
import com.cl.service.TougaoService;
import com.cl.entity.view.TougaoView;

@Service("tougaoService")
public class TougaoServiceImpl extends ServiceImpl<TougaoDao, TougaoEntity> implements TougaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TougaoEntity> page = this.selectPage(
                new Query<TougaoEntity>(params).getPage(),
                new EntityWrapper<TougaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TougaoEntity> wrapper) {
		  Page<TougaoView> page =new Query<TougaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<TougaoView> selectListView(Wrapper<TougaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TougaoView selectView(Wrapper<TougaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<TougaoEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<TougaoEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<TougaoEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
