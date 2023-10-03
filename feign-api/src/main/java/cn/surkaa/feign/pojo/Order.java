package cn.surkaa.feign.pojo;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * @author SurKaa
 */
@Data
@Builder
public class Order {
    private Long id;
    private User user;
    private Long totalPrice;
    private Integer orderStatus;
    private Date createdTime;
    private Date updatedTime;
    private Integer isDeleted;
}
