public class SequenceFncEx2 {
    public static void add(int a){
        for(int i=1;i<=a;i++){
            if(i%2==0)
            {
                System.out.println("even");
            }
            else{
                System.out.println("not even");
            }
        }
    }
    public static void palindrome(int a)
    {
    
        int rev=0;
        while(a!=0){
            int rem=a%10;
            rev=rev*10+rem;
            a=a/10;
        }
        if(rev==a)
        {
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
    public static void main(String[] args) {
        add(5);
        palindrome(121);
    }
}
