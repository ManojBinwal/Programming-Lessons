import java.util.Scanner;

class AreaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        float area = 3.14f * r * r;
        System.out.println(area);
        sc.close();
    }
}