package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YouxiuxiangmuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YouxiuxiangmuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YouxiuxiangmuView;


/**
 * 优秀项目
 *
 * @author 
 * @email 
 * @date 2021-04-21 16:28:27
 */
public interface YouxiuxiangmuService extends IService<YouxiuxiangmuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YouxiuxiangmuVO> selectListVO(Wrapper<YouxiuxiangmuEntity> wrapper);
   	
   	YouxiuxiangmuVO selectVO(@Param("ew") Wrapper<YouxiuxiangmuEntity> wrapper);
   	
   	List<YouxiuxiangmuView> selectListView(Wrapper<YouxiuxiangmuEntity> wrapper);
   	
   	YouxiuxiangmuView selectView(@Param("ew") Wrapper<YouxiuxiangmuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YouxiuxiangmuEntity> wrapper);
   	
}

