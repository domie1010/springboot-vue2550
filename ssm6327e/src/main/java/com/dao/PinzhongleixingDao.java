package com.dao;

import com.entity.PinzhongleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PinzhongleixingVO;
import com.entity.view.PinzhongleixingView;


/**
 * 品种类型
 * 
 * @author 
 * @email 
 * @date 2021-04-22 09:58:33
 */
public interface PinzhongleixingDao extends BaseMapper<PinzhongleixingEntity> {
	
	List<PinzhongleixingVO> selectListVO(@Param("ew") Wrapper<PinzhongleixingEntity> wrapper);
	
	PinzhongleixingVO selectVO(@Param("ew") Wrapper<PinzhongleixingEntity> wrapper);
	
	List<PinzhongleixingView> selectListView(@Param("ew") Wrapper<PinzhongleixingEntity> wrapper);

	List<PinzhongleixingView> selectListView(Pagination page,@Param("ew") Wrapper<PinzhongleixingEntity> wrapper);
	
	PinzhongleixingView selectView(@Param("ew") Wrapper<PinzhongleixingEntity> wrapper);
	
}
