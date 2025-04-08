package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 病虫防治
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-22 09:58:33
 */
@TableName("bingchongfangzhi")
public class BingchongfangzhiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BingchongfangzhiEntity() {
		
	}
	
	public BingchongfangzhiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 种植物名称
	 */
					
	private String zhongzhiwumingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：种植物名称
	 */
	public void setZhongzhiwumingcheng(String zhongzhiwumingcheng) {
		this.zhongzhiwumingcheng = zhongzhiwumingcheng;
	}
	/**
	 * 获取：种植物名称
	 */
	public String getZhongzhiwumingcheng() {
		return zhongzhiwumingcheng;
	}
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
