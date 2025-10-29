import java.util.Scanner;
public class studentGradeCalculator {
    public static void main(String args[]){

        int minMarks=35,cnt=0,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of subject: ");
        int n=sc.nextInt();
        float subjectMarks[]=new float[n];

        System.out.println("Enter marks of "+n+" Subjects: ");
        i=0;
        while(i<n){
            System.out.println("subject "+(i+1)+" : ");
            float marks=sc.nextFloat();
            if(marks>=0 && marks<=100){
                subjectMarks[i]=marks;
                i++;
            }
            else{
                System.out.println("Enter marks again marks must be between 0 to 100 !!");
            }
        }

        float totalmarks=0;
        for(i=0;i<n;i++){
            totalmarks+=subjectMarks[i];
        }        

        float percentage=(totalmarks/n);

        System.out.println("Total marks obtained "+totalmarks+" out of "+(n*100));
        System.out.printf("Average percentage: %.2f%%%n", percentage);
        System.out.println("Grade obtained:");
        if(percentage >= 75)
            System.out.println("A+");
        else if(percentage >= 80 )
            System.out.println("A");
        else if(percentage >= 70)
            System.out.println("B+");
        else if(percentage >= 60)
            System.out.println("B");
        else if(percentage >= 50)
            System.out.println("C+");
        else if(percentage >= 35)
            System.out.println("C");
        else
            System.out.println("F");

        for(i=0;i<n;i++){
            if(subjectMarks[i]<=minMarks)
                cnt++;
        }
        if(cnt>0)
            System.out.println("Student fail in "+cnt+" subject");

    }
}
