package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhongzhiwuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhongzhiwuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhongzhiwuxinxiView;


/**
 * 种植物信息
 *
 * @author 
 * @email 
 * @date 2021-04-22 09:58:33
 */
public interface ZhongzhiwuxinxiService extends IService<ZhongzhiwuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhongzhiwuxinxiVO> selectListVO(Wrapper<ZhongzhiwuxinxiEntity> wrapper);
   	
   	ZhongzhiwuxinxiVO selectVO(@Param("ew") Wrapper<ZhongzhiwuxinxiEntity> wrapper);
   	
   	List<ZhongzhiwuxinxiView> selectListView(Wrapper<ZhongzhiwuxinxiEntity> wrapper);
   	
   	ZhongzhiwuxinxiView selectView(@Param("ew") Wrapper<ZhongzhiwuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhongzhiwuxinxiEntity> wrapper);
   	
}

