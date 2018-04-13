package QLKH;

import java.util.Scanner;

import javax.management.loading.PrivateClassLoader;

public class Khachhang {
	private String maKH;
	private String hoTen;
	private int namSinh;
	private int tongLuong;
	Khachhang( String maKH)
	{
		this.maKH= maKH;
		
	}
	Khachhang(String maKH, String hoTen, int namSinh, int tongLuong){
		this.maKH=maKH;
		this.hoTen=hoTen;
		this.namSinh=namSinh;
		this.tongLuong=tongLuong;
	}
	public String getmaKH()
	{
	return maKH;
	}
	public String gethoTen()
	{
	return hoTen;
	}
	public int getnamSinh()
	{
	return namSinh;
	}
	public int gettongLuong()
	{
	return tongLuong;
	}
	public void setmaKH(String maKH)
	{
		this.maKH=maKH;
	}
	public void sethoTen(String hoTen)
	{
		this.hoTen=hoTen;
	}
	public void setnamSinh(int namSinh)
	{
		this.namSinh=namSinh;
	}
	public void settongLuong(int tongLuong)
	{
		this.tongLuong=tongLuong;
	}
	public void NhapTT() {
			Scanner sc= new Scanner(System.in);
			System.out.println("Ma khach hang:");
			maKH=sc.nextLine();
			System.out.println("Ho va ten:");
			hoTen=sc.nextLine();
			System.out.println("Nam sinh:");
			namSinh= Integer.parseInt(sc.nextLine());
			System.out.println("Tong luong");
			tongLuong=Integer.parseInt(sc.nextLine());
	}
	public void in(){
		System.out.println("ma khach hang:"+maKH);
		System.out.println("ten khach hang:"+hoTen);
		System.out.println("nam sinh:"+namSinh);
		System.out.println("tong luong:"+tongLuong);
		
	}
}

