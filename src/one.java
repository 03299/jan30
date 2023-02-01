public class one {
    public static void main(String args[]){
        //angel==angle
        char s1[]={'a','n','g','e','l'};
        char s2[]={'a','n','g','l','e'};
        for(int i=0; i<s1.length; i++){
            for(int j=i+1; j<s1.length; j++) {
                if (s1[i] > s1[j]) {
                    char temp=s1[i];
                    s1[i]=s1[j];
                    s1[j]=temp;
                }
            }
        }
        System.out.println(s1);
        for(int i=0; i<s2.length; i++){
            for(int j=i+1; j<s2.length; j++) {
                if (s2[i] > s2[j]) {
                    char temp=s2[i];
                    s2[i]=s2[j];
                    s2[j]=temp;
                }
            }
        }
        boolean flag=true;
        System.out.println(s2);
        for(int i=0; i<s1.length; i++) {
            if (s1[i]!=s2[i]) {
                flag=false;
            }
        }
        if(flag==true){
            System.out.println("Yes");
        }
    }
}
