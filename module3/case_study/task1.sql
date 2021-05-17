create database case_study;
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
create table nhan_vien
(
id_nhan_vien int primary key auto_increment,
id_trinh_do_nhan_vien int,
id_vi_tri_lam_viec int,
id_bo_phan_nhan_vien int,
ten_nhan_vien varchar(50),
ngay_sinh date,
luong bigint,
so_CMND int,
so_DT varchar(50),
email varchar(50),
dia_chi varchar(50),
foreign key (id_trinh_do_nhan_vien) references trinh_do_nhan_vien(id_trinh_do_nhan_vien),
foreign key (id_vi_tri_lam_viec) references vi_tri_lam_viec(id_vi_tri_lam_viec),
foreign key (id_bo_phan_nhan_vien) references bo_phan_nhan_vien(id_bo_phan_nhan_vien)
on DELETE CASCADE
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
so_DT varchar(50),
email varchar(50),
dia_chi varchar(50),
foreign key(id_loai_khach) references loai_khach(id_loai_khach)
on DELETE CASCADE
);
create table loai_dich_vu
(
id_loai_dich_vu int primary key auto_increment,
loai_dich_vu varchar(50)
);
create table kieu_thue
(
id_kieu_thue int primary key auto_increment,
kieu_thue varchar(50),
gia bigint
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
so_tang int,
trang_thai varchar(50),
foreign key (id_loai_dich_vu) references loai_dich_vu(id_loai_dich_vu),
foreign key (id_kieu_thue) references kieu_thue(id_kieu_thue)
on delete CASCADE
);
create table hop_dong
(
id_hop_dong int primary key auto_increment,
id_khach_hang int,
id_nhan_vien int,
id_dich_vu int,
ngay_lam_hop_dong date,
ngay_ket_thuc date,
so_tien_coc_truoc double,
tong_tien_thanh_toan double,
foreign key (id_khach_hang) references khach_hang(id_khach_hang),
foreign key (id_nhan_vien) references nhan_vien(id_nhan_vien),
foreign key (id_dich_vu) references dich_vu(id_dich_vu)
on delete CASCADE
);
create table dich_vu_di_kem
(
id_dich_vu_di_kem int primary key auto_increment,
ten_dich_vu_di_kem varchar(50),
gia bigint,
don_vi int,
trang_thai varchar(50)
);
create table hop_dong_chi_tiet
(
id_hop_dong_chi_tiet int primary key auto_increment,
id_dich_vu_di_kem int,
id_hop_dong int,
so_luong int,
foreign key (id_dich_vu_di_kem) references dich_vu_di_kem(id_dich_vu_di_kem),
foreign key (id_hop_dong) references hop_dong(id_hop_dong)
on delete CASCADE
);


insert into vi_tri_lam_viec (vi_tri) 
values("Lễ Tân"),
("Phục Vụ"),
("Chuyên Viên"),
("Giám Sát"),
("Giám Đốc");

insert into trinh_do_nhan_vien (trinh_do)
values("Trung Cấp"),
("Cao Đẳng"),
("Đại Học"),
("Sau Đại Học");

insert into bo_phan_nhan_vien (bo_phan) 
values("Sale – Marketing"),
("Hành Chính"),
("Phục Vụ"),
("Quản Lý");

insert into nhan_vien(ten_nhan_vien,id_vi_tri_lam_viec,id_trinh_do_nhan_vien,id_bo_phan_nhan_vien,ngay_sinh,so_CMND,luong,so_DT,email,dia_chi)
values("Đoàn Minh Đức",5,4,4,"1995-06-05","090909090","50000000","09699999999","ducdoan@gmail.com","Dương Thưởng"),
("Đặng Anh Toàn",4,3,4,"1993-07-20","012345678","30000000","0988888888","toandang@gmail.com","Chợ Cồn"),
("Nguyễn Đức Minh",2,2,3,"1997-08-25","545454545","8000000","0977777777","ducminh@gmail.com","Quảng Nam"),
("Nguyễn Anh Tấn",3,3,2,"1980-04-15","365365365","20000000","0966666666","anhtan@gmail.com","Hòa Khánh"),
("Trần Như Tâm",3,3,2,"1985-07-05","656565656","20000000","0955555555","nhutam@gmail.com","Hòa Khánh"),
("Hoàng Thị Diệu Thúy",1,2,1,"1996-08-12","787878787","10000000","0944444444","dieuthuy@gmail.com","Sơn Trà"),
("Trần Anh Tú",5,4,4,"1995-06-05","090909090","50000000","09699999999","ducdoan@gmail.com","Dương Thưởng");

