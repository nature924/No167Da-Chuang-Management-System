package com.entity.vo;

import com.entity.XiangmupingshenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 项目评审
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-21 16:28:28
 */
public class XiangmupingshenVO  implements Serializable {
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
	 * 学生团队
	 */
	
	private String xueshengtuandui;
		
	/**
	 * 成员介绍
	 */
	
	private String chengyuanjieshao;
		
	/**
	 * 文件
	 */
	
	private String wenjian;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
				
	
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
	 * 设置：学生团队
	 */
	 
	public void setXueshengtuandui(String xueshengtuandui) {
		this.xueshengtuandui = xueshengtuandui;
	}
	
	/**
	 * 获取：学生团队
	 */
	public String getXueshengtuandui() {
		return xueshengtuandui;
	}
				
	
	/**
	 * 设置：成员介绍
	 */
	 
	public void setChengyuanjieshao(String chengyuanjieshao) {
		this.chengyuanjieshao = chengyuanjieshao;
	}
	
	/**
	 * 获取：成员介绍
	 */
	public String getChengyuanjieshao() {
		return chengyuanjieshao;
	}
				
	
	/**
	 * 设置：文件
	 */
	 
	public void setWenjian(String wenjian) {
		this.wenjian = wenjian;
	}
	
	/**
	 * 获取：文件
	 */
	public String getWenjian() {
		return wenjian;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
			
}
