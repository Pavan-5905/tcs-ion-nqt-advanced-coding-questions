import java.util.Scanner;
class BobsBet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int sum=0,seq=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sum+=arr[j];
                if(sum<k)
                    seq++;
                else
                    break;
            }
        }System.out.print(seq);
    }
}