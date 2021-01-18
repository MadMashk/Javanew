import java.util.Scanner;
public class Task5 {
    public static void run(){
        int number;
        int n=0;
        int count=0;
        Scanner input= new Scanner(System.in);
        System.out.println("input n");
        n=input.nextInt();
        while (n>100){
            System.out.println("sequence shouldn't exceed 100");
            n=input.nextInt();
        }
        for (int i=0; i<n; i++){
            System.out.println("input number №"+(i+1));
            number=input.nextInt();
            if(polynomial(number))
                count++;
        }
        System.out.println("Count of the polynomial numbers "+count);
    }
 public static boolean polynomial (int number) { //polynomial check
     int copy=number;
     int total=0;
     int count=0;
     while (copy>0){
         copy/=10;
         total++;
     }
     int Arr[]= new int[total];
     for (int i = 1; i <=total ; i++) {
         Arr[i-1]=(int)(number%Math.pow(10,i)/Math.pow(10,i-1));
     }
     for(int i=0;i<total/2;i++){
         if(Arr[i]==Arr[total-i-1])
             count++;
     }
     if(count==total/2)
         return true;
     else return false;
 }
}