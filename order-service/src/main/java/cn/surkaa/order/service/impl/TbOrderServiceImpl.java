package cn.surkaa.order.service.impl;

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

}




