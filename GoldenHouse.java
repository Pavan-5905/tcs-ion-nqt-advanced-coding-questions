import java.util.Scanner;
class GoldenHouse {
    private static int[] fun(int n,int k, int[] arr) {  
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j]; 
                if(sum==k)
                    return new int[]{i+1,j+1};
            }
        }return new int[]{-1};
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int[] ans = fun(n, k, arr);
        System.out.print(ans[0]+" "+ans[1]);
    }
}