package cn.surkaa.order.controller;

import cn.surkaa.feign.pojo.Order;
import cn.surkaa.order.service.TbOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author SurKaa
 */
@Slf4j
@RestController
@RequestMapping("/order")
public class OrderController {

    private final TbOrderService orderService;

    public OrderController(TbOrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/{id}")
    public Order getOneOrder(@PathVariable Long id) {
        log.debug("查询订单信息 id:{}", id);
        return orderService.getOneOrder(id);
    }
}
