package TamGiac ;
import java.util.Scanner;
public class bacanh{


    int a,b,c;

    double S;

    float C,p;

    Scanner sc;



    public void inputInfo(){

        sc=new Scanner(System.in);

        System.out.println("Nhap cao canh thu 1:");

        a=sc.nextInt();

        System.out.println("Nhap vao canh thu 2: ");

        b=sc.nextInt();

        System.out.println("Nhap vao canh thu 3: ");

        c=sc.nextInt();

        System.out.println("Do dai 3 canh : a= "+a+" b= "+b+" c= "+c);



    }

    public boolean ktTamGiac(){

        if((a+b>c)&&(b+c>a)&&(c+a>b)&&a>0&&b>0&&c>0) return true;

        return false;

    }

    public void tinhChuVi(){

        if(ktTamGiac()==true){

            C=(a+b+c);

            System.out.println("Chu vi tam giac la: "+C);

        }else System.out.println("3 so ban nhap khong tao thanh tam giac!");

    }

    public void tinhDienTich(){



        p=C/2;



        if(ktTamGiac()==true){

            S=Math.sqrt(p*(p-a)*(p-b)*(p-c));

            System.out.println("Dien tich tam giac la: "+S);



        }else{System.out.println("");}

    }



}