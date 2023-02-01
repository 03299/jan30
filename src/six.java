public class six {
    public static void main(String args[]){
        String s="LowerCaseLetter";
        char c[]=s.toCharArray();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                int tmp=c[i]-32;//
                char o=(char)tmp;
                System.out.print(o);
            }else{
                System.out.print(c[i]);
            }
        }
    }
}
