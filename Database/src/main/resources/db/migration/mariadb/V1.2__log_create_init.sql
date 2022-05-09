DROP TABLE IF EXISTS `log`;
CREATE TABLE `log`
(
    `id`          bigint UNSIGNED NOT NULL AUTO_INCREMENT,
    `user_id`     bigint UNSIGNED,
    `action`      varchar(255)    NOT NULL,
    `create_time` datetime        not null,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 3
  DEFAULT CHARSET = utf8;
