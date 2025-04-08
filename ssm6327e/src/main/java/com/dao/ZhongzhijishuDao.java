package com.dao;

import com.entity.ZhongzhijishuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhongzhijishuVO;
import com.entity.view.ZhongzhijishuView;


/**
 * 种植技术
 * 
 * @author 
 * @email 
 * @date 2021-04-22 09:58:33
 */
public interface ZhongzhijishuDao extends BaseMapper<ZhongzhijishuEntity> {
	
	List<ZhongzhijishuVO> selectListVO(@Param("ew") Wrapper<ZhongzhijishuEntity> wrapper);
	
	ZhongzhijishuVO selectVO(@Param("ew") Wrapper<ZhongzhijishuEntity> wrapper);
	
	List<ZhongzhijishuView> selectListView(@Param("ew") Wrapper<ZhongzhijishuEntity> wrapper);

	List<ZhongzhijishuView> selectListView(Pagination page,@Param("ew") Wrapper<ZhongzhijishuEntity> wrapper);
	
	ZhongzhijishuView selectView(@Param("ew") Wrapper<ZhongzhijishuEntity> wrapper);
	
}
