package quan_li_hoa_don_tien_dien.menu;

public interface Regex1 {
    String INPUT="^[1-7]{1}&";
    String MA_VIET_NAM="^KHVN-[0-9]{5}$";
    String MA_NUOC_NGOAI="^KHNN-[0-9]{5}$";
    String TEN_KHACH_HANG="[A-ZẮẰẲẴẶĂẤẦẨẪẬÂÁÀÃẢẠĐẾỀỂỄỆÊÉÈẺẼẸÍÌỈĨỊỐỒỔỖỘÔỚỜỞỠỢƠÓÒÕỎỌỨỪỬỮỰƯÚÙỦŨỤÝỲỶỸỴ][a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]+([ ][A-ZẮẰẲẴẶĂẤẦẨẪẬÂÁÀÃẢẠĐẾỀỂỄỆÊÉÈẺẼẸÍÌỈĨỊỐỒỔỖỘÔỚỜỞỠỢƠÓÒÕỎỌỨỪỬỮỰƯÚÙỦŨỤÝỲỶỸỴ][a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]+)+";
    String LOAI_KHACH_HANG="^Sinh hoat|Kinh doanh|San xuat$";
    String DINH_MUC_TIEU_THU="^[0-9]{1,}$";
    String QUOC_TICH="^[A-Z]{1}[a-z]{1,}([ ][A-Z]{1}[a-z]{1,})+";
    String TEXT_KHACH_HANG="E:\\C0221G1-nguyenducminh1\\C0221G1-nguyenducminh\\module2\\bai_tap_lam_them\\src\\quan_li_hoa_don_tien_dien\\fileText\\KhachHang.csv";
}
