use master
go

create database [asmjava4]
go

use asmjava4
go

create table [user]
(
	id				int				primary key identity,
	username			varchar(10)		unique not null, --unique(Username ko trung nhau)
	[password]		varchar(10)		not null,
	email			varchar(40)		unique not null, 
	isAdmin			bit				not null default 0,
	isActive		bit				not null default 1
)
go

create table video
(
	id				int				primary key identity,
	title			nvarchar(255)	not null,
	href			varchar(50)		not null unique ,
	poster			varchar(255)	null,
	[views]			int				not null default 0,
	shares			int				not null default 0,
	[description]	nvarchar(255)	not null,
	isActive		bit				not null default 1
)
go

create table history
(
	id				int				primary key identity,
	userId			int				foreign key references [user](id),		
	videoId			int				foreign key references video(id),	
	viewedDate		datetime		not null default getDate(),
	isLiked			bit				not null default	0,
	likedDate		datetime		null
)
go

insert into [user](username, [password], email, isAdmin) values
('huyht',		'111',		'nguyengiahuy110@gmail.com',		1),
('thuan',		'112',		'huynhthuanhthuan120@gmail.com',		0)
go

insert into video(title, href, [description]) values
(N'TRƯỚC KHI TUỔI TRẺ NÀY ĐÓNG LỐI ',		'Oz8RF_1eGxw',			N'Ngắn x Xám x Dick'),
(N'SỐNG CHO HẾT ĐỜI THANH XUÂN',			'lqQZnvSgLHc',				N'BCTN x TNS '),
(N'GIỮ LẤY LÀM GÌ',							'BYgzu_r_RmE',				N'MONSTAR')
go

insert into history(userId, videoId, isLiked, likedDate) values
(2, 1, 1, getDate()),
(2, 3, 0, null)
go


