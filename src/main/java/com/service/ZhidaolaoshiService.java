package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhidaolaoshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhidaolaoshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhidaolaoshiView;


/**
 * 指导老师
 *
 * @author 
 * @email 
 * @date 2021-04-21 16:28:27
 */
public interface ZhidaolaoshiService extends IService<ZhidaolaoshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhidaolaoshiVO> selectListVO(Wrapper<ZhidaolaoshiEntity> wrapper);
   	
   	ZhidaolaoshiVO selectVO(@Param("ew") Wrapper<ZhidaolaoshiEntity> wrapper);
   	
   	List<ZhidaolaoshiView> selectListView(Wrapper<ZhidaolaoshiEntity> wrapper);
   	
   	ZhidaolaoshiView selectView(@Param("ew") Wrapper<ZhidaolaoshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhidaolaoshiEntity> wrapper);
   	
}

