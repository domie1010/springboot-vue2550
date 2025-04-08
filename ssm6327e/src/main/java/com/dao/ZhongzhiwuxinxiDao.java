package com.dao;

import com.entity.ZhongzhiwuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhongzhiwuxinxiVO;
import com.entity.view.ZhongzhiwuxinxiView;


/**
 * 种植物信息
 * 
 * @author 
 * @email 
 * @date 2021-04-22 09:58:33
 */
public interface ZhongzhiwuxinxiDao extends BaseMapper<ZhongzhiwuxinxiEntity> {
	
	List<ZhongzhiwuxinxiVO> selectListVO(@Param("ew") Wrapper<ZhongzhiwuxinxiEntity> wrapper);
	
	ZhongzhiwuxinxiVO selectVO(@Param("ew") Wrapper<ZhongzhiwuxinxiEntity> wrapper);
	
	List<ZhongzhiwuxinxiView> selectListView(@Param("ew") Wrapper<ZhongzhiwuxinxiEntity> wrapper);

	List<ZhongzhiwuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhongzhiwuxinxiEntity> wrapper);
	
	ZhongzhiwuxinxiView selectView(@Param("ew") Wrapper<ZhongzhiwuxinxiEntity> wrapper);
	
}
