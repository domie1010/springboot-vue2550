package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhongzhijishuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhongzhijishuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhongzhijishuView;


/**
 * 种植技术
 *
 * @author 
 * @email 
 * @date 2021-04-22 09:58:33
 */
public interface ZhongzhijishuService extends IService<ZhongzhijishuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhongzhijishuVO> selectListVO(Wrapper<ZhongzhijishuEntity> wrapper);
   	
   	ZhongzhijishuVO selectVO(@Param("ew") Wrapper<ZhongzhijishuEntity> wrapper);
   	
   	List<ZhongzhijishuView> selectListView(Wrapper<ZhongzhijishuEntity> wrapper);
   	
   	ZhongzhijishuView selectView(@Param("ew") Wrapper<ZhongzhijishuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhongzhijishuEntity> wrapper);
   	
}

