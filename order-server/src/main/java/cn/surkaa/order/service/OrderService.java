package cn.surkaa.order.service;

import cn.surkaa.feign.pojo.OrderWithUserVO;
import cn.surkaa.order.domain.Order;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author SurKaa
 * @description 针对表【tb_order(订单表)】的数据库操作Service
 * @createDate 2023-09-19 15:01:59
 */
public interface OrderService extends IService<Order> {


    /**
     * 通过id获取订单信息 并携带订单中的用户信息
     *
     * @param id id
     * @return {@link OrderWithUserVO}
     */
    OrderWithUserVO getOrderWithUser(long id);

}
