package com.company.intfac;
import com.company.nhanvien.nhanvien;
import java.util.ArrayList;

public interface nhanvien_if {
    void add(ArrayList<nhanvien> nhanviens,nhanvien nhanvien);
    void xem(ArrayList<nhanvien> nhanviens);
    void sua(ArrayList<nhanvien> nhanviens, nhanvien nhanvien);
    void timkiem(ArrayList<nhanvien> nhanviens);
    void xoa(ArrayList<nhanvien> nhanviens, nhanvien nhanvien);
    void xapsep(ArrayList<nhanvien>nhanviens);
    void ghifile(ArrayList<nhanvien> nhanviens);
    void docfile(ArrayList<nhanvien> nhanviens);
}
