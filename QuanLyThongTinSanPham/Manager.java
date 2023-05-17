package QuanLyThongTinSanPham;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Manager {
    public Manager() {       
    }
    
    public List<HangTieuDung> htd = new ArrayList<>();
    public List<DoGiaDung> dgd = new ArrayList<>();
    public List<Sale> sale = new ArrayList<>();
    
    public void add(){
        int a = 1;
        while(a!=4){
            System.out.println("1. Add HangTieuDung");
            System.out.println("2. Add DoGiaDung");
            System.out.println("3. Add Sale");
            System.out.println("4. Exit");
            a = Common.getInt("Enter choice: ");
            switch(a){
                case 1:
                    HangTieuDung td = HangTieuDung.nhap();
                    htd.add(td);
                    break;
                case 2:
                    DoGiaDung gd = DoGiaDung.nhap();
                    dgd.add(gd);
                    break;
                case 3:
                    Sale  sl = Sale.nhap();
                    sale.add(sl);
                    break;
            }
        }
    }
    
    public void edit(){
        int a = 1;
        while(a!=4){
            System.out.println("1. Edit HangTieuDung");
            System.out.println("2. Edit DoGiaDung");
            System.out.println("3. Eit Sale");
            System.out.println("4. Exit");
            a = Common.getInt("Enter choice: ");
            switch(a){
                case 1:
                    String masp = null;
                    boolean i = false;
                    String x = Common.getStrings("Nhap ma sp:");
                    for(HangTieuDung e : htd){
                        if (e.getId().equals(x)){
                            masp = x;
                            i = true;
                            break;
                        }   
                    }
                    if (i == true) {
                        int index1 = -1;
                        for (int t = 0; t < htd.size(); t++) {
                            if (htd.get(t).getId().equals(masp)) {
                                index1 = t;
                                break;
                            }
                        }

                        if (index1 >= 0) {
                            HangTieuDung emp = htd.get(index1);
                            emp.setName(Common.getString("Nhap ten: "));
                            emp.setPrice(Common.getInt("Nhap gia: "));
                            
                            htd.set(index1, emp);
                        }
                    }else System.out.println("khong ton tai San Pham");
                    break;
                case 2:
                     String masp2 = null;
                    boolean i2 = false;
                    String x2 = Common.getStrings("Nhap ma sp:");
                    for(DoGiaDung d : dgd){
                        if (d.getId().equals(x2)){
                            masp2 = x2;
                            i2 = true;
                            break;
                        }   
                    }
                    if (i2 == true) {
                        int index2 = -1;
                        for (int t = 0; t < dgd.size(); t++) {
                            if (dgd.get(t).getId().equals(masp2)) {
                                index2 = t;
                                break;
                            }
                        }

                        if (index2 >= 0) {
                            DoGiaDung Do= dgd.get(index2);
                            Do.setName(Common.getString("Nhap ten: "));
                            Do.setPrice(Common.getInt("Nhap gia: "));
                            
                            dgd.set(index2, Do);
                        }
                    }else System.out.println("khong ton tai San Pham");
                    break;
                case 3:
                     String masp3 = null;
                    boolean i3 = false;
                    String x3 = Common.getStrings("Nhap ma sp:");
                    for(Sale s : sale){
                        if (s.getId().equals(x3)){
                            masp3 = x3;
                            i3 = true;
                            break;
                        }   
                    }
                    if (i3 == true) {
                        int index3 = -1;
                        for (int t = 0; t < sale.size(); t++) {
                            if (sale.get(t).getId().equals(masp3)) {
                                index3 = t;
                                break;
                            }
                        }

                        if (index3 >= 0) {
                            Sale sa = sale.get(index3);
                            sa.setName(Common.getString("Nhap ten: "));
                            sa.setStartDate(Common.getDate("Nhap Ngay Bat Dau: "));
                            sa.setEndDate(Common.getDate("Nhap Ngay Ket Thuc: "));                            
                            sa.setDiscountPercent(Common.getDouble("Nhap gia: "));                         
                            sale.set(index3, sa);
                        }
                    }else System.out.println("khong ton tai phieu sale");
                    break;
            }
        }
    }
    
    public void del(){
        int a = 1;
        while(a!=4){
            System.out.println("1. Delete HangTieuDung");
            System.out.println("2. Delete DoGiaDung");
            System.out.println("3. Delete Sale");
            System.out.println("4. Exit");
            a = Common.getInt("Enter choice: ");
            switch(a){
                case 1:
                    String masp = Common.getStrings("Input HangTieuDung id: ");
                    if(htd.isEmpty()){
                        System.out.println("Khong Co San Pham!");
                        return;
                    }
                    Iterator<HangTieuDung> Td = htd.iterator();
                    while (Td.hasNext()) {
                        HangTieuDung e = Td.next();
                        if (e.getId().equals(masp)) {
                            Td.remove();
                        }
                    }
                    break;
                case 2:
                    String masp2 = Common.getStrings("Input DoGiaDung id: ");
                    if(dgd.isEmpty()){
                        System.out.println("Khong Co San Pham!");
                        return;
                    }
                    Iterator<DoGiaDung> gd = dgd.iterator();
                    while (gd.hasNext()) {
                        DoGiaDung d = gd.next();
                        if (d.getId().equals(masp2)) {
                            gd.remove();
                        }
                    }
                    break;
                case 3:
                    String masp3 = Common.getStrings("Input Sale id: ");
                    if(sale.isEmpty()){
                        System.out.println("Khong Co San Pham!");
                        return;
                    }
                    Iterator<Sale> sL = sale.iterator();
                    while (sL.hasNext()) {
                        Sale s = sL.next();
                        if (s.getId().equals(masp3)) {
                            sL.remove();
                        }
                    }
                    break;
            }
        }
    }
    
    public void show(){
        int a = 1;
        while(a!=4){
            System.out.println("1. Show HangTieuDung");
            System.out.println("2. Show DoGiaDung");
            System.out.println("3. Show Sale");
            System.out.println("4. Exit");
            a = Common.getInt("Enter choice: ");
            switch(a){
                case 1:
                    if(htd.isEmpty()){
                        System.out.println("Khong Co San Pham!");
                        return;
                    }else{
                        System.out.println("Ma san pham \tTen san pham \tGia \tNgay San Xuat \tNgay Het Han ");
                    }
                    for(HangTieuDung hangtieudung : htd){
                        System.out.println(hangtieudung.toString());
                    }
                    break;
                case 2:
                    if(dgd.isEmpty()){
                        System.out.println("Khong Co San Pham!");
                        return;
                    }else{
                        System.out.println("Ma san pham \tTen san pham \tGia \tBao Hanh \tNguon Goc ");
                    }
                    for(DoGiaDung dogiadung : dgd){
                        System.out.println(dogiadung.toString());
                    }
                    break;
                case 3:
                    if(sale.isEmpty()){
                        System.out.println("Khong Co phieu sale!");
                        return;
                    }else{
                        System.out.println("Ma Sale \tTen sale  \tNgay Bat Dau \tNgay Het Han \t So %");
                    }
                    for(Sale s : sale){
                        System.out.println(s.toString());
                    }
                    break;
            }
        }
    }
    
    public void menu(){
        while(true){
            System.out.println("1. Add");
            System.out.println("2. Edit");
            System.out.println("3. Delete");
            System.out.println("4. Show");
            System.out.println("5. Exit");
            int choice=Common.getInt("Enter choice: ");
            menu(choice);
        }
    }
    
    public void menu(int choice){
        switch(choice){
            case 1:
                add();
                break;
            case 2:
                edit();
                break;
            case 3:
                del();
                break;
            case 4:
                show();
                break;
            case 5:
                System.exit(0);
                break;
        }
    }
}
