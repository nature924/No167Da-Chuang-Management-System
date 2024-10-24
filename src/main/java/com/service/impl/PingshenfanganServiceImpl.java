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


import com.dao.PingshenfanganDao;
import com.entity.PingshenfanganEntity;
import com.service.PingshenfanganService;
import com.entity.vo.PingshenfanganVO;
import com.entity.view.PingshenfanganView;

@Service("pingshenfanganService")
public class PingshenfanganServiceImpl extends ServiceImpl<PingshenfanganDao, PingshenfanganEntity> implements PingshenfanganService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PingshenfanganEntity> page = this.selectPage(
                new Query<PingshenfanganEntity>(params).getPage(),
                new EntityWrapper<PingshenfanganEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PingshenfanganEntity> wrapper) {
		  Page<PingshenfanganView> page =new Query<PingshenfanganView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PingshenfanganVO> selectListVO(Wrapper<PingshenfanganEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PingshenfanganVO selectVO(Wrapper<PingshenfanganEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PingshenfanganView> selectListView(Wrapper<PingshenfanganEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PingshenfanganView selectView(Wrapper<PingshenfanganEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
