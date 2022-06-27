import java.util.InputMismatchException;
import java.util.Scanner;

public class Test_Main {

	public static void main(String[] args) {
		int luaChon;
		Scanner scanner = new Scanner(System.in);
		DanhSachBenhNhan danhSachBenhNhan = new DanhSachBenhNhan();

		System.out.println(" __________________________");
		System.out.println("|                          |");
		System.out.println("|   DANH SÁCH BỆNH NHÂN    |");
		System.out.println("|__________________________|");
		System.out.println("");
		danhSachBenhNhan.danhSach_BenhNhan();
//		danhSachBenhNhan.inDanhSach();
		danhSachBenhNhan.inDanhSach_BN();
		do {
			System.out.println(" _______________________________________________________");
			System.out.println("|   1. Thêm Bệnh Nhân                                   |");
			System.out.println("|   2. in Danh Sách Các Bệnh Nhân                       |");
			System.out.println("|   3. Xóa Bệnh Nhân Theo Mã                            |");
			System.out.println("|   4. Ghi Danh Sách Ra File                            |");
			System.out.println("|   5. Đoc Danh Sách Từ File                            |");
			System.out.println("|   6. Thoát                                            |");
			System.out.println("|_______________________________________________________|");
			luaChon = scanner.nextInt();
			scanner.nextLine();
			System.out.println("----------");
			switch (luaChon) {
			case 1:
				String nhapTiep = " ";
				NhapThongTinBenhNhan nhapThongTinBenhNhan = new NhapThongTinBenhNhan();

				do {
					ThongTinBenhNhan thongTinBenhNhan = nhapThongTinBenhNhan.nhapThongTinBenhNhan();
					System.out.println("Ban Có Muốn Tiếp Tục hay Không? Y/N");
					nhapTiep = nhapThongTinBenhNhan.scanner.nextLine();
              
				} while (nhapTiep.equalsIgnoreCase("Y"));
				break;

			case 2:
				danhSachBenhNhan.inDanhSach();
				break;

			case 3:
				System.out.println("Nhập Tên Bệnh Nhân Cần Xóa: ");
				String tenBenhNhan = scanner.nextLine();
				ThongTinBenhNhan xoaBenhNhan = danhSachBenhNhan.timBenhNhanTheoTen(tenBenhNhan);
				danhSachBenhNhan.xoaBenhNhan(xoaBenhNhan);
				break;
			case 4:
				System.out.println("Nhập Tên File Muốn Ghi: ");
				String tenFile = scanner.nextLine();
				danhSachBenhNhan.ghiFileDanhSachBenhNhan(tenFile);
				break;

			case 5:
				System.out.println("NHập Tên File MUốn Đọc: ");
				String File = scanner.nextLine();
				danhSachBenhNhan.docFileDanhSachBenhNhan(File);
				break;
				
			case 6:
				System.exit(0);
			}
		} while (true);
	}

}