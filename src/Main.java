import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) { // class main ในการสร้างตัวแปรๆต่าง
        Scanner s = new Scanner(System.in); // สร้าง scanner ขึ้นมา
        System.out.print("Enter number : ");
        int num = s.nextInt(); // ให้ num มารับเลขที่ input จะที่เราพิมพ์ (s.nextInt)
        int[] arr = new int[num]; // สร้าง array จากเลขที่ input เข้ามา
        System.out.print("Pls enter number what you want : ");
        for (int i = 0; i < num; i++) {
            arr[i] = s.nextInt(); // วน for เอาค่าที่ input เข้าไปใน array แต่ละตัวตามจำนวนขนาด array
        }
        sort(arr); // ส่งไปยัง method sort
    }
    public static void sort(int[] arr){ // เรียงข้อมูลใน array โดยรับ array และ size of array มา
        Arrays.sort(arr); // ใช้ import class array เพื่อใช้คำสั่ง sort array
        System.out.println("Sorted Array is ");
        for(int i : arr){
            System.out.println(i); // print element in array
        }
    }

}

