public class string {

    
public static void main(String[] args) {
    String str="Hello123World54";
    int res=0;
    for(int i=0;i<str.length();i++){
        char ch= str.charAt(i);
        if(ch>='0' && ch<='9'){
            int a=ch-'0';
            res=res*10+a;
        }
    }
    System.out.println(res);
}

}
