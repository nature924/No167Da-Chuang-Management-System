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


import com.dao.ZhuanjiapingshenDao;
import com.entity.ZhuanjiapingshenEntity;
import com.service.ZhuanjiapingshenService;
import com.entity.vo.ZhuanjiapingshenVO;
import com.entity.view.ZhuanjiapingshenView;

@Service("zhuanjiapingshenService")
public class ZhuanjiapingshenServiceImpl extends ServiceImpl<ZhuanjiapingshenDao, ZhuanjiapingshenEntity> implements ZhuanjiapingshenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhuanjiapingshenEntity> page = this.selectPage(
                new Query<ZhuanjiapingshenEntity>(params).getPage(),
                new EntityWrapper<ZhuanjiapingshenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhuanjiapingshenEntity> wrapper) {
		  Page<ZhuanjiapingshenView> page =new Query<ZhuanjiapingshenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhuanjiapingshenVO> selectListVO(Wrapper<ZhuanjiapingshenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhuanjiapingshenVO selectVO(Wrapper<ZhuanjiapingshenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhuanjiapingshenView> selectListView(Wrapper<ZhuanjiapingshenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhuanjiapingshenView selectView(Wrapper<ZhuanjiapingshenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
