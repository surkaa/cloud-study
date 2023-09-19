package cn.surkaa.user.service;

import cn.surkaa.user.domain.User;
import cn.surkaa.util.vo.UserVO;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author SurKaa
 * @description 针对表【tb_user(用户表)】的数据库操作Service
 * @createDate 2023-09-19 14:59:46
 */
public interface UserService extends IService<User> {

    /**
     * 通过id获取脱敏后的用户信息
     *
     * @param id id
     * @return {@link UserVO}
     */
    UserVO getSafeUserById(long id);

}
