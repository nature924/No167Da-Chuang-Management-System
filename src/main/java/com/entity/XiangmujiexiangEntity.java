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
 * 项目结项
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-21 16:28:28
 */
@TableName("xiangmujiexiang")
public class XiangmujiexiangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XiangmujiexiangEntity() {
		
	}
	
	public XiangmujiexiangEntity(T t) {
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
	 * 项目名称
	 */
					
	private String xiangmumingcheng;
	
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
	 * 设置：项目名称
	 */
	public void setXiangmumingcheng(String xiangmumingcheng) {
		this.xiangmumingcheng = xiangmumingcheng;
	}
	/**
	 * 获取：项目名称
	 */
	public String getXiangmumingcheng() {
		return xiangmumingcheng;
	}
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
