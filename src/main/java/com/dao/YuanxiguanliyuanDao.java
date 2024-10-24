package com.dao;

import com.entity.YuanxiguanliyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuanxiguanliyuanVO;
import com.entity.view.YuanxiguanliyuanView;


/**
 * 院系管理员
 * 
 * @author 
 * @email 
 * @date 2021-04-21 16:28:27
 */
public interface YuanxiguanliyuanDao extends BaseMapper<YuanxiguanliyuanEntity> {
	
	List<YuanxiguanliyuanVO> selectListVO(@Param("ew") Wrapper<YuanxiguanliyuanEntity> wrapper);
	
	YuanxiguanliyuanVO selectVO(@Param("ew") Wrapper<YuanxiguanliyuanEntity> wrapper);
	
	List<YuanxiguanliyuanView> selectListView(@Param("ew") Wrapper<YuanxiguanliyuanEntity> wrapper);

	List<YuanxiguanliyuanView> selectListView(Pagination page,@Param("ew") Wrapper<YuanxiguanliyuanEntity> wrapper);
	
	YuanxiguanliyuanView selectView(@Param("ew") Wrapper<YuanxiguanliyuanEntity> wrapper);
	
}
