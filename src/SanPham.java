public class SanPham {
    private String maSanPham;
    private String tenSanPham;
    private Double donGia;       // Đã đổi doiGia -> donGia
    private Integer soLuongTon;

    // Constructor nhận Double và Integer (để chấp nhận null)
    public SanPham(String maSanPham, String tenSanPham, Double donGia, Integer soLuongTon) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.donGia = donGia;
        this.soLuongTon = soLuongTon;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }


    public Double getDonGia() {
        return donGia;
    }

    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }


    public Integer getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(Integer soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    @Override
    public String toString() {
//        return "SanPham{" +
//                "maSanPham='" + maSanPham + '\'' +
//                ", tenSanPham='" + tenSanPham + '\'' +
//                ", donGia=" + donGia +
//                ", soLuongTon=" + soLuongTon +
//                '}';
        return String.format("%-5s %-18s %-10s %s",
                maSanPham,
                tenSanPham,
                (donGia != null ? String.format("%,.0f", donGia).replace(',', '.') : ""),
                (soLuongTon != null ? "tồn " + soLuongTon : ""));
    }


}