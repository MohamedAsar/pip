create table demo_Hotel (
	uuid_ VARCHAR(75) null,
	orderId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	pizza INTEGER,
	burger INTEGER,
	Doughnut INTEGER,
	status INTEGER,
	statusByUserId LONG,
	statusByUserName VARCHAR(75) null,
	statusDate DATE null
);

create table demo_Leave (
	uuid_ VARCHAR(75) null,
	leaveId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	leaveName VARCHAR(75) null,
	startDate DATE null,
	endDate DATE null
);