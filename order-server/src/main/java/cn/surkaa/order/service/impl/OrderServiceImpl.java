package cn.surkaa.order.service.impl;

import cn.surkaa.order.client.UserClients;
import cn.surkaa.order.domain.Order;
import cn.surkaa.util.exception.NoFoundException;
import cn.surkaa.util.vo.OrderWithUserVO;
import cn.surkaa.util.vo.UserVO;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.surkaa.order.service.OrderService;
import cn.surkaa.order.mapper.OrderMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author SurKaa
 * @description 针对表【tb_order(订单表)】的数据库操作Service实现
 * @createDate 2023-09-19 15:01:59
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order>
        implements OrderService {

    private final UserClients userClients;

    public OrderServiceImpl(UserClients userClients) {
        this.userClients = userClients;
    }

    @Override
    public OrderWithUserVO getOrderWithUser(long id) {
        Order byId = this.getById(id);
        if (null == byId) {
            throw NoFoundException.error();
        }
        UserVO userVO = userClients.getUserById(byId.getUserId());
        OrderWithUserVO orderWithUserVO = new OrderWithUserVO();
        orderWithUserVO.setId(byId.getId());
        orderWithUserVO.setTotalPrice(byId.getTotalPrice());
        orderWithUserVO.setOrderStatus(byId.getOrderStatus());
        orderWithUserVO.setCreatedTime(byId.getCreatedTime());
        orderWithUserVO.setUpdatedTime(byId.getUpdatedTime());
        orderWithUserVO.setIsDeleted(byId.getIsDeleted());
        orderWithUserVO.setUser(userVO);
        return orderWithUserVO;
    }
}




