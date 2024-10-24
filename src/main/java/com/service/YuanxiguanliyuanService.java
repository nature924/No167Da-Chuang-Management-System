package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuanxiguanliyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuanxiguanliyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuanxiguanliyuanView;


/**
 * 院系管理员
 *
 * @author 
 * @email 
 * @date 2021-04-21 16:28:27
 */
public interface YuanxiguanliyuanService extends IService<YuanxiguanliyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuanxiguanliyuanVO> selectListVO(Wrapper<YuanxiguanliyuanEntity> wrapper);
   	
   	YuanxiguanliyuanVO selectVO(@Param("ew") Wrapper<YuanxiguanliyuanEntity> wrapper);
   	
   	List<YuanxiguanliyuanView> selectListView(Wrapper<YuanxiguanliyuanEntity> wrapper);
   	
   	YuanxiguanliyuanView selectView(@Param("ew") Wrapper<YuanxiguanliyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuanxiguanliyuanEntity> wrapper);
   	
}

