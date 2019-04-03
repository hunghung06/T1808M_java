package exam;

import java.util.Scanner;
import java.util.Arrays;

    public class Hotel {
        String name;
        String location;
        String ownerName;

        public Hotel() {
        }



        public Hotel(String name, String location, String ownerName) {
            this.name = name;
            this.location = location;
            this.ownerName = ownerName;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getOwnerName() {
            return ownerName;
        }


        public void inputInfo(){
            System.out.println("Nhap ten khach san:");
            Scanner scanner = new Scanner(System.in);
            name = scanner.nextLine();

            System.out.println("Nhap vi tri:");
            location = scanner.nextLine();

            System.out.println("Nhap ten chu so huu:");
            ownerName = scanner.nextLine();

        }

        public  void printInfo(){
            System.out.println("Thong tin khach san:");
            System.out.println(name+" - vi tri:"+location);
        }



        }








