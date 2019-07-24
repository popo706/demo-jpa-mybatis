--
-- table create  `user_dept`
--

CREATE TABLE `user_dept` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `deptName` VARCHAR(100) NOT NULL COMMENT '姓名',
  `userId` INT NOT NULL COMMENT '用户id',
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COMMENT = '用户科室信息表';

