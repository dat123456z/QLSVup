package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.QLSVModel;
import model.Tinh;
import model.ThiSinh;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.JSeparator;
import java.awt.Font;

import javax.swing.Action;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import java.awt.ScrollPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import controller.QLSVController;

import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import java.awt.event.ActionEvent;

public class QLSVView extends JFrame {

    public JPanel contentPane;
    public QLSVModel model;
    public JTable table;
    public JTextField textField_maThiSinh;
    public JTextField textField_hoVaTen;
    public JTextField textField_ngaySinh;
    public JTextField textField_mon1;
    public JTextField textField_mon2;
    public JTextField textField_mon3;
    public JRadioButton rdbtn_nam;
    public JRadioButton rdbtn_nu;
    public JComboBox comboBox_queQuan;
    public ButtonGroup btngrp;
    public JButton btn_Them;
    public JButton btn_sua;
    public JButton btn_update;
    public JButton btn_luu;
    public JButton btn_xoa;
    public JButton btn_huyBo;
    public JTextField textField_maThiSinhTimKiem;
    public JComboBox comboBox_queQuanCanTim;

    /**
     * Launch the application.
     */
    public static void main(String[] args) throws IOException{
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    QLSVView frame = new QLSVView();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public QLSVView() {
        this.model = new QLSVModel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 859, 565);
        Action ac= new QLSVController(this);
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        
        JMenu mnNewMenu = new JMenu("File");
        mnNewMenu.addActionListener(ac);
        mnNewMenu.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        menuBar.add(mnNewMenu);
        
        JMenuItem mntmNewMenuItem_Open = new JMenuItem("Open");
        mntmNewMenuItem_Open.addActionListener(ac);
        mntmNewMenuItem_Open.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        mnNewMenu.add(mntmNewMenuItem_Open);
        
        JMenuItem mntmNewMenuItem_Close = new JMenuItem("Close");
        mntmNewMenuItem_Open.addActionListener(ac);
        mntmNewMenuItem_Close.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        mnNewMenu.add(mntmNewMenuItem_Close);
        
        JSeparator separator = new JSeparator();
        mnNewMenu.add(separator);
        
        JMenuItem mntmNewMenuItem_Exit = new JMenuItem("Exit");
        mntmNewMenuItem_Exit.addActionListener(ac);
        mntmNewMenuItem_Exit.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        mnNewMenu.add(mntmNewMenuItem_Exit);
        
        JMenu mnNewMenu_About = new JMenu("About");
        
        mnNewMenu_About.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        menuBar.add(mnNewMenu_About);
        mnNewMenu_About.addActionListener(ac);
        JMenuItem mntmNewMenuItem_Aboutme = new JMenuItem("About me");
        mntmNewMenuItem_Aboutme.addActionListener(ac);
        mntmNewMenuItem_Aboutme.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        mnNewMenu.add(mntmNewMenuItem_Aboutme);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblQuQun = new JLabel("Quê Quán");
        lblQuQun.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lblQuQun.setBounds(30, 10, 92, 45);
        contentPane.add(lblQuQun);
        
        comboBox_queQuanCanTim = new JComboBox();
        ArrayList<Tinh> dsTinh = Tinh.getdsTinh();
        comboBox_queQuanCanTim.addItem("");
        for(Tinh tinh:dsTinh) {
            comboBox_queQuanCanTim.addItem(tinh.getTentinh());
        }
        comboBox_queQuanCanTim.setBounds(126, 10, 209, 45);
        contentPane.add(comboBox_queQuanCanTim);
        
        JLabel lblMThSinh = new JLabel("Mã Thí Sinh");
        lblMThSinh.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lblMThSinh.setBounds(345, 10, 116, 45);
        contentPane.add(lblMThSinh);
        
        JButton btn_Tim = new JButton("Tìm");
        btn_Tim.addActionListener(ac);
        btn_Tim.setFont(new Font("Tahoma", Font.PLAIN, 19));
        btn_Tim.setBounds(598, 10, 85, 45);
        contentPane.add(btn_Tim);
        
        JSeparator separator_1 = new JSeparator();
        separator_1.setBounds(10, 62, 825, 2);
        contentPane.add(separator_1);
        
        JLabel lblDanhSchSinh = new JLabel("Danh Sách Sinh Viên");
        lblDanhSchSinh.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lblDanhSchSinh.setBounds(10, 72, 201, 23);
        contentPane.add(lblDanhSchSinh);
        table = new JTable();
        
        table.setModel(new DefaultTableModel(
            new Object[][] {
            },
            new String[] {
                "M\u00E3 th\u00ED sinh", "H\u1ECD t\u00EAn", "Qu\u00EA qu\u00E1n", "Ng\u00E0y Sinh", "Gi\u1EDBi t\u00EDnh", "\u0110i\u1EC3m m\u00F4n 1", "\u0110i\u1EC3m m\u00F4n 2", "\u0110i\u1EC3m m\u00F4n 3"
            }
        ));
        
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(10, 98, 825, 149);
        contentPane.add(scrollPane);
        
        JSeparator separator_1_1 = new JSeparator();
        separator_1_1.setBounds(10, 257, 825, 2);
        contentPane.add(separator_1_1);
        
        JLabel lblThngTin = new JLabel(" Thông tin thí sinh");
        lblThngTin.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lblThngTin.setBounds(0, 267, 201, 23);
        contentPane.add(lblThngTin);
        
        JLabel lblMThSinh_1 = new JLabel("Mã thí sinh");
        lblMThSinh_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lblMThSinh_1.setBounds(10, 300, 116, 23);
        contentPane.add(lblMThSinh_1);
        
        textField_maThiSinh = new JTextField();
        textField_maThiSinh.setColumns(10);
        textField_maThiSinh.setBounds(122, 300, 140, 23);
        contentPane.add(textField_maThiSinh);
        
        JLabel label_tên = new JLabel("Họ và tên");
        label_tên.setFont(new Font("Tahoma", Font.PLAIN, 19));
        label_tên.setBounds(10, 333, 116, 23);
        contentPane.add(label_tên);
        
        textField_hoVaTen = new JTextField();
        textField_hoVaTen.setColumns(10);
        textField_hoVaTen.setBounds(122, 333, 140, 23);
        contentPane.add(textField_hoVaTen);
        
        JLabel label_quêquán = new JLabel("Quê quán");
        label_quêquán.setFont(new Font("Tahoma", Font.PLAIN, 19));
        label_quêquán.setBounds(10, 366, 116, 23);
        contentPane.add(label_quêquán);
        
        comboBox_queQuan = new JComboBox();
        comboBox_queQuan.addItem("");
        for (Tinh tinh : dsTinh) {
            comboBox_queQuan.addItem(tinh.getTentinh());
        }
        comboBox_queQuan.setBounds(122, 366, 140, 23);
        contentPane.add(comboBox_queQuan);
        
        JLabel label_ngaysinh = new JLabel("Ngày sinh");
        label_ngaysinh.setFont(new Font("Tahoma", Font.PLAIN, 19));
        label_ngaysinh.setBounds(10, 399, 116, 23);
        contentPane.add(label_ngaysinh);
        
        textField_ngaySinh = new JTextField();
        textField_ngaySinh.setColumns(10);
        textField_ngaySinh.setBounds(122, 399, 140, 23);
        contentPane.add(textField_ngaySinh);
        
        JLabel label_gioitinh = new JLabel("Giới Tính");
        label_gioitinh.setFont(new Font("Tahoma", Font.PLAIN, 19));
        label_gioitinh.setBounds(351, 300, 116, 23);
        contentPane.add(label_gioitinh);
        
        rdbtn_nam = new JRadioButton("Nam");
        rdbtn_nam.setFont(new Font("Tahoma", Font.PLAIN, 19));
        rdbtn_nam.setBounds(448, 300, 103, 23);
        contentPane.add(rdbtn_nam);
        
        rdbtn_nu = new JRadioButton("Nữ");
        rdbtn_nu.setFont(new Font("Tahoma", Font.PLAIN, 19));
        rdbtn_nu.setBounds(553, 300, 103, 23);
        contentPane.add(rdbtn_nu);
        btngrp = new ButtonGroup();
        btngrp.add(rdbtn_nam);
        btngrp.add(rdbtn_nu);
        JLabel label_mon1 = new JLabel("Môn 1");
        label_mon1.setFont(new Font("Tahoma", Font.PLAIN, 19));
        label_mon1.setBounds(351, 333, 116, 23);
        contentPane.add(label_mon1);
        
        textField_mon1 = new JTextField();
        textField_mon1.setColumns(10);
        textField_mon1.setBounds(458, 333, 140, 23);
        contentPane.add(textField_mon1);
        
        JLabel label_mon2 = new JLabel("Môn 2");
        label_mon2.setFont(new Font("Tahoma", Font.PLAIN, 19));
        label_mon2.setBounds(351, 366, 116, 23);
        contentPane.add(label_mon2);
        
        JLabel label_mon3 = new JLabel("Môn 3");
        label_mon3.setFont(new Font("Tahoma", Font.PLAIN, 19));
        label_mon3.setBounds(351, 399, 116, 23);
        contentPane.add(label_mon3);
        
        textField_mon2 = new JTextField();
        textField_mon2.setColumns(10);
        textField_mon2.setBounds(458, 366, 140, 23);
        contentPane.add(textField_mon2);
        
        textField_mon3 = new JTextField();
        textField_mon3.setColumns(10);
        textField_mon3.setBounds(458, 399, 140, 23);
        contentPane.add(textField_mon3);
        
        btn_Them = new JButton("Thêm");
        btn_Them.addActionListener(ac);
        btn_Them.setFont(new Font("Tahoma", Font.PLAIN, 19));
        btn_Them.setBounds(49, 433, 85, 45);
        contentPane.add(btn_Them);
        
        btn_xoa = new JButton("Xóa");
        btn_xoa.addActionListener(ac);
        btn_xoa.setFont(new Font("Tahoma", Font.PLAIN, 19));
        btn_xoa.setBounds(165, 433, 85, 45);
        contentPane.add(btn_xoa);
        
        btn_update = new JButton("Cập nhật");
        btn_update.addActionListener(ac);
        btn_update.setFont(new Font("Tahoma", Font.PLAIN, 19));
        btn_update.setBounds(277, 433, 132, 45);
        contentPane.add(btn_update);
        
        btn_luu = new JButton("Lưu");
        btn_luu.addActionListener(ac);
        btn_luu.setFont(new Font("Tahoma", Font.PLAIN, 19));
        btn_luu.setBounds(442, 433, 85, 45);
        contentPane.add(btn_luu);
        
        btn_huyBo = new JButton("Hủy Bỏ");
        btn_huyBo.addActionListener(ac);
        btn_huyBo.setFont(new Font("Tahoma", Font.PLAIN, 19));
        btn_huyBo.setBounds(553, 432, 140, 45);
        contentPane.add(btn_huyBo);
        
        textField_maThiSinhTimKiem = new JTextField();
        textField_maThiSinhTimKiem.setColumns(10);
        textField_maThiSinhTimKiem.setBounds(448, 14, 140, 45);
        contentPane.add(textField_maThiSinhTimKiem);
        
        JButton btn_HuyTim = new JButton("Hủy Tìm");
        btn_HuyTim.addActionListener(ac);
        btn_HuyTim.setFont(new Font("Tahoma", Font.PLAIN, 19));
        btn_HuyTim.setBounds(693, 10, 142, 45);
        contentPane.add(btn_HuyTim);

        this.setVisible(true);
    }

