package com.company.nhanvien;

public class luongbanthoigian {
    private  String manv;
    private  String tenNV;
    private String tenchucvu;
    private String khuvuc;
    private int sogiolam;
    private int luong;
    private String ngaynhap;

    public static int luongtheogio=17000;

    public luongbanthoigian(String manv, String tenNV, String tenchucvu, String khuvuc, int sogiolam,int luong, String ngaynhap) {
        this.manv = manv;
        this.tenNV = tenNV;
        this.tenchucvu = tenchucvu;
        this.khuvuc = khuvuc;
        this.sogiolam = sogiolam;
        this.luong=luong;
        this.ngaynhap = ngaynhap;
    }

    public luongbanthoigian() {

    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getTenchucvu() {
        return tenchucvu;
    }

    public void setTenchucvu(String tenchucvu) {
        this.tenchucvu = tenchucvu;
    }

    public String getKhuvuc() {
        return khuvuc;
    }

    public void setKhuvuc(String khuvuc) {
        this.khuvuc = khuvuc;
    }

    public int getSogiolam() {
        return sogiolam;
    }

    public void setSogiolam(int sogiolam) {
        this.sogiolam = sogiolam;
    }

    public String getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public static int getLuongtheogio() {
        return luongtheogio;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = tinhluong();
    }

    public static void setLuongtheogio(int luongtheogio) {
        luongbanthoigian.luongtheogio = luongtheogio;
    }

    public int tinhluong(){
        return sogiolam*luongtheogio;
    }public boolean setngaynhap(String ngaynhap) {

        if (ngaynhap!=null && check2(ngaynhap)){
            this.ngaynhap = ngaynhap;
            return true;}
        else {
            System.err.print("\t\t\tnhập sai vui lòng nhập lại theo mẫu DD-MM-YYYY :");
            return false;
        }

    }
    public boolean setmaNV(String maNV) {

        if (maNV!=null&&maNV.length()==4){
            this.manv = maNV;
            return true;}
        else {
            System.err.print("\t\t\tnhập mã nhân viên sai vui lòng nhập lại :");
            return false;
        }

    }public boolean check2(String  ngaynhap){
        String s="[0-3][0-9]/[0-1][0-9]/[0-9]{4}";
        return ngaynhap.matches(s);}
    public boolean setkhuvuc(String khuvuc) {

        if (khuvuc!=null&&khuvuc.equals("bếp")||khuvuc.equals("quầy thu ngân")||khuvuc.equals("phục vụ")||khuvuc.equals("tiến sảnh")){
            this.khuvuc = khuvuc;
            return true;}
        else {
            System.out.print("\t\t\tnhập sai vui lòng nhập(bếp ,quầy thu ngân ,tiền sảnh) :");
            return false;
        }
    }public boolean setchucvu(String chucvu) {
        if (chucvu!=null&&chucvu.equals("phụ bếp")||chucvu.equals("nhân viên")||chucvu.equals("thu ngân")){
            this.tenchucvu=chucvu;
            return true;}
        else {
            System.out.print("\t\t\tnhập sai vui lòng nhập (thu ngân,phụ bếp,nhân viên ):");
            return false;
        }
    } public boolean sethoten(String tenNV) {

        if (tenNV!=null&&tenNV.length()!=0){
            this.tenNV = tenNV;
            return true;}
        else {
            System.out.println("\t\t\tvui lòng không để trống !");
            System.out.print("nhập lại :");
            return false;
        }

    }

    @Override
    public String toString() {
        return  manv + "#" + tenNV + "#" + tenchucvu + "#" + khuvuc + "#" + sogiolam +"#"+tinhluong()+ "#" + ngaynhap+"\n"
                ;
    }
}
