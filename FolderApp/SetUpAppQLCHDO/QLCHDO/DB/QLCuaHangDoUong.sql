use master
go
create database QLCuaHangDoUong
on
(
	name = QLCuaHangDoUong_dat,
	filename='D:\COM2034PhanHongPhuPS24848\QLCuaHangDoUong_dat.mdf',
	size = 5,
	maxsize = 50,
	filegrowth = 5
)
log on
(
	name = QLCuaHangDoUong_log,
	filename = 'D:\COM2034PhanHongPhuPS24848\QLCuaHangDoUong_log.ldf',
	size = 5 mb,
	maxsize = 50 mb,
	filegrowth = 5 mb
)
go
use QLCuaHangDoUong
go
CREATE TABLE NHANVIEN(
	MaNV NVARCHAR(10) PRIMARY KEY,
	TenNV NVARCHAR(100) NOT NULL,
	SDT NVARCHAR(50) NOT NULL,
	MatKhau NVARCHAR(100) NOT NULL,
	ChucVu BIT NOT NULL,
	Email NVARCHAR(100) NOT NULL
);

CREATE TABLE LOAISANPHAM
(
	MaLoaiSP NVARCHAR(10) PRIMARY KEY,
	TenLoai nvarchar(100),
	MaNV NVARCHAR(10) references NHANVIEN(MaNV)
);

CREATE TABLE SANPHAM(
	MaSP NVARCHAR(10) PRIMARY KEY,
	TenSP NVARCHAR(100) NOT NULL,
	Gia FLOAT NOT NULL,
	TrangThai NVARCHAR(30) NOT NULL,
	Anh NVARCHAR(100),
	MaLoai NVARCHAR(10) references LOAISANPHAM(MaLoaiSP)
);

CREATE TABLE GIAMGIA(
	MaGG NVARCHAR(50) PRIMARY KEY,
	TenGG NVARCHAR(100) NOT NULL,
	DieuKien FLOAT NOT NULL,
	Giatri INT NOT NULL,
	NgayBD DATE NOT NULL,
	NgayKT DATE NOT NULL,
	MaNV NVARCHAR(10) REFERENCES NHANVIEN(MaNV) 
);

CREATE TABLE KHACHHANG(
	MaKH NVARCHAR(10) PRIMARY KEY,
	TenKH NVARCHAR(100) NOT NULL,
	SDT NVARCHAR(100) NOT NULL,
	Diem FLOAT NOT NULL,
);
 CREATE TABLE HOADON
 (
	MaHD NVARCHAR(10) PRIMARY KEY,
	NgayBan DATE NOT NULL,
	MaKH NVARCHAR(10) REFERENCES KHACHHANG(MaKH),
	MaNV NVARCHAR(10) REFERENCES NHANVIEN(MaNV)
 );
CREATE TABLE CTHOADON(
	MaHD NVARCHAR(10) REFERENCES HOADON(MaHD) ON DELETE CASCADE,
	MaSP NVARCHAR(10) REFERENCES SANPHAM(MaSP) ON DELETE CASCADE,
	SoLuong INT NOT NULL,
	Gia FLOAT NOT NULL,
	TrangThai NVARCHAR(30) NOT NULL,
	TongTien FLOAT NOT NULL,
	CONSTRAINT PK_MaCTHoaDon PRIMARY KEY (MaHD, MaSP),
);
-- ALTER TABLE CTHOADON 
-- ADD GIA FLOAT NULL;
ALTER TABLE SANPHAM
ADD SoLuongSanPham INT NULL;
SELECT * FROM CTHOADON
INSERT INTO NHANVIEN VALUES('NV01', N'Nguyễn Văn An', '0123456789', '123', 0, 'annguyen01@gmail.com');
INSERT INTO NHANVIEN VALUES('NV02', N'Phùng Văn Nam', '0596794769', '321', 1, 'namphung02@gmail.com');
INSERT INTO NHANVIEN VALUES('NV03', N'Lê Hà Anh', '07597544', '456', 1, 'anhha03@gmail.com');
INSERT INTO NHANVIEN VALUES('NV04', N'Trần Thái Bảo', '075974644', '789', 1, 'thaibao04@gmail.com');
INSERT INTO NHANVIEN VALUES('NV05', N'Nguyễn Anh Nam', '083568645', '890', 0, 'namnguyen05@gmail.com');

INSERT INTO LOAISANPHAM VALUES('LT01', N'Loại trà', 'NV01');
INSERT INTO LOAISANPHAM VALUES('DA01', N'Đồ ăn', 'NV01');
INSERT INTO LOAISANPHAM VALUES('AC01', N'ăn chơi', 'NV01');

