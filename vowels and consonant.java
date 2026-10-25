import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
         char ch = sc.next().charAt(n);
         if( ch == 'a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='O'){
System.out.println("VOWEL");
    }
    else{
      System.out.println("CONSTANT");
    }
    }
}
