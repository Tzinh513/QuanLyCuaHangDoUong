/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCH.Utils;

//import EduSys.Poly.Entity.NhanVien;

import QLCH.Entity.NhanVien;


/**
 *
 * @author Admin
 */
public class AuthRoleQLCH {
    public static NhanVien user = null;
    public static void clear(){
        AuthRoleQLCH.user = null;
    }
    public static boolean isLogin()
    {
        return AuthRoleQLCH.user !=null;
    }
    public static boolean isManager()
    {
        return AuthRoleQLCH.isLogin() && user.isChucvu();
    }
}
