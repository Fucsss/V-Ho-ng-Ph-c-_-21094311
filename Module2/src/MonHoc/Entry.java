package MonHoc;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Entry {

	public static void tieude() {
		for(int i = 1; i <= 66; i++)
			System.out.print('-');
		System.out.println();
		System.out.printf("|%-10s|%-20s|%-10s|%-20s|\n", "Mã môn hoc", "Tên môn học", "Ngày mở lớp" , "Họ tên giáo viên");
		for(int i = 1; i <= 66; i++)
			System.out.print('-');
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tieude();
	}

}
