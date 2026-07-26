import java.util.*;
public class SquareCloth {
    static class Point {
        int x, y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    static int distSq(Point p, Point q) {
        int dx = p.x - q.x;
        int dy = p.y - q.y;
        return dx * dx + dy * dy;
    }
    static boolean isSquare(Point p1, Point p2, Point p3, Point p4) {
        int d2 = distSq(p1, p2);
        int d3 = distSq(p1, p3);
        int d4 = distSq(p1, p4);
        if (d2 == 0 || d3 == 0 || d4 == 0)
            return false;
        if (d2 == d3 &&
            2 * d2 == d4 &&
            2 * distSq(p2, p4) == distSq(p2, p3))
            return true;
        if (d3 == d4 &&
            2 * d3 == d2 &&
            2 * distSq(p3, p2) == distSq(p3, p4))
            return true;
        if (d2 == d4 &&
            2 * d2 == d3 &&
            2 * distSq(p2, p3) == distSq(p2, p4))
            return true;
        return false;
    }
    static int fun(int n, Point[] arr) {
        if (n < 3) {
            return 4 - n;
        }
        else if (n == 3) {
            if (distSq(arr[0], arr[1]) == distSq(arr[1], arr[2]) &&
                distSq(arr[1], arr[2]) == distSq(arr[0], arr[2]))
                return 1;
            else
                return 2;
        }
        else {
            for (int a = 0; a < n - 3; a++) {
                for (int b = a + 1; b < n - 2; b++) {
                    for (int c = b + 1; c < n - 1; c++) {
                        for (int d = c + 1; d < n; d++) {

                            if (isSquare(arr[a], arr[b], arr[c], arr[d]))
                                return 0;
                        }
                    }
                }
            }
            for (int a = 0; a < n - 2; a++) {
                for (int b = a + 1; b < n - 1; b++) {
                    for (int c = b + 1; c < n; c++) {
                        if (distSq(arr[a], arr[b]) == distSq(arr[b], arr[c]) &&
                            distSq(arr[b], arr[c]) == distSq(arr[a], arr[c]))
                            return 1;
                    }
                }
            }
        }
        return 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Point[] arr = new Point[N];
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[i] = new Point(x, y);
        }
        System.out.println(fun(N, arr));
    }
}