import java.util.Scanner;
class GoldenHouse {
    private static void fun(int n,int k, int[] arr) {  
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j]; 
                if(sum==k){
                    System.out.print((i+1)+" "+(j+1));
                    return;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        fun(n,k,arr);
    }
}