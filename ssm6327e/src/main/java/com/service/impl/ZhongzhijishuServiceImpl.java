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


import com.dao.ZhongzhijishuDao;
import com.entity.ZhongzhijishuEntity;
import com.service.ZhongzhijishuService;
import com.entity.vo.ZhongzhijishuVO;
import com.entity.view.ZhongzhijishuView;

@Service("zhongzhijishuService")
public class ZhongzhijishuServiceImpl extends ServiceImpl<ZhongzhijishuDao, ZhongzhijishuEntity> implements ZhongzhijishuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhongzhijishuEntity> page = this.selectPage(
                new Query<ZhongzhijishuEntity>(params).getPage(),
                new EntityWrapper<ZhongzhijishuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhongzhijishuEntity> wrapper) {
		  Page<ZhongzhijishuView> page =new Query<ZhongzhijishuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhongzhijishuVO> selectListVO(Wrapper<ZhongzhijishuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhongzhijishuVO selectVO(Wrapper<ZhongzhijishuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhongzhijishuView> selectListView(Wrapper<ZhongzhijishuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhongzhijishuView selectView(Wrapper<ZhongzhijishuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
