package com.company.nhaptt;
import com.company.nhanvien.nhanvien;
import com.company.chuanhoa.chuanhoa;
import com.company.intfac.nhanvien_if;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class nhap_nhanvien implements nhanvien_if{

    @Override
    public void add(ArrayList<nhanvien> nhanviens,nhanvien nhanvien) {

        Scanner scanner=new Scanner(System.in);
        chuanhoa chuanhoa=new chuanhoa();
        while (true){
            System.out.print("\t\t\tnhập mã nhân viên gồm 4 kí tự :");
            while (!nhanvien.setMaNV1(scanner.nextLine()));
            boolean a=false;
            for (int i=0;i<nhanviens.size();i++){
                if(nhanviens.get(i).getMaNV().equals(nhanvien.getMaNV())){
                    a=true;
                }
            }
            if(!a){
                break;
            }
            else {
                System.out.println("\t\t\tnhập lại :");
            }
        }

        System.out.print("\t\t\tnhập họ tên nhân viên :");
        while (!nhanvien.sethoten1(scanner.nextLine()));
        chuanhoa.chuanhoadanhturieng(nhanvien.getHoten());
        System.out.print("\t\t\tnhập ngày sinh :");
        while (!nhanvien.setngaysinh1(scanner.nextLine()));

        System.out.print("\t\t\tnhập giới tính nhân viên : ");
        while (!nhanvien.setgiotinh1(scanner.nextLine()));

        System.out.print("\t\t\tnhập địa chỉ nhân viên :");
        while (!nhanvien.setdiachi1(scanner.nextLine()));

        System.out.print("\t\t\tnhập khu vưc làm việc của nhân viên :");
        while (!nhanvien.setkhuvuc1(scanner.nextLine()));

        System.out.print("\t\t\tnhập chức vụ nhân viên :");
        while (!nhanvien.setchucvu1(scanner.nextLine()));

        System.out.print("\t\t\tnhập loại nhân viên (nhân viên,nhân viên tg):");
        while (!nhanvien.setloainhanvien1(scanner.nextLine()));

        System.out.print("\t\t\tnhập số điện thoại :");
        while (!nhanvien.setsdt1(scanner.nextLine()));

        System.out.print("\t\t\tngày nhập  :");
        while (!nhanvien.setngaynhap1(scanner.nextLine()));

        nhanviens.add(new nhanvien(nhanvien.getMaNV()
                ,nhanvien.getHoten(),
                nhanvien.getGioitinh(),nhanvien.getNgaysinh(),nhanvien.getDiachi(),nhanvien.getChucvu(),nhanvien.getKhuvuc(),nhanvien.getLoainv(),nhanvien.getSdt(),nhanvien.getNgaynhap()));
    }
    public static void hienthi(nhanvien nhanvien){
        System.out.printf("\t\t\t|\t%4s\t|%20s\t|%10s\t|%20s\t|%20s\t|%10s\t|%10s\t|%10s\t|%20s\t|%20s\t|\n", nhanvien.getMaNV(),nhanvien.getHoten(),nhanvien.getGioitinh(),nhanvien.getNgaysinh(),nhanvien.getDiachi(),nhanvien.getChucvu(),nhanvien.getKhuvuc(),nhanvien.getLoainv(),nhanvien.getSdt(),nhanvien.getNgaynhap());
    }

    @Override
    public void xem(ArrayList<nhanvien> nhanviens) {
        System.out.println("\t\t\t╔===================================================================================================================================================================================╗");
        System.out.printf("\t\t\t|\t%4s\t|%20s\t|%10s\t|%20s\t|%20s\t|%10s\t|%10s\t|%10s\t|%20s\t|%20s\t|\n ","mã NV","tên nv","giới tính","ngày sinh","địa chỉ","chúc vụ","khu vực","loaiNV","số dt","ngày nhập");
        System.out.println("\t\t\t╟===================================================================================================================================================================================╢");
        for (nhanvien a:nhanviens){
            hienthi(a);
        }
        System.out.println("\t\t\t╚===================================================================================================================================================================================╝");

    }
    public static nhanvien nhanvien(ArrayList<nhanvien>nhanviens,String nhap){

        nhanvien result = null;
        for (nhanvien nhanvien : nhanviens
        ) {
            if (nhap.equals(nhanvien.getMaNV()) || nhap.equals(nhanvien.getHoten())
            ) {
                result = nhanvien;
            }
        }
        return result;
    }

    @Override
    public void sua(ArrayList<nhanvien> nhanviens, nhanvien nhanvien) {
            Scanner scanner =new Scanner(System.in);
            chuanhoa chuanhoa=new chuanhoa();
            while (true) {
                String chon;
                System.out.println("\t\t\t1.mã nhân viên ");
                System.out.println("\t\t\t2.tên nhân viên");
                System.out.println("\t\t\t3.giới tính nhân viên");
                System.out.println("\t\t\t4.ngày sinh nhân viên");
                System.out.println("\t\t\t5.địa chỉ nhân viên");
                System.out.println("\t\t\t6.chức vụ nhân viên");
                System.out.println("\t\t\t7.khu vực làm việc nhân viên");
                System.out.println("\t\t\t8.loại nhân viên");
                System.out.println("\t\t\t9.số điện thoại nhân viên");
                System.out.println("\t\t\t10.ngày nhập thông tin");
                System.out.println("\t\t\t0.thoat");
                chon=scanner.nextLine();
                if(chon.equals("0"))break;
                switch (chon){
                    case "1":
                System.out.print("\t\t\tnhập mã nhân viên gồm 4 kí tự :");
                nhanvien.setMaNV(scanner.nextLine());
                scanner.nextLine();
                break;
                    case "2":
                System.out.print("\t\t\tnhập họ tên nhân viên :");
                nhanvien.setHoten(scanner.nextLine());
                chuanhoa.chuanhoadanhturieng(nhanvien.getHoten());
                        scanner.nextLine();
                break;
                    case "3":
                System.out.print("\t\t\tnhập giới tính nhân viên : ");
                nhanvien.setGioitinh((scanner.nextLine())) ;scanner.nextLine();
                break;
                    case "4":
                System.out.print("\t\t\tnhập ngày sinh :");
                nhanvien.setNgaysinh(scanner.nextLine()) ;scanner.nextLine();
                break;
                    case "5":
                System.out.print("\t\t\tnhập địa chỉ nhân viên :");
                nhanvien.setDiachi(scanner.nextLine()) ;scanner.nextLine();
                break;
                    case "6":
                System.out.print("\t\t\tnhập chức vụ nhân viên :");
               nhanvien.setChucvu(scanner.nextLine()) ;scanner.nextLine();
               break;
                    case "7":
                System.out.print("\t\t\tnhập khu vưc làm việc cửa nhân viên :");
               nhanvien.setKhuvuc(scanner.nextLine()) ;
               break;
                    case "8":
                System.out.print("\t\t\tnhập loại nhân viên (nhân viên,nhân viên tg):");
                nhanvien.setLoainv(scanner.nextLine()) ;scanner.nextLine();
                break;

                    case "9":
                System.out.print("\t\t\tnhập số điện thoại :");
               nhanvien.setSdt(scanner.nextLine()) ;scanner.nextLine();
               break;
                    case "10":
                System.out.print("\t\t\tngày nhập  :");
                nhanvien.setNgaynhap(scanner.nextLine()) ;scanner.nextLine();
                break;
                    default:
                        break;
            }
            }

    }



    @Override
    public void timkiem(ArrayList<nhanvien> nhanviens) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("\t\t\tnhập ma nv nhân viên bạn muốn tìm :");
        String ten=scanner.nextLine();
        nhanvien a=nhanvien(nhanviens,ten);
        if (a!=null){
            System.out.println("\t\t\t╔===================================================================================================================================================================================╗");
            System.out.printf("\t\t\t|\t%4s\t|%20s\t|%10s\t|%20s\t|%20s\t|%10s\t|%10s\t|%10s\t|%20s\t|%20s\t|\n ","mã NV","tên nv","giới tính","ngày sinh","địa chỉ","chúc vụ","khu vực","loaiNV","số dt","ngày nhập");
            System.out.println("\t\t\t╟===================================================================================================================================================================================╢");

                hienthi(a);

            System.out.println("\t\t\t╚===================================================================================================================================================================================╝");
            while (true){
                System.out.println("\t\t\t1.Sửa thông tin nhân viên ");
                System.out.println("\t\t\t2.xóa thông tin nhân viên");
                System.out.println("\t\t\t0.thoát");
                int choose = scanner.nextInt();
                if(choose==0)break;
                switch (choose) {
                    case 1:
                        sua(nhanviens, a);
                        ghifile(nhanviens);scanner.nextLine();break;
                    case 2:
                        xoa(nhanviens,a)
                        ;ghifile(nhanviens);scanner.nextLine();break;
                    default:break;
                }
            }
        }else {
            System.out.println("\t\t\tkhông tìm thấy nhân viên ");
            scanner.nextLine();
        }
    }

    @Override
    public void xoa(ArrayList<nhanvien> nhanviens, nhanvien nhanvien) {
                nhanviens.remove(nhanvien);
       System.out.println("\t\t\txóa thành công");
    }

    @Override
    public void xapsep(ArrayList<nhanvien>nhanviens) {
        Collections.sort(nhanviens, new Comparator<nhanvien>() {
            @Override
            public int compare(nhanvien o1, nhanvien o2) {
                if(o1.getHoten().compareToIgnoreCase(o2.getHoten())==1)
                    return 1;
                else
                    return -1;
            }
        });
    }

    @Override
    public void ghifile(ArrayList<nhanvien> nhanviens) {
        try {
            File file=new File("nhanvien.txt");
            FileWriter fileWriter=new FileWriter(file);
            for(nhanvien nhanvien:nhanviens){
                fileWriter.write(nhanvien.toString());}
            fileWriter.close();
        }
        catch (Exception e){
            System.err.println("\t\t\tlỗi ghi flie !!!!" );
            System.out.println(e.getMessage());
        }
    }
    @Override
    public void docfile(ArrayList<nhanvien> nhanviens) {
        try {
            File file=new File("nhanvien.txt");
            FileReader fileReader=new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line;
            while((line = bufferedReader.readLine())!=null){
                nhanviens.add(new nhanvien(line.split("#")[0],
                        line.split("#")[1], line.split("#")[2], line.split("#")[3],
                        line.split("#")[4], line.split("#")[5],line.split("#")[6],
                        line.split("#")[7],line.split("#")[8],line.split("#")[9]));
            }
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            System.out.println("\t\t\tlỗi đọc file");
            e.getMessage();
        }
    }
}
