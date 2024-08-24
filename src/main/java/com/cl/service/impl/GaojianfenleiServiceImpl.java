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


import com.cl.dao.GaojianfenleiDao;
import com.cl.entity.GaojianfenleiEntity;
import com.cl.service.GaojianfenleiService;
import com.cl.entity.view.GaojianfenleiView;

@Service("gaojianfenleiService")
public class GaojianfenleiServiceImpl extends ServiceImpl<GaojianfenleiDao, GaojianfenleiEntity> implements GaojianfenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GaojianfenleiEntity> page = this.selectPage(
                new Query<GaojianfenleiEntity>(params).getPage(),
                new EntityWrapper<GaojianfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GaojianfenleiEntity> wrapper) {
		  Page<GaojianfenleiView> page =new Query<GaojianfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<GaojianfenleiView> selectListView(Wrapper<GaojianfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GaojianfenleiView selectView(Wrapper<GaojianfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
