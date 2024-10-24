package com.dao;

import com.entity.XiangmushenbaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiangmushenbaoVO;
import com.entity.view.XiangmushenbaoView;


/**
 * 项目申报
 * 
 * @author 
 * @email 
 * @date 2021-04-21 16:28:27
 */
public interface XiangmushenbaoDao extends BaseMapper<XiangmushenbaoEntity> {
	
	List<XiangmushenbaoVO> selectListVO(@Param("ew") Wrapper<XiangmushenbaoEntity> wrapper);
	
	XiangmushenbaoVO selectVO(@Param("ew") Wrapper<XiangmushenbaoEntity> wrapper);
	
	List<XiangmushenbaoView> selectListView(@Param("ew") Wrapper<XiangmushenbaoEntity> wrapper);

	List<XiangmushenbaoView> selectListView(Pagination page,@Param("ew") Wrapper<XiangmushenbaoEntity> wrapper);
	
	XiangmushenbaoView selectView(@Param("ew") Wrapper<XiangmushenbaoEntity> wrapper);
	
}
