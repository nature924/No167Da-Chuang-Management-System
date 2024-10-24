package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PingshenfanganEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PingshenfanganVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PingshenfanganView;


/**
 * 评审方案
 *
 * @author 
 * @email 
 * @date 2021-04-21 16:28:28
 */
public interface PingshenfanganService extends IService<PingshenfanganEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PingshenfanganVO> selectListVO(Wrapper<PingshenfanganEntity> wrapper);
   	
   	PingshenfanganVO selectVO(@Param("ew") Wrapper<PingshenfanganEntity> wrapper);
   	
   	List<PingshenfanganView> selectListView(Wrapper<PingshenfanganEntity> wrapper);
   	
   	PingshenfanganView selectView(@Param("ew") Wrapper<PingshenfanganEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PingshenfanganEntity> wrapper);
   	
}

