package com.entity.vo;

import com.entity.ZhongzhijishuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 种植技术
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-22 09:58:33
 */
public class ZhongzhijishuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 品种
	 */
	
	private String pinzhong;
		
	/**
	 * 种植要求
	 */
	
	private String zhongzhiyaoqiu;
		
	/**
	 * 施用材料
	 */
	
	private String shiyongcailiao;
		
	/**
	 * 种植方法
	 */
	
	private String zhongzhifangfa;
		
	/**
	 * 种植时间
	 */
	
	private String zhongzhishijian;
		
	/**
	 * 注意事项
	 */
	
	private String zhuyishixiang;
		
	/**
	 * 图片
	 */
	
	private String tupian;
				
	
	/**
	 * 设置：品种
	 */
	 
	public void setPinzhong(String pinzhong) {
		this.pinzhong = pinzhong;
	}
	
	/**
	 * 获取：品种
	 */
	public String getPinzhong() {
		return pinzhong;
	}
				
	
	/**
	 * 设置：种植要求
	 */
	 
	public void setZhongzhiyaoqiu(String zhongzhiyaoqiu) {
		this.zhongzhiyaoqiu = zhongzhiyaoqiu;
	}
	
	/**
	 * 获取：种植要求
	 */
	public String getZhongzhiyaoqiu() {
		return zhongzhiyaoqiu;
	}
				
	
	/**
	 * 设置：施用材料
	 */
	 
	public void setShiyongcailiao(String shiyongcailiao) {
		this.shiyongcailiao = shiyongcailiao;
	}
	
	/**
	 * 获取：施用材料
	 */
	public String getShiyongcailiao() {
		return shiyongcailiao;
	}
				
	
	/**
	 * 设置：种植方法
	 */
	 
	public void setZhongzhifangfa(String zhongzhifangfa) {
		this.zhongzhifangfa = zhongzhifangfa;
	}
	
	/**
	 * 获取：种植方法
	 */
	public String getZhongzhifangfa() {
		return zhongzhifangfa;
	}
				
	
	/**
	 * 设置：种植时间
	 */
	 
	public void setZhongzhishijian(String zhongzhishijian) {
		this.zhongzhishijian = zhongzhishijian;
	}
	
	/**
	 * 获取：种植时间
	 */
	public String getZhongzhishijian() {
		return zhongzhishijian;
	}
				
	
	/**
	 * 设置：注意事项
	 */
	 
	public void setZhuyishixiang(String zhuyishixiang) {
		this.zhuyishixiang = zhuyishixiang;
	}
	
	/**
	 * 获取：注意事项
	 */
	public String getZhuyishixiang() {
		return zhuyishixiang;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
			
}
