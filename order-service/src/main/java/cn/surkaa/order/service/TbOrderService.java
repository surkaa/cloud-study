package cn.surkaa.order.service;

import cn.surkaa.feign.pojo.Order;
import cn.surkaa.order.domain.TbOrder;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author SurKaa
 * @description 针对表【tb_order(订单表)】的数据库操作Service
 * @createDate 2023-10-03 19:13:34
 */
public interface TbOrderService extends IService<TbOrder> {

    /**
     * 查询订单信息
     *
     * @param id 订单id
     * @return 订单信息
     */
    Order getOneOrder(Long id);

}
