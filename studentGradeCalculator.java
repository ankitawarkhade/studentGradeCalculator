import java.util.*;
public class studentGradeCalculator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total number of subject:");
        int totalSub=sc.nextInt();
       int  obtainMarks=0;
       int totalMarks=100*totalSub;
        for(int i=1;i<=totalSub;i++){
            System.out.println("Enter the marks of subject "+i);
            int subMarks=sc.nextInt();
            obtainMarks=obtainMarks+subMarks;
        }
        System.out.println("you got total marks  :"+obtainMarks);
        int avgMarks=(obtainMarks/totalSub);
        System.out.println("you got average marks : "+avgMarks);
        float percentage=((obtainMarks*100)/totalMarks);
        System.out.println("you got percentage :"+percentage);
        if(percentage<40){
            System.out.println("sorry you don not have clear the exam");
        }
        else if(percentage<50){
            System.out.println("congratulation ! you got the grade EE");
        }else if(percentage<60){
            System.out.println("congratulation ! you got the grade DD");
        }else if(percentage<70){
            System.out.println("congratulation ! you got the grade CC");
        }else if(percentage<80){
            System.out.println("congratulation ! you got the grade BB");
        }else if(percentage<90){
            System.out.println("congratulation ! you got the grade AA");
        }else if(percentage<100){
            System.out.println("congratulation ! you got the grade Ex");
        }





        

    }

}