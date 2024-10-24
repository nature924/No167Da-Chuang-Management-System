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


import com.dao.XiangmuzhongjianDao;
import com.entity.XiangmuzhongjianEntity;
import com.service.XiangmuzhongjianService;
import com.entity.vo.XiangmuzhongjianVO;
import com.entity.view.XiangmuzhongjianView;

@Service("xiangmuzhongjianService")
public class XiangmuzhongjianServiceImpl extends ServiceImpl<XiangmuzhongjianDao, XiangmuzhongjianEntity> implements XiangmuzhongjianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiangmuzhongjianEntity> page = this.selectPage(
                new Query<XiangmuzhongjianEntity>(params).getPage(),
                new EntityWrapper<XiangmuzhongjianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiangmuzhongjianEntity> wrapper) {
		  Page<XiangmuzhongjianView> page =new Query<XiangmuzhongjianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiangmuzhongjianVO> selectListVO(Wrapper<XiangmuzhongjianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiangmuzhongjianVO selectVO(Wrapper<XiangmuzhongjianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiangmuzhongjianView> selectListView(Wrapper<XiangmuzhongjianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiangmuzhongjianView selectView(Wrapper<XiangmuzhongjianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
