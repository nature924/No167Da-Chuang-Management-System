package com.entity.view;

import com.entity.PingshenfanganEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 评审方案
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-21 16:28:28
 */
@TableName("pingshenfangan")
public class PingshenfanganView  extends PingshenfanganEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PingshenfanganView(){
	}
 
 	public PingshenfanganView(PingshenfanganEntity pingshenfanganEntity){
 	try {
			BeanUtils.copyProperties(this, pingshenfanganEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
