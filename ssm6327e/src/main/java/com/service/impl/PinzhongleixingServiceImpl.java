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


import com.dao.PinzhongleixingDao;
import com.entity.PinzhongleixingEntity;
import com.service.PinzhongleixingService;
import com.entity.vo.PinzhongleixingVO;
import com.entity.view.PinzhongleixingView;

@Service("pinzhongleixingService")
public class PinzhongleixingServiceImpl extends ServiceImpl<PinzhongleixingDao, PinzhongleixingEntity> implements PinzhongleixingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PinzhongleixingEntity> page = this.selectPage(
                new Query<PinzhongleixingEntity>(params).getPage(),
                new EntityWrapper<PinzhongleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PinzhongleixingEntity> wrapper) {
		  Page<PinzhongleixingView> page =new Query<PinzhongleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PinzhongleixingVO> selectListVO(Wrapper<PinzhongleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PinzhongleixingVO selectVO(Wrapper<PinzhongleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PinzhongleixingView> selectListView(Wrapper<PinzhongleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PinzhongleixingView selectView(Wrapper<PinzhongleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
