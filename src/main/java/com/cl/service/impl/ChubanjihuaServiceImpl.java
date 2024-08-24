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


import com.cl.dao.ChubanjihuaDao;
import com.cl.entity.ChubanjihuaEntity;
import com.cl.service.ChubanjihuaService;
import com.cl.entity.view.ChubanjihuaView;

@Service("chubanjihuaService")
public class ChubanjihuaServiceImpl extends ServiceImpl<ChubanjihuaDao, ChubanjihuaEntity> implements ChubanjihuaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChubanjihuaEntity> page = this.selectPage(
                new Query<ChubanjihuaEntity>(params).getPage(),
                new EntityWrapper<ChubanjihuaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChubanjihuaEntity> wrapper) {
		  Page<ChubanjihuaView> page =new Query<ChubanjihuaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ChubanjihuaView> selectListView(Wrapper<ChubanjihuaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChubanjihuaView selectView(Wrapper<ChubanjihuaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
