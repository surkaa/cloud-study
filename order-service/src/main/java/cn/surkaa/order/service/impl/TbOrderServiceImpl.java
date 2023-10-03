package cn.surkaa.order.service.impl;

import cn.surkaa.feign.clients.UserClient;
import cn.surkaa.feign.pojo.Order;
import cn.surkaa.feign.pojo.User;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.surkaa.order.domain.TbOrder;
import cn.surkaa.order.service.TbOrderService;
import cn.surkaa.order.mapper.TbOrderMapper;
import org.springframework.stereotype.Service;

/**
* @author SurKaa
* @description 针对表【tb_order(订单表)】的数据库操作Service实现
* @createDate 2023-10-03 19:13:34
*/
@Service
public class TbOrderServiceImpl extends ServiceImpl<TbOrderMapper, TbOrder>
    implements TbOrderService{

    private final UserClient userClient;

    public TbOrderServiceImpl(UserClient userClient) {
        this.userClient = userClient;
    }

    @Override
    public Order getOneOrder(Long id) {
        TbOrder order = this.getById(id);
        User user = userClient.findById(order.getUserId());
        return Order.builder()
                .id(order.getId())
                .user(user)
                .totalPrice(order.getTotalPrice())
                .orderStatus(order.getOrderStatus())
                .createdTime(order.getCreatedTime())
                .updatedTime(order.getUpdatedTime())
                .isDeleted(order.getIsDeleted())
                .build();
    }
}




