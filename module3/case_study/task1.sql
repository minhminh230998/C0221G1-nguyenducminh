create database case_study;

create table nhan_vien
(
id_nhan_vien int primary key auto_increment,
id_trinh_do_nhan_vien int,
id_vi_tri_lam_viec int,
id_bo_phan_nhan_vien int,
ten_nha_vien varchar(50),
ngay_sinh date,
so_CMND int,
so_DT int,
email varchar(50),
trinh_do varchar(50),
foreign key (id_trinh_do_nhan_vien) references trinh_do_nhan_vien(id_trinh_do_nhan_vien),
foreign key (id_vi_tri_lam_viec) references vi_tri_lam_viec(id_vi_tri_lam_viec),
foreign key (id_bo_phan_nhan_vien) references bo_phan_nhan_vien(id_bo_phan_nhan_vien)
);
alter table nhan_vien
drop trinh_do;
create table trinh_do_nhan_vien
(
id_trinh_do_nhan_vien  int primary key auto_increment,
trinh_do varchar(50)
);
create table bo_phan_nhan_vien
(
id_bo_phan_nhan_vien int primary key auto_increment,
bo_phan varchar(100)
);
create table vi_tri_lam_viec
(
id_vi_tri_lam_viec  int primary key auto_increment,
vi_tri varchar(50)
);
create table loai_khach
(
id_loai_khach int primary key auto_increment,
ten_loai_khach_hang varchar(45)
);

create table khach_hang
(
id_khach_hang int primary key auto_increment,
id_loai_khach int,
ten_khach_hang varchar(50),
ngay_sinh date,
so_CMND int,
so_DT int,
email varchar(50),
dia_chi varchar(50),
foreign key(id_loai_khach) references loai_khach(id_loai_khach)
);
create table dich_vu_di_kem
(
id_dich_vu_di_kem int primary key auto_increment,
ten_dich_vu_di_kem varchar(50)
);
create table loai_dich_vu
(
id_loai_dich_vu int primary key auto_increment,
loai_dich_vu varchar(50)
);
create table kieu_thue
(
id_kieu_thue int primary key auto_increment,
kieu_thue varchar(50)
);
create table dich_vu
(
id_dich_vu int primary key auto_increment,
id_loai_dich_vu int,
id_kieu_thue int,
ten_dich_vu varchar(50),
dien_tich_su_dung float,
chi_phi_thue float,
so_nguoi_toi_da int,
kieu_thue varchar(20),
foreign key (id_loai_dich_vu) references loai_dich_vu(id_loai_dich_vu),
foreign key (id_kieu_thue) references kieu_thue(id_kieu_thue)
);
alter table dich_vu
drop kieu_thue;

create table hop_dong
(
id_hop_dong int primary key auto_increment,
id_khach_hang int,
id_nhan_vien int,
id_dich_vu int,
so_hop_dong int,
ngay_bat_dau date,
ngay_ket_thuc date,
so_tien_coc_truoc double,
tong_tien_thanh_toan double,
foreign key (id_khach_hang) references khach_hang(id_khach_hang),
foreign key (id_nhan_vien) references nhan_vien(id_nhan_vien),
foreign key (id_dich_vu) references dich_vu(id_dich_vu)
);
create table hop_dong_chi_tiet
(
id_hop_dong_chi_tiet int primary key auto_increment,
id_dich_vu_di_kem int,
id_hop_dong int,
so_luong int,
foreign key (id_dich_vu_di_kem) references dich_vu_di_kem(id_dich_vu_di_kem),
foreign key (id_hop_dong) references hop_dong(id_hop_dong)
);
insert into trinh_do_nhan_vien (trinh_do)
values('12/12'),
('11/12');
insert into bo_phan_nhan_vien (bo_phan)
values('sale'),
('maketting');
insert into vi_tri_lam_viec (vi_tri)
values('phong sale'),
('phong maketting');
insert into nhan_vien(id_trinh_do_nhan_vien,id_vi_tri_lam_viec,id_bo_phan_nhan_vien,ten_nha_vien,ngay_sinh,so_CMND,so_DT,email)
values(2,1,1,'Nguyễn Văn A','1999/11/11',123456789,01213141,'123@gmail.com'),
(1,2,2,'Nguyễn Văn B','1988/10/11',234561234,23412342,'456@gmail.com');
insert into loai_khach(ten_loai_khach_hang)
values('vip'),('nomal');
insert into khach_hang(id_loai_khach,ten_khach_hang,ngay_sinh,so_CMND,so_DT,email,dia_chi)
values(1,'Nguyễn Thị B','2000/12/12',1234234,12345321,'abc@gmail.com','Quang Nam'),
(2,'Nguyễn Thị C','1998/11/11',1234223,12345521,'abc@gmail.com','Da Nang');
insert into loai_dich_vu(loai_dich_vu)
values('vip'),('nomal');

insert into kieu_thue(kieu_thue)
values('day'),('year');
insert into dich_vu(id_loai_dich_vu,id_kieu_thue,ten_dich_vu,dien_tich_su_dung,chi_phi_thue,so_nguoi_toi_da)
values(1,2,'villa',50.0,1000000,10),
(2,1,'Room',45.5,2000000,15);

insert into hop_dong(id_khach_hang,id_nhan_vien,id_dich_vu,so_hop_dong,ngay_bat_dau,ngay_ket_thuc,so_tien_coc_truoc,tong_tien_thanh_toan)
values(1,2,1,1234,'2020/12/12','2021/1/23',1000000,2000000),
(1,2,1,2345,'2020/11/12','2021/1/23',2000000,4000000);
insert into dich_vu_di_kem(ten_dich_vu_di_kem)
values ('karaoke'),('car');
insert into hop_dong_chi_tiet(id_dich_vu_di_kem,id_hop_dong,so_luong)
values (1,2,10),(2,1,15);
