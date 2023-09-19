package cn.surkaa.order.controller;

import cn.surkaa.order.service.OrderService;
import cn.surkaa.util.vo.OrderWithUserVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author SurKaa
 */
@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/{id}")
    public OrderWithUserVO getOrderWithUser(@PathVariable Long id) {
        return orderService.getOrderWithUser(id);
    }

}
