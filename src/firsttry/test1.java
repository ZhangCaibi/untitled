package firsttry;
public class test1 {public static void main(String[] args) {
    int a, b, c, d;
    d = 1;
    c = 1;
    a = 27;
    b = 1;
    for (d = 1; d <= 10; d++) {
        for (a = 27 - 3 * (d - 1); a >= 0; a--) {
            System.out.print(" ");
        }
        for (b = 1; b <= c; b++) {
            System.out.print("*");
        }
        System.out.print("\n");
        c = c + 1;
    }
    for (int e = 9; e >= 1; e--) {
        for (int f = 0; f <= (10 - e) * 3; f++)
        {
            System.out.print(" ");
        }
        for (int g = 9; g >=10-e; g--) {
            System.out.print("*");
        }
            System.out.print("\n");
    }
}}