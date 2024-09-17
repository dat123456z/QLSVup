package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Tinh implements Serializable{ 
   private int maTinh;  
   private String tentinh;
public Tinh(int maTinh, String tentinh) {
    super();
    this.maTinh = maTinh;
    this.tentinh = tentinh;
}
public int getMaTinh() {
    return maTinh;
}
public void setMaTinh(int maTinh) {
    this.maTinh = maTinh;
}
public String getTentinh() {
    return tentinh;
}
public void setTentinh(String tentinh) {
    this.tentinh = tentinh;
}
@Override
public String toString() {
    return "Tinh [maTinh=" + maTinh + ", tentinh=" + tentinh + "]";
}
@Override
public int hashCode() {
    return Objects.hash(maTinh, tentinh);
}
@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Tinh other = (Tinh) obj;
    return Objects.equals(maTinh, other.maTinh) && Objects.equals(tentinh, other.tentinh);
}
   public static ArrayList<Tinh> getdsTinh(){
       String[] arr =  {
               "An Giang",
               "Bà Rịa-Vũng Tàu",
               "Bắc Giang",
               "Bắc Kạn",
               "Bạc Liêu",
               "Bắc Ninh",
               "Bến Tre",
               "Bình Định",
               "Bình Dương",
               "Bình Phước",
               "Bình Thuận",
               "Cà Mau",
               "Cần Thơ",
               "Cao Bằng",
               "Đà Nẵng",
               "Đắk Lắk",
               "Đắk Nông",
               "Điện Biên",
               "Đồng Nai",
               "Đồng Tháp",
               "Gia Lai",
               "Hà Giang",
               "Hà Nam",
               "Hà Nội",
               "Hà Tĩnh",
               "Hải Dương",
               "Hải Phòng",
               "Hậu Giang",
               "TP. Hồ Chí Minh",
               "Hòa Bình",
               "Hưng Yên",
               "Khánh Hòa",
               "Kiên Giang",
               "Kon Tum",
               "Lai Châu",
               "Lâm Đồng",
               "Lạng Sơn",
               "Lào Cai",
               "Long An",
               "Nam Định",
               "Nghệ An",
               "Ninh Bình",
               "Ninh Thuận",
               "Phú Thọ",
               "Phú Yên",
               "Quảng Bình",
               "Quảng Nam",
               "Quảng Ngãi",
               "Quảng Ninh",
               "Quảng Trị",
               "Sóc Trăng",
               "Sơn La",
               "Tây Ninh",
               "Thái Bình",
               "Thái Nguyên",
               "Thanh Hóa",
               "Thừa Thiên - Huế",
               "Tiền Giang",
               "Trà Vinh",
               "Tuyên Quang",
               "Vĩnh Long",
               "Vĩnh Phúc",
               "Yên Bái",
              
       };
       ArrayList<Tinh> listTinh = new ArrayList<Tinh>();
       int i=0;
       for(String tenTinh:arr) {
           Tinh t = new Tinh(i,tenTinh);
           listTinh.add(t);   
       }
       return listTinh;
   }
public static Tinh getQueQuanByID(int queQuan) {
    return Tinh.getdsTinh().get(queQuan);
}
public static Tinh getQueQuanByTen(String tenTinh) {
    ArrayList<Tinh> ds=Tinh.getdsTinh();
    for(Tinh tinh:ds) {
        if(tinh.getTentinh().equals(tenTinh)) {
            return tinh;
        }
        
    }
    return null;
}
}

*test
test.java
package test;

import java.io.IOException;
import view.QLSVView;

public class test {
   public static void main(String[] args) throws IOException{
   new QLSVView();
}
}