    public void xoaForm() {
        textField_maThiSinh.setText("");
        textField_ngaySinh.setText("");
        textField_hoVaTen.setText("");
        textField_mon1.setText("");
        textField_mon2.setText("");
        textField_mon3.setText("");
        comboBox_queQuan.setSelectedIndex(-1);
        btngrp.clearSelection();
    }
    
    public ThiSinh getThiSinhDangChon() {
        DefaultTableModel model_table = (DefaultTableModel) table.getModel();
        int i_row=table.getSelectedRow();
        int maThiSinh = Integer.valueOf(model_table.getValueAt(i_row, 0)+"");
        String tenThiSinh = model_table.getValueAt(i_row, 1)+"";
        Tinh tinh=Tinh.getQueQuanByTen(model_table.getValueAt(i_row, 2)+"");
        String s_ngaySinh=model_table.getValueAt(i_row, 3)+"";
        Date ngaySinh = new Date(s_ngaySinh);
        String text_GioiTinh = model_table.getValueAt(i_row, 4)+"";
        boolean gioiTinh= text_GioiTinh.equals("Nam");
        float diemThiMon1=Float.valueOf(model_table.getValueAt(i_row, 5)+"");
        float diemThiMon2=Float.valueOf(model_table.getValueAt(i_row, 6)+"");
        float diemThiMon3=Float.valueOf(model_table.getValueAt(i_row, 7 )+"");
        ThiSinh ts = new ThiSinh(maThiSinh, tenThiSinh, tinh, ngaySinh, gioiTinh, diemThiMon1, diemThiMon2, diemThiMon3);
        return ts;
    }
    