INSERT INTO SANPHAM VALUES('TS01', N'Trà Sữa Truyền Thống', '27', N'Còn Hàng', 'hinh1.jpg', 'LT01');
INSERT INTO SANPHAM VALUES('TS02', N'Trà Sữa Macha', '27', N'Còn Hàng', 'hinh1.jpg', 'LT01');
INSERT INTO SANPHAM VALUES('BK01', N'Bò Khô', '27', N'Còn Hàng', 'hinh1.jpg', 'DA01');
INSERT INTO SANPHAM VALUES('BN01', N'Bánh Ngọt', '27', N'Còn Hàng', 'hinh1.jpg', 'DA01');
/*
	CREATE TABLE GIAMGIA(
	MaGG NVARCHAR(50) PRIMARY KEY,
	TenGG NVARCHAR(100) NOT NULL,
	DieuKien FLOAT NOT NULL,
	Giatri INT NOT NULL,
	NgayBD DATE NOT NULL,
	NgayKT DATE NOT NULL,
	MaNV NVARCHAR(10) REFERENCES NHANVIEN(MaNV) 
);
*/
select * from GIAMGIA
INSERT INTO GIAMGIA VALUES('GG01', N'Giảm giá ngày tết','100000', '10','2022-01-01', '2022-01-03', 'NV01');
INSERT INTO GIAMGIA VALUES('GG02', N'Trung thu', '200000', '30','2022-01-01', '2022-01-05', 'NV01');
INSERT INTO GIAMGIA VALUES('GG03', N'Mùa Xuân','50000', '10','2022-01-01', '2022-01-06', 'NV03');
INSERT INTO GIAMGIA VALUES('GG04', N'Mùa đông','80000', '50','2022-01-01', '2022-01-06', 'NV02');

INSERT INTO KHACHHANG VALUES('MKH01', N'Nguyễn Văn Khánh', '0987654321', '22');
INSERT INTO KHACHHANG VALUES('MKH02', N'Phú Văn Hà', '098324234', '27');
INSERT INTO KHACHHANG VALUES('MKH03', N'Phạm Văn Huy', '0982342321', '28');
INSERT INTO KHACHHANG VALUES('MKH04', N'Nguyễn Tiến Khánh Nam', '0234534321', '26');
/*
	CREATE TABLE HOADON
 (
	MaHD NVARCHAR(10) PRIMARY KEY,
	NgayBan DATE NOT NULL,
	MaKH NVARCHAR(10) REFERENCES KHACHHANG(MaKH),
	MaNV NVARCHAR(10) REFERENCES NHANVIEN(MaNV)
 );

 CREATE TABLE CTHOADON(
	MaHD NVARCHAR(10) REFERENCES HOADON(MaHD),
	MaSP NVARCHAR(10) REFERENCES SANPHAM(MaSP),
	SoLuong INT NOT NULL,
	TrangThai NVARCHAR(30) NOT NULL,
	TongTien FLOAT NOT NULL,
	CONSTRAINT PK_MaCTHoaDon PRIMARY KEY (MaHD, MaSP)
);
*/
INSERT INTO HOADON VALUES('HD01', '2022-01-07', 'MKH01', 'NV01');	
INSERT INTO HOADON VALUES('HD02', '2022-01-03', 'MKH02', 'NV01');
INSERT INTO HOADON VALUES('HD03', '2022-01-03', 'MKH01', 'NV03');
INSERT INTO HOADON VALUES('HD04', '2022-02-14', 'MKH04', 'NV02');
INSERT INTO CTHOADON VALUES('HD01', 'TS01', '1', '20000',N'Đã Thanh Toán', '20000');
INSERT INTO CTHOADON VALUES('HD02', 'BK01', '1', '30000',N'Đã Thanh Toán', '30000');
INSERT INTO CTHOADON VALUES('HD02', 'TS01', '5', '40000',N'Đã Thanh Toán', '200000');
INSERT INTO CTHOADON VALUES('HD03', 'TS01', '8', '10000',N'Đã Thanh Toán', '80000');
INSERT INTO CTHOADON VALUES('HD04', 'BK01', '6', '15000',N'Đã Thanh Toán', '90000');
INSERT INTO CTHOADON VALUES('HD04', 'TS01', '10', '25000',N'Đã Thanh Toán', '250000');
-- CAU LENH TAO STORE PROCEDURE
-- Thống kê doanh số bán hàng theo của từng sản phẩm theo tháng
GO
CREATE PROC DSSanPhamTheoThang @Thang int, @Nam int
AS
BEGIN
	select B.TenSP, sum(A.SoLuong) tongSL, sum(A.TongTien) tongTien, MONTH(C.NgayBan) Thang, YEAR(C.NgayBan) Nam from CTHOADON A inner join SANPHAM B on A.MaSP = B.MaSP 
	inner join HOADON C on A.MaHD = C.MaHD group by B.TenSP, MONTH(C.NgayBan), YEAR(C.NgayBan) having MONTH(C.NgayBan) = @Thang  and YEAR(C.NgayBan) = @Nam
