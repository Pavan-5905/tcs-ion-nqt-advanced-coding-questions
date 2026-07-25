import java.util.*;
class SurvivalGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        boolean pos=false,neg=false;
        int min=Integer.MAX_VALUE;
        for(int i=-0;i<n;i++){
            int x=sc.nextInt();
            if(x>=0)
                pos=true;
            else
                neg=true;
            sum+=Math.abs(x);
            min=Math.min(min, Math.abs(x));
        }int ans;
        if(pos&&neg)
            ans=sum;
        else if(pos)
            ans=sum-2*min;
        else
            ans=sum-2*min;
        System.out.print(ans);
    }
}