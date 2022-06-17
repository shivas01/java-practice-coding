import java.util.*;
class Strings1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the string");
        ArrayList<String>str2=new ArrayList<String>();
        String s1=sc.nextLine();
        String[] a1;
        int t=0;
        a1=s1.split(" ");
        for(String c:a1){
            if(c.matches("-?\\d+"))
            {
                if(c.contains("9")==false)
                {
                    str2.add(c);
                    t=1;
                }
            }
        }
        if(t==0){System.out.println("-1");}
        else
        Collections.sort(str2);
        System.out.println(str2.get(0));
        
        
    }
}