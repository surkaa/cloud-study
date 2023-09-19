package cn.surkaa.order.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 订单表
 *
 * @author SurKaa
 * @TableName tb_order
 */
@TableName(value = "tb_order")
@Data
public class Order implements Serializable {

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 8452439137297112856L;

    /**
     * 订单主键
     */
    @TableId
    private Long id;

    /**
     * 用户外键
     */
    private Long userId;

    /**
     * 商品总价
     */
    private Long totalPrice;

    /**
     * 订单状态
     */
    private Integer orderStatus;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 更新时间
     */
    private Date updatedTime;

    /**
     * 逻辑删除 0-未删除
     */
    @TableLogic
    private Integer isDeleted;
}