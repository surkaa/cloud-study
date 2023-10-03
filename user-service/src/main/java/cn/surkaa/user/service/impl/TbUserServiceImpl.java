package cn.surkaa.user.service.impl;

import cn.surkaa.feign.pojo.User;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.surkaa.user.domain.TbUser;
import cn.surkaa.user.service.TbUserService;
import cn.surkaa.user.mapper.TbUserMapper;
import org.springframework.stereotype.Service;

/**
* @author SurKaa
* @description 针对表【tb_user(用户表)】的数据库操作Service实现
* @createDate 2023-10-03 19:12:50
*/
@Service
public class TbUserServiceImpl extends ServiceImpl<TbUserMapper, TbUser>
    implements TbUserService{

    @Override
    public User getOneUser(Long id) {
        TbUser user = getById(id);
        return User.builder()
                .id(user.getId())
                .username(user.getUsername())
                .password(user.getPassword())
                .nickname(user.getNickname())
                .avatar(user.getAvatar())
                .gender(user.getGender())
                .phone(user.getPhone())
                .email(user.getEmail())
                .age(user.getAge())
                .userStatus(user.getUserStatus())
                .createTime(user.getCreateTime())
                .updateTime(user.getUpdateTime())
                .isDelete(user.getIsDelete())
                .build();
    }
}




