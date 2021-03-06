/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Dao.DBConnection;
import Dao.SinhVienDao;

import Model.SinhVien;
import Service.SinhVienService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class home extends javax.swing.JFrame {
    SinhVienService sinhVienService;
    
    SinhVienDao dao = new SinhVienDao();
    String strFind = "";
    String srtTK ="";
    /**
     * Creates new form home
     */
    
    public home(){
        initComponents();
        hometk();
        tkComboBox();
    }
    
    
    public void hometk() {
        DefaultTableModel tbModel = (DefaultTableModel) table_SinhVien1.getModel();
        tbModel.setRowCount(0);//Xóa data Trong table
        for(SinhVien st : dao.getfindSVById(strFind)){
            Object dataRow[] = new Object[11];
            dataRow[0] = st.getMaSV();
            dataRow[1] = st.getTenSV();
            dataRow[2] = st.getLopSH();
            dataRow[3] = st.getKhoa();
            dataRow[4] = st.getGioiTinh();
            dataRow[5] = st.getSDT();
            dataRow[6] = st.geteMail();
            dataRow[7] = st.getNgaySinh();
            dataRow[8] = st.getDoiTuong();
            dataRow[9] = st.getNamHoc();
            dataRow[10] = st.getGhiChu();  
            tbModel.addRow(dataRow);
        }
        
    }
    
    public void tkComboBox(){
          DefaultTableModel tbModel = (DefaultTableModel) table_SinhVien1.getModel();
        tbModel.setRowCount(0);//Xóa data Trong table
        for(SinhVien st : dao.getfindSVByDT(srtTK)){
            Object dataRow[] = new Object[11];
            dataRow[0] = st.getMaSV();
            dataRow[1] = st.getTenSV();
            dataRow[2] = st.getLopSH();
            dataRow[3] = st.getKhoa();
            dataRow[4] = st.getGioiTinh();
            dataRow[5] = st.getSDT();
            dataRow[6] = st.geteMail();
            dataRow[7] = st.getNgaySinh();
            dataRow[8] = st.getDoiTuong();
            dataRow[9] = st.getNamHoc();
            dataRow[10] = st.getGhiChu();  
            tbModel.addRow(dataRow);
        }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        textboxsearch = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        timkiem_Button = new javax.swing.JButton();
        doiTuong_ComboBox = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_SinhVien1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField_User = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPasswordField = new javax.swing.JPasswordField();
        chucvuComboBox = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N

        jPanel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel3AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        textboxsearch.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 255));
        jLabel27.setText("Tìm kiếm :");

        timkiem_Button.setBackground(new java.awt.Color(255, 204, 204));
        timkiem_Button.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        timkiem_Button.setText("Tìm kiếm");
        timkiem_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timkiem_ButtonActionPerformed(evt);
            }
        });

        doiTuong_ComboBox.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        doiTuong_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hộ nghèo", "Hộ cận nghèo", "Con Thương binh liệt sĩ", "Mồ côi", "Con Cb", "Cn", "Vc tai nạn lao động", "Khuyết tật", "Hoàn cảnh khó khắn", "Dân tộc thiểu số" }));

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 51, 255));
        jLabel28.setText("Lọc theo danh mục:");

        table_SinhVien1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã SV", "Họ Tên", "Lớp SH", "Khoa", "Giới Tính", "SĐT", "Email", "Ngày Sinh", "Đối Tượng", "Năm Học", "Ghi Chú"
            }
        ));
        jScrollPane2.setViewportView(table_SinhVien1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(31, 31, 31)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textboxsearch, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                    .addComponent(doiTuong_ComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addComponent(timkiem_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(355, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textboxsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(timkiem_Button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(doiTuong_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
        );

        jTabbedPane1.addTab("HOME", new javax.swing.ImageIcon(getClass().getResource("/image/navigator.png")), jPanel3); // NOI18N

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("- Nếu bạn là Sinh viên, giản viên muốn tìm kiếm sách hãy đăng nhập với quyền Độc giả để bắt đầu tra cứu ");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("- Nếu bạn là cán bộ quản lý thư viện hãy đăng nhập với quyền Thủ thứ để tiến hành quản lý hệ thống!");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/learning.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("ĐĂNG NHẬP");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("TÊN ĐĂNG NHẬP");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("MẬT KHẨU");

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("ĐĂNG NHẬP");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("ĐĂNG KÍ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPasswordField.setText("jPasswordField2");

        chucvuComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sinh Viên", "Nhân Viên" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel4)
                .addGap(61, 61, 61)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(70, 70, 70)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5)
                        .addComponent(jTextField_User, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                        .addComponent(jPasswordField))
                    .addComponent(chucvuComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(172, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(72, 72, 72))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(58, 58, 58)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(239, 239, 239))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(chucvuComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(49, 49, 49))
        );

        jTabbedPane1.addTab("ĐĂNG NHẬP", new javax.swing.ImageIcon(getClass().getResource("/image/login.png")), jPanel4); // NOI18N

        jPanel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Giúp cho trường đại học Sư Phạm Kỹ Thuật quản lý được thông tin các sinh viên thuộc diện chính sách một cách nhanh chóng và dễ dàng.\nGiúp các bạn sinh viên đăng ký diện chính sách không còn gặp nhiều rắc rối về việc giấy tờ khi phải chờ trong thời gian lâu.\nTránh tình trạng thất lạc giấy tờ giữa nhà trường và sinh viên.\n\t\t----------------------------------------------------------------------------------\n>Đối tượng sinh viên được miễn 100%  học phí:\n          Con của liệt sỹ, thương binh, bệnh binh; con của người hoạt động kháng chiến bị chất độc màu da cam.\n          Sinh viên bị tàn tật, khuyết tật thuộc diện cận nghèo hoặc hộ nghèo.\n          Sinh viên hệ cử tuyển.\n          Sinh viên là người dân tộc thiểu số thuộc hộ nghèo và hộ cận nghèo theo quy định của Thủ tướng Chính phủ phê duyệt theo từng thời kỳ.\n          Sinh viên người dân tộc thiểu số rất ít người ở vùng có điều kiện kinh tế-xã hội khó khăn hoặc đặc biệt khó khăn.\n>Đối tượng sinh viên được miễn 70% học phí:\n          Sinh viên là người dân tộc thiểu số có điều kiện kinh tế xã hội đặc biệt khó khăn theo quy định của cơ quan nhà nước có thẩm quyền. Cụ thể:\n            + Người dân tộc thiểu số (không phải là người dân tộc thiểu số rất ít người)\n            + Vùng có điều kiện kinh tế xã hội đặc biệt khó khăn được quy định tại phụ lục I kèm theo Thông tư liên tịch số 09/TTLT- BGD ĐT-BTC- BLĐTBXH\n (trừ các vùng có điều kiện kinh tế- xã hội khó khăn)\n>Đối tượng sinh viên được giảm 50% học phí:\n          Sinh viên là con cán bộ, công nhân, viên chức mà cha hoặc mẹ bị tai nạn lao động hoặc mắc bệnh nghề nghiệp được hưởng trợ cấp thường xuyên.\n>Đối tượng  sinh viên được hưởng trợ cấp xã hội:\n          Sinh viên là người dân tộc ít người ở vùng cao.\n          Sinh viên mồ côi cả cha lẫn mẹ không nơi nương tựa.\n          Sinh viên tàn tật theo quy định của Nhà nước và gặp khó khăn về kinh tế, khả năng lao động bị suy giảm từ 41% trở lên.\n          Sinh viên có hoàn cảnh đặc biệt khó khăn về kinh tế, vượt khó học tập là những người mà gia đình thuộc diện xóa đói giảm nghèo.\nLink tham khảo thêm các mẫu hướng dẫn và mẫu đơn đăng ký diện chính sách của trường đại học Sư Phạm Kỹ Thuật:\n https://drive.google.com/drive/folders/1YEF7_6B0MTCW-w5sB42IHlk2aJ6LwxsG?usp=sharing\n");
        jTextArea1.setMaximumSize(new java.awt.Dimension(32767, 32767));
        jTextArea1.setMinimumSize(new java.awt.Dimension(100, 80));
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1106, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("GIỚI THIỆU", new javax.swing.ImageIcon(getClass().getResource("/image/contact-list.png")), jPanel2); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo-truong-250.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("QUẢN LÍ DANH SÁCH SINH VIÊN THUỘC DIỆN CHÍNH SÁCH");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("TRƯỜNG ĐẠI HỌC SƯ PHẠM KĨ THUẬT ĐÀ NẴNG");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            Connection connection = DBConnection.getConnection();
            String chucvu = String.valueOf(chucvuComboBox.getSelectedItem());
            if(chucvu == "Nhân Viên")
            {
                String sql = "select * from Ad_min where tkAdmin = ? and mkAdmin =?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, jTextField_User.getText());
            ps.setString(2, String.valueOf(jPasswordField.getPassword()));

            ResultSet rs = ps.executeQuery();//trả về 1 đối tượng resultset khi thực thi câu lệnh select

            if (jTextField_User.getText().equals("") || jPasswordField.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "chưa nhập user và password");
            } else if (rs.next()) {
                new nhanvien().setVisible(true);
                this.dispose();
                JOptionPane.showMessageDialog(this, "Đăng nhập thành công");
            } else {
                JOptionPane.showMessageDialog(this, "Đăng nhập thất bại");
            }
            } else {
                String sql = "select * from Users where tk = ? and mk =?";
                PreparedStatement ps = connection.prepareStatement(sql);
                ps.setString(1, jTextField_User.getText());
                ps.setString(2, String.valueOf(jPasswordField.getPassword()));
 
                ResultSet rs = ps.executeQuery();//trả về 1 đối tượng resultset khi thực thi câu lệnh select

                if (jTextField_User.getText().equals("") || jPasswordField.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "chưa nhập user và password");
                } else if (rs.next()) {
                    new SINHVIEN().setVisible(true);
                    this.dispose();
                JOptionPane.showMessageDialog(this, "Đăng nhập thành công");
                } else {
                      JOptionPane.showMessageDialog(this, "Đăng nhập thất bại");
            }
            }
        } catch (SQLException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new signup().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel3AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3AncestorAdded

    private void timkiem_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timkiem_ButtonActionPerformed
        // TODO add your handling code here:
        
         if (textboxsearch.getText().equals("") )
         {
             srtTK = String.valueOf(doiTuong_ComboBox.getSelectedItem());
             tkComboBox();
         }
        else
         {
            strFind = textboxsearch.getText();
            hometk();
         }
        
    }//GEN-LAST:event_timkiem_ButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new home().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> chucvuComboBox;
    private javax.swing.JComboBox<String> doiTuong_ComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField_User;
    private javax.swing.JTable table_SinhVien1;
    private javax.swing.JTextField textboxsearch;
    private javax.swing.JButton timkiem_Button;
    // End of variables declaration//GEN-END:variables
}
