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


import com.dao.BingchongfangzhiDao;
import com.entity.BingchongfangzhiEntity;
import com.service.BingchongfangzhiService;
import com.entity.vo.BingchongfangzhiVO;
import com.entity.view.BingchongfangzhiView;

@Service("bingchongfangzhiService")
public class BingchongfangzhiServiceImpl extends ServiceImpl<BingchongfangzhiDao, BingchongfangzhiEntity> implements BingchongfangzhiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BingchongfangzhiEntity> page = this.selectPage(
                new Query<BingchongfangzhiEntity>(params).getPage(),
                new EntityWrapper<BingchongfangzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BingchongfangzhiEntity> wrapper) {
		  Page<BingchongfangzhiView> page =new Query<BingchongfangzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BingchongfangzhiVO> selectListVO(Wrapper<BingchongfangzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BingchongfangzhiVO selectVO(Wrapper<BingchongfangzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BingchongfangzhiView> selectListView(Wrapper<BingchongfangzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BingchongfangzhiView selectView(Wrapper<BingchongfangzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
