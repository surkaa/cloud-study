package cn.surkaa.user.service;

import cn.surkaa.feign.pojo.User;
import cn.surkaa.user.domain.TbUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author SurKaa
 * @description 针对表【tb_user(用户表)】的数据库操作Service
 * @createDate 2023-10-03 19:12:50
 */
public interface TbUserService extends IService<TbUser> {

    /**
     * 根据id查询用户信息
     *
     * @param id 用户id
     * @return 用户信息
     */
    User getOneUser(Long id);

}
