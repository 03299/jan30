import java.util.Scanner;
public class three {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=new String();
        s=sc.nextLine();
        char a[]=s.toCharArray();
        int sum=0;
        for(int i=0; i<a.length; i++){
            if(a[i]>=48 && a[i]<=57){


                System.out.println(a[i]);
                sum=sum+(a[i]-48);
            }
        }
        System.out.println(sum);
    }
}
