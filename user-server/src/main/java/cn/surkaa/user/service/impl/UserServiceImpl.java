package cn.surkaa.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.surkaa.user.domain.User;
import cn.surkaa.user.service.UserService;
import cn.surkaa.user.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
 * @author SurKaa
 * @description 针对表【tb_user(用户表)】的数据库操作Service实现
 * @createDate 2023-09-19 14:59:46
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
        implements UserService {

}