    public void themThiSinhVaoTable(ThiSinh ts) {
        DefaultTableModel model_table = (DefaultTableModel) table.getModel();
        model_table.addRow(new Object[] { ts.getMaThiSinh() + "", ts.getTenThiSinh(), ts.getQueQuan().getTentinh(),
                ts.getNgaySinh().getDate() + "/" + (ts.getNgaySinh().getMonth() + 1) + "/"
                        + (ts.getNgaySinh().getYear() + 1900),
                (ts.isGioiTinh() ? "Nam" : "Nữ"), ts.getDiemThiMon1() + "", ts.getDiemThiMon2() + "",
                ts.getDiemThiMon3() + "", });
    }
    
    public void themhoaccapnhatThiSinh(ThiSinh ts) {
        DefaultTableModel model_table = (DefaultTableModel) table.getModel();
        if(!this.model.kiemTraTonTai(ts)) {
            this.model.insert(ts);
            this.themThiSinhVaoTable(ts);
        }else if(this.model.kiemTraTonTai(ts)){
            this.model.update(ts);
            int soLuongDong = model_table.getRowCount();
            for (int i = 0; i < soLuongDong; i++) {
                String id = model_table.getValueAt(i, 0) + "";
                if (id.equals(ts.getMaThiSinh() + "")) {
                    model_table.setValueAt(ts.getMaThiSinh() + "", i, 0);
                    model_table.setValueAt(ts.getTenThiSinh() + "", i, 1);
                    model_table.setValueAt(ts.getQueQuan().getTentinh() + "", i, 2);
                    model_table.setValueAt(ts.getNgaySinh().getDate() + "/" + (ts.getNgaySinh().getMonth() + 1) + "/"
                            + (ts.getNgaySinh().getYear() + 1900) + "", i, 3);
                    model_table.setValueAt((ts.isGioiTinh() ? "Nam" : "Nữ"), i, 4);
                    model_table.setValueAt(ts.getDiemThiMon1() + "", i, 5);
                    model_table.setValueAt(ts.getDiemThiMon2() + "", i, 6);
                    model_table.setValueAt(ts.getDiemThiMon3() + "", i, 7);

                }
            }
        }
    }
        

