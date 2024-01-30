public class Student{
    int Admno;
    String name;
        void data()
        {
            Admno = 9;
            name = "Rimshot";
            System.out.println(Admno);
            System.out.println(name);
        }
        public static void main(String args[]){
            Student output = new Student();
            output.data();
    }
}