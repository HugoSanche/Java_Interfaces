import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
//Note
//***COMPARABLE***
// int compareTo(T o)
//Compares de Argument with the current instance
//Called from the instance of the class that implements comparable
//Best practice in to have this.compareTo(0)== 0 result in this.equals(o) being true
//***COMPARATOR***
//int compare(T o1, T02)
//compares two arguments of the same tyoe with each other
//Called from an instance of Comparator
//Does not require the class itself to implement Comparator, thought you could also implement it this way

public class Main {
    public static void main(String[] args) {
        Integer five =5;
        Integer[] others={0,5,7,-5,9};
        for (Integer i:others){
            int val=five.compareTo(i);
            System.out.printf("%d %s %d: compareTo=%d%n", five,(val==0 ? "==":(val<0) ? "<":">"),i,val);
        }
        String banana="banana";
        String[] fruits={"pera","banana","apple","BANANA","manzana"};
        for(String f:fruits){
            int val=banana.compareTo(f);
            System.out.printf("%s %s %s: compareTo=%d%n", banana,(val==0 ? "==":(val<0) ? "<":">"),f,val);
        }

        //note.- when compare string compareTo compare int of initial character:
        //example banana (98) > apple (97) == 1 this return
        Arrays.sort(fruits);
        System.out.println(Arrays.toString(fruits));
        System.out.println("A :"+(int)'A'+" "+"a :"+(int)'a');
        System.out.println("B :"+(int)'A'+" "+"b :"+(int)'b');
        System.out.println("P :"+(int)'P'+" "+"p :"+(int)'p');
        Student hugo =new Student("Hugo");
        Student students[] ={new Student("paco"),new Student( "karina"),new Student("veronica"),new Student("lionel")};

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
        System.out.println(hugo.compareTo(new Student("hugo")));

        Comparator<Student> gpaSorter=new StudentGPAComparator();
        Arrays.sort(students,gpaSorter.reversed());//reverse method
        System.out.println(Arrays.toString(students));
    }
}
class StudentGPAComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return (o1.gpa+o1.name).compareTo(o2.gpa+o2.name);
    }
}
 class Student implements Comparable<Student>{
    private static int LAST_ID=1000;
    private static Random random=new Random();
    private int id;
    double gpa;
    String name;

     public Student(String name) {
         this.name = name;
         this.id=LAST_ID++;
         gpa=random.nextDouble(1.0,4.0);
     }

     @Override
     public String toString() {
         return "%d - %s (%.2f)".formatted(id,name,gpa);
     }

     @Override
     public int compareTo(Student o) {
         //return name.compareTo(o.name);
         return Integer.valueOf(id).compareTo(Integer.valueOf(o.id));
     }

//     @Override
//     public int compareTo(Object o) {
//         Student others=(Student) o;
//         return name.compareTo(others.name);
//     }
 }