insert into loai_khach(ten_loai_khach_hang)
values("Diamond"),
("Platinium"),
("Gold"),
("Silver"),
("Member");

insert into khach_hang(id_loai_khach,ten_khach_hang,ngay_sinh,so_CMND,so_DT,email,dia_chi)
values(1,"Nguyễn Văn Tèo","1890-05-25","030604050","0936363636","vanteo@gmail.com","Phan Huy Ích"),
(1,"Trần Nguyên Vũ","1996-07-15","036587452","0966121451","nguyenvu@gmail.com","Đà Nẵng"),
(2,"Nguyễn Ngọc Lân","1991-08-26","052458755","0978458784","lannguyen@gmail.com","Quảng Trị"),
(3,"Hồ Mậu Tùng","1988-12-22","065452547","0983214512","tungho@gmail.com","Bành Văn Trân"),
(4,"Lê Văn Minh","1978-08-10","012132102","0931232121","minhvan@gmail.com","Hải Phòng"),
(1,"Huỳnh Văn Tý","1956-01-15","565423653","0933123123","tyvan@gmail.com","Nha Trang"),
(1,"Huỳnh Vũ Võ","1990-01-16","0530303542","0933123321","vuvo@gmail.com","Vinh"),
(1,"Trần Tam Khúc","1990-01-16","0530303542","0933123321","vuvo@gmail.com","Quảng Ngãi"),
(1,"Huỳnh Văn Tý","1986-02-20","527894527","0975487878","tyvanhuynh@gmail.com","Vinh");


insert into kieu_thue(kieu_thue,gia)
values("Theo Năm","20000000"),
("Theo Tháng","20000000"),
("Theo Ngày","1000000"),
("Theo Giờ","200000");

insert into loai_dich_vu(loai_dich_vu)
values("Cho Thuê Ngắn Hạn"),
("Cho Thuê Dài Hạn");

insert into dich_vu(ten_dich_vu,dien_tich_su_dung,so_tang,so_nguoi_toi_da,chi_phi_thue,id_kieu_thue,id_loai_dich_vu,trang_thai)
values("Villa001",500,5,"20","30000000",3,2,"Trống"),
("Villa002",500,5,"20","25000000",2,2,"Đã Thuê"),
("House001",200,"3","10","10000000",3,1,"Trống"),
("House002",150,"3","10","8000000",2,2,"Trống"),
("Room001",80,"1","2","2000000",3,1,"Đã Thuê"),
("Room002",100,"1","2","500000",4,1,"Trống");
 
insert into hop_dong(id_nhan_vien,id_khach_hang,id_dich_vu,ngay_lam_hop_dong,ngay_ket_thuc,so_tien_coc_truoc)
values(1,1,1,"2021/12/05","2021/12/06","500000"),
(2,2,2,"2021/12/03","2021/12/10","1000000"),
(3,3,3,"2019/12/04","2019/12/07","500000"),
(4,1,3,"2019/12/04","2019/12/07","500000"),
(3,1,4,"2018/07/14","2018/07/17","1000000"),
(2,3,2,"2019/10/07","2019/10/10","500000"),
(3,4,1,"2018/09/15","2018/09/20","500000"),
(3,8,1,"2019/03/15","2019/03/20","1000000"),
(2,7,2,"2019/05/20","2019/05/21","500000"),
(1,5,2,"2015/03/15","2015/03/20","500000")
;

insert into dich_vu_di_kem(ten_dich_vu_di_kem,gia,don_vi,trang_thai)
values("Massage","200000","1","Khả Dụng"),
("Karaoke","80000","1","Khả Dụng"),
("Thức Ăn","100000","1","Khả Dụng"),
("Nước Uống","50000","1","Khả Dụng"),
("Thuê Xe","500000","1","Khả Dụng");
insert into hop_dong_chi_tiet(id_hop_dong,id_dich_vu_di_kem,so_luong)
values(1,1,2),
(2,5,1),
(3,3,5),
(4,2,1),
(5,3,2),
(6,1,3),
(7,2,1),
(8,1,2),
(9,3,2),
(10,2,1)
;


