

import java.util.*;

public class rps {
    public static void main(String[] args) {
        int mych;
        int comch;
        Random r= new Random();
        int mycou=0;
        int comcou=0;

        int i=0;
        while(i<3){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your choice");
            System.out.println("0 for stone");
            System.out.println("1 for paper");
            System.out.println("2 for scissor");

            mych=sc.nextInt();
            System.out.println("My choice:" +mych);


            comch=r.nextInt(3);
            System.out.println("Computer choice:" +comch);

            if(mych==0 && comch==2||mych==1 && comch==0|| mych==2 && comch==1 ){
             mycou++;
            }
           else {
               comcou++;
            }
           i++;
        }
        if(mycou>comcou){
            System.out.println("x:User Win!!");
            System.out.println("My point:" +mycou+  "Computer point:" +comcou);

        }
        if(comcou>mycou){
            System.out.println("x:Computer Wins!!");
            System.out.println("My point:" +mycou+ "Computer point:" +comcou);

        }
        if(mycou==comcou){
            System.out.println("x:* Draw *");
            System.out.println("My point:" +mycou+  "Computer point:" +comcou);

        }
    }
}
