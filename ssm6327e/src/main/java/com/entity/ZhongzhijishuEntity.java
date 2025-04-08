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
 * 种植技术
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-22 09:58:33
 */
@TableName("zhongzhijishu")
public class ZhongzhijishuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhongzhijishuEntity() {
		
	}
	
	public ZhongzhijishuEntity(T t) {
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
