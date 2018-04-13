package Quanlytiendien;

import java.util.Scanner;

public class main {
	public static void main(String [] args) {
		int luachon,n;
		BienLai[] danhsachHD =null;
		Scanner sc = new Scanner(System.in);
		System.out.println("1 nhap thong tin cho n ho dan su dung dien");
		System.out.println("2 hien thi thong tin tat ca ho dan");
		System.out.println("3 thoat chuong trinh");
		do {
			System.out.println("moi ban nhap lua chon");
			luachon = Integer.parseInt(sc.nextLine());
			if(luachon<1||luachon>3)
			{
				System.out.println("ban nhap khong hop le");
			}
			switch(luachon) {
			case 1:{
				System.out.println("nhap vao so luong ho dan:");;
				n = Integer.parseInt(sc.nextLine());
				danhsachHD = new BienLai[n];
				for(int i=0; i<danhsachHD.length;i++) {
					danhsachHD[i] = new BienLai();
					danhsachHD[i].nhap();
				}
				break;
			}
			case 2:{
				System.out.println("danh sach ho dan:");
				for( int i=0; i<danhsachHD.length;i++) {
					danhsachHD[i].in();
				}
				break;
			}
			case 3: {
				break;
			}
			}
		}while(luachon!=3);
		
	}

}
