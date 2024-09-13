package com.entity.view;

import com.entity.KucuntongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 库存统计
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-11-13 13:46:15
 */
@TableName("kucuntongji")
public class KucuntongjiView  extends KucuntongjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KucuntongjiView(){
	}
 
 	public KucuntongjiView(KucuntongjiEntity kucuntongjiEntity){
 	try {
			BeanUtils.copyProperties(this, kucuntongjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
