package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 工作记录
 *
 * @author 
 * @email
 */
@TableName("jiaogongjilu")
public class JiaogongjiluEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiaogongjiluEntity() {

	}

	public JiaogongjiluEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 教工编号
     */
    @ColumnInfo(comment="教工编号",type="varchar(200)")
    @TableField(value = "jiaogongjilu_uuid_number")

    private String jiaogongjiluUuidNumber;


    /**
     * 教工名称
     */
    @ColumnInfo(comment="教工名称",type="varchar(200)")
    @TableField(value = "jiaogongjilu_name")

    private String jiaogongjiluName;


    /**
     * 教工类型
     */
    @ColumnInfo(comment="教工类型",type="int(11)")
    @TableField(value = "jiaogongjilu_types")

    private Integer jiaogongjiluTypes;


    /**
     * 工作量
     */
    @ColumnInfo(comment="工作量",type="int(11)")
    @TableField(value = "gongzuoliang_num")

    private Integer gongzuoliangNum;


    /**
     * 备注
     */
    @ColumnInfo(comment="备注",type="longtext")
    @TableField(value = "jiaogongjilu_text")

    private String jiaogongjiluText;


    /**
     * 工作详情
     */
    @ColumnInfo(comment="工作详情",type="longtext")
    @TableField(value = "jiaogongjilu_content")

    private String jiaogongjiluContent;


    /**
     * 工龄
     */
    @ColumnInfo(comment="工龄",type="int(11)")
    @TableField(value = "jiaogongjilu_gongling")

    private Integer jiaogongjiluGongling;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="录入时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 设置：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：教工编号
	 */
    public String getJiaogongjiluUuidNumber() {
        return jiaogongjiluUuidNumber;
    }
    /**
	 * 设置：教工编号
	 */

    public void setJiaogongjiluUuidNumber(String jiaogongjiluUuidNumber) {
        this.jiaogongjiluUuidNumber = jiaogongjiluUuidNumber;
    }
    /**
	 * 获取：教工名称
	 */
    public String getJiaogongjiluName() {
        return jiaogongjiluName;
    }
    /**
	 * 设置：教工名称
	 */

    public void setJiaogongjiluName(String jiaogongjiluName) {
        this.jiaogongjiluName = jiaogongjiluName;
    }
    /**
	 * 获取：教工类型
	 */
    public Integer getJiaogongjiluTypes() {
        return jiaogongjiluTypes;
    }
    /**
	 * 设置：教工类型
	 */

    public void setJiaogongjiluTypes(Integer jiaogongjiluTypes) {
        this.jiaogongjiluTypes = jiaogongjiluTypes;
    }
    /**
	 * 获取：工作量
	 */
    public Integer getGongzuoliangNum() {
        return gongzuoliangNum;
    }
    /**
	 * 设置：工作量
	 */

    public void setGongzuoliangNum(Integer gongzuoliangNum) {
        this.gongzuoliangNum = gongzuoliangNum;
    }
    /**
	 * 获取：备注
	 */
    public String getJiaogongjiluText() {
        return jiaogongjiluText;
    }
    /**
	 * 设置：备注
	 */

    public void setJiaogongjiluText(String jiaogongjiluText) {
        this.jiaogongjiluText = jiaogongjiluText;
    }
    /**
	 * 获取：工作详情
	 */
    public String getJiaogongjiluContent() {
        return jiaogongjiluContent;
    }
    /**
	 * 设置：工作详情
	 */

    public void setJiaogongjiluContent(String jiaogongjiluContent) {
        this.jiaogongjiluContent = jiaogongjiluContent;
    }
    /**
	 * 获取：工龄
	 */
    public Integer getJiaogongjiluGongling() {
        return jiaogongjiluGongling;
    }
    /**
	 * 设置：工龄
	 */

    public void setJiaogongjiluGongling(Integer jiaogongjiluGongling) {
        this.jiaogongjiluGongling = jiaogongjiluGongling;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Jiaogongjilu{" +
            ", id=" + id +
            ", jiaogongjiluUuidNumber=" + jiaogongjiluUuidNumber +
            ", jiaogongjiluName=" + jiaogongjiluName +
            ", jiaogongjiluTypes=" + jiaogongjiluTypes +
            ", gongzuoliangNum=" + gongzuoliangNum +
            ", jiaogongjiluText=" + jiaogongjiluText +
            ", jiaogongjiluContent=" + jiaogongjiluContent +
            ", jiaogongjiluGongling=" + jiaogongjiluGongling +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
