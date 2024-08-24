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


import com.cl.dao.DiscusstougaoDao;
import com.cl.entity.DiscusstougaoEntity;
import com.cl.service.DiscusstougaoService;
import com.cl.entity.view.DiscusstougaoView;

@Service("discusstougaoService")
public class DiscusstougaoServiceImpl extends ServiceImpl<DiscusstougaoDao, DiscusstougaoEntity> implements DiscusstougaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusstougaoEntity> page = this.selectPage(
                new Query<DiscusstougaoEntity>(params).getPage(),
                new EntityWrapper<DiscusstougaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusstougaoEntity> wrapper) {
		  Page<DiscusstougaoView> page =new Query<DiscusstougaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<DiscusstougaoView> selectListView(Wrapper<DiscusstougaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusstougaoView selectView(Wrapper<DiscusstougaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
