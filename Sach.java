package quanlisanpham;
import java.util.Scanner;

public class Sach {
private String maSach, Tensach;
    private double donGia;
    private int soLuong;
    Scanner scanner = new Scanner(System.in);

    public Sach() {
        super();
    }

    public Sach(String maSach, String Tensach, double donGia, int soLuong) {
        super();
        this.maSach = maSach;
        this.Tensach = Tensach;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTensach() {
        return Tensach;
    }

    public void setTensach(String nhaXuatBan) {
        this.Tensach = nhaXuatBan;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void nhapSach() {
        System.out.print("Nhập mã sách: ");
        maSach = scanner.nextLine();
        System.out.print("Nhập tên sachs: ");
        Tensach = scanner.nextLine();
        System.out.print("Nhập đơn giá: ");
        donGia = scanner.nextDouble();
        System.out.print("Nhập số lượng: ");
        soLuong = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Mã sách: " + this.maSach + ", tên sach: " + this.Tensach + ", đơn giá: " +
                this.donGia + ", số lượng: " + this.soLuong;
    }
}
