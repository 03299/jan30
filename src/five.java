public class five {
    public static void main(String args[]){
        String a="11000";
        //char a[]=s.toCharArray();
        int start=0;
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)=='1'){
                start=i;//1
                break;
            }
        }
        int end=0;
        for(int i=a.length()-1; i>0; i--){
            if(a.charAt(i)=='1'){//6
                end=i;//7
                break;
            }
        }
        for(int i=start; i<=end; i++){
            if(a.charAt(i)=='0'){
                System.out.println("No");
                break;
            }
        }

    }
}
