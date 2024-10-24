package com.entity.vo;

import com.entity.YouxiuxiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 优秀项目
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-21 16:28:27
 */
public class YouxiuxiangmuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 项目类型
	 */
	
	private String xiangmuleixing;
		
	/**
	 * 项目简介
	 */
	
	private String xiangmujianjie;
		
	/**
	 * 学生负责人
	 */
	
	private String xueshengfuzeren;
		
	/**
	 * 指导老师
	 */
	
	private String zhidaolaoshi;
		
	/**
	 * 评审意见
	 */
	
	private String pingshenyijian;
		
	/**
	 * 图片
	 */
	
	private String tupian;
				
	
	/**
	 * 设置：项目类型
	 */
	 
	public void setXiangmuleixing(String xiangmuleixing) {
		this.xiangmuleixing = xiangmuleixing;
	}
	
	/**
	 * 获取：项目类型
	 */
	public String getXiangmuleixing() {
		return xiangmuleixing;
	}
				
	
	/**
	 * 设置：项目简介
	 */
	 
	public void setXiangmujianjie(String xiangmujianjie) {
		this.xiangmujianjie = xiangmujianjie;
	}
	
	/**
	 * 获取：项目简介
	 */
	public String getXiangmujianjie() {
		return xiangmujianjie;
	}
				
	
	/**
	 * 设置：学生负责人
	 */
	 
	public void setXueshengfuzeren(String xueshengfuzeren) {
		this.xueshengfuzeren = xueshengfuzeren;
	}
	
	/**
	 * 获取：学生负责人
	 */
	public String getXueshengfuzeren() {
		return xueshengfuzeren;
	}
				
	
	/**
	 * 设置：指导老师
	 */
	 
	public void setZhidaolaoshi(String zhidaolaoshi) {
		this.zhidaolaoshi = zhidaolaoshi;
	}
	
	/**
	 * 获取：指导老师
	 */
	public String getZhidaolaoshi() {
		return zhidaolaoshi;
	}
				
	
	/**
	 * 设置：评审意见
	 */
	 
	public void setPingshenyijian(String pingshenyijian) {
		this.pingshenyijian = pingshenyijian;
	}
	
	/**
	 * 获取：评审意见
	 */
	public String getPingshenyijian() {
		return pingshenyijian;
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
