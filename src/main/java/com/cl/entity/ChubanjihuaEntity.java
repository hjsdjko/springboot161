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
 * 出版计划
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-14 21:07:54
 */
@TableName("chubanjihua")
public class ChubanjihuaEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChubanjihuaEntity() {
		
	}
	
	public ChubanjihuaEntity(T t) {
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
	 * 稿件主题
	 */
					
	private String gaojianzhuti;
	
	/**
	 * 内容
	 */
					
	private String neirong;
	
	/**
	 * 出版形式
	 */
					
	private String chubanxingshi;
	
	/**
	 * 出版时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date chubanshijian;
	
	
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
	 * 设置：稿件主题
	 */
	public void setGaojianzhuti(String gaojianzhuti) {
		this.gaojianzhuti = gaojianzhuti;
	}
	/**
	 * 获取：稿件主题
	 */
	public String getGaojianzhuti() {
		return gaojianzhuti;
	}
	/**
	 * 设置：内容
	 */
	public void setNeirong(String neirong) {
		this.neirong = neirong;
	}
	/**
	 * 获取：内容
	 */
	public String getNeirong() {
		return neirong;
	}
	/**
	 * 设置：出版形式
	 */
	public void setChubanxingshi(String chubanxingshi) {
		this.chubanxingshi = chubanxingshi;
	}
	/**
	 * 获取：出版形式
	 */
	public String getChubanxingshi() {
		return chubanxingshi;
	}
	/**
	 * 设置：出版时间
	 */
	public void setChubanshijian(Date chubanshijian) {
		this.chubanshijian = chubanshijian;
	}
	/**
	 * 获取：出版时间
	 */
	public Date getChubanshijian() {
		return chubanshijian;
	}

}
