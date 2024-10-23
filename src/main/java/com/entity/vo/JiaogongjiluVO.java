package com.entity.vo;

import com.entity.JiaogongjiluEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 工作记录
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jiaogongjilu")
public class JiaogongjiluVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 教工编号
     */

    @TableField(value = "jiaogongjilu_uuid_number")
    private String jiaogongjiluUuidNumber;


    /**
     * 教工名称
     */

    @TableField(value = "jiaogongjilu_name")
    private String jiaogongjiluName;


    /**
     * 教工类型
     */

    @TableField(value = "jiaogongjilu_types")
    private Integer jiaogongjiluTypes;


    /**
     * 工作量
     */

    @TableField(value = "gongzuoliang_num")
    private Integer gongzuoliangNum;


    /**
     * 备注
     */

    @TableField(value = "jiaogongjilu_text")
    private String jiaogongjiluText;


    /**
     * 工作详情
     */

    @TableField(value = "jiaogongjilu_content")
    private String jiaogongjiluContent;


    /**
     * 工龄
     */

    @TableField(value = "jiaogongjilu_gongling")
    private Integer jiaogongjiluGongling;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：教工编号
	 */
    public String getJiaogongjiluUuidNumber() {
        return jiaogongjiluUuidNumber;
    }


    /**
	 * 获取：教工编号
	 */

    public void setJiaogongjiluUuidNumber(String jiaogongjiluUuidNumber) {
        this.jiaogongjiluUuidNumber = jiaogongjiluUuidNumber;
    }
    /**
	 * 设置：教工名称
	 */
    public String getJiaogongjiluName() {
        return jiaogongjiluName;
    }


    /**
	 * 获取：教工名称
	 */

    public void setJiaogongjiluName(String jiaogongjiluName) {
        this.jiaogongjiluName = jiaogongjiluName;
    }
    /**
	 * 设置：教工类型
	 */
    public Integer getJiaogongjiluTypes() {
        return jiaogongjiluTypes;
    }


    /**
	 * 获取：教工类型
	 */

    public void setJiaogongjiluTypes(Integer jiaogongjiluTypes) {
        this.jiaogongjiluTypes = jiaogongjiluTypes;
    }
    /**
	 * 设置：工作量
	 */
    public Integer getGongzuoliangNum() {
        return gongzuoliangNum;
    }


    /**
	 * 获取：工作量
	 */

    public void setGongzuoliangNum(Integer gongzuoliangNum) {
        this.gongzuoliangNum = gongzuoliangNum;
    }
    /**
	 * 设置：备注
	 */
    public String getJiaogongjiluText() {
        return jiaogongjiluText;
    }


    /**
	 * 获取：备注
	 */

    public void setJiaogongjiluText(String jiaogongjiluText) {
        this.jiaogongjiluText = jiaogongjiluText;
    }
    /**
	 * 设置：工作详情
	 */
    public String getJiaogongjiluContent() {
        return jiaogongjiluContent;
    }


    /**
	 * 获取：工作详情
	 */

    public void setJiaogongjiluContent(String jiaogongjiluContent) {
        this.jiaogongjiluContent = jiaogongjiluContent;
    }
    /**
	 * 设置：工龄
	 */
    public Integer getJiaogongjiluGongling() {
        return jiaogongjiluGongling;
    }


    /**
	 * 获取：工龄
	 */

    public void setJiaogongjiluGongling(Integer jiaogongjiluGongling) {
        this.jiaogongjiluGongling = jiaogongjiluGongling;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
