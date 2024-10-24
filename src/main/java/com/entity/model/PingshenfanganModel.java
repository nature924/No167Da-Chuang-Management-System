package com.entity.model;

import com.entity.PingshenfanganEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 评审方案
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-21 16:28:28
 */
public class PingshenfanganModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
