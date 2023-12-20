/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package QLCH.UI;

import com.formdev.flatlaf.FlatLightLaf;

import QLCH.Utils.Masterfrom;
import QLCH.Utils.UndoRedo;
import QLCH.Utils.Thread_Menu;
import QLCH.Utils.Thread_Menu2;
import QLCH.Utils.AuthRoleQLCH;
import QLCH.Utils.MessageBoxQLCH;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import static java.awt.Font.BOLD;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;
import sun.net.www.content.text.plain;

/**
 *
 * @author AD
 */
public class HomeJFrame extends javax.swing.JFrame {

    private final UndoRedo<Masterfrom> forms = new UndoRedo<>();

    public void showForm(Masterfrom form) {
        forms.add(form);
        pnlView.removeAll();
        pnlView.add(form);
        pnlView.revalidate();
        pnlView.repaint();
    }

    public void showFooterForm(Masterfrom form2) {
        forms.add(form2);
        pnlFooter.removeAll();
        pnlFooter.add(form2);
        pnlFooter.revalidate();
        pnlFooter.repaint();
    }

    public HomeJFrame() {
        initComponents();
        setLocationRelativeTo(null);
        init();
        showTrangChu();
        showFooterForm(new FooterJPanel());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackgroudAll = new javax.swing.JPanel();
        pnlHeader = new javax.swing.JPanel();
        pnlCtrForm = new javax.swing.JPanel();
        lblLogout = new javax.swing.JLabel();
        lblMize = new javax.swing.JLabel();
        lblSubtract = new javax.swing.JLabel();
        lblHeaderTitle = new javax.swing.JLabel();
        pnlClock = new javax.swing.JPanel();
        lblCalendarIcon = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblHelloNV = new javax.swing.JLabel();
        lblHelloNV1 = new javax.swing.JLabel();
        pnlPhancach = new javax.swing.JPanel();
        pnlContent = new javax.swing.JPanel();
        pnlView = new javax.swing.JPanel();
        pnlFooter = new javax.swing.JPanel();
        pnlListMenuIcon = new javax.swing.JPanel();
        pnlListMenu = new javax.swing.JPanel();
        btnTrangChu = new javax.swing.JPanel();
        lblTrangchu = new javax.swing.JLabel();
        ind1 = new javax.swing.JPanel();
        btnBanHang = new javax.swing.JPanel();
        lblBanhang = new javax.swing.JLabel();
        ind2 = new javax.swing.JPanel();
        btnSanPham = new javax.swing.JPanel();
        lblSanpham = new javax.swing.JLabel();
        ind3 = new javax.swing.JPanel();
        btnKhachHang = new javax.swing.JPanel();
        lblKhachhang = new javax.swing.JLabel();
        ind4 = new javax.swing.JPanel();
        btnGiamGia = new javax.swing.JPanel();
        lblKhuyenmai = new javax.swing.JLabel();
        ind5 = new javax.swing.JPanel();
        btnThongKe = new javax.swing.JPanel();
        lblThongke = new javax.swing.JLabel();
        ind6 = new javax.swing.JPanel();
        btnNhanVien = new javax.swing.JPanel();
        lblNhanvien = new javax.swing.JLabel();
        ind7 = new javax.swing.JPanel();
        btnHoaDon = new javax.swing.JPanel();
        lblHoadon = new javax.swing.JLabel();
        ind8 = new javax.swing.JPanel();
        pnlIconJava = new javax.swing.JPanel();
        lblJava = new javax.swing.JLabel();
        lblMenuIcon = new javax.swing.JLabel();
        pnlNameLogo = new javax.swing.JPanel();
        lblnameLogo1 = new javax.swing.JLabel();
        lblNameLogo2 = new javax.swing.JLabel();
        lblText1 = new javax.swing.JLabel();
        lblText2 = new javax.swing.JLabel();
        lblBlackmenuIcon = new javax.swing.JLabel();
        lblIconListMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBackgroudAll.setBackground(new java.awt.Color(255, 255, 255));
        pnlBackgroudAll.setPreferredSize(new java.awt.Dimension(1535, 860));
        pnlBackgroudAll.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlHeader.setBackground(new java.awt.Color(24, 116, 205));
        pnlHeader.setPreferredSize(new java.awt.Dimension(1317, 50));
        pnlHeader.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlHeaderMouseDragged(evt);
            }
        });
        pnlHeader.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlHeaderMousePressed(evt);
            }
        });

        pnlCtrForm.setBackground(new Color(0, 0, 0, 0)
        );

        lblLogout.setBackground(new Color(0, 0, 0, 0));
        lblLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLCH/Icon/icons8-logout-32.png"))); // NOI18N
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblLogoutMousePressed(evt);
            }
        });

        lblMize.setBackground(new Color(0, 0, 0, 0));
        lblMize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLCH/Icon/icons8-maximize-button-32.png"))); // NOI18N
        lblMize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblMizeMousePressed(evt);
            }
        });

        lblSubtract.setBackground(new Color(0, 0, 0, 0));
        lblSubtract.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLCH/Icon/icons8-subtract-32.png"))); // NOI18N
        lblSubtract.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblSubtractMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlCtrFormLayout = new javax.swing.GroupLayout(pnlCtrForm);
        pnlCtrForm.setLayout(pnlCtrFormLayout);
        pnlCtrFormLayout.setHorizontalGroup(
            pnlCtrFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCtrFormLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblSubtract)
                .addGap(18, 18, 18)
                .addComponent(lblMize)
                .addGap(18, 18, 18)
                .addComponent(lblLogout))
        );
        pnlCtrFormLayout.setVerticalGroup(
            pnlCtrFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblSubtract, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblMize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lblHeaderTitle.setBackground(new Color(0,0,0,0));
        lblHeaderTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblHeaderTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblHeaderTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeaderTitle.setText("Have a good day!");
        lblHeaderTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        pnlClock.setBackground(new Color (0, 0, 0, 0));
        pnlClock.setOpaque(false);
        pnlClock.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCalendarIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLCH/Icon/icons8-schedule-32.png"))); // NOI18N
        pnlClock.add(lblCalendarIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 6, -1, -1));

        lblType.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        lblType.setForeground(new java.awt.Color(255, 255, 255));
        lblType.setText("AM");
        pnlClock.add(lblType, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 13, 24, -1));

        lblTime.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 255, 255));
        lblTime.setText("0:00:00");
        pnlClock.add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 5, 98, 21));

        lblDate.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblDate.setForeground(new java.awt.Color(255, 255, 255));
        lblDate.setText("Sunday, November 20, 2025");
        pnlClock.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 25, 190, 20));

        lblHelloNV.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        lblHelloNV.setForeground(new java.awt.Color(255, 255, 255));

        lblHelloNV1.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        lblHelloNV1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlPhancachLayout = new javax.swing.GroupLayout(pnlPhancach);
        pnlPhancach.setLayout(pnlPhancachLayout);
        pnlPhancachLayout.setHorizontalGroup(
            pnlPhancachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        pnlPhancachLayout.setVerticalGroup(
            pnlPhancachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addComponent(pnlClock, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPhancach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHelloNV1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHelloNV, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(241, 241, 241)
                .addComponent(lblHeaderTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 379, Short.MAX_VALUE)
                .addComponent(pnlCtrForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlCtrForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlClock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHeaderTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlPhancach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlHeaderLayout.createSequentialGroup()
                        .addComponent(lblHelloNV1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblHelloNV, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 5, Short.MAX_VALUE))
        );

        pnlBackgroudAll.add(pnlHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1535, -1));

        pnlContent.setBackground(new java.awt.Color(255, 255, 255));
        pnlContent.setPreferredSize(new java.awt.Dimension(1317, 760));

        pnlView.setBackground(new java.awt.Color(255, 255, 255));
        pnlView.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout pnlContentLayout = new javax.swing.GroupLayout(pnlContent);
        pnlContent.setLayout(pnlContentLayout);
        pnlContentLayout.setHorizontalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlContentLayout.setVerticalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlBackgroudAll.add(pnlContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 50, -1, -1));

        pnlFooter.setBackground(new java.awt.Color(255, 255, 255));
        pnlFooter.setLayout(new java.awt.BorderLayout());
        pnlBackgroudAll.add(pnlFooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 810, 1317, 50));

        pnlListMenuIcon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlListMenu.setBackground(new java.awt.Color(20, 20, 82));
        pnlListMenu.setPreferredSize(new java.awt.Dimension(218, 800));
        pnlListMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTrangChu.setBackground(new java.awt.Color(20, 37, 100));
        btnTrangChu.setPreferredSize(new java.awt.Dimension(190, 65));
        btnTrangChu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTrangChuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTrangChuMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTrangChuMousePressed(evt);
            }
        });

        lblTrangchu.setBackground(new Color(0,0,0,0));
        lblTrangchu.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        lblTrangchu.setForeground(new java.awt.Color(255, 255, 255));
        lblTrangchu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLCH/Icon/icons8-home-32.png"))); // NOI18N
        lblTrangchu.setText("Trang chủ");
        lblTrangchu.setIconTextGap(20);

        ind1.setPreferredSize(new java.awt.Dimension(5, 0));

        javax.swing.GroupLayout ind1Layout = new javax.swing.GroupLayout(ind1);
        ind1.setLayout(ind1Layout);
        ind1Layout.setHorizontalGroup(
            ind1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        ind1Layout.setVerticalGroup(
            ind1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout btnTrangChuLayout = new javax.swing.GroupLayout(btnTrangChu);
        btnTrangChu.setLayout(btnTrangChuLayout);
        btnTrangChuLayout.setHorizontalGroup(
            btnTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnTrangChuLayout.createSequentialGroup()
                .addComponent(ind1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblTrangchu, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        btnTrangChuLayout.setVerticalGroup(
            btnTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ind1, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
            .addComponent(lblTrangchu, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        pnlListMenu.add(btnTrangChu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 155, 218, -1));

        btnBanHang.setBackground(new java.awt.Color(20, 37, 100));
        btnBanHang.setPreferredSize(new java.awt.Dimension(190, 65));
        btnBanHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBanHangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBanHangMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBanHangMousePressed(evt);
            }
        });

        lblBanhang.setBackground(new Color(0,0,0,0));
        lblBanhang.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        lblBanhang.setForeground(new java.awt.Color(255, 255, 255));
        lblBanhang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLCH/Icon/icons8-sell-32.png"))); // NOI18N
        lblBanhang.setText("Bán hàng");
        lblBanhang.setIconTextGap(20);

        ind2.setPreferredSize(new java.awt.Dimension(5, 0));

        javax.swing.GroupLayout ind2Layout = new javax.swing.GroupLayout(ind2);
        ind2.setLayout(ind2Layout);
        ind2Layout.setHorizontalGroup(
            ind2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        ind2Layout.setVerticalGroup(
            ind2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout btnBanHangLayout = new javax.swing.GroupLayout(btnBanHang);
        btnBanHang.setLayout(btnBanHangLayout);
        btnBanHangLayout.setHorizontalGroup(
            btnBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBanHangLayout.createSequentialGroup()
                .addComponent(ind2, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblBanhang, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        btnBanHangLayout.setVerticalGroup(
            btnBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ind2, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
            .addComponent(lblBanhang, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        pnlListMenu.add(btnBanHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 218, -1));

        btnSanPham.setBackground(new java.awt.Color(20, 37, 100));
        btnSanPham.setPreferredSize(new java.awt.Dimension(190, 65));
        btnSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSanPhamMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSanPhamMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSanPhamMousePressed(evt);
            }
        });

        lblSanpham.setBackground(new Color(0,0,0,0));
        lblSanpham.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        lblSanpham.setForeground(new java.awt.Color(255, 255, 255));
        lblSanpham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLCH/Icon/icons8-box-32.png"))); // NOI18N
        lblSanpham.setText("Sản phẩm");
        lblSanpham.setIconTextGap(20);

        ind3.setPreferredSize(new java.awt.Dimension(5, 0));

        javax.swing.GroupLayout ind3Layout = new javax.swing.GroupLayout(ind3);
        ind3.setLayout(ind3Layout);
        ind3Layout.setHorizontalGroup(
            ind3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        ind3Layout.setVerticalGroup(
            ind3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout btnSanPhamLayout = new javax.swing.GroupLayout(btnSanPham);
        btnSanPham.setLayout(btnSanPhamLayout);
        btnSanPhamLayout.setHorizontalGroup(
            btnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSanPhamLayout.createSequentialGroup()
                .addComponent(ind3, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblSanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        btnSanPhamLayout.setVerticalGroup(
            btnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ind3, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
            .addComponent(lblSanpham, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        pnlListMenu.add(btnSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 285, 218, -1));

        btnKhachHang.setBackground(new java.awt.Color(20, 37, 100));
        btnKhachHang.setPreferredSize(new java.awt.Dimension(190, 65));
        btnKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnKhachHangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnKhachHangMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnKhachHangMousePressed(evt);
            }
        });

        lblKhachhang.setBackground(new Color(0,0,0,0));
        lblKhachhang.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        lblKhachhang.setForeground(new java.awt.Color(255, 255, 255));
        lblKhachhang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLCH/Icon/icons8-search-client-32.png"))); // NOI18N
        lblKhachhang.setText("Khách hàng");
        lblKhachhang.setIconTextGap(20);

        ind4.setPreferredSize(new java.awt.Dimension(5, 0));

        javax.swing.GroupLayout ind4Layout = new javax.swing.GroupLayout(ind4);
        ind4.setLayout(ind4Layout);
        ind4Layout.setHorizontalGroup(
            ind4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        ind4Layout.setVerticalGroup(
            ind4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout btnKhachHangLayout = new javax.swing.GroupLayout(btnKhachHang);
        btnKhachHang.setLayout(btnKhachHangLayout);
        btnKhachHangLayout.setHorizontalGroup(
            btnKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnKhachHangLayout.createSequentialGroup()
                .addComponent(ind4, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblKhachhang, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        btnKhachHangLayout.setVerticalGroup(
            btnKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ind4, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
            .addComponent(lblKhachhang, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        pnlListMenu.add(btnKhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 218, -1));

        btnGiamGia.setBackground(new java.awt.Color(20, 37, 100));
        btnGiamGia.setPreferredSize(new java.awt.Dimension(190, 65));
        btnGiamGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGiamGiaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGiamGiaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGiamGiaMousePressed(evt);
            }
        });

        lblKhuyenmai.setBackground(new Color(0,0,0,0));
        lblKhuyenmai.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        lblKhuyenmai.setForeground(new java.awt.Color(255, 255, 255));
        lblKhuyenmai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLCH/Icon/icons8-black-friday-tag-32.png"))); // NOI18N
        lblKhuyenmai.setText("Khuyến mãi");
        lblKhuyenmai.setIconTextGap(20);

        ind5.setPreferredSize(new java.awt.Dimension(5, 0));

        javax.swing.GroupLayout ind5Layout = new javax.swing.GroupLayout(ind5);
        ind5.setLayout(ind5Layout);
        ind5Layout.setHorizontalGroup(
            ind5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        ind5Layout.setVerticalGroup(
            ind5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout btnGiamGiaLayout = new javax.swing.GroupLayout(btnGiamGia);
        btnGiamGia.setLayout(btnGiamGiaLayout);
        btnGiamGiaLayout.setHorizontalGroup(
            btnGiamGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnGiamGiaLayout.createSequentialGroup()
                .addComponent(ind5, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblKhuyenmai, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        btnGiamGiaLayout.setVerticalGroup(
            btnGiamGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ind5, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
            .addComponent(lblKhuyenmai, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        pnlListMenu.add(btnGiamGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 415, 218, -1));

        btnThongKe.setBackground(new java.awt.Color(20, 37, 100));
        btnThongKe.setPreferredSize(new java.awt.Dimension(190, 65));
        btnThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnThongKeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnThongKeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnThongKeMousePressed(evt);
            }
        });

        lblThongke.setBackground(new Color(0,0,0,0));
        lblThongke.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        lblThongke.setForeground(new java.awt.Color(255, 255, 255));
        lblThongke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLCH/Icon/icons8-statistics-32 (1).png"))); // NOI18N
        lblThongke.setText("Thống kê");
        lblThongke.setIconTextGap(18);

        ind6.setPreferredSize(new java.awt.Dimension(5, 0));

        javax.swing.GroupLayout ind6Layout = new javax.swing.GroupLayout(ind6);
        ind6.setLayout(ind6Layout);
        ind6Layout.setHorizontalGroup(
            ind6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        ind6Layout.setVerticalGroup(
            ind6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout btnThongKeLayout = new javax.swing.GroupLayout(btnThongKe);
        btnThongKe.setLayout(btnThongKeLayout);
        btnThongKeLayout.setHorizontalGroup(
            btnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnThongKeLayout.createSequentialGroup()
                .addComponent(ind6, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblThongke, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        btnThongKeLayout.setVerticalGroup(
            btnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ind6, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
            .addComponent(lblThongke, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        pnlListMenu.add(btnThongKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 218, -1));

        btnNhanVien.setBackground(new java.awt.Color(20, 37, 100));
        btnNhanVien.setPreferredSize(new java.awt.Dimension(190, 65));
        btnNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNhanVienMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNhanVienMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnNhanVienMousePressed(evt);
            }
        });

        lblNhanvien.setBackground(new Color(0,0,0,0));
        lblNhanvien.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        lblNhanvien.setForeground(new java.awt.Color(255, 255, 255));
        lblNhanvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLCH/Icon/icons8-staff-32.png"))); // NOI18N
        lblNhanvien.setText("Nhân viên");
        lblNhanvien.setIconTextGap(20);

        ind7.setPreferredSize(new java.awt.Dimension(5, 0));

        javax.swing.GroupLayout ind7Layout = new javax.swing.GroupLayout(ind7);
        ind7.setLayout(ind7Layout);
        ind7Layout.setHorizontalGroup(
            ind7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        ind7Layout.setVerticalGroup(
            ind7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout btnNhanVienLayout = new javax.swing.GroupLayout(btnNhanVien);
        btnNhanVien.setLayout(btnNhanVienLayout);
        btnNhanVienLayout.setHorizontalGroup(
            btnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnNhanVienLayout.createSequentialGroup()
                .addComponent(ind7, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        btnNhanVienLayout.setVerticalGroup(
            btnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ind7, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
            .addComponent(lblNhanvien, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        pnlListMenu.add(btnNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 545, 218, -1));

        btnHoaDon.setBackground(new java.awt.Color(20, 37, 100));
        btnHoaDon.setPreferredSize(new java.awt.Dimension(190, 65));
        btnHoaDon.setRequestFocusEnabled(false);
        btnHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHoaDonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHoaDonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHoaDonMousePressed(evt);
            }
        });

        lblHoadon.setBackground(new Color(0,0,0,0));
        lblHoadon.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        lblHoadon.setForeground(new java.awt.Color(255, 255, 255));
        lblHoadon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLCH/Icon/icons8-bill-32.png"))); // NOI18N
        lblHoadon.setText("Hóa đơn");
        lblHoadon.setIconTextGap(18);

        ind8.setPreferredSize(new java.awt.Dimension(5, 0));

        javax.swing.GroupLayout ind8Layout = new javax.swing.GroupLayout(ind8);
        ind8.setLayout(ind8Layout);
        ind8Layout.setHorizontalGroup(
            ind8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        ind8Layout.setVerticalGroup(
            ind8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout btnHoaDonLayout = new javax.swing.GroupLayout(btnHoaDon);
        btnHoaDon.setLayout(btnHoaDonLayout);
        btnHoaDonLayout.setHorizontalGroup(
            btnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnHoaDonLayout.createSequentialGroup()
                .addComponent(ind8, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblHoadon, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        btnHoaDonLayout.setVerticalGroup(
            btnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ind8, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
            .addComponent(lblHoadon, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        pnlListMenu.add(btnHoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 218, -1));

        pnlIconJava.setBackground(new Color(0, 0, 0, 0)
        );
        pnlIconJava.setOpaque(false);

        lblJava.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLCH/Icon/icons8-bubble-tea-64.png"))); // NOI18N
        lblJava.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblJavaMousePressed(evt);
            }
        });

        lblMenuIcon.setForeground(new java.awt.Color(255, 255, 255));
        lblMenuIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLCH/Icon/icons8-menu-32.png"))); // NOI18N
        lblMenuIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuIconMouseClicked(evt);
            }
        });

        pnlNameLogo.setBackground(new Color (0, 0, 0, 0));
        pnlNameLogo.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        pnlNameLogo.setOpaque(false);
        pnlNameLogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblnameLogo1.setBackground(new Color (0, 0, 0, 0));
        lblnameLogo1.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        lblnameLogo1.setForeground(new java.awt.Color(255, 255, 255));
        lblnameLogo1.setText("yummy");
        lblnameLogo1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblnameLogo1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblnameLogo1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        pnlNameLogo.add(lblnameLogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 30));

        lblNameLogo2.setBackground(new Color (0, 0, 0, 0));
        lblNameLogo2.setFont(new java.awt.Font("Castellar", 3, 24)); // NOI18N
        lblNameLogo2.setForeground(new java.awt.Color(255, 255, 255));
        lblNameLogo2.setText("Java");
        pnlNameLogo.add(lblNameLogo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, -1));

        javax.swing.GroupLayout pnlIconJavaLayout = new javax.swing.GroupLayout(pnlIconJava);
        pnlIconJava.setLayout(pnlIconJavaLayout);
        pnlIconJavaLayout.setHorizontalGroup(
            pnlIconJavaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIconJavaLayout.createSequentialGroup()
                .addGroup(pnlIconJavaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlIconJavaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMenuIcon)
                        .addGap(34, 34, 34)
                        .addComponent(lblJava))
                    .addGroup(pnlIconJavaLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(pnlNameLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        pnlIconJavaLayout.setVerticalGroup(
            pnlIconJavaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIconJavaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlIconJavaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMenuIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlIconJavaLayout.createSequentialGroup()
                        .addGap(0, 18, Short.MAX_VALUE)
                        .addComponent(lblJava)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlNameLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlListMenu.add(pnlIconJava, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 218, -1));

        lblText1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblText1.setForeground(new java.awt.Color(255, 255, 255));
        lblText1.setText("Copyright @ Ricid Kumbara");
        pnlListMenu.add(lblText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 730, -1, -1));

        lblText2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblText2.setForeground(new java.awt.Color(255, 255, 255));
        lblText2.setText("Blessing Software");
        pnlListMenu.add(lblText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 750, -1, -1));

        pnlListMenuIcon.add(pnlListMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 810));

        lblBlackmenuIcon.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBlackmenuIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLCH/Icon/icons8-menu-32 (1).png"))); // NOI18N
        lblBlackmenuIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblBlackmenuIcon.setIconTextGap(10);
        lblBlackmenuIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBlackmenuIconMouseClicked(evt);
            }
        });
        pnlListMenuIcon.add(lblBlackmenuIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        lblIconListMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLCH/Icon/Apple Orange Pineapple Carrot Fresh OJ Orange Carrot Apple Carrot Madness Pear Kiwi Cooler.png"))); // NOI18N
        lblIconListMenu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 2, new java.awt.Color(0, 0, 102)));
        pnlListMenuIcon.add(lblIconListMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 810));

        pnlBackgroudAll.add(pnlListMenuIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 218, 810));

        getContentPane().add(pnlBackgroudAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTrangChuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrangChuMousePressed
        openTrangChu();
    }//GEN-LAST:event_btnTrangChuMousePressed

    private void btnBanHangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBanHangMousePressed
        openBanHang();
    }//GEN-LAST:event_btnBanHangMousePressed

    private void btnSanPhamMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSanPhamMousePressed
        if (!AuthRoleQLCH.isManager()) {
            MessageBoxQLCH.alert(this, "Bạn không được phân quyền để sử dụng chức năng này");
        } else {
            openSanPham();
        }
    }//GEN-LAST:event_btnSanPhamMousePressed

    private void btnKhachHangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKhachHangMousePressed
        openKhachHang();
    }//GEN-LAST:event_btnKhachHangMousePressed

    private void btnGiamGiaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGiamGiaMousePressed
        if (!AuthRoleQLCH.isManager()) {
            MessageBoxQLCH.alert(this, "Bạn không được phân quyền để sử dụng chức năng này");
        } else {
            openGiamGia();
        }
    }//GEN-LAST:event_btnGiamGiaMousePressed

    private void btnThongKeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongKeMousePressed
        openThongKe();
    }//GEN-LAST:event_btnThongKeMousePressed

    private void btnNhanVienMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNhanVienMousePressed
        if (!AuthRoleQLCH.isManager()) {
            MessageBoxQLCH.alert(this, "Bạn không được phân quyền để sử dụng chức năng này");
        } else {
            openNhanVien();
        }
    }//GEN-LAST:event_btnNhanVienMousePressed

    private void btnHoaDonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHoaDonMousePressed
        openHoaDon();
    }//GEN-LAST:event_btnHoaDonMousePressed

    private void lblJavaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJavaMousePressed
        openlblJavaMouse();
    }//GEN-LAST:event_lblJavaMousePressed

    private void lblLogoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMousePressed
        openlblJavaMouse();
        showFooterForm(new FooterJPanel());
        openDangXuat();

    }//GEN-LAST:event_lblLogoutMousePressed

    private void lblMizeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMizeMousePressed
        // Min/Max mize JFrame

        if (this.getExtendedState() != HomeJFrame.MAXIMIZED_BOTH) {
            this.setExtendedState(HomeJFrame.MAXIMIZED_BOTH);

            lblMize.setIcon(new ImageIcon(getClass().getResource("/QLCH/Icon/icons8-restore-down-32.png"))); //set Icon clicked

        } else {
            this.setExtendedState(HomeJFrame.NORMAL);
            lblMize.setIcon(new ImageIcon(getClass().getResource("/QLCH/Icon/icons8-maximize-button-32.png")));  //set Icon clicked

        }

    }//GEN-LAST:event_lblMizeMousePressed

    private void lblSubtractMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSubtractMousePressed
        // Minimize button Taskbar
        this.setExtendedState(HomeJFrame.ICONIFIED);
    }//GEN-LAST:event_lblSubtractMousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    int x = 218;
    int a = 0;
    private void lblMenuIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuIconMouseClicked

        if (x == 218) {
            pnlListMenu.setSize(218, 810);
            Thread_Menu mn = new Thread_Menu(pnlListMenu);
            mn.start();
            x = 0;
        } else if (x == 0) {
            pnlListMenu.setSize(x, 810);
            Thread_Menu2 mn2 = new Thread_Menu2(pnlListMenu);
            mn2.start();
            x = 218;
        }

    }//GEN-LAST:event_lblMenuIconMouseClicked

    private void lblBlackmenuIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBlackmenuIconMouseClicked

        if (x == 218) {
            pnlListMenu.setSize(218, 810);
            Thread_Menu mn = new Thread_Menu(pnlListMenu);
            mn.start();
            x = 0;
        } else if (x == 0) {
            pnlListMenu.setSize(x, 810);
            Thread_Menu2 mn2 = new Thread_Menu2(pnlListMenu);
            mn2.start();
            x = 218;
        }
    }//GEN-LAST:event_lblBlackmenuIconMouseClicked

    int xx, xy;
    private void pnlHeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHeaderMousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_pnlHeaderMousePressed

    private void pnlHeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHeaderMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_pnlHeaderMouseDragged

    private void btnTrangChuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrangChuMouseEntered
        // TODO add your handling code here:
        setColor(btnTrangChu);
    }//GEN-LAST:event_btnTrangChuMouseEntered

    private void btnTrangChuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrangChuMouseExited
        // TODO add your handling code here:
        setColor2(btnTrangChu);
    }//GEN-LAST:event_btnTrangChuMouseExited

    private void btnBanHangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBanHangMouseEntered
        setColor(btnBanHang);
    }//GEN-LAST:event_btnBanHangMouseEntered

    private void btnBanHangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBanHangMouseExited
        setColor2(btnBanHang);
    }//GEN-LAST:event_btnBanHangMouseExited

    private void btnSanPhamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSanPhamMouseEntered
        setColor(btnSanPham);
    }//GEN-LAST:event_btnSanPhamMouseEntered

    private void btnSanPhamMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSanPhamMouseExited
        setColor2(btnSanPham);
    }//GEN-LAST:event_btnSanPhamMouseExited

    private void btnKhachHangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKhachHangMouseEntered
        setColor(btnKhachHang);
    }//GEN-LAST:event_btnKhachHangMouseEntered

    private void btnKhachHangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKhachHangMouseExited
        setColor2(btnKhachHang);
    }//GEN-LAST:event_btnKhachHangMouseExited

    private void btnGiamGiaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGiamGiaMouseEntered
        setColor(btnGiamGia);
    }//GEN-LAST:event_btnGiamGiaMouseEntered

    private void btnGiamGiaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGiamGiaMouseExited
        setColor2(btnGiamGia);
    }//GEN-LAST:event_btnGiamGiaMouseExited

    private void btnThongKeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongKeMouseEntered
        setColor(btnThongKe);
    }//GEN-LAST:event_btnThongKeMouseEntered

    private void btnThongKeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongKeMouseExited
        setColor2(btnThongKe);
    }//GEN-LAST:event_btnThongKeMouseExited

    private void btnNhanVienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNhanVienMouseEntered
        setColor(btnNhanVien);
    }//GEN-LAST:event_btnNhanVienMouseEntered

    private void btnNhanVienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNhanVienMouseExited
        setColor2(btnNhanVien);
    }//GEN-LAST:event_btnNhanVienMouseExited

    private void btnHoaDonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHoaDonMouseEntered
        setColor(btnHoaDon);
    }//GEN-LAST:event_btnHoaDonMouseEntered

    private void btnHoaDonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHoaDonMouseExited
        setColor2(btnHoaDon);
    }//GEN-LAST:event_btnHoaDonMouseExited

    public static void main(String args[]) {

        FlatLightLaf.setup();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeJFrame().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnBanHang;
    private javax.swing.JPanel btnGiamGia;
    private javax.swing.JPanel btnHoaDon;
    private javax.swing.JPanel btnKhachHang;
    private javax.swing.JPanel btnNhanVien;
    private javax.swing.JPanel btnSanPham;
    private javax.swing.JPanel btnThongKe;
    private javax.swing.JPanel btnTrangChu;
    private javax.swing.JPanel ind1;
    private javax.swing.JPanel ind2;
    private javax.swing.JPanel ind3;
    private javax.swing.JPanel ind4;
    private javax.swing.JPanel ind5;
    private javax.swing.JPanel ind6;
    private javax.swing.JPanel ind7;
    private javax.swing.JPanel ind8;
    private javax.swing.JLabel lblBanhang;
    private javax.swing.JLabel lblBlackmenuIcon;
    private javax.swing.JLabel lblCalendarIcon;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblHeaderTitle;
    private javax.swing.JLabel lblHelloNV;
    private javax.swing.JLabel lblHelloNV1;
    private javax.swing.JLabel lblHoadon;
    private javax.swing.JLabel lblIconListMenu;
    private javax.swing.JLabel lblJava;
    private javax.swing.JLabel lblKhachhang;
    private javax.swing.JLabel lblKhuyenmai;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblMenuIcon;
    private javax.swing.JLabel lblMize;
    private javax.swing.JLabel lblNameLogo2;
    private javax.swing.JLabel lblNhanvien;
    private javax.swing.JLabel lblSanpham;
    private javax.swing.JLabel lblSubtract;
    private javax.swing.JLabel lblText1;
    private javax.swing.JLabel lblText2;
    private javax.swing.JLabel lblThongke;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTrangchu;
    private javax.swing.JLabel lblType;
    private javax.swing.JLabel lblnameLogo1;
    private javax.swing.JPanel pnlBackgroudAll;
    private javax.swing.JPanel pnlClock;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlCtrForm;
    private javax.swing.JPanel pnlFooter;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlIconJava;
    private javax.swing.JPanel pnlListMenu;
    private javax.swing.JPanel pnlListMenuIcon;
    private javax.swing.JPanel pnlNameLogo;
    private javax.swing.JPanel pnlPhancach;
    private javax.swing.JPanel pnlView;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.setLocationRelativeTo(null);
        openIntroDialog();
        openLogonDialog();
        new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date date = new Date();
                SimpleDateFormat tf = new SimpleDateFormat("h:mm:ss aa");
                SimpleDateFormat df = new SimpleDateFormat("EEEE, MMMM dd, yyyy");
                String time = tf.format(date);
                lblTime.setText(time.split(" ")[0]);
                lblType.setText(time.split(" ")[1]);
                lblDate.setText(df.format(date));
                if (AuthRoleQLCH.isLogin()) {
                    lblHelloNV1.setText("Nhân viên:");
                    lblHelloNV.setText("   " + AuthRoleQLCH.user.getTenNV());
                } else {
                    lblHelloNV.setText("");
                    lblHelloNV1.setText("");
                    pnlPhancach.setBackground(new Color(0, 0, 0, 0));
                }
            }
        }).start();
    }

    //    EVEN CLICKED BUTTON IN LISTMENU
    private void setColor(JPanel pane) {
        pane.setBackground(new Color(20, 37, 100));
    }

    private void setColor2(JPanel pane) {
        pane.setBackground(new Color(20, 20, 82));
    }

    private void resetColor(JPanel[] pane, JPanel[] indicators) {
        for (int i = 0; i < pane.length; i++) {
            pane[i].setBackground(new Color(20, 20, 82));
        }
        for (int i = 0; i < indicators.length; i++) {
            indicators[i].setOpaque(false);
        }

    }

    //    Text animation (run) Footer
    private BufferedImage img;

    int z = 219;
    int y = 845;
    int t = 100;
    int i = 700;

    public void paint(Graphics gp) {
        super.paint(gp);
        Graphics2D g2d = (Graphics2D) gp;

        g2d.setColor(new Color(16, 78, 139));
        g2d.setFont(new Font("ALLBITS", ALLBITS, 15));
        g2d.drawString("", z, y);
        try {
            Thread.sleep(80);
            z += 2;
            if (z > getWidth()) {
                z = 219;
            }
            repaint();
        } catch (InterruptedException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }

    private void openDangXuat() {
        AuthRoleQLCH.clear();
        openLogonDialog();
    }

    private void openIntroDialog() {
        new ChaoJDialog(this, true).setVisible(true);
    }

    private void openLogonDialog() {
        new LoginJDialog(this, true).setVisible(true);
    }

    private void openTrangChu() {
        setColor(btnTrangChu);
        ind1.setOpaque(true);
        resetColor(new JPanel[]{btnBanHang, btnSanPham, btnKhachHang, btnGiamGia, btnThongKe, btnNhanVien, btnHoaDon},
                new JPanel[]{ind2, ind3, ind4, ind5, ind6, ind7, ind8});

        showForm(new TrangChuJPanel());
        lblHeaderTitle.setText("____ Trang chủ ____");
    }

    private void openBanHang() {
        setColor(btnBanHang);
        ind2.setOpaque(true);
        resetColor(new JPanel[]{btnTrangChu, btnSanPham, btnKhachHang, btnGiamGia, btnThongKe, btnNhanVien, btnHoaDon},
                new JPanel[]{ind1, ind3, ind4, ind5, ind6, ind7, ind8});

        showForm(new BanHangJPanel());
        lblHeaderTitle.setText("____ Bán hàng ____");
    }

    private void openSanPham() {
        setColor(btnSanPham);
        ind3.setOpaque(true);
        resetColor(new JPanel[]{btnBanHang, btnTrangChu, btnKhachHang, btnGiamGia, btnThongKe, btnNhanVien, btnHoaDon},
                new JPanel[]{ind2, ind1, ind4, ind5, ind6, ind7, ind8});

        showForm(new SanPhamJPanel());
        lblHeaderTitle.setText("____ Sản phẩm ____");
    }

    private void openKhachHang() {
        setColor(btnKhachHang);
        ind4.setOpaque(true);
        resetColor(new JPanel[]{btnBanHang, btnSanPham, btnTrangChu, btnGiamGia, btnThongKe, btnNhanVien, btnHoaDon},
                new JPanel[]{ind2, ind3, ind1, ind5, ind6, ind7, ind8});

        showForm(new KhachHangJPanel());
        lblHeaderTitle.setText("____ Khách hàng ____");
    }

    private void openGiamGia() {
        setColor(btnGiamGia);
        ind5.setOpaque(true);
        resetColor(new JPanel[]{btnBanHang, btnSanPham, btnKhachHang, btnTrangChu, btnThongKe, btnNhanVien, btnHoaDon},
                new JPanel[]{ind2, ind3, ind4, ind1, ind6, ind7, ind8});
        showForm(new GiamGiaJPanel());
        lblHeaderTitle.setText("____ Khuyến mãi ____");
    }

    private void openThongKe() {
        setColor(btnThongKe);
        ind6.setOpaque(true);
        resetColor(new JPanel[]{btnBanHang, btnSanPham, btnKhachHang, btnGiamGia, btnTrangChu, btnNhanVien, btnHoaDon},
                new JPanel[]{ind2, ind3, ind4, ind5, ind1, ind7, ind8});
        showForm(new ThongKeJPanel());
        lblHeaderTitle.setText("____ Thống kê ____");
    }

    private void openNhanVien() {
        setColor(btnNhanVien);
        ind7.setOpaque(true);
        resetColor(new JPanel[]{btnBanHang, btnSanPham, btnKhachHang, btnGiamGia, btnThongKe, btnTrangChu, btnHoaDon},
                new JPanel[]{ind2, ind3, ind4, ind5, ind6, ind1, ind8});

        showForm(new NhanVienJPanel());
        lblHeaderTitle.setText("____ Nhân viên ____");
    }

    private void openHoaDon() {
        setColor(btnHoaDon);
        ind8.setOpaque(true);
        resetColor(new JPanel[]{btnBanHang, btnSanPham, btnKhachHang, btnGiamGia, btnThongKe, btnNhanVien, btnTrangChu},
                new JPanel[]{ind2, ind3, ind4, ind5, ind6, ind7, ind1});

        showForm(new HoaDonJPanel());
        lblHeaderTitle.setText("____ Quản lý hóa đơn ____");
    }

    private void openlblJavaMouse() {
        setColor(btnTrangChu);
        ind1.setOpaque(true);
        resetColor(new JPanel[]{btnBanHang, btnSanPham, btnKhachHang, btnGiamGia, btnThongKe, btnNhanVien, btnHoaDon},
                new JPanel[]{ind2, ind3, ind4, ind5, ind6, ind7, ind8});

        showForm(new TrangChuJPanel());
        lblHeaderTitle.setText("Have a good day!");
    }

    private void showTrangChu() {
        //Tạo màu cho trang chủ chọn
        setColor(btnTrangChu);
        ind1.setOpaque(true);
        resetColor(new JPanel[]{btnBanHang, btnSanPham, btnKhachHang, btnGiamGia, btnThongKe, btnNhanVien, btnHoaDon}, new JPanel[]{ind2, ind3, ind4, ind5, ind6, ind7, ind8});
        //Hiện trang chủ lên form
        showForm(new TrangChuJPanel());
        lblHeaderTitle.setText("____ Trang chủ ____");
    }

}
