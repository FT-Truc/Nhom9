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
public class HangTieuDung extends Product {
   private Date  startDate;
   private Date  endDate;

    public HangTieuDung(Date startDate, Date endDate, String name, double price, String id) {
        super(name, price, id);
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

  
   
    
    public String toString() {
        return super.toString() + "\t\t" +startDate+"\t"+endDate;
    }
    
    
    
    public static HangTieuDung nhap(){
        String Name = Common.getStrings("Nhap Ten SP: ");
        String Id = Common.getString("Nhap Ma SP: ");
        int pr =Common.getInt("Nhap Gia Sp: ");
        Date st =Common.getDate("Nhap Ngay San Xuat :");
        Date ed =Common.getDate("Nhap Ngay Het Han :");

        return new HangTieuDung(st,ed,Name,pr,Id);
        
    }
}
