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


import com.dao.XiangmushenbaoDao;
import com.entity.XiangmushenbaoEntity;
import com.service.XiangmushenbaoService;
import com.entity.vo.XiangmushenbaoVO;
import com.entity.view.XiangmushenbaoView;

@Service("xiangmushenbaoService")
public class XiangmushenbaoServiceImpl extends ServiceImpl<XiangmushenbaoDao, XiangmushenbaoEntity> implements XiangmushenbaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiangmushenbaoEntity> page = this.selectPage(
                new Query<XiangmushenbaoEntity>(params).getPage(),
                new EntityWrapper<XiangmushenbaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiangmushenbaoEntity> wrapper) {
		  Page<XiangmushenbaoView> page =new Query<XiangmushenbaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiangmushenbaoVO> selectListVO(Wrapper<XiangmushenbaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiangmushenbaoVO selectVO(Wrapper<XiangmushenbaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiangmushenbaoView> selectListView(Wrapper<XiangmushenbaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiangmushenbaoView selectView(Wrapper<XiangmushenbaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
