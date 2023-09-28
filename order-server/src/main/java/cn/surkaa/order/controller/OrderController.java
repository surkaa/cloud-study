package cn.surkaa.order.controller;

import cn.surkaa.feign.pojo.OrderWithUserVO;
import cn.surkaa.order.service.OrderService;
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
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/{id}")
    public OrderWithUserVO getOrderWithUser(@PathVariable Long id) {
        log.debug("getOrderWithUser: {}", id);
        return orderService.getOrderWithUser(id);
    }

}
