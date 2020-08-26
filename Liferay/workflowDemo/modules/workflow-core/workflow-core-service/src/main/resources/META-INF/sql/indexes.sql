create index IX_257F1352 on demo_Hotel (groupId, status);
create index IX_C61F4C38 on demo_Hotel (userId);
create index IX_28321072 on demo_Hotel (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_23880B74 on demo_Hotel (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_17B4B17B on demo_Leave (userId);
create index IX_75E7FDF5 on demo_Leave (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_DDD17DB7 on demo_Leave (uuid_[$COLUMN_LENGTH:75$], groupId);