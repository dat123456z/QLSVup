package model;

import java.util.ArrayList;

public class QLSVModel {
  private ArrayList<ThiSinh> dsthiSinh;
  private String luaChon;
public QLSVModel(ArrayList<ThiSinh> dsthiSinh) { 
    this.dsthiSinh = dsthiSinh;
    
}

public QLSVModel() { 
    this.dsthiSinh = new ArrayList<ThiSinh> ();
    this.luaChon="";
}
public String getLuaChon() {
    return luaChon;
}

public void setLuaChon(String luaChon) {
    this.luaChon = luaChon;
}

public ArrayList<ThiSinh> getDsthiSinh() {
    return dsthiSinh;
}

public void setDsthiSinh(ArrayList<ThiSinh> dsthiSinh) {
    this.dsthiSinh = dsthiSinh;
}

  
  public void insert(ThiSinh ts) {
      this.dsthiSinh.add(ts);
  }
  
  public void delete(ThiSinh ts) {
              this.dsthiSinh.remove(ts);
  }
  
  public void update(ThiSinh ts) {
      this.dsthiSinh.remove(ts);
      this.dsthiSinh.add(ts);
  }

  public boolean kiemTraTonTai(ThiSinh ts) {
        for(ThiSinh thiSinh: dsthiSinh) {
            if(thiSinh.getMaThiSinh() == ts.getMaThiSinh())
                return true;
        }
        return false;
    }
}
