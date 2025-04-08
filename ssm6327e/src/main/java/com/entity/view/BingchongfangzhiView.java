package com.entity.view;

import com.entity.BingchongfangzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 病虫防治
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-22 09:58:33
 */
@TableName("bingchongfangzhi")
public class BingchongfangzhiView  extends BingchongfangzhiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BingchongfangzhiView(){
	}
 
 	public BingchongfangzhiView(BingchongfangzhiEntity bingchongfangzhiEntity){
 	try {
			BeanUtils.copyProperties(this, bingchongfangzhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
