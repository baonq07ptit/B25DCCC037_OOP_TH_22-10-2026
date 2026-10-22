public class Main {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham("SP01", "Bàn phím cơ", 450000.0, 20);
        SanPham sp2 = new SanPham("SP02", "Chuột không dây", 200000.0, 50);
        SanPham sp3 = new SanPham("SP03", "Tai nghe", null, null);
        sp3.setDonGia(350000.0);
        sp3.setSoLuongTon(10);

        System.out.println("===== DANH SÁCH SẢN PHẨM =====");
        System.out.println(sp1.toString());
        System.out.println(sp2.toString());
        System.out.println(sp3.toString());

        DonHang dh1 = new DonHang("An", sp1, 2);
        DonHang dh2 = new DonHang("Bình", sp2, 5);
        DonHang dh3 = new DonHang("Chi", sp3, 0);

        System.out.println("===== DANH SÁCH ĐƠN HÀNG =====");
        System.out.printf("%-6s %-16s %-3s %-10s\n", "Khách", "Sản phẩm", "SL", "Thành tiền");
        System.out.println(dh1.toString());
        System.out.println(dh2.toString());
        System.out.println(dh3.toString());
    }
}