    public void hienThiThongTinThiSinhDaChon() {
        ThiSinh ts = getThiSinhDangChon();
        this.textField_maThiSinh.setText(ts.getMaThiSinh()+"");
        this.textField_hoVaTen.setText(ts.getTenThiSinh()+"");
        this.comboBox_queQuan.setSelectedItem(ts.getQueQuan().getTentinh());
        String s_ngaySinh = ts.getNgaySinh().getDate()+ "/" + (ts.getNgaySinh().getMonth() + 1) + "/" + (ts.getNgaySinh().getYear() + 1900);
        this.textField_ngaySinh.setText(s_ngaySinh+"");
        if(ts.isGioiTinh()) {
            rdbtn_nam.setSelected(true);
        }else {
            rdbtn_nu.setSelected(true);
        }
        
        this.textField_mon1.setText(ts.getDiemThiMon1()+"");
        this.textField_mon2.setText(ts.getDiemThiMon2()+"");
        this.textField_mon3.setText(ts.getDiemThiMon3()+"");
        
    }

    public void thucHienXoa() {
        DefaultTableModel model_table = (DefaultTableModel) table.getModel();
        int i_row=table.getSelectedRow();
        int luaChon=JOptionPane.showConfirmDialog(this, "Bạn có chắc xóa thông tin");
        if(JOptionPane.YES_OPTION==luaChon) {
            ThiSinh ts = getThiSinhDangChon();
            this.model.delete(ts);
            model_table.removeRow(i_row);
        }
        
    }

