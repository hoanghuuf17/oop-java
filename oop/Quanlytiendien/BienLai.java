package Quanlytiendien;

import java.util.Scanner;

public class BienLai extends Khachhang {
	private int soMoi;
	private int soCu;
	private int sotienphaitra;
public BienLai() {
}
public BienLai(String hoTen, int soNha, int socongto, int soMOi, int soCu) {
	super(hoTen,soNha,socongto);
	this.soMoi=soMoi;
	this.soCu=soCu;
}
@Override
public void nhap() {
	super.nhap();
	System.out.println("Chi so moi: ");
	Scanner sc = new Scanner(System.in);
	soMoi=Integer.parseInt(sc.nextLine());
	System.out.println("Chi so cu: ");
	soCu = Integer.parseInt(sc.nextLine());
} @Override
public void in() {
	super.in();
	System.out.println("Chi so moi: " +soMoi);
	System.out.println("Chi so cu: " +soCu);
	System.out.println("So tien phai tra:" +Tinhtien());
}
public int Tinhtien() {
	sotienphaitra=(soMoi-soCu)*850000;
	return sotienphaitra;
}
}