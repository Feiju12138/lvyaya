
-- drop table if EXISTS position;
CREATE TABLE `position` (
`ID` VARCHAR(64) NOT NULL COMMENT '主键',
    PRIMARY KEY (`ID`),
    `address` VARCHAR(64) DEFAULT NULL COMMENT '地址',
    `kind` VARCHAR(64) DEFAULT NULL COMMENT '垃圾种类',
    `city` VARCHAR(64) DEFAULT NULL COMMENT '城市',
    `street` VARCHAR(64) DEFAULT NULL COMMENT '街道',
        `TENANT_ID` varchar(64) DEFAULT NULL,
        `DR` int(11) DEFAULT NULL COMMENT '是否删除',
        `TS` varchar(64) DEFAULT NULL COMMENT '时间戳',
        `LAST_MODIFIED` varchar(64) DEFAULT NULL COMMENT '修改时间',
        `LAST_MODIFY_USER` varchar(64) DEFAULT NULL COMMENT '修改人',
        `CREATE_TIME` varchar(64) DEFAULT NULL COMMENT '创建时间',
        `CREATE_USER` varchar(64) DEFAULT NULL COMMENT '创建人'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPACT;




