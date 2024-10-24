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


import com.dao.XiangmujiexiangDao;
import com.entity.XiangmujiexiangEntity;
import com.service.XiangmujiexiangService;
import com.entity.vo.XiangmujiexiangVO;
import com.entity.view.XiangmujiexiangView;

@Service("xiangmujiexiangService")
public class XiangmujiexiangServiceImpl extends ServiceImpl<XiangmujiexiangDao, XiangmujiexiangEntity> implements XiangmujiexiangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiangmujiexiangEntity> page = this.selectPage(
                new Query<XiangmujiexiangEntity>(params).getPage(),
                new EntityWrapper<XiangmujiexiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiangmujiexiangEntity> wrapper) {
		  Page<XiangmujiexiangView> page =new Query<XiangmujiexiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiangmujiexiangVO> selectListVO(Wrapper<XiangmujiexiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiangmujiexiangVO selectVO(Wrapper<XiangmujiexiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiangmujiexiangView> selectListView(Wrapper<XiangmujiexiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiangmujiexiangView selectView(Wrapper<XiangmujiexiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