END 
exec DSSanPhamTheoThang 01, 2022
-- Thống kê doanh số sản phẩm theo năm
GO
CREATE PROC DSSanPhamTheoNam @Nam int
AS
BEGIN
	select B.TenSP,  sum(A.SoLuong) tongSL, sum(A.TongTien) tongTien, MONTH(C.NgayBan) as Thang, YEAR(C.NgayBan) as Nam from CTHOADON A inner join SANPHAM B on A.MaSP = B.MaSP 
	inner join HOADON C on A.MaHD = C.MaHD group by B.TenSP, MONTH(C.NgayBan), YEAR(C.NgayBan) having YEAR(C.NgayBan) = @Nam order by Thang, Nam asc 
END
exec DSSanPhamTheoNam 2022
-- Tim hoa don chi tiet theo ma hoa don
GO
CREATE PROC CTHoaDonTheoMaHoaDon @MaHD varchar(10)
AS
BEGIN
	select b.TenSP, a.SoLuong, b.Gia, a.TrangThai, a.TongTien from CTHOADON a inner join SANPHAM b on a.MaSP = b.MaSP 
	group by a.MaHD, b.TenSP, a.SoLuong, b.Gia, a.TrangThai, a.TongTien having MaHD = @MaHD
END
exec CTHoaDonTheoMaHoaDon 'HD1124003'
-- Thống kế doanh số bán hàng của cả năm
GO
CREATE PROC DoanhSoTheoNam @Nam int
AS
BEGIN
	select sum(a.TongTien) TongTien, MONTH(b.NgayBan) Thang, YEAR(b.NgayBan) Nam from CTHOADON a inner join HOADON b on a.MaHD = b.MaHD 
	group by MONTH(b.NgayBan), YEAR(b.NgayBan) having YEAR(b.NgayBan) = @Nam
END
exec DoanhSoTheoNam 2022
drop proc DoanhSoTheoNam
-- CAU LENH TAO TRIGGER
-- Cập nhật số lượng sản phẩm trong kho
GO
CREATE TRIGGER tr_OderHoaDon on CTHOADON AFTER INSERT
AS
BEGIN
	update SANPHAM set SoLuongSanPham = SoLuongSanPham - (select SoLuong from inserted where MaSP = SANPHAM.MaSP) 
	from SANPHAM join inserted on SANPHAM.MaSP = inserted.MaSP
END
-- Cập nhật trang thái sản phẩm trong kho
GO
CREATE TRIGGER tr_TrangThaiSanPham on SANPHAM AFTER UPDATE AS
BEGIN
	declare @maSP varchar(10)
	set @maSP = (select MaSP from inserted)	
	if ((select SoLuongSanPham from inserted)=0)
		begin
			update SANPHAM set TrangThai = N'hết hàng' where MaSP = @maSP
		end
	else
		begin
			update SANPHAM set TrangThai = N'Còn hàng' where MaSP = @maSP
		end
END
----------------------------------------------------------------- CODE TRUY VẤN ----------------------------------------------------------------------------------
GO
CREATE TRIGGER tr_SoLuongSanPham on SANPHAM AFTER UPDATE AS
BEGIN
	declare @maSP varchar(10)
	set @maSP = (select MaSP from inserted)	
	update SANPHAM set SoLuongSanPham = SoLuongSanPham + (select SoLuongSanPham from inserted where MaSP = @maSP) where MaSP = @maSP
