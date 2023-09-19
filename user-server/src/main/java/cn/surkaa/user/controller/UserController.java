package cn.surkaa.user.controller;

import cn.surkaa.user.service.UserService;
import cn.surkaa.util.ResultUtil;
import cn.surkaa.util.vo.BaseVO;
import cn.surkaa.util.vo.UserVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author SurKaa
 */
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // 添加打印方法执行过程(参数 执行时间 返回值...)的注解
    @GetMapping("/{id}")
    public BaseVO<UserVO> getById(@PathVariable Long id) {
        UserVO byId = userService.getSafeUserById(id);
        return ResultUtil.success(byId);
    }

}
