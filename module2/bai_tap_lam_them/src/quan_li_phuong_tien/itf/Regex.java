package quan_li_phuong_tien.itf;

public interface Regex {
    String SO_XE_TAI="^[0-9]{2}C-[0-9]{3}.[0-9]{2}$";
    String SO_XE_OTO="^[0-9]{2}[AB]{1}-[0-9]{3}.[0-9]{2}$";
    String SO_XE_MAY="^[0-9]{2}-[A-Z]{1}[A-Z0-9]{1}-[0-9]{3}.[0-9]{2}$";
    String HANG_SAN_XUAT="^[A-Z]{1}[a-z]{1,}$";
    String NAM_SAN_XUAT="^[0-9]{4}$";
    String CHU_SO_HUU="[A-ZẮẰẲẴẶĂẤẦẨẪẬÂÁÀÃẢẠĐẾỀỂỄỆÊÉÈẺẼẸÍÌỈĨỊỐỒỔỖỘÔỚỜỞỠỢƠÓÒÕỎỌỨỪỬỮỰƯÚÙỦŨỤÝỲỶỸỴ][a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]+([ ][A-ZẮẰẲẴẶĂẤẦẨẪẬÂÁÀÃẢẠĐẾỀỂỄỆÊÉÈẺẼẸÍÌỈĨỊỐỒỔỖỘÔỚỜỞỠỢƠÓÒÕỎỌỨỪỬỮỰƯÚÙỦŨỤÝỲỶỸỴ][a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]+)+";
    String TAI_TRONG="^[0-9]{1,}$";
    String KIEU_XE="^[A-Z]{1}[a-z//s]$";
    String SO_CHO_NGOI="^[0-9]{1,2}$";
    String CONG_XUAT="^[0-9]{2,3}$";
    String XE_TAI_CSV="E:\\C0221G1-nguyenducminh1\\C0221G1-nguyenducminh\\module2\\bai_tap_lam_them\\src\\quan_li_phuong_tien\\filetext\\xeTai.csv";
    String XE_OTO_CSV="E:\\C0221G1-nguyenducminh1\\C0221G1-nguyenducminh\\module2\\bai_tap_lam_them\\src\\quan_li_phuong_tien\\filetext\\Oto.csv";
    String XE_MAY_CSV="E:\\C0221G1-nguyenducminh1\\C0221G1-nguyenducminh\\module2\\bai_tap_lam_them\\src\\quan_li_phuong_tien\\filetext\\xeMay.csv";
}
