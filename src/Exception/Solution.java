package Exception;

public class Solution {
    public static void main(String[] args)
    {
       Solution me = new Solution();
       try {
           me.alaki();
       }
       catch (Exception e)
       {
           e.printStackTrace();
       }

    }

    private void alaki()
    {
        try {
            int a = 0;
            int b = 1 / a;
        }
        catch (ArithmeticException e)
        {
            e.printStackTrace();
            throw e;
        }

        System.out.println("done");
    }
}
