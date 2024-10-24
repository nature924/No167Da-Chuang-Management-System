package com.entity.view;

import com.entity.XiangmushenbaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 项目申报
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-21 16:28:27
 */
@TableName("xiangmushenbao")
public class XiangmushenbaoView  extends XiangmushenbaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiangmushenbaoView(){
	}
 
 	public XiangmushenbaoView(XiangmushenbaoEntity xiangmushenbaoEntity){
 	try {
			BeanUtils.copyProperties(this, xiangmushenbaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
