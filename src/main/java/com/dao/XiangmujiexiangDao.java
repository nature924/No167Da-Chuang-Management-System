package com.dao;

import com.entity.XiangmujiexiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiangmujiexiangVO;
import com.entity.view.XiangmujiexiangView;


/**
 * 项目结项
 * 
 * @author 
 * @email 
 * @date 2021-04-21 16:28:28
 */
public interface XiangmujiexiangDao extends BaseMapper<XiangmujiexiangEntity> {
	
	List<XiangmujiexiangVO> selectListVO(@Param("ew") Wrapper<XiangmujiexiangEntity> wrapper);
	
	XiangmujiexiangVO selectVO(@Param("ew") Wrapper<XiangmujiexiangEntity> wrapper);
	
	List<XiangmujiexiangView> selectListView(@Param("ew") Wrapper<XiangmujiexiangEntity> wrapper);

	List<XiangmujiexiangView> selectListView(Pagination page,@Param("ew") Wrapper<XiangmujiexiangEntity> wrapper);
	
	XiangmujiexiangView selectView(@Param("ew") Wrapper<XiangmujiexiangEntity> wrapper);
	
}
