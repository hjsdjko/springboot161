package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.GaojianfenleiEntity;
import com.cl.entity.view.GaojianfenleiView;

import com.cl.service.GaojianfenleiService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 稿件分类
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-14 21:07:54
 */
@RestController
@RequestMapping("/gaojianfenlei")
public class GaojianfenleiController {
    @Autowired
    private GaojianfenleiService gaojianfenleiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,GaojianfenleiEntity gaojianfenlei,
		HttpServletRequest request){
        EntityWrapper<GaojianfenleiEntity> ew = new EntityWrapper<GaojianfenleiEntity>();

		PageUtils page = gaojianfenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gaojianfenlei), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,GaojianfenleiEntity gaojianfenlei, 
		HttpServletRequest request){
        EntityWrapper<GaojianfenleiEntity> ew = new EntityWrapper<GaojianfenleiEntity>();

		PageUtils page = gaojianfenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gaojianfenlei), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( GaojianfenleiEntity gaojianfenlei){
       	EntityWrapper<GaojianfenleiEntity> ew = new EntityWrapper<GaojianfenleiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( gaojianfenlei, "gaojianfenlei")); 
        return R.ok().put("data", gaojianfenleiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(GaojianfenleiEntity gaojianfenlei){
        EntityWrapper< GaojianfenleiEntity> ew = new EntityWrapper< GaojianfenleiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( gaojianfenlei, "gaojianfenlei")); 
		GaojianfenleiView gaojianfenleiView =  gaojianfenleiService.selectView(ew);
		return R.ok("查询稿件分类成功").put("data", gaojianfenleiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        GaojianfenleiEntity gaojianfenlei = gaojianfenleiService.selectById(id);
		gaojianfenlei = gaojianfenleiService.selectView(new EntityWrapper<GaojianfenleiEntity>().eq("id", id));
        return R.ok().put("data", gaojianfenlei);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        GaojianfenleiEntity gaojianfenlei = gaojianfenleiService.selectById(id);
		gaojianfenlei = gaojianfenleiService.selectView(new EntityWrapper<GaojianfenleiEntity>().eq("id", id));
        return R.ok().put("data", gaojianfenlei);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GaojianfenleiEntity gaojianfenlei, HttpServletRequest request){
    	gaojianfenlei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(gaojianfenlei);
        gaojianfenleiService.insert(gaojianfenlei);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody GaojianfenleiEntity gaojianfenlei, HttpServletRequest request){
    	gaojianfenlei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(gaojianfenlei);
        gaojianfenleiService.insert(gaojianfenlei);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody GaojianfenleiEntity gaojianfenlei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(gaojianfenlei);
        gaojianfenleiService.updateById(gaojianfenlei);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        gaojianfenleiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
