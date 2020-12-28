package com.company.intfac;

import com.company.nhanvien.luongbanthoigian;

import java.util.ArrayList;

public interface luongbtg_if {
    void add(ArrayList<luongbanthoigian> luongs,luongbanthoigian luong);
    void xem(ArrayList<luongbanthoigian> luongs);
    void sua(ArrayList<luongbanthoigian> luongs, luongbanthoigian luong);
    void xapsep(ArrayList<luongbanthoigian> luongs);
    void xapsep1(ArrayList<luongbanthoigian> luongs);
    void timkiem(ArrayList<luongbanthoigian> luongs);
    void xoa(ArrayList<luongbanthoigian> luongs, luongbanthoigian luong);
    int max(ArrayList<luongbanthoigian> luongs);
    int min(ArrayList<luongbanthoigian> luongs);
    void docfile(ArrayList<luongbanthoigian> luongs);
    void ghifile(ArrayList<luongbanthoigian> luongs);
    int tong(ArrayList<luongbanthoigian> luongs);
}
