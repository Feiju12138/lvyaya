

CREATE TABLE [position] (

[ID] varchar(64)   NOT NULL ,
[TS] varchar(64)   NULL ,
[CREATE_TIME] varchar(64)   NULL ,
[CREATE_USER] varchar(64)   NULL ,
[LAST_MODIFIED] varchar(64)   NULL ,
[LAST_MODIFY_USER] varchar(64)   NULL ,

[address] VARCHAR(64)   NULL ,
[city] VARCHAR(64)   NULL ,
[street] VARCHAR(64)   NULL ,
   PRIMARY KEY ([ID])
)
ON [PRIMARY]
GO

EXEC sp_addextendedproperty 'MS_Description',N'地址','user','dbo','TABLE','position','COLUMN','address'
GO
EXEC sp_addextendedproperty 'MS_Description',N'城市','user','dbo','TABLE','position','COLUMN','city'
GO
EXEC sp_addextendedproperty 'MS_Description',N'街道','user','dbo','TABLE','position','COLUMN','street'
GO


EXEC sp_addextendedproperty 'MS_Description',N'主键 ID','user','dbo','TABLE','position','COLUMN','ID'
GO
EXEC sp_addextendedproperty 'MS_Description',N'乐观锁时间戳','user','dbo','TABLE','position','COLUMN','TS'
GO
EXEC sp_addextendedproperty 'MS_Description',N'修改时间','user','dbo','TABLE','position','COLUMN','LAST_MODIFIED'
GO
EXEC sp_addextendedproperty 'MS_Description',N'修改人','user','dbo','TABLE','position','COLUMN','LAST_MODIFY_USER'
GO
EXEC sp_addextendedproperty 'MS_Description',N'创建时间','user','dbo','TABLE','position','COLUMN','CREATE_TIME'
GO
EXEC sp_addextendedproperty 'MS_Description',N'创建人','user','dbo','TABLE','position','COLUMN','CREATE_USER'
GO
EXEC sp_addextendedproperty 'MS_Description',N'租户标识','user','dbo','TABLE','position','COLUMN','TENANT_ID'
GO
EXEC sp_addextendedproperty 'MS_Description',N'是否删除','user','dbo','TABLE','position','COLUMN','DR'
GO



 


--------------------------------------------------------

