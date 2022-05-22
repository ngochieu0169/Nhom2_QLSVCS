USE [master]
GO
/****** Object:  Database [QuanliDsSinhvien]    Script Date: 5/14/2022 9:59:19 AM ******/
CREATE DATABASE [QuanliDsSinhvien]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'QuanliDsSinh', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.SQLEXPRESS\MSSQL\DATA\QuanliDsSinh.mdf' , SIZE = 4096KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'QuanliDsSinh_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.SQLEXPRESS\MSSQL\DATA\QuanliDsSinh_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [QuanliDsSinhvien] SET COMPATIBILITY_LEVEL = 110
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [QuanliDsSinhvien].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [QuanliDsSinhvien] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [QuanliDsSinhvien] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [QuanliDsSinhvien] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [QuanliDsSinhvien] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [QuanliDsSinhvien] SET ARITHABORT OFF 
GO
ALTER DATABASE [QuanliDsSinhvien] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [QuanliDsSinhvien] SET AUTO_CREATE_STATISTICS ON 
GO
ALTER DATABASE [QuanliDsSinhvien] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [QuanliDsSinhvien] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [QuanliDsSinhvien] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [QuanliDsSinhvien] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [QuanliDsSinhvien] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [QuanliDsSinhvien] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [QuanliDsSinhvien] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [QuanliDsSinhvien] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [QuanliDsSinhvien] SET  DISABLE_BROKER 
GO
ALTER DATABASE [QuanliDsSinhvien] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [QuanliDsSinhvien] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [QuanliDsSinhvien] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [QuanliDsSinhvien] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [QuanliDsSinhvien] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [QuanliDsSinhvien] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [QuanliDsSinhvien] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [QuanliDsSinhvien] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [QuanliDsSinhvien] SET  MULTI_USER 
GO
ALTER DATABASE [QuanliDsSinhvien] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [QuanliDsSinhvien] SET DB_CHAINING OFF 
GO
ALTER DATABASE [QuanliDsSinhvien] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [QuanliDsSinhvien] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
USE [QuanliDsSinhvien]
GO
/****** Object:  Table [dbo].[Admin]    Script Date: 5/14/2022 9:59:19 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Admin](
	[tkAdmin] [varchar](255) NOT NULL,
	[Matkhau] [varchar](255) NULL,
	[idChucvu] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[tkAdmin] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Chucvu]    Script Date: 5/14/2022 9:59:19 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Chucvu](
	[idChucvu] [int] NOT NULL,
	[tenChucvu] [varchar](255) NULL,
 CONSTRAINT [PK_Chucvu] PRIMARY KEY CLUSTERED 
(
	[idChucvu] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Doituong]    Script Date: 5/14/2022 9:59:19 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Doituong](
	[idDoituong] [int] NOT NULL,
	[Tendoituong] [varchar](255) NULL,
	[hinhthucmiengiam] [int] NULL,
 CONSTRAINT [PK_Doituong] PRIMARY KEY CLUSTERED 
(
	[idDoituong] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Hocki]    Script Date: 5/14/2022 9:59:19 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Hocki](
	[MaHk] [int] NOT NULL,
	[Namhoc] [int] NULL,
	[HocKi] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[MaHk] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[khoa]    Script Date: 5/14/2022 9:59:19 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[khoa](
	[idKhoa] [int] NOT NULL,
	[tenKhoa] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[idKhoa] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[lop]    Script Date: 5/14/2022 9:59:19 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[lop](
	[idLop] [int] NOT NULL,
	[idKhoa] [int] NOT NULL,
	[tenLop] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[idLop] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Minhchung]    Script Date: 5/14/2022 9:59:19 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Minhchung](
	[idMinhchung] [int] NOT NULL,
	[Tenminhchung] [varchar](1) NULL,
	[Ngaynop] [datetime] NULL,
	[NgayCapnhat] [datetime] NULL,
PRIMARY KEY CLUSTERED 
(
	[idMinhchung] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[sinhvien]    Script Date: 5/14/2022 9:59:19 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[sinhvien](
	[idSV] [varchar](255) NOT NULL,
	[idLop] [int] NOT NULL,
	[TenSV] [varchar](255) NULL,
	[GioiTinh] [int] NULL,
	[Ngaysinh] [datetime] NULL,
	[Email] [varchar](255) NULL,
	[Sdt] [varchar](255) NULL,
	[CMND] [varchar](255) NULL,
	[Diachi] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[idSV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[SVthuocdien]    Script Date: 5/14/2022 9:59:19 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[SVthuocdien](
	[MaHd] [varchar](10) NOT NULL,
	[idSV] [varchar](255) NOT NULL,
	[MaHk] [int] NOT NULL,
	[Sotc] [int] NULL,
	[idMinhchung] [int] NOT NULL,
	[Tinhtrang] [varchar](1) NULL,
	[tkAdmin] [varchar](255) NOT NULL,
	[idDoituong] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[MaHd] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[taikhoan]    Script Date: 5/14/2022 9:59:19 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[taikhoan](
	[tk] [varchar](255) NOT NULL,
	[Matkhau] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[tk] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[user]    Script Date: 5/14/2022 9:59:19 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[user](
	[id_user] [int] NOT NULL,
	[tk] [varchar](255) NULL,
	[mk] [varchar](255) NULL,
	[hoten] [varchar](255) NULL,
	[ngaysinh] [date] NULL,
	[cmnd] [nchar](10) NULL,
	[email] [varchar](50) NULL,
	[sdt] [int] NULL,
	[diachi] [varchar](255) NULL,
	[idChucvu] [int] NULL,
	[tinhtrang] [varchar](50) NULL,
	[ngaydangki] [date] NULL,
 CONSTRAINT [PK_user] PRIMARY KEY CLUSTERED 
(
	[id_user] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
ALTER TABLE [dbo].[Admin]  WITH CHECK ADD  CONSTRAINT [FK_Admin_Chucvu] FOREIGN KEY([idChucvu])
REFERENCES [dbo].[Chucvu] ([idChucvu])
GO
ALTER TABLE [dbo].[Admin] CHECK CONSTRAINT [FK_Admin_Chucvu]
GO
ALTER TABLE [dbo].[lop]  WITH CHECK ADD FOREIGN KEY([idKhoa])
REFERENCES [dbo].[khoa] ([idKhoa])
GO
ALTER TABLE [dbo].[sinhvien]  WITH CHECK ADD FOREIGN KEY([idLop])
REFERENCES [dbo].[lop] ([idLop])
GO
ALTER TABLE [dbo].[SVthuocdien]  WITH CHECK ADD FOREIGN KEY([idMinhchung])
REFERENCES [dbo].[Minhchung] ([idMinhchung])
GO
ALTER TABLE [dbo].[SVthuocdien]  WITH CHECK ADD FOREIGN KEY([tkAdmin])
REFERENCES [dbo].[Admin] ([tkAdmin])
GO
ALTER TABLE [dbo].[SVthuocdien]  WITH CHECK ADD FOREIGN KEY([idSV])
REFERENCES [dbo].[sinhvien] ([idSV])
GO
ALTER TABLE [dbo].[SVthuocdien]  WITH CHECK ADD FOREIGN KEY([MaHk])
REFERENCES [dbo].[Hocki] ([MaHk])
GO
ALTER TABLE [dbo].[SVthuocdien]  WITH CHECK ADD  CONSTRAINT [FK_SVthuocdien_Doituong] FOREIGN KEY([idDoituong])
REFERENCES [dbo].[Doituong] ([idDoituong])
GO
ALTER TABLE [dbo].[SVthuocdien] CHECK CONSTRAINT [FK_SVthuocdien_Doituong]
GO
ALTER TABLE [dbo].[user]  WITH CHECK ADD  CONSTRAINT [FK_user_Chucvu] FOREIGN KEY([idChucvu])
REFERENCES [dbo].[Chucvu] ([idChucvu])
GO
ALTER TABLE [dbo].[user] CHECK CONSTRAINT [FK_user_Chucvu]
GO
ALTER TABLE [dbo].[user]  WITH CHECK ADD  CONSTRAINT [FK_user_taikhoan] FOREIGN KEY([tk])
REFERENCES [dbo].[taikhoan] ([tk])
GO
ALTER TABLE [dbo].[user] CHECK CONSTRAINT [FK_user_taikhoan]
GO
USE [master]
GO
ALTER DATABASE [QuanliDsSinhvien] SET  READ_WRITE 
GO
