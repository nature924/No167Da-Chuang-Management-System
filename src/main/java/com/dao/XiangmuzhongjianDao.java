package com.dao;

import com.entity.XiangmuzhongjianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiangmuzhongjianVO;
import com.entity.view.XiangmuzhongjianView;


/**
 * 项目中检
 * 
 * @author 
 * @email 
 * @date 2021-04-21 16:28:28
 */
public interface XiangmuzhongjianDao extends BaseMapper<XiangmuzhongjianEntity> {
	
	List<XiangmuzhongjianVO> selectListVO(@Param("ew") Wrapper<XiangmuzhongjianEntity> wrapper);
	
	XiangmuzhongjianVO selectVO(@Param("ew") Wrapper<XiangmuzhongjianEntity> wrapper);
	
	List<XiangmuzhongjianView> selectListView(@Param("ew") Wrapper<XiangmuzhongjianEntity> wrapper);

	List<XiangmuzhongjianView> selectListView(Pagination page,@Param("ew") Wrapper<XiangmuzhongjianEntity> wrapper);
	
	XiangmuzhongjianView selectView(@Param("ew") Wrapper<XiangmuzhongjianEntity> wrapper);
	
}
