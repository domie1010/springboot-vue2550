package com.entity.view;

import com.entity.PinzhongleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 品种类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-22 09:58:33
 */
@TableName("pinzhongleixing")
public class PinzhongleixingView  extends PinzhongleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PinzhongleixingView(){
	}
 
 	public PinzhongleixingView(PinzhongleixingEntity pinzhongleixingEntity){
 	try {
			BeanUtils.copyProperties(this, pinzhongleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
