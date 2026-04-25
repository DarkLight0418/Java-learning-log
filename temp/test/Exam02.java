package test;

public class Exam02 { 
    public static void main(String[] args) { 
        Movie m1 = new Movie("바람과 함께 사라지다", 1939, "3시간 53분"); 
        Movie m2 = new Movie("대부", 1973, "2시간 57분"); 
         
        System.out.println(m1); 
        System.out.println(m2); 
        System.out.println(m1.getTitle() + (m1.isLongerThan(m2) ? " > " : " < ") +  
m2.getTitle()); 
    } 
} 