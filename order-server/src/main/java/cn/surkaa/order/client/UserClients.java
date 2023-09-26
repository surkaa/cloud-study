package cn.surkaa.order.client;

import cn.surkaa.util.vo.UserVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author SurKaa
 */
@FeignClient(name = "user-server") // 指定服务名称
public interface UserClients {

    // 请求方法 + 请求路径
    // 返回值类型 + 参数
    @GetMapping("/users/{id}")
    UserVO getUserById(@PathVariable("id") Long id);

}
