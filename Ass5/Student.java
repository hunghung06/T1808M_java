package Ass5;
import java.util.Scanner;

public class Student {
    private String lop;
    private Person nguoi;

    public Student() {
        super();
    }

    public Student(String lop, Person nguoi) {
        super();
        this.lop = lop;
        this.nguoi = nguoi;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public Person getNguoi() {
        return nguoi;
    }

    public void setNguoi(Person nguoi) {
        this.nguoi = nguoi;
    }

    public void nhapThongTinHoSo() {
        nguoi = new Person();
        nguoi.nhapThongTin();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập lớp: ");
        lop = scanner.nextLine();
    }

    public void hienThiThongTinHoSo() {
        nguoi.hienThiThongTin();
        System.out.println("Lớp: " + lop);
    }
}

