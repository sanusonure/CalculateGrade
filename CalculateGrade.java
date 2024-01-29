import java.util.*;
class CalculateGrade
{
    
    public static void  main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int amt,total=0,sub;
        double avg;
        System.out.println(" Enter the amount of subjects : ");
        amt=sc.nextInt();
        
        for(int i=1;i<=amt;i++)
        {
            System.out.println(" Enter the marks for Subject "+i+" Out Of 100 ");
            sub=sc.nextInt();
            total+=sub;
        }
        avg=total/amt;
        int x=(int)avg/10;
        System.out.println(" Sum of Marks : "+total);
        System.out.println(" Average : "+avg+"%");
        System.out.printf(" Grade : ");
        switch(x)
        {
            case 10:
                System.out.println("A+");
                break;
            case 9:
            System.out.println("A");
            break;   
            case 8:
            System.out.println("B+");
            break;   
            case 7:
            System.out.println( "B");
            break;  
            case 6:
            System.out.println( "C");
            break;
            case 5:
            System.out.println( "D");
            break;
            case 4:
            System.out.println( "F"); 
            break; 
        }
        


    }
}