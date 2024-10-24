package com.entity.view;

import com.entity.XiangmupingshenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 项目评审
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-21 16:28:28
 */
@TableName("xiangmupingshen")
public class XiangmupingshenView  extends XiangmupingshenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiangmupingshenView(){
	}
 
 	public XiangmupingshenView(XiangmupingshenEntity xiangmupingshenEntity){
 	try {
			BeanUtils.copyProperties(this, xiangmupingshenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
