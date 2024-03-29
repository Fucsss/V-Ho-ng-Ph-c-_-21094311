package Bai7;

public class HinhTron {
	private Toado tam;
	private double BanKinh;
	private final double PI = 3.14159;
	
	public HinhTron() {
		// TODO Auto-generated constructor stub
	}

	public HinhTron(Toado tam, double banKinh) {
		this.tam = tam;
		BanKinh = banKinh;
	}
	

	public Toado getTam() {
		return tam;
	}

	public void setTam(Toado tam) {
		this.tam = tam;
	}

	public double getBanKinh() {
		return BanKinh;
	}

	public void setBanKinh(double banKinh) {
		BanKinh = banKinh;
	}
	
	public double tinhChuVi() {
		return 2*this.BanKinh*PI;
	}
	
	public double tinhDienTich() {
		return Math.pow(BanKinh, 2) * PI;
	}
	
}
