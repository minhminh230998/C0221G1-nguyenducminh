SELECT *
FROM nhan_vien
WHERE ten_nha_vien LIKE "H%" and length(ten_nha_vien)<15 or ten_nha_vien LIKE "%K%"and length(ten_nha_vien)<15 or ten_nha_vien LIKE "%T%"and length(ten_nha_vien)<15 ;
select *
from khach_hang
where (YEAR(CURDATE()) - YEAR(ngay_sinh)>18)and(YEAR(CURDATE()) - YEAR(ngay_sinh)<50) and dia_chi like "Quang Nam";
select count(ten_khach_hang) 
from khach_hang