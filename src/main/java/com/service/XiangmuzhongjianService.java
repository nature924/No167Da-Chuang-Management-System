package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiangmuzhongjianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiangmuzhongjianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiangmuzhongjianView;


/**
 * 项目中检
 *
 * @author 
 * @email 
 * @date 2021-04-21 16:28:28
 */
public interface XiangmuzhongjianService extends IService<XiangmuzhongjianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiangmuzhongjianVO> selectListVO(Wrapper<XiangmuzhongjianEntity> wrapper);
   	
   	XiangmuzhongjianVO selectVO(@Param("ew") Wrapper<XiangmuzhongjianEntity> wrapper);
   	
   	List<XiangmuzhongjianView> selectListView(Wrapper<XiangmuzhongjianEntity> wrapper);
   	
   	XiangmuzhongjianView selectView(@Param("ew") Wrapper<XiangmuzhongjianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiangmuzhongjianEntity> wrapper);
   	
}

