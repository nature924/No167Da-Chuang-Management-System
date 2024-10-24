package com.entity.view;

import com.entity.YuanxiguanliyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 院系管理员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-21 16:28:27
 */
@TableName("yuanxiguanliyuan")
public class YuanxiguanliyuanView  extends YuanxiguanliyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuanxiguanliyuanView(){
	}
 
 	public YuanxiguanliyuanView(YuanxiguanliyuanEntity yuanxiguanliyuanEntity){
 	try {
			BeanUtils.copyProperties(this, yuanxiguanliyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
