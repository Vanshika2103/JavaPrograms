✅method  2
🔥 *REVERSE A STRING*🔥

import java.util.Date;

public class HelloWorld {
    public static void main(String[] args) {
       
       String s= "vanshika";
       char a[] = new char[9];
       String reverse="";
       for(int i=s.length();i>0;i--){
          reverse=reverse+s.charAt(i-1);
       }
      
       System.out.println(reverse);
         
    }
}
