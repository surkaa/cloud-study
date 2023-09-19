package cn.surkaa.util.vo;

import lombok.Data;

import java.util.Date;

/**
 * 携带用户信息的订单返回体
 *
 * @author SurKaa
 */
@Data
public class OrderWithUserVO {

    private Long id;
    private Long userId;
    private Long totalPrice;
    private Integer orderStatus;
    private Date createdTime;
    private Date updatedTime;
    private Integer isDeleted;
    private UserVO user;

}
