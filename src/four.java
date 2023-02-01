public class four {
    public static void main(String args[]){
        String s1="computer";
        String s2="cat";
        char a[]=s1.toCharArray();
        char b[]=s2.toCharArray();
        for(int i=0; i<s1.length(); i++){
            int flag=1;
            for(int j=0; j<s2.length(); j++){
                if(a[i]==b[j]){
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                System.out.println(a[i]);
            }
        }
    }
}
