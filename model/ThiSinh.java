package model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class ThiSinh implements Serializable{
    private int maThiSinh;
    private String tenThiSinh;
    private Tinh queQuan;
    private Date ngaySinh;
    private boolean gioiTinh;
    private float diemThiMon1;
    private float diemThiMon2;
    private float diemThiMon3;
    
    public ThiSinh() {  
    }
    
    public ThiSinh(int maThiSinh, String tenThiSinh, Tinh queQuan, Date ngaySinh2, boolean gioiTinh, float diemThiMon1,
            float diemThiMon2, float diemThiMon3) {
        this.maThiSinh = maThiSinh;
        this.tenThiSinh = tenThiSinh;
        this.queQuan = queQuan;
        this.ngaySinh = ngaySinh2;
        this.gioiTinh = gioiTinh;
        this.diemThiMon1 = diemThiMon1;
        this.diemThiMon2 = diemThiMon2;
        this.diemThiMon3 = diemThiMon3;
    }
    public int getMaThiSinh() {
        return maThiSinh;
    }
    public void setMaThiSinh(int maThiSinh) {
        this.maThiSinh = maThiSinh;
    }
    public String getTenThiSinh() {
        return tenThiSinh;
    }
    public void setTenThiSinh(String tenThiSinh) {
        this.tenThiSinh = tenThiSinh;
    }
    public Tinh getQueQuan() {
        return queQuan;
    }
    public void setQueQuan(Tinh queQuan) {
        this.queQuan = queQuan;
    }
    public Date getNgaySinh() {
        return ngaySinh;
    }
    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public boolean isGioiTinh() {
        return gioiTinh;
    }
    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public float getDiemThiMon1() {
        return diemThiMon1;
    }
    public void setDiemThiMon1(float diemThiMon1) {
        this.diemThiMon1 = diemThiMon1;
    }
    public float getDiemThiMon2() {
        return diemThiMon2;
    }
    public void setDiemThiMon2(float diemThiMon2) {
        this.diemThiMon2 = diemThiMon2;
    }
    public float getDiemThiMon3() {
        return diemThiMon3;
    }
    public void setDiemThiMon3(float diemThiMon3) {
        this.diemThiMon3 = diemThiMon3;
    }
    
    
    @Override
    public String toString() {
        return "thiSinh [maThiSinh=" + maThiSinh + ", tenThiSinh=" + tenThiSinh + ", queQuan=" + queQuan + ", ngaySinh="
                + ngaySinh + ", gioiTinh=" + gioiTinh + ", diemThiMon1=" + diemThiMon1 + ", diemThiMon2=" + diemThiMon2
                + ", diemThiMon3=" + diemThiMon3 + "]";
    }
    @Override
    public int hashCode() {
        return Objects.hash(diemThiMon1, diemThiMon2, diemThiMon3, gioiTinh, maThiSinh, ngaySinh, queQuan, tenThiSinh);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ThiSinh other = (ThiSinh) obj;
        return Float.floatToIntBits(diemThiMon1) == Float.floatToIntBits(other.diemThiMon1)
                && Float.floatToIntBits(diemThiMon2) == Float.floatToIntBits(other.diemThiMon2)
                && Float.floatToIntBits(diemThiMon3) == Float.floatToIntBits(other.diemThiMon3)
                && gioiTinh == other.gioiTinh && maThiSinh == other.maThiSinh
                && Objects.equals(ngaySinh, other.ngaySinh) && Objects.equals(queQuan, other.queQuan)
                && Objects.equals(tenThiSinh, other.tenThiSinh);
    }
    
    
}
