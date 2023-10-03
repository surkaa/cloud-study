package cn.surkaa.user.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName tb_user
 */
@TableName(value ="tb_user")
@Data
public class TbUser implements Serializable {
    private Long id;

    private String username;

    private String password;

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

    private static final long serialVersionUID = 1L;
}