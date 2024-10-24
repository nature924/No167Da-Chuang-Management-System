package com.dao;

import com.entity.YouxiuxiangmuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YouxiuxiangmuVO;
import com.entity.view.YouxiuxiangmuView;


/**
 * 优秀项目
 * 
 * @author 
 * @email 
 * @date 2021-04-21 16:28:27
 */
public interface YouxiuxiangmuDao extends BaseMapper<YouxiuxiangmuEntity> {
	
	List<YouxiuxiangmuVO> selectListVO(@Param("ew") Wrapper<YouxiuxiangmuEntity> wrapper);
	
	YouxiuxiangmuVO selectVO(@Param("ew") Wrapper<YouxiuxiangmuEntity> wrapper);
	
	List<YouxiuxiangmuView> selectListView(@Param("ew") Wrapper<YouxiuxiangmuEntity> wrapper);

	List<YouxiuxiangmuView> selectListView(Pagination page,@Param("ew") Wrapper<YouxiuxiangmuEntity> wrapper);
	
	YouxiuxiangmuView selectView(@Param("ew") Wrapper<YouxiuxiangmuEntity> wrapper);
	
}
