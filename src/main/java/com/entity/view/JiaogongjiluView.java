package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.JiaogongjiluEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 工作记录
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("jiaogongjilu")
public class JiaogongjiluView extends JiaogongjiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 教工类型的值
	*/
	@ColumnInfo(comment="教工类型的字典表值",type="varchar(200)")
	private String jiaogongjiluValue;




	public JiaogongjiluView() {

	}

	public JiaogongjiluView(JiaogongjiluEntity jiaogongjiluEntity) {
		try {
			BeanUtils.copyProperties(this, jiaogongjiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 教工类型的值
	*/
	public String getJiaogongjiluValue() {
		return jiaogongjiluValue;
	}
	/**
	* 设置： 教工类型的值
	*/
	public void setJiaogongjiluValue(String jiaogongjiluValue) {
		this.jiaogongjiluValue = jiaogongjiluValue;
	}




	@Override
	public String toString() {
		return "JiaogongjiluView{" +
			", jiaogongjiluValue=" + jiaogongjiluValue +
			"} " + super.toString();
	}
}
