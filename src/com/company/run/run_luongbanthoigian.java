package com.company.run;
import com.company.nhaptt.nhap_nhanvien;
import com.company.nhanvien.luongbanthoigian;
import com.company.nhanvien.nhanvien;
import com.company.nhaptt.nhap_luongbanthoigian;

import java.util.ArrayList;
import java.util.Scanner;

public class run_luongbanthoigian {
    public  void menu(){
        System.out.println("\t\t\t1.nhập thông tin lương cho nhân viên thời vụ ");
        System.out.println("\t\t\t2.hiển thị thông lương tin nhân viên thời vụ");
        System.out.println("\t\t\t3.tim kiếm  ");
        System.out.println("\t\t\t4.sắp xếp theo tăng dần");
        System.out.println("\t\t\t5.sắp xếp theo giảm dần");
        System.out.println("\t\t\t0.thoát");
    }
    public void run_luongbanthoigian(ArrayList<luongbanthoigian> luongs , luongbanthoigian luong,nhap_luongbanthoigian nhap_luong,ArrayList<nhanvien>nhanviens,nhap_nhanvien nhap_nhanvien){
        int chon;
        Scanner scanner=new Scanner(System.in);
        while (true){
            menu();
            chon=scanner.nextInt();
            if(chon==0) break;
            switch (chon){
                case 1:nhap_nhanvien.xem(nhanviens);
                    nhap_luong.add(luongs,luong);
                    nhap_luong.ghifile(luongs);scanner.nextLine();
                    break;
                case 2:
                    nhap_luong.xem(luongs);scanner.nextLine();break;
                case 3:
                    nhap_luong.timkiem(luongs);
                    nhap_luong.ghifile(luongs);scanner.nextLine();break;
                case 4:
                    nhap_luong.xapsep(luongs);
                    nhap_luong.ghifile(luongs);
                    nhap_luong.xem(luongs);scanner.nextLine();
                    break;
                case 5:
                    nhap_luong.xapsep1(luongs);
                    nhap_luong.ghifile(luongs);
                    nhap_luong.xem(luongs);scanner.nextLine();
                default:
                    break;

            }
        }
    }
}
