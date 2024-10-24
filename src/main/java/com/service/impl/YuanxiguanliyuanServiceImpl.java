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


import com.dao.YuanxiguanliyuanDao;
import com.entity.YuanxiguanliyuanEntity;
import com.service.YuanxiguanliyuanService;
import com.entity.vo.YuanxiguanliyuanVO;
import com.entity.view.YuanxiguanliyuanView;

@Service("yuanxiguanliyuanService")
public class YuanxiguanliyuanServiceImpl extends ServiceImpl<YuanxiguanliyuanDao, YuanxiguanliyuanEntity> implements YuanxiguanliyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuanxiguanliyuanEntity> page = this.selectPage(
                new Query<YuanxiguanliyuanEntity>(params).getPage(),
                new EntityWrapper<YuanxiguanliyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuanxiguanliyuanEntity> wrapper) {
		  Page<YuanxiguanliyuanView> page =new Query<YuanxiguanliyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuanxiguanliyuanVO> selectListVO(Wrapper<YuanxiguanliyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuanxiguanliyuanVO selectVO(Wrapper<YuanxiguanliyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuanxiguanliyuanView> selectListView(Wrapper<YuanxiguanliyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuanxiguanliyuanView selectView(Wrapper<YuanxiguanliyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
