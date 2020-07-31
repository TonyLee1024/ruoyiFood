package com.ruoyi.everyday.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.CreatedDate;

/**
 * 食物对象 uer_food
 *
 * @author ruoyi
 * @date 2020-07-30
 */

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="食物", description="uer_food")
@TableName("uer_food")
public class UerFood
{
    private static final long serialVersionUID = 1L;

    /** 属性id */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /** 名称 */
    @Excel(name = "名称")
    @TableField("name")
    private String name;

    /** 颜色 */
    @Excel(name = "颜色")
    @TableField("color")
    private String color;

    /** 味道 */
    @Excel(name = "味道")
    @TableField("taste")
    private String taste;

    /** 生长环境 */
    @Excel(name = "生长环境")
    @TableField("graw_env")
    private String grawEnv;

    /** 类别 */
    @Excel(name = "类别")
    @TableField("cate")
    private String cate;

    /** 阴或阳 */
    @Excel(name = "阴或阳")
    @TableField("yin_yang")
    private String yinYang;

    /** 常见吃法 */
    @Excel(name = "常见吃法")
    @TableField("eat_way")
    private String eatWay;

    /** 备注 */
    @Excel(name = "备注")
    @TableField("note")
    private String note;



    /** 创建时间 */
    @Excel(name = "创建时间")
    @TableField("create_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String createTime;

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("name", getName())
                .append("color", getColor())
                .append("taste", getTaste())
                .append("grawEnv", getGrawEnv())
                .append("cate", getCate())
                .append("yinYang", getYinYang())
                .append("eatWay", getEatWay())
                .append("note", getNote())
                .append("createTime", getCreateTime())
                .toString();
    }
}
