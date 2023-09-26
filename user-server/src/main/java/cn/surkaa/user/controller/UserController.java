package cn.surkaa.user.controller;

import cn.surkaa.user.service.UserService;
import cn.surkaa.util.vo.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author SurKaa
 */
@Slf4j
@RefreshScope // 动态刷新配置文件 感知配置文件的变化
@RestController
@RequestMapping("/users")
public class UserController {

    @Value("${pattern.dateformat}")
    private String dateformat;

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * 测试 获取当前时间 检查配置文件是否生效
     *
     * @return 当前时间
     */
    @GetMapping("/now")
    public String now() {
        return LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern(dateformat));
    }

    // 添加打印方法执行过程(参数 执行时间 返回值...)的注解
    @GetMapping("/{id}")
    public UserVO getById(@PathVariable Long id) {
        log.debug("getById: {}", id);
        return userService.getSafeUserById(id);
    }

}
