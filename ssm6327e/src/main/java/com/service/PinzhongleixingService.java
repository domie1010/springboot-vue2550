package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PinzhongleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PinzhongleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PinzhongleixingView;


/**
 * 品种类型
 *
 * @author 
 * @email 
 * @date 2021-04-22 09:58:33
 */
public interface PinzhongleixingService extends IService<PinzhongleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PinzhongleixingVO> selectListVO(Wrapper<PinzhongleixingEntity> wrapper);
   	
   	PinzhongleixingVO selectVO(@Param("ew") Wrapper<PinzhongleixingEntity> wrapper);
   	
   	List<PinzhongleixingView> selectListView(Wrapper<PinzhongleixingEntity> wrapper);
   	
   	PinzhongleixingView selectView(@Param("ew") Wrapper<PinzhongleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PinzhongleixingEntity> wrapper);
   	
}

