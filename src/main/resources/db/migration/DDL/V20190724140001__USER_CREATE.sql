--
-- table create  `user`
--

CREATE TABLE `user` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `realName` VARCHAR(100) NOT NULL COMMENT '姓名',
  `phoneNum` VARCHAR(20) NOT NULL COMMENT '手机号',
  `birthday` BIGINT(20) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COMMENT = '用户信息表';

