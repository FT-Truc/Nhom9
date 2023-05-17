/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package QuanLyThongTinSanPham;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author LHUser
 */
public class Common {
    static Scanner sc = new Scanner(System.in);
    static int getInt(String s){
        System.out.print(s);
        int result = 0;
        try {
            result = sc.nextInt();
        }catch(NumberFormatException e){
            System.out.println("Invalid input: "+ s);
        }
            return result;
    }
        static double getDouble(String s){
            System.out.print(s);
            double result = 0;
            try{
                result = sc.nextDouble();
            }
            catch(NumberFormatException e){
                System.out.println("Invalid input: "+s);
            }
            return result;
        }
        static String getString(String s){
            String result="";
            System.out.print(s);
            try{
                result=sc.nextLine();
            }
            catch (NumberFormatException e){
                System.out.println("Invalid input: "+ s);
            }
            return result;
        }
        static String getStrings(String s){
            System.out.print(s);
            String result="";
            try{
                sc.nextLine();
                result= sc.nextLine();
            }catch(NumberFormatException e){
                System.out.println("In valid input: "+s);
            }
            return result;
        }
        static boolean getBoolean(String s){
            boolean result = false;
            try{
                result = sc.nextBoolean();
            }
            catch (NumberFormatException e){
                System.out.println("Invalid input: "+s);
            }
            return result;
        }
        
        
        
        static Date getDate(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        String input = scanner.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = dateFormat.parse(input);
            return date;
        } catch (ParseException e) {
            System.out.println("Dinh dang ngay khong hop le, vui long thu lai!.");
            return getDate(message);
        }
    }
}
