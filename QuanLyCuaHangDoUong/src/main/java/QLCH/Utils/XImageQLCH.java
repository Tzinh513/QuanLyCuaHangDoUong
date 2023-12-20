/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCH.Utils;

import java.awt.Image;
import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;

/**
 *
 * @author Admin
 */
public class XImageQLCH {
    public static Image getAppIcon(){
        URL url = XImageQLCH.class.getResource("/EduSys/Poly/Icon/download.png");
        return new ImageIcon(url).getImage();
    }
    public static boolean save(File src){
        File file = new File("src\\main\\resources\\EduSys\\Poly\\Icon", src.getName());
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        try {
            Path from = Paths.get(src.getAbsolutePath());
            Path to = Paths.get(file.getAbsolutePath());
            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public static ImageIcon read(String fileName){
        File path = new File("src\\main\\resources\\EduSys\\Poly\\Icon",fileName);
        return new ImageIcon(path.getAbsolutePath());
    }
}
