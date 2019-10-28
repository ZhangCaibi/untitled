package firsttry;
import java.util.Arrays;
public class test2 {public static void main(String[] args) {
    int[] arr1={123,156,187};
    int[] arr2={145,154,199,201};
    int a1=arr1.length;
    int a2=arr2.length;
    arr1=Arrays.copyOf(arr1,a1+a2);
    System.arraycopy(arr2,0,arr1,a1,a2);
    Arrays.sort(arr1);
    if(arr1.length%2==1)
    {System.out.println(arr1[(arr1.length-1)/2]);}
    else
        System.out.println("无法找到学妹");
}}
