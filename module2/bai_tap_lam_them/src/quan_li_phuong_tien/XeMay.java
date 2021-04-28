package quan_li_phuong_tien;

public class XeMay extends PhuongTien{
    private String congXuat;

    public XeMay() {
    }

    public XeMay(String bienKiemSoat, String tenHangSanXuat, String namSanXuat, String chuSoHuu, String congXuat) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.congXuat = congXuat;
    }

    public String getCongXuat() {
        return congXuat;
    }

    public void setCongXuat(String congXuat) {
        this.congXuat = congXuat;
    }

    @Override
    public String toString() {
        return super.toString() +
                "," + congXuat;
    }
}
