package rocker;
import java.util.Scanner;
public class level2 {
    public static void main(String[] args) {
        DrawFunctionTool drawFunctionTool = new DrawFunctionTool();
        //各个数学函数的写法:
        //y=x
        //y=x^2
        //x=y^2
        //x^2+y^2=1
        //y=x^3
        String str;
        Scanner s = new Scanner(System.in);
        str = s.next();
        DrawFunctionTool.drawFunction(str);
    }
}
class DrawFunctionTool {
    public static void drawFunction(String function) {
        String[][] f = new String[50][50];
        switch (function) {
            case "y=x":
                for (int i = 0; i < 50; i++) {
                    for (int j = 0; j < 50; j++) {
                        if (i + j == 49) {
                            f[i][j] = " *";
                        } else {
                            f[i][j] = "  ";
                        }
                    }
                }
                break;
            case "y=x^2":
                for (int i = 0; i < 50; i++) {
                    for (int j = 0; j < 50; j++) {
                        if ((j - 24) * (j - 24) == 25 - i) {
                            f[i][j] = " *";
                        } else {
                            f[i][j] = "  ";
                        }
                    }
                }

                break;
            case "x=y^2":
                for (int i = 0; i < 50; i++) {
                    for (int j = 0; j < 50; j++) {
                        if ((25 - i) * (25 - i) == j - 24) {
                            f[i][j] = " *";
                        } else {
                            f[i][j] = "  ";
                        }
                    }
                }
                break;
            case "x^2+y^2=1":
                for (int i = 0; i < 50; i++) {
                    for (int j = 0; j < 50; j++) {
                        if ((25 - i) * (25 - i) + (j - 24) * (j - 24) == 1) {
                            f[i][j] = " *";
                        } else {
                            f[i][j] = "  ";
                        }
                    }
                }
                break;
            case "y=x^3":
                for (int i = 0; i < 50; i++) {
                    for (int j = 0; j < 50; j++) {
                        if (25 - i == (j - 24) * (j - 24) * (j - 24)) {
                            f[i][j] = " *";
                        } else {
                            f[i][j] = "  ";
                        }
                    }
                }
                break;
        }
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
                System.out.print(f[i][j]);
                if (j == 49) {
                    System.out.println();
                }
            }
        }
        System.out.println(function);}
        }


