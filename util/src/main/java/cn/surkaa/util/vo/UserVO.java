package cn.surkaa.util.vo;

import lombok.Data;

import java.util.Date;

/**
 * @author SurKaa
 */
@Data
public class UserVO {

    private Long id;
    private String username;
    // private String password;
    private String nickname;
    private String avatar;
    private String gender;
    private String phone;
    private String email;
    private Integer age;
    private Integer role;
    private Integer userStatus;
    private Date createTime;
    private Date updateTime;
    private Integer isDelete;

}
