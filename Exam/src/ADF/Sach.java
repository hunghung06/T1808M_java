package ADF;
import java.util.Scanner;

public class Sach {

    public String BookID;
    public String Bookname;
    public String Author;
    public Double Price;

    public Sach() {
        super();
    }

    public Sach(String BookID, String Bookname, double Price, String Author) {
        super();
        this.BookID = BookID;
        this.Bookname = Bookname;
        this.Price = Price;
        this.Author = Author;
    }

    public String getMaSach() {
        return BookID;
    }

    public void setMaSach(String maSach) {
        this.BookID = maSach;
    }

    public String getTensach() {
        return BookID;
    }

    public void setTensach(String nhaXuatBan) {
        this.Bookname = nhaXuatBan;
    }

    public double getDonGia() {
        return Price;
    }

    public void setDonGia(double donGia) {
        this.Price = donGia;
    }

    public String gettacgia() {
        return Author;
    }

    public String settacgia(String tacgia) {
        this.Author = tacgia;

    }

    public void nhapSach() {
        System.out.print("Nhập mã sách: ");
        BookID = sca.nextLine();
        System.out.print("Nhập tên sachs: ");
        Bookname = scanner.nextLine();
        System.out.print("Nhập đơn giá: ");
        Price = scanner.nextDouble();
        System.out.print("Nhập tac gia: ");
        Author = scanner.nextInt();
    }
}
