package com.entity.vo;

import com.entity.XiangmuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 项目信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-21 16:28:27
 */
public class XiangmuxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 项目类型
	 */
	
	private String xiangmuleixing;
		
	/**
	 * 项目描述
	 */
	
	private String xiangmumiaoshu;
		
	/**
	 * 涉及领域
	 */
	
	private String shejilingyu;
		
	/**
	 * 文档
	 */
	
	private String wendang;
		
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
	 * 设置：项目描述
	 */
	 
	public void setXiangmumiaoshu(String xiangmumiaoshu) {
		this.xiangmumiaoshu = xiangmumiaoshu;
	}
	
	/**
	 * 获取：项目描述
	 */
	public String getXiangmumiaoshu() {
		return xiangmumiaoshu;
	}
				
	
	/**
	 * 设置：涉及领域
	 */
	 
	public void setShejilingyu(String shejilingyu) {
		this.shejilingyu = shejilingyu;
	}
	
	/**
	 * 获取：涉及领域
	 */
	public String getShejilingyu() {
		return shejilingyu;
	}
				
	
	/**
	 * 设置：文档
	 */
	 
	public void setWendang(String wendang) {
		this.wendang = wendang;
	}
	
	/**
	 * 获取：文档
	 */
	public String getWendang() {
		return wendang;
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
