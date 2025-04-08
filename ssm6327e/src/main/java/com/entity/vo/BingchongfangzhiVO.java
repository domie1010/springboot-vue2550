package com.entity.vo;

import com.entity.BingchongfangzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 病虫防治
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-22 09:58:33
 */
public class BingchongfangzhiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 品种
	 */
	
	private String pinzhong;
		
	/**
	 * 病虫名称
	 */
	
	private String bingchongmingcheng;
		
	/**
	 * 用药名称
	 */
	
	private String yongyaomingcheng;
		
	/**
	 * 病症特征
	 */
	
	private String bingzhengtezheng;
		
	/**
	 * 防治办法
	 */
	
	private String fangzhibanfa;
		
	/**
	 * 防治效果
	 */
	
	private String fangzhixiaoguo;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
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
	 * 设置：病虫名称
	 */
	 
	public void setBingchongmingcheng(String bingchongmingcheng) {
		this.bingchongmingcheng = bingchongmingcheng;
	}
	
	/**
	 * 获取：病虫名称
	 */
	public String getBingchongmingcheng() {
		return bingchongmingcheng;
	}
				
	
	/**
	 * 设置：用药名称
	 */
	 
	public void setYongyaomingcheng(String yongyaomingcheng) {
		this.yongyaomingcheng = yongyaomingcheng;
	}
	
	/**
	 * 获取：用药名称
	 */
	public String getYongyaomingcheng() {
		return yongyaomingcheng;
	}
				
	
	/**
	 * 设置：病症特征
	 */
	 
	public void setBingzhengtezheng(String bingzhengtezheng) {
		this.bingzhengtezheng = bingzhengtezheng;
	}
	
	/**
	 * 获取：病症特征
	 */
	public String getBingzhengtezheng() {
		return bingzhengtezheng;
	}
				
	
	/**
	 * 设置：防治办法
	 */
	 
	public void setFangzhibanfa(String fangzhibanfa) {
		this.fangzhibanfa = fangzhibanfa;
	}
	
	/**
	 * 获取：防治办法
	 */
	public String getFangzhibanfa() {
		return fangzhibanfa;
	}
				
	
	/**
	 * 设置：防治效果
	 */
	 
	public void setFangzhixiaoguo(String fangzhixiaoguo) {
		this.fangzhixiaoguo = fangzhixiaoguo;
	}
	
	/**
	 * 获取：防治效果
	 */
	public String getFangzhixiaoguo() {
		return fangzhixiaoguo;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
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
