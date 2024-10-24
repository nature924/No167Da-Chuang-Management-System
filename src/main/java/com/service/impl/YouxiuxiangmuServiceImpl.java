package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YouxiuxiangmuDao;
import com.entity.YouxiuxiangmuEntity;
import com.service.YouxiuxiangmuService;
import com.entity.vo.YouxiuxiangmuVO;
import com.entity.view.YouxiuxiangmuView;

@Service("youxiuxiangmuService")
public class YouxiuxiangmuServiceImpl extends ServiceImpl<YouxiuxiangmuDao, YouxiuxiangmuEntity> implements YouxiuxiangmuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YouxiuxiangmuEntity> page = this.selectPage(
                new Query<YouxiuxiangmuEntity>(params).getPage(),
                new EntityWrapper<YouxiuxiangmuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YouxiuxiangmuEntity> wrapper) {
		  Page<YouxiuxiangmuView> page =new Query<YouxiuxiangmuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YouxiuxiangmuVO> selectListVO(Wrapper<YouxiuxiangmuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YouxiuxiangmuVO selectVO(Wrapper<YouxiuxiangmuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YouxiuxiangmuView> selectListView(Wrapper<YouxiuxiangmuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YouxiuxiangmuView selectView(Wrapper<YouxiuxiangmuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
