package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiangmupingshenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiangmupingshenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiangmupingshenView;


/**
 * 项目评审
 *
 * @author 
 * @email 
 * @date 2021-04-21 16:28:28
 */
public interface XiangmupingshenService extends IService<XiangmupingshenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiangmupingshenVO> selectListVO(Wrapper<XiangmupingshenEntity> wrapper);
   	
   	XiangmupingshenVO selectVO(@Param("ew") Wrapper<XiangmupingshenEntity> wrapper);
   	
   	List<XiangmupingshenView> selectListView(Wrapper<XiangmupingshenEntity> wrapper);
   	
   	XiangmupingshenView selectView(@Param("ew") Wrapper<XiangmupingshenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiangmupingshenEntity> wrapper);
   	
}

