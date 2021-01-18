import javax.sound.midi.Soundbank;
import java.util.*;
public class Task6 {
    static void run(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int numbOfElements=scanner.nextInt();
        System.out.println("Enter max weight of bag");
        int maxBag=scanner.nextInt();
        int[] cost=new int[numbOfElements];
        int[] wei=new int[numbOfElements];
        int bestWay=0,maxWei=0;
        int bestCost=0;
        for(int i=0;i<numbOfElements;i++){
            System.out.println("enter weight");
            cost[i]=scanner.nextInt();
            wei[i]=scanner.nextInt();
            if(bestWay<cost[i]/wei[i])
                bestWay=i;
            if(maxWei<wei[i])
                bestWay=wei[i];

        }
        while(maxBag>maxWei){
            bestCost+=cost[bestWay];
            maxBag-=wei[bestWay];
        }
        for(int i=0;i<numbOfElements;i++){
            int x=maxBag;
            while(x>0&&!(x-wei[i]<0)){
                bestCost+=cost[i];
                x-=wei[i];
            }
            for(int j=0;j<numbOfElements;j++){
                while(x>0&&!(x-wei[j]<0)){
                    bestCost+=cost[j];
                    x-=wei[j];
                }

            }
        }
        System.out.println("The best cost is - "+bestCost);
    }
}
