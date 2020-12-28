package com.company.intfac;
import com.company.nhanvien.luong;
import java.util.ArrayList;

public interface luon_if {
    void add(ArrayList<luong> luongs,luong luong);
    void xem(ArrayList<luong> luongs);
    void sua(ArrayList<luong> luongs, luong luong);
    void xapsep(ArrayList<luong> luongs);
    void xapsep1(ArrayList<luong> luongs);
    void timkiem(ArrayList<luong> luongs);
    void xoa(ArrayList<luong> luongs, luong luong);
    int max(ArrayList<luong> luongs);
   int min(ArrayList<luong> luongs);
    void docfile(ArrayList<luong> luongs);
    void ghifile(ArrayList<luong> luongs);
    int tong(ArrayList<luong> luongs);



}
