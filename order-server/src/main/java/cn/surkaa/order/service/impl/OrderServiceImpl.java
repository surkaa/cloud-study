package cn.surkaa.order.service.impl;

import cn.surkaa.order.domain.Order;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.surkaa.order.service.OrderService;
import cn.surkaa.order.mapper.OrderMapper;
import org.springframework.stereotype.Service;

/**
 * @author SurKaa
 * @description 针对表【tb_order(订单表)】的数据库操作Service实现
 * @createDate 2023-09-19 15:01:59
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order>
        implements OrderService {

}




