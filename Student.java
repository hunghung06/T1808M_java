package com;

public class Student {
    private String hoTen, lop, tuoi, masinhvien;
    private double diemToan, diemLy, diemHoa;

    // tạo 1 phương thức nhập để nhập thông tin của 1 sinh viên
    public void nhap() {
        Scanner scanner = new Scanner(System.in);   // scanner là biến cục bộ
        private String hoTen, lop, tuoi, masinhvien;
        private double diemToan, diemLy, diemHoa;

        // tạo 1 phương thức nhập để nhập thông tin của 1 sinh viên
        public void nhap() {
            Scanner scanner = new Scanner(System.in);   // scanner là biến cục bộ
            System.out.println("Nhập họ tên sinh viên: ");
            hoTen = scanner.nextLine();
            System.out.println("Nhập ma sinh viên: ");
            masinhvien = scanner.nextLine();
            System.out.println("Nhập tuoi sinh viên: ");
            tuoi = scanner.nextLine();
            System.out.println("Nhập lớp: ");
            lop = scanner.nextLine();
            System.out.println("Nhập điểm toán: ");
            diemToan = scanner.nextDouble();
            System.out.println("Nhập điểm lý: ");
            diemLy = scanner.nextDouble();
            System.out.println("Nhập điểm hóa: ");
            diemHoa = scanner.nextDouble();
        }

        // phương thức tính điểm trung bình
        // phương thức này có 3 tham số truyền vào là a, b, c có kiểu double
        // và có kiểu trả về là double
        // 3 tham số này tượng trưng cho điểm toán, lý, hóa của sinh viên
        public double tinhDiemTrungBinh(double a, double b, double c) {
            return (a + b + c) / 3;
        }

        // phương thức xếp loại học lực
        // phương thức này có tham số truyền vào là điểm trung bình của sinh viên đó
        // và có kiểu trả về là String
        public String xemxethocbongc(double diemTB) {
            if (diemTB >= 8 && diemTB <= 10) {
                return "Duoc hoc bong";
            }

            if (diemTB >= 0.0 && diemTB < 8) {
                return "Khong duoc hoc bong";
            }
            return "Nhập sai!";
        }

        public static void main(String[] args) {
            // tạo 1 đối tượng của Student
            Student student = new Student();

            // nhập thông tin sinh viên
            student.nhap();

            // tính điểm trung bình 3 môn
            System.out.println("Điểm trung bình 3 môn = " + student.tinhDiemTrungBinh(
                    student.diemToan, student.diemLy, student.diemHoa));

            // hiển thị kết quả xếp loại
            System.out.println(student.xemxethocbong(
                    student.tinhDiemTrungBinh(student.diemToan, student.diemLy, student.diemHoa)));
        }

    }
