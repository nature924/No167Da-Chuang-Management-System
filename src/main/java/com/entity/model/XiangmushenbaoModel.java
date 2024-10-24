package com.entity.model;

import com.entity.XiangmushenbaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 项目申报
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-21 16:28:27
 */
public class XiangmushenbaoModel  implements Serializable {
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
	 * 学生团队
	 */
	
	private String xueshengtuandui;
		
	/**
	 * 成员介绍
	 */
	
	private String chengyuanjieshao;
		
	/**
	 * 指导老师
	 */
	
	private String zhidaolaoshi;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 指导老师意见
	 */
	
	private String zhidaolaoshiyijian;
		
	/**
	 * 院系管理员意见
	 */
	
	private String yuanxiguanliyuanyijian;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
	 * 设置：指导老师意见
	 */
	 
	public void setZhidaolaoshiyijian(String zhidaolaoshiyijian) {
		this.zhidaolaoshiyijian = zhidaolaoshiyijian;
	}
	
	/**
	 * 获取：指导老师意见
	 */
	public String getZhidaolaoshiyijian() {
		return zhidaolaoshiyijian;
	}
				
	
	/**
	 * 设置：院系管理员意见
	 */
	 
	public void setYuanxiguanliyuanyijian(String yuanxiguanliyuanyijian) {
		this.yuanxiguanliyuanyijian = yuanxiguanliyuanyijian;
	}
	
	/**
	 * 获取：院系管理员意见
	 */
	public String getYuanxiguanliyuanyijian() {
		return yuanxiguanliyuanyijian;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
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
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
