package com.dao;

import com.entity.ZhuanjiapingshenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuanjiapingshenVO;
import com.entity.view.ZhuanjiapingshenView;


/**
 * 专家评审
 * 
 * @author 
 * @email 
 * @date 2021-04-21 16:28:28
 */
public interface ZhuanjiapingshenDao extends BaseMapper<ZhuanjiapingshenEntity> {
	
	List<ZhuanjiapingshenVO> selectListVO(@Param("ew") Wrapper<ZhuanjiapingshenEntity> wrapper);
	
	ZhuanjiapingshenVO selectVO(@Param("ew") Wrapper<ZhuanjiapingshenEntity> wrapper);
	
	List<ZhuanjiapingshenView> selectListView(@Param("ew") Wrapper<ZhuanjiapingshenEntity> wrapper);

	List<ZhuanjiapingshenView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuanjiapingshenEntity> wrapper);
	
	ZhuanjiapingshenView selectView(@Param("ew") Wrapper<ZhuanjiapingshenEntity> wrapper);
	
}
