# -- 2022年6月29日15:55:42，taskInfo建表语句
# CREATE TABLE `tas_bushi_taskinto`
# (
# 	`ID`                VARCHAR(255) NOT NULL COMMENT '主键',
# 	`ENABLE_FLAG`       CHAR(1)               DEFAULT NULL COMMENT '启用标志，0-停用，1-启用',
# 	`SYS_ENTY_ID`       VARCHAR(32)           DEFAULT NULL COMMENT '系统确认ID',
# 	`SYS_DEL_FLG`       VARCHAR(1)            DEFAULT NULL COMMENT '系统删除标识，默认为0',
# 	`SYS_CRT_USER`      VARCHAR(32)           DEFAULT NULL COMMENT '创建人',
# 	`SYS_CRT_DT`        TIMESTAMP(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6) COMMENT '创建日期',
# 	`SYS_MODIFY_USER`   VARCHAR(32)           DEFAULT NULL COMMENT '最后编辑人',
# 	`SYS_MODIFY_DT`     TIMESTAMP(6) NULL     DEFAULT NULL COMMENT '最后编辑日期',
# 	`TASK_ID`           VARCHAR(32)           DEFAULT NULL COMMENT '任务 ID ',
# 	`TRAN_ID`           VARCHAR(32)           DEFAULT NULL COMMENT '国结交易信息主键',
# 	`TRANNODE_CODE`     VARCHAR(32)           DEFAULT NULL COMMENT '交易节点编码',
# 	`TRANSYS_CODE`      VARCHAR(32)           DEFAULT NULL COMMENT '系统编码',
# 	`ASSIGN_TYPE`       CHAR(1)               DEFAULT NULL COMMENT '分派方式1-智能粉派2-手工领取3-转派4指派5-驳回',
# 	`QUEUE_CODE`        VARCHAR(512)          DEFAULT NULL COMMENT '所属队列代码',
# 	`QUEUE_FLAG`        CHAR(2)               DEFAULT NULL COMMENT '所属队列标识 01-普通队列02-外包队列03-特殊队列0 ',
# 	`ASSIGNOR`          VARCHAR(32)           DEFAULT NULL COMMENT '分派人STAFFNAME',
# 	`ASSIGNOR_CODE`     VARCHAR(32)           DEFAULT NULL COMMENT '分派人STAFFCODE',
# 	`ASSIGNOR_NAME`     VARCHAR(64)           DEFAULT NULL COMMENT '分派人STAFFNAME ',
# 	`RECEIPTOR`         VARCHAR(32)           DEFAULT NULL COMMENT '领取人',
# 	`RECEIPTOR_CODE`    VARCHAR(32)           DEFAULT NULL COMMENT '领取人STAFFCODE',
# 	`RECEIPTOR_NAME`    VARCHAR(64)           DEFAULT NULL COMMENT '领取人STAFFNAME',
# 	`ASSIGN_TIME`       CHAR(14)              DEFAULT NULL COMMENT '分派时间',
# 	`ORIPATH_FLG`       VARCHAR(1)            DEFAULT NULL COMMENT '是否沿用原分派路径YN',
# -- 	`OPTIME` NUMBER ( 16 ) DEFAULT NULL COMMENT '交易结点操作时长',
# 	`OPTIME`            decimal(18, 2)        DEFAULT NULL COMMENT '交易结点操作时长',
# -- 	`REST_TIME` NUMBER ( 16 ) DEFAULT NULL COMMENT '预估剩余操作时长',
# 	`REST_TIME`         decimal(18, 2)        DEFAULT NULL COMMENT '预估剩余操作时长',
# -- 	`REAL_TIME` NUMBER ( 16 ) DEFAULT NULL COMMENT '任务实际操作时间',
# 	`REAL_TIME`         decimal(18, 2)        DEFAULT NULL COMMENT '任务实际操作时间',
# 	`NOBODY_FLAG`       CHAR(1)               DEFAULT NULL COMMENT '无人指派标志Y未选到人N选到人',
# 	`ORG_ID`            VARCHAR(32)           DEFAULT NULL COMMENT '领取人员所属组织ID',
# 	`BIZ_ORG_ID`        VARCHAR(32)           DEFAULT NULL COMMENT '通过队列识别的组织D',
# 	`CRT_DATE_TIME`     CHAR(14)              DEFAULT NULL COMMENT '任务创建时间',
# 	`DONE_DATE_TIME`    CHAR(14)              DEFAULT NULL COMMENT '任务提交时间',
# 	`REMAIN_CYCLE_WARN` CHAR(1)               DEFAULT NULL COMMENT '剩余周期预警',
# 	`NOBODY_TYPE`       CHAR(2)               DEFAULT NULL COMMENT '无人指派类型：01-不在岗。02-无权限、03-不空闲。04-',
# 	`TAS_STATUS`        CHAR(1)               DEFAULT NULL COMMENT '任务状态：1结点未识别，2-任务未处理3-任务已处理',
# 	`TAS_REMARK`        VARCHAR(4000)         DEFAULT NULL COMMENT '备注',
# 	`OVER_FO_THRESHOLD` VARCHAR(32)           DEFAULT NULL COMMENT '超过阀值后进入外包队列的业务0是',
# 	PRIMARY KEY (`ID`) USING BTREE
# ) ENGINE = INNODB
#   DEFAULT CHARSET = utf8mb4
#   ROW_FORMAT = DYNAMIC COMMENT = '任务信息表(宁波项目测试表-后续会主动删除)';
