CREATE DATABASE QuanLiDsSinhVien
go
USE QuanLiDsSinhVien
go
--Tạo bảng Chức Vụ
CREATE TABLE Chucvu
(
	[idChucvu] [varchar](15) NOT NULL primary key,
	[tenChucvu] [nvarchar](50) NULL
)
--Tạo Bảng Admin
CREATE TABLE  Ad_min
(
	[tkAdmin] [varchar](50) NOT NULL primary key,
	[Matkhau] [varchar](50) NULL,
	[idChucvu] [varchar](15) NULL,
	FOREIGN KEY(idChucvu) REFERENCES Chucvu(idChucvu)
)
--Tạo bảng Đối tượng
CREATE TABLE Doituong
(
	[idDoituong] [varchar](15) NOT NULL primary key,
	[Tendoituong] [nvarchar](50) NULL,
	[hinhthucmiengiam] [nvarchar](100) NULL
)
--
CREATE TABLE Hocki
(
	[MaHk] [varchar](15) NOT NULL primary key,
	[Namhoc] [int] NULL,
	[HocKi] [nvarchar](20) NULL
)
--
CREATE TABLE Khoa
(
	[idKhoa] [varchar](15) NOT NULL primary key,
	[tenKhoa] [nvarchar](255) NULL,
)
--
CREATE TABLE Lop
(
	[idLop] [varchar](15) NOT NULL primary key,
	[idKhoa] [varchar](15) NOT NULL,
	[tenLop] [nvarchar](50) NULL,
	FOREIGN KEY(idKhoa) REFERENCES Khoa(idKhoa)
)
--
CREATE TABLE Minhchung
(
	[idMinhchung] [varchar](15) NOT NULL primary key,
	[Tenminhchung] [nvarchar](255) NULL,
	[Ngaynop] [nvarchar](255) NULL,
	[NgayCapnhat] [nvarchar](255) NULL, 
)
--
CREATE TABLE SinhVien
(
	[maSV] [varchar](15) NOT NULL primary key,
	[tenSV] [nvarchar](255) NULL,
	[lopSH] [varchar](15) NOT NULL,
	[ngaySinh] [nvarchar](255) NULL,
	[gioiTinh] [nvarchar](10) NULL,
	[Khoa] [nvarchar](255) NULL,
	[SDT] [nvarchar](255) NULL,	
	[eMail] [nvarchar](255) NULL,
	[diaChi] [nvarchar](255) NULL,
	[doiTuong] [nvarchar](255) NULL,
	[namHoc] [nvarchar](255) NULL,
	[ghiChu] [nvarchar](255) NULL,
	
)
--
CREATE TABLE SVthuocdien
(
	[MaHd] [varchar](15) NOT NULL primary key,
	[maSV] [varchar](15) NOT NULL,
	[MaHk] [varchar](15) NOT NULL FOREIGN KEY(MaHk) REFERENCES Hocki(MaHk),
	[Sotc] [int] NULL,
	[idMinhchung] [varchar](15) NOT NULL FOREIGN KEY(idMinhchung) REFERENCES Minhchung(idMinhchung),
	[Tinhtrang] [nvarchar](1) NULL,
	[tkAdmin] [varchar](255) NOT NULL,
	[idDoituong] [varchar](15) NULL,
	FOREIGN KEY(maSV) REFERENCES SinhVien(maSV)
)
--
CREATE TABLE users
(
	[tk] [varchar](50) NOT NULL primary key,
	[mk] [varchar](255) NOT NULL,
	[hoten] [nvarchar](50) NULL,
	[ngaysinh] [nvarchar](255) NULL,
	[cmnd] [nchar](10) NULL,
	[email] [varchar](50) NULL,
	[sdt] [char](11) NULL,
	[diachi] [nvarchar](255) NULL,
	[idChucvu] [varchar](15) NULL,
	[tinhtrang] [nvarchar](255) NULL,
	[ngaydangki] [varchar](50) NULL,
	FOREIGN KEY(idChucvu) REFERENCES Chucvu(idChucvu)
)
GO

--Cập Nhật thông tin

INSERT INTO Chucvu
VALUES('CV001', N'Admin'),
      ('CV002', N'Sinh Viên'),
	  ('CV003', N'Giáo Viên')
INSERT INTO Ad_min
VALUES('AD001', 'Hieu', 'CV001'),
      ('AD002', 'Tuan', 'CV001'),
	  ('AD003', 'Khoa', 'CV001')








