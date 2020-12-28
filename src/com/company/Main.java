package com.company;
import  com.company.nhanvien.*;
import com.company.nhaptt.*;
import com.company.run.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<nhanvien>nhanviens =new ArrayList<>();
        ArrayList<luong>luongs=new ArrayList<>();
        ArrayList<luongbanthoigian>luongbanthoigians=new ArrayList<>();
        luong luong=new luong();
        nhanvien nhanvien=new nhanvien();
        luongbanthoigian luongbanthoigian=new luongbanthoigian();
        nhap_nhanvien nhap_nhanvien=new nhap_nhanvien();
        nhap_luong nhap_luong=new nhap_luong();
        nhap_luongbanthoigian nhap_luongbanthoigian=new nhap_luongbanthoigian();
        run_nhanvien run_nhanvien =new run_nhanvien();
        run_luongbanthoigian run_luongthoigian=new run_luongbanthoigian();
        run_luong run_luong=new run_luong();
        nhap_nhanvien.docfile(nhanviens);
        nhap_luong.docfile(luongs);
        nhap_luongbanthoigian.docfile(luongbanthoigians);
        Scanner sc = new Scanner(System.in);
        String xau = "admin";
        String mk1="123456";
        while (true) {
            System.out.print("\t\t\t\t\t\t\t\t\tTài khoản: ");
            String taikhoan = sc.nextLine();
            System.out.println("\t");
            System.out.print("\t\t\t\t\t\t\t\t\tMật khẩu: ");
            String mk = sc.nextLine();
            if (taikhoan.equals(xau) && mk.equals(mk1)) {
                System.out.println(" ");
                System.out.println("\t\t\t                           Chương trình quản lý nhân viên                                ");
                System.out.println("\t\t\t                                   nhà Hàn Sen                                        ");
                System.out.println("\t\t\t                                                                                        ");
                System.err.println("\t\t\t                Giảng viên hướng     :  NGUYỄN THỊ HẢI NẰNG                           ");
                System.out.println("\t\t\t                                                                                        ");
                System.err.println("\t\t\t                SINH VIÊN THỰC HIỆN  :  ĐỖ QUANG HÀO                                 ");
                System.out.println("\t\t\t                                                                                        ");
                System.err.println("\t\t\t                        Nhấn ENTER để tiếp tục                                  ");
                System.out.println(" ");
                sc.nextLine();
        dangnhap(nhanvien,luong,luongbanthoigian,nhap_nhanvien,nhap_luong,nhap_luongbanthoigian,luongs,nhanviens,luongbanthoigians,run_nhanvien,run_luongthoigian,run_luong);
                break;
            } else {
                System.out.println("\t\t\t\t\t\t\t\t\tThông tin tài khoản hoặc mật khẩu không đúng");
            }
        }
    }
    public  static void dangnhap(nhanvien nhanvien, luong luong, luongbanthoigian luongbanthoigian, nhap_nhanvien nhap_nhanvien, nhap_luong nhap_luong,nhap_luongbanthoigian nhap_luongbanthoigian, ArrayList<luong> luongs, ArrayList<nhanvien>nhanviens, ArrayList<luongbanthoigian> luongbanthoigians, run_nhanvien run_nhanvien,run_luongbanthoigian run_luongthoigian,run_luong run_luong){
        int chon;
        Scanner scanner=new Scanner(System.in);
        while (true){
            chonmenu();
            chon=scanner.nextInt();
            if(chon==0)break;
            switch (chon){
                case 1: run_nhanvien.run_nhan_vien(nhanviens,nhanvien,nhap_nhanvien);
                    scanner.nextLine();
                    break;case 2:
                    run_luong.run_luong(luongs,luong,nhap_luong,nhap_nhanvien,nhanviens);scanner.nextLine();
                case 3:
                    run_luongthoigian.run_luongbanthoigian(luongbanthoigians,luongbanthoigian,nhap_luongbanthoigian,nhanviens,nhap_nhanvien);scanner.nextLine();
                    break;
                default:
                    break;

            }
        }
    }

    public static void chonmenu(){
        System.out.println(" ");
        System.out.println("\t\t\t1.nhập thông tin cho nhân viên ");
        System.out.println("\t\t\t2.nhập thông tin lương cho nhân viên ");
        System.out.println("\t\t\t3.nhập thông tin lương cho nhân viên thời vụ");
        System.out.println("\t\t\t0.thoát");
        System.out.println("\t\t\tChọn một chức năng : ");
    }

}
