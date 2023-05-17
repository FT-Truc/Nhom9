/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyThongTinSanPham;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class DoGiaDung extends Product {
    private int warrantyPeriod;
    private String origin;

    public DoGiaDung(int warrantyPeriod, String origin, String name, double price, String id) {
        super(name, price, id);
        this.warrantyPeriod = warrantyPeriod;
        this.origin = origin;
    }
    
    

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
    
    
    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }
    
    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }
    
    public String toString() {
        return super.toString() + " - Bao hanh: " + warrantyPeriod + " thang";
    }
    
     public static DoGiaDung nhap(){
        String Name = Common.getStrings("Nhap Ten SP: ");
        String Id = Common.getString("Nhap Ma SP: ");
        int pr = Common.getInt("Nhap Gia Sp: ");
        int bh = Common.getInt("Bao Hanh: ");
        String ng = Common.getString("Nguon Goc: ");

        return new DoGiaDung(bh,ng,Name,pr,Id);
        
    }
}
