package com.company.nhanvien;

public class luong {
    private String manv;
    private String tenNV;
    private String tenchucvu;
    private String khuvuc;
    private int songaylam;
    private int songaylamthem;
    private int ngaynghicophep;
    private int ngaynghikhongphep;
    public static int luonglamfulltimetruongphong = 300000;
    public static int luonglamfulltimephotruongphong = 250000;
    public static int luonglamfulltimenv = 200000;
    public static int luonglamthemnv=250000;
    public static int luonglamthemsep=400000;
    public static int luonglamthempho=350000;
    private int tinhluong;
    private String ngaynhap;


    public luong(String manv, String tenNV, String tenchucvu, String khuvuc, int songaylam, int songaylamthem, int ngaynghicophep, int ngaynghikhongphep,int tinhluong, String ngaynhap) {
        this.manv = manv;
        this.tenNV = tenNV;
        this.tenchucvu = tenchucvu;
        this.khuvuc = khuvuc;

        this.songaylam = songaylam;
        this.songaylamthem = songaylamthem;
        this.ngaynghicophep = ngaynghicophep;
        this.ngaynghikhongphep = ngaynghikhongphep;
        this.tinhluong=tinhluong;
        this.ngaynhap = ngaynhap;

    }

    public luong() {

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

    public int getSongaylam() {
        return songaylam;
    }

    public void setSongaylam(int songaylam) {
        this.songaylam = songaylam;
    }

    public int getSongaylamthem() {
        return songaylamthem;
    }

    public void setSongaylamthem(int songaylamthem) {
        this.songaylamthem = songaylamthem;
    }

    public int getNgaynghicophep() {
        return ngaynghicophep;
    }

    public void setNgaynghicophep(int ngaynghicophep) {
        this.ngaynghicophep = ngaynghicophep;
    }

    public int getNgaynghikhongphep() {
        return ngaynghikhongphep;
    }

    public void setNgaynghikhongphep(int ngaynghikhongphep) {
        this.ngaynghikhongphep = ngaynghikhongphep;
    }

    public static int getLuonglamfulltimetruongphong() {
        return luonglamfulltimetruongphong;
    }

    public static void setLuonglamfulltimetruongphong(int luonglamfulltimetruongphong) {
        luong.luonglamfulltimetruongphong = luonglamfulltimetruongphong;
    }

    public static int getLuonglamfulltimephotruongphong() {
        return luonglamfulltimephotruongphong;
    }

    public static void setLuonglamfulltimephotruongphong(int luonglamfulltimephotruongphong) {
        luong.luonglamfulltimephotruongphong = luonglamfulltimephotruongphong;
    }

    public static int getLuonglamfulltimenv() {
        return luonglamfulltimenv;
    }

    public static void setLuonglamfulltimenv(int luonglamfulltimenv) {
        luong.luonglamfulltimenv = luonglamfulltimenv;
    }

    public static int getLuonglamthemnv() {
        return luonglamthemnv;
    }

    public static void setLuonglamthemnv(int luonglamthemnv) {
        luong.luonglamthemnv = luonglamthemnv;
    }

    public static int getLuonglamthemsep() {
        return luonglamthemsep;
    }

    public static void setLuonglamthemsep(int luonglamthemsep) {
        luong.luonglamthemsep = luonglamthemsep;
    }

    public static int getLuonglamthempho() {
        return luonglamthempho;
    }

    public static void setLuonglamthempho(int luonglamthempho) {
        luong.luonglamthempho = luonglamthempho;
    }

    public int getTinhluong() {
        return tinhluong;
    }

    public void setTinhluong(int tinhluong) {
        this.tinhluong = tinhluong;
    }

    public String getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public String ngaynghi(){
        return "cophep:"+ngaynghicophep+"\tkhongphep:"+ngaynghikhongphep;
    }
    public int tinhluong(){
        if (tenchucvu.equalsIgnoreCase("nhân viên")||tenchucvu.equalsIgnoreCase("phụ bếp")){
            return songaylam*luonglamfulltimenv+songaylamthem*luonglamthemnv;
        }
        if (tenchucvu.equalsIgnoreCase("phó bếp")||tenchucvu.equalsIgnoreCase("phó quản lý")||tenchucvu.equalsIgnoreCase("thu ngân")){
            return  songaylam*luonglamfulltimephotruongphong+songaylamthem*luonglamthempho;
        }
        else {
            return songaylam*luonglamfulltimetruongphong+songaylamthem*luonglamthemsep;
        }
    }
    public boolean sethoten(String tenNV) {

        if (tenNV!=null&&tenNV.length()!=0){
            this.tenNV = tenNV;
            return true;}
        else {
            System.out.println("\t\t\tvui lòng không để trống !!!");
            System.out.print("nhập lại :");
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

    }
    public boolean setkhuvuc(String khuvuc) {

        if (khuvuc!=null&&khuvuc.equals("bếp")||khuvuc.equals("quầy thu ngân")||khuvuc.equals("phục vụ")||khuvuc.equals("tiền sảnh")){
            this.khuvuc = khuvuc;
            return true;}
        else {
            System.err.print("\t\t\tnhập sai vui nhập(bếp ,quầy thu ngân ,tiền sảnh) :");
            return false;
        }
    }
    public boolean setchucvu(String chucvu) {

        if (chucvu!=null&&chucvu.equals("bếp trưởng")||chucvu.equals("bếp phó")||chucvu.equals("phụ bếp")||chucvu.equals("quản lý")||chucvu.equals("phó quản lý")||chucvu.equals("nhân viên")||chucvu.equals("tổ trưởng")||chucvu.equals("thu ngân")){
            this.tenchucvu=chucvu;
            return true;}
        else {
            System.err.println("\t\t\tnhập sai vui lòng nhập (quản lý,phó quản lý,bếp trưởng,thu ngân,bếp phó,phụ bếp,tổ trưởng,nhân viên ):");
            return false;
        }
    }
    public boolean setngaynhap(String ngaynhap) {

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
        return ngaynhap.matches(s);}

    @Override
    public String toString() {
        return  manv +
                "#" + tenNV +
                "#" + tenchucvu +
                "#" + khuvuc +
                "#" + songaylam +
                "#" + songaylamthem +
                "#" + ngaynghicophep +
                "#" + ngaynghikhongphep +
                "#"+tinhluong()+
                "#" + ngaynhap +"\n"
                ;
    }
}
