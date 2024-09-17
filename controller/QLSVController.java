package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.util.Date;

import javax.swing.Action;
import javax.swing.JOptionPane;

import model.Tinh;
import model.ThiSinh;
import view.QLSVView;
public class QLSVController implements Action{
    private QLSVView view;
    public QLSVController(QLSVView view) {
        this.view= view;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String src=e.getActionCommand();
        if(src.equals("Thêm")) {
            view.xoaForm();
            this.view.model.setLuaChon("Thêm");
        }else if(src.equals("Lưu")) {
            try {
                this.view.thucHienThem();
            } catch (Exception e2) {
                // TODO: handle exception
            }
        }else if(src.equals("Cập nhật")) {
             this.view.hienThiThongTinThiSinhDaChon();          
        }else if(src.equals("Xóa")) {
            this.view.thucHienXoa();
        }else if(src.equals("Hủy Bỏ")) {
            this.view.xoaForm();
        }else if(src.equals("Tìm")) {
            this.view.thucHienTim();
        }else if(src.equals("Hủy Tìm")) {
            this.view.thucHienHuyTim();
        }
    }
    @Override
    public Object getValue(String key) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public void putValue(String key, Object value) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void setEnabled(boolean b) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public boolean isEnabled() {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        // TODO Auto-generated method stub
        
    }
    
    
}
