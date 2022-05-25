CREATE DATABASE QuanLiDsSinhVien
go
USE QuanLiDsSinhVien
go

--Tạo Bảng Admin
CREATE TABLE  Ad_min
(
	[tkAdmin] [varchar](50) NOT NULL primary key,
	[mkAdmin] [varchar](50) NULL,
	[hoten] [nvarchar](255) NULL,
	[ngaysinh] [nvarchar](255) NULL,
	[cmnd] [nchar](10) NULL,
	[email] [varchar](50) NULL,
	[sdt] [char](11) NULL,
	[diachi] [nvarchar](255) NULL,
	[tenchucvu] [varchar](50) NULL,
	[tinhtrang] [nvarchar](255) NULL,
	[ngaydangki] [varchar](50) NULL,
	
)

CREATE TABLE SinhVien
(
	[maSV] [varchar](15) NOT NULL primary key,
	[tenSV] [nvarchar](255) NULL,
	[lopSH] [varchar](15)  NULL,
	[Khoa] [nvarchar](255) NULL,
	[gioiTinh] [nvarchar](10) NULL,	
	[SDT] [nvarchar](255) NULL,	
	[eMail] [nvarchar](255) NULL,
	[ngaySinh] [nvarchar](255) NULL,
	[doiTuong] [nvarchar](255) NULL,
	[namHoc] [nvarchar](255) NULL,
	[ghiChu] [nvarchar](255) NULL,
	
)

CREATE TABLE users
(
	[tk] [varchar](50) NOT NULL primary key,
	[mk] [varchar](50) NOT NULL,
	[hoten] [nvarchar](100) NULL,
	[ngaysinh] [nvarchar](255) NULL,
	[cmnd] [nchar](15) NULL,
	[email] [varchar](50) NULL,
	[sdt] [char](11) NULL,
	[diachi] [nvarchar](255) NULL,
	[tenchucvu] [nvarchar](50) NULL,
	[tinhtrang] [nvarchar](255) NULL,
	[ngaydangki] [varchar](50) NULL,
	
)
GO

INSERT INTO Ad_min
VALUES('AD001', 'Hieu', 'CV001',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
      ('AD002', 'Tuan', 'CV001',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
	  ('AD003', 'Khoa', 'CV001',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL)
go
INSERT INTO SinhVien
VALUES('2050521200142', N'Đoàn Ngọc Hiếu', '20T1',N'Công Nghệ Số',N'Nam','0711333131','hieu@gmail.com','200/05/2002',N'Hộ nghèo',N'Đang học','10/05/2022'),
      ('1811505310449', N'Nguyễn Hoàng Anh Tuấn',N'Công Nghệ Số' ,'18T1',N'Nam','0982482423','Tuan242@gmail.com','01/10/1999',N'Mồ côi',N'Gần tốt nghiệp','20/05/2022'),
	  ('2051222211142', N'Trần Văn Hướng', '20T1',N'Công Nghệ Số',N'Nam','0379139311','Khoa@gmail.com','15/07/2002',NULL,N'Con Thương binh liệt sỉ','11/04/2022'),
	  ('1950522255535', N'Nguyễn Thị Hà', '20T1',N'Công Nghệ Số','14/05/2000',N'Nữ',NULL,'Ha@gmail.com',NULL,N'Hộ cận nghèo',NULL),
	  ('1852132012322', N'Lê Minh Hiếu', '20T1',N'Công Nghệ Số','07/02/1999',N'Nam',NULL,NULL,NULL,N'Hộ nghòe',NULL)

INSERT INTO users
VALUES('2050531200142', 'Hieu', N'Đoàn Ngọc Hiếu','200/05/2002',NULL,NULL,NULL,NULL,N'Sinh Viên',NULL,NULL),
      ('1811505310449', 'Tuan',  N'Nguyễn Hoàng Anh Tuấn','01/10/1999',NULL,NULL,NULL,NULL,N'Sinh Viên',NULL,NULL),
	  ('2051222211142', 'Khoa',N'Trần Văn Hướng','15/07/2002',NULL,NULL,NULL,NULL,N'Sinh Viên',NULL,NULL)








