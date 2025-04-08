package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BingchongfangzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BingchongfangzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BingchongfangzhiView;


/**
 * 病虫防治
 *
 * @author 
 * @email 
 * @date 2021-04-22 09:58:33
 */
public interface BingchongfangzhiService extends IService<BingchongfangzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BingchongfangzhiVO> selectListVO(Wrapper<BingchongfangzhiEntity> wrapper);
   	
   	BingchongfangzhiVO selectVO(@Param("ew") Wrapper<BingchongfangzhiEntity> wrapper);
   	
   	List<BingchongfangzhiView> selectListView(Wrapper<BingchongfangzhiEntity> wrapper);
   	
   	BingchongfangzhiView selectView(@Param("ew") Wrapper<BingchongfangzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BingchongfangzhiEntity> wrapper);
   	
}

