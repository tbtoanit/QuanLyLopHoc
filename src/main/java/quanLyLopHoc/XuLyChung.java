package quanLyLopHoc;

import java.util.ArrayList;
import java.util.Scanner;

public class XuLyChung {
    public static void main(String[] args) {

        ArrayList<LopHoc> listLopHoc = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int i;

        LopHocController lhc = new LopHocController();
        while (true){
            System.out.println("Vui long chon chuc nang cua chuong trinh: ");
            System.out.println("0. Dung chuong trinh: ");
            System.out.println("1. Nhap thong tin cua lop: ");
            System.out.println("2. In danh sach lop thong tin cua lop: ");
            System.out.println("3. Sap xep danh sach lop theo so hoc sinh: ");
            i = sc.nextInt();
            sc.nextLine();
            switch (i){
                case 0:
                    System.exit(1);
                case 1:
                    listLopHoc = lhc.nhapThongTinLopHoc();
                    break;
                case 2:
                    lhc.inDanhSachLop(listLopHoc);
                    break;
                case 3:
                    lhc.sapXepLopHoc(listLopHoc);
                    break;
            }
        }
    }
}
