package Quanlytiendien;

import java.util.Scanner;

public class Khachhang {
	private String hoTen;
	private int soNha;
	private int socongto;
	
	public Khachhang() {
		
	}
	public Khachhang(String hoTen, int soNha, int socongto) {
		this.hoTen=hoTen;
		this.soNha=soNha;
		this.hoTen=hoTen;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho ten ho dang su dung");
		hoTen = sc.nextLine();
		System.out.println("moi ban nhap so nha:");
		soNha = Integer.parseInt(sc.nextLine());
		System.out.println("So cong to:");
		socongto = Integer.parseInt(sc.nextLine());
	}
	public void in() {
		System.out.println("Ho ten cua ho dan:" +hoTen);
		System.out.println("So nha:" + soNha);
		System.out.println("So cong to:" + socongto);
	}
}
