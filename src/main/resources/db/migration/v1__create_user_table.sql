Create TABLE User(
    id VARCHAR(32) NOT NULL
                 PRIMARY KEY COMMENT '用户id',
    username VARCHAR(64) NOT NULL  COMMENT '用户名',
    password VARCHAR(64) NOT NULL  COMMENT '加密后密码',
    gender VARCHAR(255)  NULL  COMMENT '性别',
    email VARCHAR(255)  NULL  COMMENT '邮箱'

)