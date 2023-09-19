create database if not exists `db_cloud_user_server`;
create database if not exists `db_cloud_order_server`;

use `db_cloud_user_server`;

create table if not exists `tb_user`
(
    `id`          bigint                                 not null comment '主键id',
    `username`    varchar(256)                           not null unique comment '登录账号',
    `password`    varchar(512)                           not null comment '密码',
    `nickname`    varchar(256) default null              null comment '用户昵称',
    `avatar`      varchar(256) default null              null comment '头像url',
    `gender`      varchar(64)  default null              null comment '性别',
    `phone`       varchar(128) default null              null comment '电话',
    `email`       varchar(512) default null              null comment '邮箱',
    `age`         int          DEFAULT null              null COMMENT '年龄',
    `role`        tinyint      DEFAULT 0                 null COMMENT '角色',
    `user_status` tinyint      default 0                 not null comment '用户状态',
    `create_time` datetime     default CURRENT_TIMESTAMP not null comment '创建时间',
    `update_time` datetime     default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    `is_delete`   tinyint      default 0                 not null comment '是否删除 0-未删除',
    primary key (`id`)
) comment '用户表';

use `db_cloud_order_server`;

create table if not exists `tb_order`
(
    `id`           bigint                               not null comment '订单主键',
    `user_id`      bigint                               not null comment '用户外键',
    `total_price`  bigint     default 0                 not null comment '商品总价',
    `order_status` tinyint default 0 not null comment '订单状态',
    `created_time` datetime   default current_timestamp not null comment '创建时间',
    `updated_time` datetime   default current_timestamp not null on update current_timestamp comment '更新时间',
    `is_deleted`   tinyint(1) default 0                 not null comment '逻辑删除 0-未删除',
    primary key (`id`)
) comment '订单表';

