import java.util.Scanner;
class JacksPastry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int left=0;
        int max=0;
        for(int i=1;i<=n;i++){
            if(n%i>=left){
                left=n%i;
                max=i;
            }
        }System.out.print(max);
    }
}