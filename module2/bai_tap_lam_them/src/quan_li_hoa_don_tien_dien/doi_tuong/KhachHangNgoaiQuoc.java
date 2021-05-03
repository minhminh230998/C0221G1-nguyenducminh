package quan_li_hoa_don_tien_dien.doi_tuong;

import quan_li_hoa_don_tien_dien.doi_tuong.KhachHang;

public class KhachHangNgoaiQuoc extends KhachHang {
    private String quocTich;

    public KhachHangNgoaiQuoc() {

    }

    public KhachHangNgoaiQuoc(String maKhachHang, String hoTen, String quocTich) {
        super(maKhachHang, hoTen);
        this.quocTich = quocTich;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    @Override
    public String toString() {
        return super.toString()+
                "," + quocTich ;
    }
}


