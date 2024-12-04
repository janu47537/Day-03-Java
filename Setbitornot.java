import java.util.*;
public class Setbitornot{
    public static void main(String[]args){
        int a=10;
        int pos=2;
        if((a&(1<<pos))!=0){
            System.out.println("Set Bit");
        }
            else{
                System.out.println("Not a setbit");

            }

        }
    }
