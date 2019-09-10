-- drop table position cascade constraints;
create table position
(
ID VARCHAR2(64) not null,
        constraint PK_position primary key (ID),
        address VARCHAR2(64) null,
        city VARCHAR2(64) null,
        street VARCHAR2(64) null,
        TENANT_ID VARCHAR2(64) NULL,
        DR NUMBER(11) NULL,
        TS VARCHAR2(64) NULL,
        LAST_MODIFIED VARCHAR2(64) NULL,
        LAST_MODIFY_USER VARCHAR2(64) NULL,
        CREATE_TIME VARCHAR2(64) NULL,
        CREATE_USER VARCHAR2(64) NULL
);
        comment on column position.address is '地址';
        comment on column position.city is '城市';
        comment on column position.street is '街道';
comment on column position.DR is '是否删除';
comment on column position.TS is '时间戳';
comment on column position.LAST_MODIFIED is '修改时间';
comment on column position.LAST_MODIFY_USER is '修改人';
comment on column position.CREATE_TIME is '创建时间';
comment on column position.CREATE_USER is '创建人';






