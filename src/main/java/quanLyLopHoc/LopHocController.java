package quanLyLopHoc;

import java.util.*;

public class LopHocController {
    public ArrayList<LopHoc> nhapThongTinLopHoc(){
        ArrayList<LopHoc> listLopHoc =  new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        LopHoc l = new LopHoc();
        ArrayList<HocSinh> listHocSinh;
        HocSinh hs;
        int stopFlag = 1;
        while (stopFlag ==1){
            listHocSinh = new ArrayList<>();
            l = new LopHoc();
            System.out.println("Vui long nhap thong tin ten lop: ");
            l.tenLopHoc = sc.nextLine();
            System.out.println("Vui long nhap thong tin so hoc sinh: ");
            l.soHocSinh = sc.nextInt();
            sc.nextLine();
            System.out.println("Vui long nhap thong tin ten giao vien: ");
            l.tenGiaoVien = sc.nextLine();
            System.out.println("Vui long nhap true de lop nay laf chuyen hoac false de lop nay la khong chuyen:");
            l.lopChuyen = sc.nextBoolean();
            sc.nextLine();
            System.out.println("Vui long nhap thong tin nhung hoc sinh trong lop: ");
            for (int i = 0; i<l.soHocSinh; i++){
                hs = new HocSinh();
                System.out.println("Vui long nhap thong tin hoc sinh thu: "+ (i+1));
                System.out.println("Vui long nhap ma hoc sinh: ");
                hs.maHocSinh = sc.nextLine();
                System.out.println("Vui long nhap ten hoc sinh: ");
                hs.tenHocSinh = sc.nextLine();
                System.out.println("Vui long nhap ngay sinh hoc sinh: ");
                hs.ngaySinh = new Date();
                listHocSinh.add(hs);
            }
            l.listHocSinh = listHocSinh;
            listLopHoc.add(l);
            System.out.println("Nhap 1 de tiep tuc them lop - Nhap -1 de ket thuc them lop");
            stopFlag = sc.nextInt();
            sc.nextLine();
        }
        return listLopHoc;
    }

    public void inDanhSachLop(ArrayList<LopHoc> dsLop){
        for (LopHoc l :dsLop) {
            System.out.println("Ten Lop Hoc: "+ l.tenLopHoc
                    + " - So hoc sinh la: "+ l.soHocSinh
                    + " - Ten Giao Vien la: " + l.tenGiaoVien
                    + " - Lop Chuyen hay khong? "+   (l.lopChuyen == true?" -Chuyen" : "khongchuyen")
            );
            for (int i = 0; i<l.listHocSinh.size(); i++){
                System.out.println("Ma Hoc Sinh: " + l.listHocSinh.get(i).maHocSinh
                        + " - Ten Hoc Sinh: " + l.listHocSinh.get(i).tenHocSinh
                        + " - Ngay sinh: "+l.listHocSinh.get(i).ngaySinh);
            }
        }
    }

    public void sapXepLopHoc(ArrayList<LopHoc> lisLopHoc){
//        Collections.sort(lisLopHoc, new Comparator<LopHoc>() {
//            @Override
//            public int compare(LopHoc lopHoc1, LopHoc lopHoc2)
//            {
//                return  Integer.toString(lopHoc1.soHocSinh).compareTo(Integer.toString(lopHoc2.soHocSinh));
//            }
//        });
        LopHoc temp = new LopHoc();
        for(int i = 0; i< lisLopHoc.size(); i++)
            for (int j = i+1; j<lisLopHoc.size(); j++){
                if(lisLopHoc.get(i).soHocSinh > lisLopHoc.get(j).soHocSinh){
                    temp = lisLopHoc.get(i);
                    lisLopHoc.set(i, lisLopHoc.get(j));
                    lisLopHoc.set(j, temp);
                }
            }
    }
}
