package com.dao;

import com.entity.PingshenfanganEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PingshenfanganVO;
import com.entity.view.PingshenfanganView;


/**
 * 评审方案
 * 
 * @author 
 * @email 
 * @date 2021-04-21 16:28:28
 */
public interface PingshenfanganDao extends BaseMapper<PingshenfanganEntity> {
	
	List<PingshenfanganVO> selectListVO(@Param("ew") Wrapper<PingshenfanganEntity> wrapper);
	
	PingshenfanganVO selectVO(@Param("ew") Wrapper<PingshenfanganEntity> wrapper);
	
	List<PingshenfanganView> selectListView(@Param("ew") Wrapper<PingshenfanganEntity> wrapper);

	List<PingshenfanganView> selectListView(Pagination page,@Param("ew") Wrapper<PingshenfanganEntity> wrapper);
	
	PingshenfanganView selectView(@Param("ew") Wrapper<PingshenfanganEntity> wrapper);
	
}
