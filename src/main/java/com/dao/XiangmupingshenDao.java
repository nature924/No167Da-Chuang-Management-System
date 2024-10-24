package com.dao;

import com.entity.XiangmupingshenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiangmupingshenVO;
import com.entity.view.XiangmupingshenView;


/**
 * 项目评审
 * 
 * @author 
 * @email 
 * @date 2021-04-21 16:28:28
 */
public interface XiangmupingshenDao extends BaseMapper<XiangmupingshenEntity> {
	
	List<XiangmupingshenVO> selectListVO(@Param("ew") Wrapper<XiangmupingshenEntity> wrapper);
	
	XiangmupingshenVO selectVO(@Param("ew") Wrapper<XiangmupingshenEntity> wrapper);
	
	List<XiangmupingshenView> selectListView(@Param("ew") Wrapper<XiangmupingshenEntity> wrapper);

	List<XiangmupingshenView> selectListView(Pagination page,@Param("ew") Wrapper<XiangmupingshenEntity> wrapper);
	
	XiangmupingshenView selectView(@Param("ew") Wrapper<XiangmupingshenEntity> wrapper);
	
}
