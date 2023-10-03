package cn.surkaa.user.controller;

import cn.surkaa.feign.pojo.User;
import cn.surkaa.user.service.TbUserService;
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
@RequestMapping("/user")
public class UserController {

    private final TbUserService userService;

    public UserController(TbUserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public User getOneUser(@PathVariable Long id) {
        log.debug("查询用户信息，id：{}", id);
        return userService.getOneUser(id);
    }
}
