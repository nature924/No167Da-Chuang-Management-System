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


import com.dao.ZhidaolaoshiDao;
import com.entity.ZhidaolaoshiEntity;
import com.service.ZhidaolaoshiService;
import com.entity.vo.ZhidaolaoshiVO;
import com.entity.view.ZhidaolaoshiView;

@Service("zhidaolaoshiService")
public class ZhidaolaoshiServiceImpl extends ServiceImpl<ZhidaolaoshiDao, ZhidaolaoshiEntity> implements ZhidaolaoshiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhidaolaoshiEntity> page = this.selectPage(
                new Query<ZhidaolaoshiEntity>(params).getPage(),
                new EntityWrapper<ZhidaolaoshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhidaolaoshiEntity> wrapper) {
		  Page<ZhidaolaoshiView> page =new Query<ZhidaolaoshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhidaolaoshiVO> selectListVO(Wrapper<ZhidaolaoshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhidaolaoshiVO selectVO(Wrapper<ZhidaolaoshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhidaolaoshiView> selectListView(Wrapper<ZhidaolaoshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhidaolaoshiView selectView(Wrapper<ZhidaolaoshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
