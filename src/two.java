import java.util.Scanner;
public class two {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=new String();
        s=sc.next();
        char a[]=s.toCharArray();
        System.out.println(a);
        int l=0,r=s.length()-1;
        while(l<=r){
           // s.charAt(l)=s.charAt(r);
            char tmp=a[l];
            a[l]=a[r];
            a[r]=tmp;
            l++;
            r--;
        }

        System.out.println(a);
    }

}
