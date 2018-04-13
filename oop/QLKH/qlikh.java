package QLKH;

import java.util.ArrayList;
import java.util.Scanner;

public class qlikh {
	public static void main(String[]args) {
		int[] Array;
		ArrayList<Khachhang> danhsach = new ArrayList();
		int luachon,n;// so luong khach hang
		System.out.println("===================================");
		System.out.println("1. nhap vao n khach hang.");
		System.out.println("2. hien thi thong tin danh sach khach hang.");
		System.out.println("3. hien thi khach hang co tong luong lon hon x.");
		System.out.println("4. thoat chuong trinh");
		System.out.println("===================================");
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("moi ban nhap vao lua chon: ");
			try {
				luachon= Integer.parseInt(sc.nextLine());	
			} catch (NumberFormatException e) {
				luachon = 0;
				System.out.println("ban can nhap vao so nguyen.");
			}
			switch(luachon) {
			case 1:{
				System.out.println("nhap vao so luong khach hang:");
				n = Integer.parseInt(sc.nextLine());
				Array = new int[n];// tao lap so luong phan tu trong mang
				for(int i=0;i<Array.length;i++) {
					Khachhang KH = new Khachhang(null);
					System.out.println("thong tin khach hang: "+(i+1));
					KH.NhapTT();
					danhsach.add(KH);//them khach hang duoc luu vao danh sach
				}
					
				break;
				
			}
			case 2:{
				System.out.println("thong tin cua khach hang co trong danh sach:");
				for(int i=0;i<danhsach.size();i++) {
					System.out.println("thong tin khach hang: "+(i+1));
					danhsach.get(i).in();
					
				}
				break;
				
			}
			case 3:{
				int x;
				System.out.println("nhap vao tong luong");
				x = Integer.parseInt(sc.nextLine());
				for(int i=0; i<danhsach.size();i++) {
					if(x>=danhsach.get(i).gettongLuong()) {
						danhsach.get(i).in();
					}
				}
				break;
				
			}
			case 4:{ System.out.println("Thoat thanh cong");
				break;
				
			}
		}
		}while(luachon!=4);
	}
}
