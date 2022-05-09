DROP TABLE IF EXISTS `user_0`;
CREATE TABLE `user_0`
(
    `id`      bigint UNSIGNED NOT NULL,
    `name`    varchar(32) NOT NULL,
    `age`     int(32) NOT NULL,
    `version` int(32) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8;

DROP TABLE IF EXISTS `user_1`;
CREATE TABLE `user_1`
(
    `id`      bigint UNSIGNED NOT NULL,
    `name`    varchar(32) NOT NULL,
    `age`     int(32) NOT NULL,
    `version` int(32) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8;
