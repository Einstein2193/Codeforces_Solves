import java.util.Scanner;

public class Polygon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t ; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if(n % m == 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
