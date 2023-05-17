/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package QuanLyThongTinSanPham;

/**
 *
 * @author dangv
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sale {
    private String id;
    private String name;
    private Date startDate;
    private Date endDate;
    private double discountPercent;

    public Sale(String id, String name, Date startDate, Date endDate, double discountPercent) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.discountPercent = discountPercent;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    @Override
    public String toString() {
        return id+"\t"+name+"\t"+startDate+"\t"+endDate+"\t"+discountPercent;
    }
    
    
    public static Sale nhap(){
           String Id = Common.getStrings("Nhap Ma Sale: ");
           String Name = Common.getString("Nhap Ten Sale: ");
           
           Date st =Common.getDate("Nhap Ngay Bat Dau :");
           Date ed =Common.getDate("Nhap Ngay Het Han");
           Double dp =Common.getDouble("Nhap So % duoc giam: ");
           return new Sale(Id,Name,st,ed,dp);

       }
}