    public void thucHienThem() {
        int maThiSinh = Integer.valueOf(this.textField_maThiSinh.getText());
        String tenThiSinh = this.textField_hoVaTen.getText();
        int queQuan=this.comboBox_queQuan.getSelectedIndex()-1;
        Date ngaySinh = new Date(this.textField_ngaySinh.getText());
        Tinh tinh=Tinh.getQueQuanByID(queQuan);
        boolean gioiTinh = true;
        if (this.rdbtn_nam.isSelected()) {
            gioiTinh = true;
        } else if (this.rdbtn_nu.isSelected()) {
            gioiTinh = false;
        }
        float diemThiMon1=Float.valueOf(this.textField_mon1.getText());
        float diemThiMon2=Float.valueOf(this.textField_mon2.getText());
        float diemThiMon3=Float.valueOf(this.textField_mon3.getText());

        ThiSinh ts= new ThiSinh(maThiSinh, tenThiSinh, tinh,ngaySinh , gioiTinh, diemThiMon1, diemThiMon2, diemThiMon3);
        this.themhoaccapnhatThiSinh(ts);
    }

    public void thucHienTim() {
        this.thucHienHuyTim();
        int queQuan= this.comboBox_queQuanCanTim.getSelectedIndex()-1;
        String maTS= this.textField_maThiSinhTimKiem.getText();
        DefaultTableModel model_table = (DefaultTableModel) table.getModel();
        int soLuongDong = model_table.getRowCount();
        Set<Integer> idThiSinhCanXoa = new TreeSet<Integer>();
        if(queQuan>=0) {
            Tinh tinhDaChon = Tinh.getQueQuanByID(queQuan);
            for (int i = 0; i < soLuongDong; i++) {
                String id = model_table.getValueAt(i, 0) + "";
                String tenTinh=model_table.getValueAt(i, 2)+"";
                if (!tenTinh.equals(tinhDaChon.getTentinh())) {
                     idThiSinhCanXoa.add(Integer.valueOf(id));
                }
            }
        }   
        if(maTS.length()>0) {
            for (int i = 0; i < soLuongDong; i++) {
                String id=model_table.getValueAt(i, 0)+"";
                if (!id.equals(maTS)) {
                     idThiSinhCanXoa.add(Integer.valueOf(id));
                }
            }
        }
        for (Integer idCanXoa : idThiSinhCanXoa) {
            soLuongDong = model_table.getRowCount();
            for(int i =0 ; i < soLuongDong ; i++ ) {
                String idTrongTable = model_table.getValueAt(i, 0)+"";
                if(idTrongTable.equals(idCanXoa.toString())) {
                    try {
                        model_table.removeRow(i);
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                    break;
                }
            }
            
        }
    }
    

    
    public void thucHienHuyTim() {
        while(true) {
            DefaultTableModel model_table = (DefaultTableModel) table.getModel();
            int soluongdong=model_table.getRowCount();
            if(soluongdong==0)
                break;
            else {
                try {
                    model_table.removeRow(0);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        for (ThiSinh ts : this.model.getDsthiSinh()) {
            this.themThiSinhVaoTable(ts);
        }
    }
}
