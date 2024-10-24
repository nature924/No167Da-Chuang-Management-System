package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhuanjiapingshenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhuanjiapingshenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuanjiapingshenView;


/**
 * 专家评审
 *
 * @author 
 * @email 
 * @date 2021-04-21 16:28:28
 */
public interface ZhuanjiapingshenService extends IService<ZhuanjiapingshenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuanjiapingshenVO> selectListVO(Wrapper<ZhuanjiapingshenEntity> wrapper);
   	
   	ZhuanjiapingshenVO selectVO(@Param("ew") Wrapper<ZhuanjiapingshenEntity> wrapper);
   	
   	List<ZhuanjiapingshenView> selectListView(Wrapper<ZhuanjiapingshenEntity> wrapper);
   	
   	ZhuanjiapingshenView selectView(@Param("ew") Wrapper<ZhuanjiapingshenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuanjiapingshenEntity> wrapper);
   	
}

