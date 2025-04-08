package com.dao;

import com.entity.BingchongfangzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BingchongfangzhiVO;
import com.entity.view.BingchongfangzhiView;


/**
 * 病虫防治
 * 
 * @author 
 * @email 
 * @date 2021-04-22 09:58:33
 */
public interface BingchongfangzhiDao extends BaseMapper<BingchongfangzhiEntity> {
	
	List<BingchongfangzhiVO> selectListVO(@Param("ew") Wrapper<BingchongfangzhiEntity> wrapper);
	
	BingchongfangzhiVO selectVO(@Param("ew") Wrapper<BingchongfangzhiEntity> wrapper);
	
	List<BingchongfangzhiView> selectListView(@Param("ew") Wrapper<BingchongfangzhiEntity> wrapper);

	List<BingchongfangzhiView> selectListView(Pagination page,@Param("ew") Wrapper<BingchongfangzhiEntity> wrapper);
	
	BingchongfangzhiView selectView(@Param("ew") Wrapper<BingchongfangzhiEntity> wrapper);
	
}
