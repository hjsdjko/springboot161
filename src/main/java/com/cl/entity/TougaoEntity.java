package com.cl.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 投稿
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-14 21:07:54
 */
@TableName("tougao")
public class TougaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TougaoEntity() {
		
	}
	
	public TougaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 稿件名称
	 */
					
	private String gaojianmingcheng;
	
	/**
	 * 稿件分类
	 */
					
	private String gaojianfenlei;
	
	/**
	 * 文章
	 */
					
	private String wenzhang;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 数据
	 */
					
	private String shuju;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 回复内容
	 */
					
	private String shhf;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：稿件名称
	 */
	public void setGaojianmingcheng(String gaojianmingcheng) {
		this.gaojianmingcheng = gaojianmingcheng;
	}
	/**
	 * 获取：稿件名称
	 */
	public String getGaojianmingcheng() {
		return gaojianmingcheng;
	}
	/**
	 * 设置：稿件分类
	 */
	public void setGaojianfenlei(String gaojianfenlei) {
		this.gaojianfenlei = gaojianfenlei;
	}
	/**
	 * 获取：稿件分类
	 */
	public String getGaojianfenlei() {
		return gaojianfenlei;
	}
	/**
	 * 设置：文章
	 */
	public void setWenzhang(String wenzhang) {
		this.wenzhang = wenzhang;
	}
	/**
	 * 获取：文章
	 */
	public String getWenzhang() {
		return wenzhang;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：数据
	 */
	public void setShuju(String shuju) {
		this.shuju = shuju;
	}
	/**
	 * 获取：数据
	 */
	public String getShuju() {
		return shuju;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：回复内容
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：回复内容
	 */
	public String getShhf() {
		return shhf;
	}

}
