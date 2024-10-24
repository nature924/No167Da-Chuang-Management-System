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


import com.dao.XiangmupingshenDao;
import com.entity.XiangmupingshenEntity;
import com.service.XiangmupingshenService;
import com.entity.vo.XiangmupingshenVO;
import com.entity.view.XiangmupingshenView;

@Service("xiangmupingshenService")
public class XiangmupingshenServiceImpl extends ServiceImpl<XiangmupingshenDao, XiangmupingshenEntity> implements XiangmupingshenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiangmupingshenEntity> page = this.selectPage(
                new Query<XiangmupingshenEntity>(params).getPage(),
                new EntityWrapper<XiangmupingshenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiangmupingshenEntity> wrapper) {
		  Page<XiangmupingshenView> page =new Query<XiangmupingshenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiangmupingshenVO> selectListVO(Wrapper<XiangmupingshenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiangmupingshenVO selectVO(Wrapper<XiangmupingshenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiangmupingshenView> selectListView(Wrapper<XiangmupingshenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiangmupingshenView selectView(Wrapper<XiangmupingshenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
