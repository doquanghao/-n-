package com.company.run;
import com.company.nhanvien.*;
import com.company.nhaptt.*;

import java.util.ArrayList;
import java.util.Scanner;

public class run_nhanvien {
    public  void menu(){
        System.out.println("\t\t\t1.nhập thông tin cho nhân viên ");
        System.out.println("\t\t\t2.hiển thị thông tin nhân viên");
        System.out.println("\t\t\t3.tim kiếm  ");
        System.out.println("\t\t\t4.sắp xếp theo tên ");
        System.out.println("\t\t\t0.thoát");
    }
    public void run_nhan_vien(ArrayList<nhanvien>nhanviens ,nhanvien nhanvien ,nhap_nhanvien nhap_nhanvien){
        int chon;
        Scanner scanner=new Scanner(System.in);
        while (true){
            menu();
            chon=scanner.nextInt();
            if(chon==0) break;
            switch (chon){
                case 1:nhap_nhanvien.add(nhanviens,nhanvien);
                    nhap_nhanvien.ghifile(nhanviens);scanner.nextLine();
                    break;
                case 2:
                    nhap_nhanvien.xem(nhanviens);
                    scanner.nextLine();break;
                case 3:
                    nhap_nhanvien.timkiem(nhanviens);
                    nhap_nhanvien.ghifile(nhanviens);
                    scanner.nextLine();break;
                case 4:
                    nhap_nhanvien.xapsep(nhanviens);
                    nhap_nhanvien.ghifile(nhanviens);
                    nhap_nhanvien.xem(nhanviens);
                    scanner.nextLine();
                    break;
                default:
                    break;

            }
        }
    }
}
