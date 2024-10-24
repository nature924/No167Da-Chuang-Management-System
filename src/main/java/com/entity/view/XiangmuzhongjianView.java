package com.entity.view;

import com.entity.XiangmuzhongjianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 项目中检
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-21 16:28:28
 */
@TableName("xiangmuzhongjian")
public class XiangmuzhongjianView  extends XiangmuzhongjianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiangmuzhongjianView(){
	}
 
 	public XiangmuzhongjianView(XiangmuzhongjianEntity xiangmuzhongjianEntity){
 	try {
			BeanUtils.copyProperties(this, xiangmuzhongjianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