END
---CAU LENH TRUY VAN SQL SERVER
select * from NHANVIEN where MaNV = 'NV02'
update NHANVIEN set TenNV = N'Trần Thái Bảo', SDT = '075974644', MatKhau = '789', ChucVu = 0, Email = 'thaibao04@gmail.com' where MaNV = 'NV03'
delete from NHANVIEN where MaNV = ?
select * from NHANVIEN
select * from GIAMGIA where MaGG = 'GG02'
select * from GIAMGIA where NgayBD = '2022-01-01' and NgayKT = '2022-01-06'
select * from GIAMGIA
update GIAMGIA set TenGG = ?, DieuKien = ?, Giatri = ?, NgayBD = ?, NgayKT = ?, MaNV = ? where MaGG = ?
delete from GIAMGIA where MaGG = ?
select * from GIAMGIA where DieuKien between '80000' and '100000'
select * from CTHOADON
select * from KHACHHANG
update KHACHHANG set TenKH = ?, SDT = ?, Diem = ? where MaKH = ?
delete from KHACHHANG where MaKH = ?
select * from KHACHHANG where MaKH = 'MKH01'
select * from KHACHHANG where TenKH like ?
select HOADON.MaHD, CTHOADON.MaHD , HOADON.MaKH, HOADON.MaNV, HOADON.NgayBan, CTHOADON.MaSP, CTHOADON.SoLuong, CTHOADON.TongTien, CTHOADON.TrangThai 
from HOADON inner join CTHOADON on HOADON.MaHD = CTHOADON.MaHD
select CTHOADON.MaSP, sum(CTHOADON.SoLuong) tongSL, sum(CTHOADON.TongTien) caonhat 
from HOADON inner join CTHOADON on HOADON.MaHD = CTHOADON.MaHD group by CTHOADON.MaSP
having CTHOADON.MaSP = 'BK01'
delete from HOADON where MaHD = 'HD04'
select * from CTHOADON
select MaHD , sum(SoLuong) tongSL,sum(TongTien) tongTien from CTHOADON where MaHD = 'HD02' group by MaHD
-- Tim doanh so theo thang
select a.MaHD, sum(b.SoLuong) tongSL, sum(b.TongTien) tongTien, Month(a.NgayBan) Thang, YEAR(a.NgayBan) Nam from HOADON a inner join CTHOADON b on a.MaHD = b.MaHD 
group by a.MaHD
having MONTH(a.NgayBan) = 01
-- Tim tong so luong va tong 
select MaSP, sum(SoLuong) tongSL, sum(TongTien) tongTien from CTHOADON group by MaSP having MaSP = 'BK01'
select * from HOADON
select * from CTHOADON
-- thong ke san pham theo thang
select B.TenSP, sum(A.SoLuong), sum(A.TongTien), MONTH(C.NgayBan), YEAR(C.NgayBan) from CTHOADON A inner join SANPHAM B on A.MaSP = B.MaSP 
inner join HOADON C on A.MaHD = C.MaHD group by B.TenSP, MONTH(C.NgayBan), YEAR(C.NgayBan) having MONTH(C.NgayBan) = 01 and YEAR(C.NgayBan) = 2022
-- Thong ke san pham theo nam
select B.TenSP, sum(A.TongTien) tongTien, MONTH(C.NgayBan) as Thang, YEAR(C.NgayBan) as Nam from CTHOADON A inner join SANPHAM B on A.MaSP = B.MaSP 
inner join HOADON C on A.MaHD = C.MaHD group by B.TenSP, MONTH(C.NgayBan), YEAR(C.NgayBan) having YEAR(C.NgayBan) = 2022 order by Thang, Nam asc 
-- show Year from HOADON
select distinct YEAR(HOADON.NgayBan) Nam from HOADON order by Nam desc
-- show mont from HOADON
select distinct month(HOADON.NgayBan) Thang from HOADON order by Thang asc
-- Tinh phan tram doanh thu cua san pham
select b.TenSP, sum(a.TongTien) tongTien, MONTH(c.NgayBan) Thang, YEAR(c.NgayBan) Nam from CTHOADON a inner join SANPHAM b on a.MaSP = b.MaSP inner join HOADON c on a.MaHD = c.MaHD 
group by b.TenSP, MONTH(c.NgayBan), YEAR(c.NgayBan)
-- show hoa don
select * from CTHOADON where MaHD = 'HD1124003'
select b.TenSP, a.SoLuong, b.Gia, a.TrangThai, a.TongTien from CTHOADON a inner join SANPHAM b on a.MaSP = b.MaSP 
group by a.MaHD, b.TenSP, a.SoLuong, b.Gia, a.TrangThai, a.TongTien having MaHD = 'HD1124003'
select * from HOADON
select * from NHANVIEN
select * from CTHOADON
select * from SANPHAM
update SANPHAM set TrangThai = N'Còn hàng' where MaSP = 'TS03'
update SANPHAM set SoLuongSanPham = 10 where MaSP = 'BK01'  
delete HOADON where MaHD = 'HD1130001'
INSERT INTO HOADON VALUES('HD1126003', '2022-11-26', 'MKH01', 'NV01');
INSERT INTO CTHOADON VALUES('HD1126003', 'BK01', '2', '27000',N'Đã Thanh Toán', '40000');
INSERT INTO CTHOADON VALUES('HD1126003', 'KT03', '5', '15000',N'Đã Thanh Toán', '75000');
-- Thong ke doanh so theo thang
select sum(a.TongTien) TongTien, MONTH(b.NgayBan) Thang, YEAR(b.NgayBan) Nam from CTHOADON a inner join HOADON b on a.MaHD = b.MaHD 
group by MONTH(b.NgayBan), YEAR(b.NgayBan) having YEAR(b.NgayBan) = 2022
-- tim theo khoang nam
select * from GIAMGIA
select * from NHANVIEN
select * from LOAISANPHAM
select * from HOADON where MaHD like 'HD03'
delete from LOAISANPHAM where MaLoaiSP = 'AC01'
INSERT INTO SANPHAM VALUES('NL01', N'nuoc loc', '5000', N'Còn Hàng', 'hinh1.jpg', 'DA01', 30);
