package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiangmujiexiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiangmujiexiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiangmujiexiangView;


/**
 * 项目结项
 *
 * @author 
 * @email 
 * @date 2021-04-21 16:28:28
 */
public interface XiangmujiexiangService extends IService<XiangmujiexiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiangmujiexiangVO> selectListVO(Wrapper<XiangmujiexiangEntity> wrapper);
   	
   	XiangmujiexiangVO selectVO(@Param("ew") Wrapper<XiangmujiexiangEntity> wrapper);
   	
   	List<XiangmujiexiangView> selectListView(Wrapper<XiangmujiexiangEntity> wrapper);
   	
   	XiangmujiexiangView selectView(@Param("ew") Wrapper<XiangmujiexiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiangmujiexiangEntity> wrapper);
   	
}

