class Palindrome{
    public static void main(String[] args) {
        int num=121;
        int temp=num;
        int rev=0;
        while(temp!=0){
            int rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;

        }
        if(num==rev)
        {
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}