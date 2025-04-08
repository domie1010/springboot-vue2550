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
 * 种植物信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-22 09:58:33
 */
@TableName("zhongzhiwuxinxi")
public class ZhongzhiwuxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhongzhiwuxinxiEntity() {
		
	}
	
	public ZhongzhiwuxinxiEntity(T t) {
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
	 * 颜色
	 */
					
	private String yanse;
	
	/**
	 * 生长环境
	 */
					
	private String shengzhanghuanjing;
	
	/**
	 * 生长周期
	 */
					
	private String shengzhangzhouqi;
	
	/**
	 * 种植方式
	 */
					
	private String zhongzhifangshi;
	
	/**
	 * 食用价值
	 */
					
	private String shiyongjiazhi;
	
	/**
	 * 详情
	 */
					
	private String xiangqing;
	
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
	 * 设置：颜色
	 */
	public void setYanse(String yanse) {
		this.yanse = yanse;
	}
	/**
	 * 获取：颜色
	 */
	public String getYanse() {
		return yanse;
	}
	/**
	 * 设置：生长环境
	 */
	public void setShengzhanghuanjing(String shengzhanghuanjing) {
		this.shengzhanghuanjing = shengzhanghuanjing;
	}
	/**
	 * 获取：生长环境
	 */
	public String getShengzhanghuanjing() {
		return shengzhanghuanjing;
	}
	/**
	 * 设置：生长周期
	 */
	public void setShengzhangzhouqi(String shengzhangzhouqi) {
		this.shengzhangzhouqi = shengzhangzhouqi;
	}
	/**
	 * 获取：生长周期
	 */
	public String getShengzhangzhouqi() {
		return shengzhangzhouqi;
	}
	/**
	 * 设置：种植方式
	 */
	public void setZhongzhifangshi(String zhongzhifangshi) {
		this.zhongzhifangshi = zhongzhifangshi;
	}
	/**
	 * 获取：种植方式
	 */
	public String getZhongzhifangshi() {
		return zhongzhifangshi;
	}
	/**
	 * 设置：食用价值
	 */
	public void setShiyongjiazhi(String shiyongjiazhi) {
		this.shiyongjiazhi = shiyongjiazhi;
	}
	/**
	 * 获取：食用价值
	 */
	public String getShiyongjiazhi() {
		return shiyongjiazhi;
	}
	/**
	 * 设置：详情
	 */
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
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
