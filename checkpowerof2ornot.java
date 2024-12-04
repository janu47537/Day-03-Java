import java.util.*;
public class checkpowerof2ornot{
    public static void main(String[]args){
    int a=8388608;
    if((a&(a-1))==0){
        System.out.println("Power of 2");
    }
    else{
        System.out.println("Not power of 2");
    }
    }
}