public class SequenceFunctionCall {
    public static int Add(int a)
    {
        int sum=0;
        for (int i=1;i<=a;i++)
        {
            sum=sum+i;

        }
        System.out.println(sum);
        return sum;
    }
    public static int Print(int b)
    {
        while(b!=0){
            System.out.println(b);
            b--;
        }
        return b;
    }
    public static void main(String[] args) {
        Add(5);
        Print(9);
    }
    
}
