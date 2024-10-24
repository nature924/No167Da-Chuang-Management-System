package com.entity;

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
 * 评审方案
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-21 16:28:28
 */
@TableName("pingshenfangan")
public class PingshenfanganEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public PingshenfanganEntity() {
		
	}
	
	public PingshenfanganEntity(T t) {
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
	 * 标题
	 */
					
	private String biaoti;
	
	/**
	 * 创新点
	 */
					
	private String chuangxindian;
	
	/**
	 * 前期准备
	 */
					
	private String qianqizhunbei;
	
	/**
	 * 实施方案
	 */
					
	private String shishifangan;
	
	/**
	 * 预期成果
	 */
					
	private String yuqichengguo;
	
	/**
	 * 经费预算
	 */
					
	private String jingfeiyusuan;
	
	/**
	 * 成员素质
	 */
					
	private String chengyuansuzhi;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	
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
	 * 设置：标题
	 */
	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}
	/**
	 * 获取：标题
	 */
	public String getBiaoti() {
		return biaoti;
	}
	/**
	 * 设置：创新点
	 */
	public void setChuangxindian(String chuangxindian) {
		this.chuangxindian = chuangxindian;
	}
	/**
	 * 获取：创新点
	 */
	public String getChuangxindian() {
		return chuangxindian;
	}
	/**
	 * 设置：前期准备
	 */
	public void setQianqizhunbei(String qianqizhunbei) {
		this.qianqizhunbei = qianqizhunbei;
	}
	/**
	 * 获取：前期准备
	 */
	public String getQianqizhunbei() {
		return qianqizhunbei;
	}
	/**
	 * 设置：实施方案
	 */
	public void setShishifangan(String shishifangan) {
		this.shishifangan = shishifangan;
	}
	/**
	 * 获取：实施方案
	 */
	public String getShishifangan() {
		return shishifangan;
	}
	/**
	 * 设置：预期成果
	 */
	public void setYuqichengguo(String yuqichengguo) {
		this.yuqichengguo = yuqichengguo;
	}
	/**
	 * 获取：预期成果
	 */
	public String getYuqichengguo() {
		return yuqichengguo;
	}
	/**
	 * 设置：经费预算
	 */
	public void setJingfeiyusuan(String jingfeiyusuan) {
		this.jingfeiyusuan = jingfeiyusuan;
	}
	/**
	 * 获取：经费预算
	 */
	public String getJingfeiyusuan() {
		return jingfeiyusuan;
	}
	/**
	 * 设置：成员素质
	 */
	public void setChengyuansuzhi(String chengyuansuzhi) {
		this.chengyuansuzhi = chengyuansuzhi;
	}
	/**
	 * 获取：成员素质
	 */
	public String getChengyuansuzhi() {
		return chengyuansuzhi;
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

}
