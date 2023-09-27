package cn.surkaa.user.service.impl;

import cn.surkaa.feign.pojo.UserVO;
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

    @Override
    public UserVO getSafeUserById(long id) {
        User byId = this.getById(id);
        UserVO safeUserVO = new UserVO();
        safeUserVO.setId(byId.getId());
        safeUserVO.setUsername(byId.getUsername());
        safeUserVO.setNickname(byId.getNickname());
        safeUserVO.setAvatar(byId.getAvatar());
        safeUserVO.setGender(byId.getGender());
        safeUserVO.setPhone(byId.getPhone());
        safeUserVO.setEmail(byId.getEmail());
        safeUserVO.setAge(byId.getAge());
        safeUserVO.setRole(byId.getRole());
        safeUserVO.setUserStatus(byId.getUserStatus());
        safeUserVO.setCreateTime(byId.getCreateTime());
        safeUserVO.setUpdateTime(byId.getUpdateTime());
        safeUserVO.setIsDelete(byId.getIsDelete());
        return safeUserVO;
    }
}




