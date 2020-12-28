package com.company.nhaptt;
import com.company.chuanhoa.chuanhoa;
import com.company.intfac.luongbtg_if;
import com.company.nhanvien.luong;
import com.company.nhanvien.luongbanthoigian;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class nhap_luongbanthoigian implements luongbtg_if{
    @Override
    public void add(ArrayList<luongbanthoigian> luongs, luongbanthoigian luong) {
        chuanhoa chuanhoa= new chuanhoa();
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.print("\t\t\tnhập mã nhân viên gồm 4 kí tự :");
            while (!luong.setmaNV(scanner.nextLine()));
            boolean a=false;
            for (int i=0;i<luongs.size();i++){
                if(luongs.get(i).getManv().equals(luong.getManv())){
                    a=true;
                }
            }
            if(!a){
                break;
            }
            else {
                System.out.print("\t\t\tnhập lại :");
            }
        }
        System.out.print(" ");
        System.out.print("\t\t\tnhập họ tên nhân viên :");
        while (!luong.sethoten(scanner.nextLine())) ;
        chuanhoa.chuanhoadanhturieng(luong.getTenNV());
        System.out.print("\t\t\tkhu vực làm việc :");
        while (!luong.setkhuvuc(scanner.nextLine())) ;
        System.out.print(" ");
        System.out.print("\t\t\tnhập tên chức vụ :");
        while (!luong.setchucvu(scanner.nextLine())) ;
        System.out.print(" ");
        do{
            System.out.print("\t\t\tnhậ số giờ làm :");
            luong.setSogiolam(Integer.parseInt(scanner.nextLine())); }while (luong.getSogiolam()<0);
        System.out.print("\t\t\tngày nhập  :");
        while (!luong.setngaynhap(scanner.nextLine()));
        luongs.add(new luongbanthoigian(luong.getManv(),luong.getTenNV(),luong.getTenchucvu(),luong.getKhuvuc(),luong.getSogiolam(),luong.tinhluong(),luong.getNgaynhap()));

    }
    public void hienthi(luongbanthoigian luongbanthoigian){
        System.out.printf("\t\t\t|\t%5s\t|%20s\t|%10s\t|%12s\t|%16s\t|%16s\t|%24s\t| \n",luongbanthoigian.getManv(),luongbanthoigian.getTenNV(),luongbanthoigian.getTenchucvu(),luongbanthoigian.getKhuvuc(),luongbanthoigian.getSogiolam(),luongbanthoigian.tinhluong(),luongbanthoigian.getNgaynhap());
    }

    @Override
    public void xem(ArrayList<luongbanthoigian> luongs) {
        System.out.println("\t\t\t╔===========================================================================================================================================================================╗");
        System.out.printf("\t\t\t|\t%5s\t|%20s\t|%10s\t|%12s\t|%16s\t|%16s\t|%24s\t| \n","mã NV","tên NV","khu vực","tên chúc vụ","sốgiờlàm","lương","ngày nhập");
        System.out.println("\t\t\t╟===========================================================================================================================================================================╢");
        for (luongbanthoigian a:luongs){
            hienthi(a);
        }
        System.out.println("\t\t\t╚===========================================================================================================================================================================╝");
        System.out.println("\t\t\t"+tong(luongs));
    }

    @Override
    public void sua(ArrayList<luongbanthoigian> luongs, luongbanthoigian luong) {
        chuanhoa chuanhoa= new chuanhoa();
        Scanner scanner=new Scanner(System.in);
        while (true) {
            String chon;
            System.out.println("\t\t\t1.mã nhân viên ");
            System.out.println("\t\t\t2.tên nhân viên");
            System.out.println("\t\t\t3.khu vực làm việc nhân viên");
            System.out.println("\t\t\t4.chức vụ nhân viên");
            System.out.println("\t\t\t5.số giờ làm");
              System.out.println("\t\t\t6.ngày nhập thông tin");
            System.out.println("\t\t\t0.thoat");
            chon=scanner.nextLine();
            if(chon.equals("0"))break;
            switch (chon){
                case "1":
            System.out.print("\t\t\tnhập mã nhân viên gồm 4 kí tự :");
            while (!luong.setmaNV(scanner.nextLine()));break;
                case "2":
        System.out.print("\t\t\tnhập họ tên nhân viên :");
        while (!luong.sethoten(scanner.nextLine())) ;
        chuanhoa.chuanhoadanhturieng(luong.getTenNV());break;
                case "3":
        System.out.print("\t\t\tkhu vực làm việc :");
        while (!luong.setkhuvuc(scanner.nextLine())) ;break;
                case "4":
        System.out.print("\t\t\tnhập tên chức vụ :");
        while (!luong.setchucvu(scanner.nextLine())) ;break;
                case "5":
        do{
            System.out.print("\t\t\tnhậ số giờ làm :");
            luong.setSogiolam(Integer.parseInt(scanner.nextLine())); }while (luong.getSogiolam()<0);break;
                case "6":
        System.out.print("\t\t\tngày nhập  :");
        while (!luong.setngaynhap(scanner.nextLine()));break;
                default:
                    break;
            }
        }

    }

    @Override
    public void xapsep(ArrayList<luongbanthoigian> luongs) {
        Collections.sort(luongs, new Comparator<luongbanthoigian>() {
            @Override
            public int compare(luongbanthoigian o1, luongbanthoigian o2) {
                if (o1.tinhluong() == o2.tinhluong()) {
                    return 0;
                } else {
                    if (o1.tinhluong() > o2.tinhluong())
                        return -1;
                    else
                        return 1;
                }
            }
        });
    }

    @Override
    public void xapsep1(ArrayList<luongbanthoigian> luongs) {
        Collections.sort(luongs, new Comparator<luongbanthoigian>() {
            @Override
            public int compare(luongbanthoigian o1, luongbanthoigian o2) {
                if (o1.tinhluong() == o2.tinhluong()) {
                    return 0;
                } else {
                    if (o1.tinhluong() < o2.tinhluong())
                        return -1;
                    else
                        return 1;
                }
            }
        });
    }
    public static luongbanthoigian luongbanthoigian(ArrayList<luongbanthoigian>luongs,String nhap){

        luongbanthoigian r = null;
        for (luongbanthoigian luongbanthoigian: luongs
        ) {
            if (nhap.equals(luongbanthoigian.getManv())
            ) {
                r=luongbanthoigian;
            }
        }
        return r;
    }
    @Override
    public void timkiem(ArrayList<luongbanthoigian> luongbanthoigians) {
        luongbanthoigian luong=null;
        Scanner scanner=new Scanner(System.in);
        System.out.println("\t\t\tnhập ma nv nhân viên bạn muốn tìm :");
        String ten=scanner.nextLine();
        luongbanthoigian a=luongbanthoigian(luongbanthoigians,ten);
        if (luong!=null){
            System.out.println("\t\t\t╔===========================================================================================================================================================================╗");
            System.out.printf("\t\t\t|\t%5s\t|%20s\t|%10s\t|%12s\t|%16s\t|%16s\t|%24s\t| \n","mã NV","tên NV","khu vực","tên chúc vụ","sốgiờlàm","lương","ngày nhập");
            System.out.println("\t\t\t╟===========================================================================================================================================================================╢");

                hienthi(a);

            System.out.println("\t\t\t╚===========================================================================================================================================================================╝");
            while (true){
                System.out.println("\t\t\t1.Sửa thông tin nhân viên ");
                System.out.println("\t\t\t2.xóa thông tin nhân viên");
                System.out.println("\t\t\t3.nhân viên có lương cao nhất ");
                System.out.println("\t\t\t4.nhân viên có lương thấp nhất ");
                System.out.println("\t\t\t0.thoát");
                int choose = scanner.nextInt();
                switch (choose) {
                    case 1:
                        sua(luongbanthoigians, a);
                        xem(luongbanthoigians);break;
                    case 2:
                        xoa(luongbanthoigians,a);break;
                    case 3:max(luongbanthoigians);break;
                    case 4:min(luongbanthoigians);break;
                    case 0:break;
                    default:break;
                }
            }
        }else {
            System.out.print("\t\t\tkhông tìm thấy nhân viên ");
        }

    }

    @Override
    public void xoa(ArrayList<luongbanthoigian> luongs, luongbanthoigian luong) {

                luongs.remove(luong);

       System.out.print("\t\t\txóa thành công");
    }
    public int maxa(ArrayList<luongbanthoigian> luongs) {
        int max = 0;
        for (luongbanthoigian a: luongs) {
            if (max < a.tinhluong()) {
                max = a.tinhluong();
            }
        }
        return max;
    }
    @Override
    public int max(ArrayList<luongbanthoigian> luongs) {
        int max = maxa(luongs);
        System.out.println("\t\t\t╔===========================================================================================================================================================================╗");
        System.out.printf("\t\t\t|\t%5s\t|%20s\t|%10s\t|%12s\t|%16s\t|%16s\t|%24s\t| \n","mã NV","tên NV","khu vực","tên chúc vụ","sốgiờlàm","lương","ngày nhập");
        System.out.println("\t\t\t╟===========================================================================================================================================================================╢");

        for (luongbanthoigian l : luongs) {
            if (max == l.tinhluong()) {
                hienthi(l);
            }
        }
        System.out.println("\t\t\t╚===========================================================================================================================================================================╝");

        return max;
    }
    public int min1(ArrayList<luongbanthoigian> luongs) {
        int max = 0;
        for (luongbanthoigian luongbanthoigian : luongs) {
            if (max > luongbanthoigian.tinhluong()) {
                max = luongbanthoigian.tinhluong();
            }
        }
        return max;
    }
    @Override
    public int min(ArrayList<luongbanthoigian> luongs) {
        int max = min1(luongs);
        System.out.println("\t\t\t╔===========================================================================================================================================================================╗");
        System.out.printf("\t\t\t|\t%5s\t|%20s\t|%10s\t|%12s\t|%16s\t|%16s\t|%24s\t| \n","mã NV","tên NV","khu vực","tên chúc vụ","sốgiờlàm","lương","ngày nhập");
        System.out.println("\t\t\t╟===========================================================================================================================================================================╢");

        for (luongbanthoigian a : luongs) {
            if (max == a.tinhluong()) {
                hienthi(a);
            }
        }  System.out.println("\t\t\t╚===========================================================================================================================================================================╝");

        return max;
    }
    File file=new File("luongthoigian.txt");
    @Override
    public void docfile(ArrayList<luongbanthoigian> luongs) {
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null ) {
                    luongs.add(new luongbanthoigian(line.split("#")[0],
                            line.split("#")[1],line.split("#")[2],
                            line.split("#")[3],Integer.parseInt(line.split("#")[4]),Integer.parseInt(line.split("#")[5])
                            ,line.split("#")[6]));
            }

            bufferedReader.close();
            fileReader.close();

        } catch (FileNotFoundException e) {
            e.getMessage();
            System.out.println("lỗi mở file");
        } catch (IOException e) {
            e.getMessage();
            System.out.println("tập tin trống");
        }

    }

    @Override
    public void ghifile(ArrayList<luongbanthoigian> luongs) {
        try {

            FileWriter fileWriter=new FileWriter(file);
            for(luongbanthoigian l:luongs){
                fileWriter.write(l.toString());}
            fileWriter.close();
        }
        catch (Exception e){
            System.err.println("\t\t\tloi ghi flie !!!!" );
            System.out.println(e.getMessage());
        }
    }

    @Override
    public int tong(ArrayList<luongbanthoigian> luongs) {
        int tong=0;
        for (luongbanthoigian a:luongs){
            tong=tong+ a.tinhluong();
        }
        return tong;
    }
}
