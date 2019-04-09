package Ass2;

    public class Student{
        public String name;

        public Student(String name){
            this.name = name;
        }
        public static void main(String []args){
            Student s = new Student("Mark");
            System.out.println(s.name);
//ket qua in ra Mark
        }
    }

