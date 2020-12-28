package com.company.nhanvien;

public class nhanvien {
    private String maNV;
    private String hoten;
    private String gioitinh;
    private String ngaysinh;
    private String diachi;
    private String chucvu;
    private String khuvuc;
    private String loainv;
    private String sdt;
    private String ngaynhap;
    public  nhanvien(){

    }

    public nhanvien(String maNV, String hoten, String gioitinh,String ngaysinh,  String diachi, String chucvu, String khuvuc, String loainv, String sdt, String ngaynhap) {
        this.maNV = maNV;
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.chucvu = chucvu;
        this.khuvuc = khuvuc;
        this.loainv = loainv;
        this.sdt = sdt;
        this.ngaynhap = ngaynhap;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMaNV() {
        return maNV;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getKhuvuc() {
        return khuvuc;
    }

    public void setKhuvuc(String khuvuc) {
        this.khuvuc = khuvuc;
    }

    public String getLoainv() {
        return loainv;
    }

    public void setLoainv(String loainv) {
        this.loainv = loainv;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public boolean setMaNV1(String maNV) {
        if (maNV!=null&&maNV.length()==4){
            this.maNV = maNV;
            return true;}
        else {
            System.err.print("\t\t\tnhập mã nhân viên sai vui lòng nhập lại :");
            return false;
        }

    }
    public boolean sethoten1(String hoten) {

        if (hoten!=null&&hoten.length()!=0){
            this.hoten = hoten;
            return true;}
        else {
            System.err.print("\t\t\tvui lòng không để trống :");
            return false;
        }

    }
    public boolean setngaysinh1(String ngaysinh) {

        if (ngaysinh!=null && check(ngaysinh)){
            this.ngaysinh = ngaysinh;
            return true;}
        else {
            System.err.print("\t\t\tnhập sai vui lòng nhập lại theo mẫu DD-MM-YYYY :");
            return false;
        }

    }
    public boolean check(String  ngaysinh){
        String s="[0-3][0-9]/[0-1][0-9]/[0-9]{4}";
        return ngaysinh.matches(s);
    }
    public boolean setngaynhap1(String ngaynhap) {

        if (ngaynhap!=null && check2(ngaynhap)){
            this.ngaynhap = ngaynhap;
            return true;}
        else {
            System.err.print("\t\t\tnhập sai vui lòng nhập lại theo mẫu DD-MM-YYYY :");
            return false;
        }

    }
    public boolean check2(String  ngaynhap){
        String s="[0-3][0-9]/[0-1][0-9]/[0-9]{4}";
        return ngaynhap.matches(s);
    }
    public boolean setsdt1(String sdt){
        if(sdt!=null&&check1(sdt)){
            this.sdt=sdt;
            return true;
        }
        else {
            System.out.print("nhập số điên lại số điện thoại gồm 10 số :");
            return false;
        }
    }
    public boolean check1(String sdt){
        String s="[0-9]{10}";
        return sdt.matches(s);
    }
    public boolean setgiotinh1(String gioitinh) {

        if (gioitinh!=null&&gioitinh.equals("nam")||gioitinh.equals("nu")){
            this.gioitinh = gioitinh;
            return true;}
        else {
            System.err.print("\t\t\tnhập sai vui lòng nhập nam hoặc nữ :");
            return false;
        }
    }
    public boolean setloainhanvien1(String loainv) {

        if (loainv!=null&&loainv.equals("nhân viên")||loainv.equalsIgnoreCase("nhân viên TG")){
            this.loainv = loainv;
            return true;}
        else {
            System.err.print("\t\t\tnhập sai vui lòng nhập (nhân viên) hoặc (nhân viên TG):");
            return false;
        }
    }
    public boolean setdiachi1(String diachi) {

        if (diachi!=null&&diachi.length()!=0){
            this.diachi = diachi;
            return true;}
        else {
            System.err.print("\t\t\tnhập sai vui lòng không bỏ trống :");
            return false;
        }
    }
    public boolean setchucvu1(String chucvu) {
        if (chucvu!=null&&chucvu.equalsIgnoreCase("bếp trưởng")||chucvu.equalsIgnoreCase("bếp phó")||chucvu.equalsIgnoreCase("phụ bếp")||chucvu.equalsIgnoreCase("quản lý")||chucvu.equalsIgnoreCase("phó quản lý")||chucvu.equalsIgnoreCase("nhân viên")||chucvu.equalsIgnoreCase("tổ trưởng")||chucvu.equalsIgnoreCase("thu ngân")){
            this.chucvu=chucvu;
            return true;}
        else {
            System.err.print("\t\t\tnhập sai vui lòng nhập (quản lý,phó quản lý,bếp trưởng,thu ngân,bếp phó,phụ bếp,tổ trưởng,nhân viên ):");
            return false;
        }
    }
    public boolean setkhuvuc1(String khuvuc) {

        if (khuvuc!=null&&khuvuc.equals("bếp")||khuvuc.equals("quầy thu ngân")||khuvuc.equals("tiền sảnh")){
            this.khuvuc = khuvuc;
            return true;}
        else {
            System.err.print("\t\t\tnhập sai vui nhập(bếp ,quầy thu ngân ,tiền sảnh) :");
            return false;
        }
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }
    @Override
    public String toString() {
        return maNV+"#"+hoten+"#"+gioitinh+"#"+ngaysinh+"#"+diachi+"#"+chucvu+"#"+khuvuc +"#"+loainv+"#"+sdt+"#"+ngaynhap+"\n";
    }
}
