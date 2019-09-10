-- drop table search cascade constraints;
create table search
(
ID VARCHAR2(64) not null,
        constraint PK_search primary key (ID),
        rubbish_name VARCHAR2(64) null,
        rubbish_kind VARCHAR2(64) null,
        TENANT_ID VARCHAR2(64) NULL,
        DR NUMBER(11) NULL,
        TS VARCHAR2(64) NULL,
        LAST_MODIFIED VARCHAR2(64) NULL,
        LAST_MODIFY_USER VARCHAR2(64) NULL,
        CREATE_TIME VARCHAR2(64) NULL,
        CREATE_USER VARCHAR2(64) NULL
);
        comment on column search.rubbish_name is '垃圾名称';
        comment on column search.rubbish_kind is '垃圾种类';
comment on column search.DR is '是否删除';
comment on column search.TS is '时间戳';
comment on column search.LAST_MODIFIED is '修改时间';
comment on column search.LAST_MODIFY_USER is '修改人';
comment on column search.CREATE_TIME is '创建时间';
comment on column search.CREATE_USER is '创建人';






