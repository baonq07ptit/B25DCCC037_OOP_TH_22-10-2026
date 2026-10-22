public class DonHang {
    private String tenKhach;
    private SanPham sanPham;
    private int soLuongMua;

    public DonHang(String tenKhach, SanPham sanPham, int soLuongMua) {
        this.tenKhach = tenKhach;
        this.sanPham = sanPham;
        setSoLuongMua(soLuongMua);
    }

    public String getTenKhach() {
        return tenKhach;
    }

    public void setTenKhach(String tenKhach) {
        this.tenKhach = tenKhach;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    public int getSoLuongMua() {
        return soLuongMua;
    }

    public void setSoLuongMua(int soLuongMua) {

        if (soLuongMua > 0) {
            this.soLuongMua = soLuongMua;
        } else {
            this.soLuongMua = 1;
        }

    }

    public double tinhThanhTien() {
        if (sanPham == null || sanPham.getDonGia() == null) {
            return 0;
        }
        double tong = sanPham.getDonGia() * soLuongMua;

        if (soLuongMua >= 5) {
            tong = tong * 0.9;

        }
        return tong;
    }

    @Override
    public String toString() {
        String tenSP = (sanPham != null) ? sanPham.getTenSanPham() : "";
        String noteGiamGia = (soLuongMua >= 5) ? "\n       (đã giảm giá 10%)" : "";

//        return "DonHang{" +
//                "tenKhach='" + tenKhach + '\'' +
//                ", sanPham=" + sanPham +
//                ", soLuongMua=" + soLuongMua +
//                '}';
        return String.format("%-6s %-16s %-3d %,10.0f%s",
                tenKhach, tenSP, soLuongMua, tinhThanhTien(), noteGiamGia);
    }
}
