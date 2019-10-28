package firsttry;
import java.util.Arrays;
public class test3 { public static void main(String[] args) {
    test3 hello = new test3();
    int maxScore=hello.getMaxAge();
    System.out.println("最大年龄为：" + maxScore);
}
    public int getMaxAge() {
        int[] ages = {18, 23, 21, 19, 25, 29, 17};
        int max;
        Arrays.sort(ages);
        max = ages[ages.length-1];
        return max;
    }
}
