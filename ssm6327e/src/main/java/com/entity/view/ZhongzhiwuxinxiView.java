package com.entity.view;

import com.entity.ZhongzhiwuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 种植物信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-22 09:58:33
 */
@TableName("zhongzhiwuxinxi")
public class ZhongzhiwuxinxiView  extends ZhongzhiwuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhongzhiwuxinxiView(){
	}
 
 	public ZhongzhiwuxinxiView(ZhongzhiwuxinxiEntity zhongzhiwuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, zhongzhiwuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
