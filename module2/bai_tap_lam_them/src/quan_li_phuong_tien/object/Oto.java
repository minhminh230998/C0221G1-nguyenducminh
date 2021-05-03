package quan_li_phuong_tien.object;

public class Oto extends PhuongTien {
    private String soChoNgoi;
    private String kieuXe;

    public Oto() {
    }

    public Oto(String bienKiemSoat, String tenHangSanXuat, String namSanXuat, String chuSoHuu, String soChoNgoi, String kieuXe) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public String getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(String soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return super.toString()+
                "," + soChoNgoi +
                "," + kieuXe;
    }
}
