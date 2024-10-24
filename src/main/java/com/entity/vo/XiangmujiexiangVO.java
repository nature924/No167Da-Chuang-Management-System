package com.entity.vo;

import com.entity.XiangmujiexiangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 项目结项
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-21 16:28:28
 */
public class XiangmujiexiangVO  implements Serializable {
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
	 * 理论依据
	 */
	
	private String lilunyiju;
		
	/**
	 * 主要成果
	 */
	
	private String zhuyaochengguo;
		
	/**
	 * 终结成果
	 */
	
	private String zhongjiechengguo;
		
	/**
	 * 指导老师意见
	 */
	
	private String zhidaolaoshiyijian;
		
	/**
	 * 院系管理员意见
	 */
	
	private String yuanxiguanliyuanyijian;
		
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
	 * 设置：理论依据
	 */
	 
	public void setLilunyiju(String lilunyiju) {
		this.lilunyiju = lilunyiju;
	}
	
	/**
	 * 获取：理论依据
	 */
	public String getLilunyiju() {
		return lilunyiju;
	}
				
	
	/**
	 * 设置：主要成果
	 */
	 
	public void setZhuyaochengguo(String zhuyaochengguo) {
		this.zhuyaochengguo = zhuyaochengguo;
	}
	
	/**
	 * 获取：主要成果
	 */
	public String getZhuyaochengguo() {
		return zhuyaochengguo;
	}
				
	
	/**
	 * 设置：终结成果
	 */
	 
	public void setZhongjiechengguo(String zhongjiechengguo) {
		this.zhongjiechengguo = zhongjiechengguo;
	}
	
	/**
	 * 获取：终结成果
	 */
	public String getZhongjiechengguo() {
		return zhongjiechengguo;
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
