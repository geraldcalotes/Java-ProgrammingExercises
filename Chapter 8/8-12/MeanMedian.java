// Write your code here
import java.util.Arrays;
import java.util.Scanner;

public class MeanMedian{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] inputs = new int[9];

        for(int i=0;i<9;i++){
            System.out.printf("Enter number %d >> ",i+1);
            inputs[i]=in.nextInt();
        }
        System.out.print("You entered : ");
        for(int i=0;i<9;i++){
            if(i==8){
                System.out.printf("%d%n",inputs[i]);
            }else{
                System.out.printf("%d, ",inputs[i]);
            }
        }
        Arrays.sort(inputs);
        double mean = Arrays.stream(inputs).asDoubleStream().sum() / 9;
        int median = inputs[4];
        System.out.printf("The mean is %.14f and the median is %d",mean,median);
        in.close();
    }
}

