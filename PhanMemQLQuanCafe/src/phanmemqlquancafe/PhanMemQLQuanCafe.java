/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package phanmemqlquancafe;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class PhanMemQLQuanCafe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ và tên của bạn: "); 
        String hoTen = sc.nextLine();
        System.out.print("Nhập năm sinh của bạn: "); 
        int namSinh = sc.nextInt(); 
        sc.nextLine();
        System.out.print("Nhập địa chỉ của bạn: "); 
        String diaChi = sc.nextLine();
        
        System.out.println("Họ và tên của bạn là: " + hoTen);
        System.out.println("Năm sinh: " + namSinh);
        System.out.println("Địa chỉ: " + diaChi);
    } 
}
