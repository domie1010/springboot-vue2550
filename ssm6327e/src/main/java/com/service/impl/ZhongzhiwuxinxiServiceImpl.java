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


import com.dao.ZhongzhiwuxinxiDao;
import com.entity.ZhongzhiwuxinxiEntity;
import com.service.ZhongzhiwuxinxiService;
import com.entity.vo.ZhongzhiwuxinxiVO;
import com.entity.view.ZhongzhiwuxinxiView;

@Service("zhongzhiwuxinxiService")
public class ZhongzhiwuxinxiServiceImpl extends ServiceImpl<ZhongzhiwuxinxiDao, ZhongzhiwuxinxiEntity> implements ZhongzhiwuxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhongzhiwuxinxiEntity> page = this.selectPage(
                new Query<ZhongzhiwuxinxiEntity>(params).getPage(),
                new EntityWrapper<ZhongzhiwuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhongzhiwuxinxiEntity> wrapper) {
		  Page<ZhongzhiwuxinxiView> page =new Query<ZhongzhiwuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhongzhiwuxinxiVO> selectListVO(Wrapper<ZhongzhiwuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhongzhiwuxinxiVO selectVO(Wrapper<ZhongzhiwuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhongzhiwuxinxiView> selectListView(Wrapper<ZhongzhiwuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhongzhiwuxinxiView selectView(Wrapper<ZhongzhiwuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
