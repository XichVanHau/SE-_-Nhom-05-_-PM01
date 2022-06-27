import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NhapThongTinBenhNhan {

	public static Scanner scanner = new Scanner(System.in);

	// SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

	public ThongTinBenhNhan nhapThongTinBenhNhan() {
		ThongTinBenhNhan thongTinBenhNhan = null;
//		
		String hoVaTen = null;
		System.out.println("vui lòng nhập họ và tên: ");
		hoVaTen = scanner.nextLine();
//		
		String diaChiNha = null;
		System.out.println("vui lòng nhập địa chỉ nhà: ");
		hoVaTen = scanner.nextLine();

		// chú ý lỗi
		String ngaySinh = null;
		System.out.println("nhập ngày sinh: ");
		hoVaTen = scanner.nextLine();
//		
		double soDienThoaiBenhNhan = 0;
		System.out.println("nhập số điện thoại của bạn (người khám bệnh): ");
		try {
			soDienThoaiBenhNhan = scanner.nextDouble();
			scanner.nextLine();
		} catch (InputMismatchException e) {
			System.out.println("Vui Lòng Nhập Số");
			e.printStackTrace();
		}
//		
		double soDienThoaiNguoiThan = 0;
		System.out.println("nhập số điện thoại người thân của bạn (người thân Của bạn): ");
		try {
			soDienThoaiNguoiThan = scanner.nextDouble();
			scanner.nextLine();
		} catch (InputMismatchException e) {
			System.out.println("Vui Lòng Nhập Số");
			e.printStackTrace();
		}
//	star	
		int khoa = 0;
		System.out.println("Chọn Khoa Và Tiến Hành Khám");
		System.out.println("1. khoa tim mạch");
		System.out.println("2. khoa xương khớp");
		System.out.println("3. khoa tai mũi họng");

		try {
			khoa = scanner.nextInt();
			scanner.nextLine();
		} catch (InputMismatchException e) {
			System.out.println("Vui Lòng Nhập Số");
		}
		if (khoa == 1) {
			System.out.println("______________________________");
			System.out.println("| đây là khoa tim mạch       |");
			System.out.println("|____________________________|");
			System.out.println("");

			String gioiTinh = null;
			System.out.println("Nhập giới tính: ");
			gioiTinh = scanner.nextLine();
			try {
//ghichu 01
			} catch (InputMismatchException e) {
				System.out.println("Vui Lòng Nhập Đúng");
			}
//nhom mau
			String nhomMau = null;
			System.out.println("nhập nhóm máu: ");
			nhomMau = scanner.nextLine();

//can nang
			float canNang = 0;
			System.out.println("nhập cân nặng: ");
			try {
				canNang = scanner.nextFloat();
				scanner.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("vui lòng nhập số: ");
				e.printStackTrace();
			}

//chieu cao
			float chieuCao = 0;
			System.out.println("nhập chiều cao: ");
			try {
				chieuCao = scanner.nextFloat();
				scanner.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("vui lòng nhập số: ");
				e.printStackTrace();
			}

//nhip timString 
			double nhipTim = 0;
			System.out.println("nhập nhịp tim: ");
			try {
				nhipTim = scanner.nextDouble();
				scanner.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("vui lòng nhập số: ");
				e.printStackTrace();
				thongTinBenhNhan = new KhoaTimMach(hoVaTen, diaChiNha, ngaySinh, soDienThoaiBenhNhan,
						soDienThoaiNguoiThan, khoa, gioiTinh, nhomMau, canNang, chieuCao, nhipTim);
			}
			System.out.println("vui lòng đến quầy thanh toán và nhận thuốc");
			System.out.println("");
		} else if (khoa == 2) {
			System.out.println(" ______________________________");
			System.out.println("| đây là khoa tai xương khớp:  |");
			System.out.println("|______________________________|");
			System.out.println("");

			String gioiTinh = null;
			System.out.println("Nhập giới tính: ");
			gioiTinh = scanner.nextLine();
			try {
//ghichu 01
			} catch (InputMismatchException e) {
				System.out.println("Vui Lòng Nhập Đúng");
			}
//nhom mau
			String nhomMau = null;
			System.out.println("nhập nhóm máu: ");
			nhomMau = scanner.nextLine();

//can nang
			float canNang = 0;
			System.out.println("nhập cân nặng: ");
			try {
				canNang = scanner.nextFloat();
				scanner.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("vui lòng nhập số: ");
				e.printStackTrace();
			}

//chieu cao
			float chieuCao = 0;
			System.out.println("nhập chiều cao: ");
			try {
				chieuCao = scanner.nextFloat();
				scanner.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("vui lòng nhập số: ");
				e.printStackTrace();
			}

//nhip timString 
			double nhipTim = 0;
			System.out.println("nhập nhịp tim: ");
			try {
				nhipTim = scanner.nextDouble();
				scanner.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("vui lòng nhập số: ");
				e.printStackTrace();
				thongTinBenhNhan = new KhoaXuongKhop(hoVaTen, diaChiNha, ngaySinh, soDienThoaiBenhNhan,
						soDienThoaiNguoiThan, khoa, gioiTinh, nhomMau, canNang, chieuCao, nhipTim);

			}
			System.out.println("đến quầy thanh toán và nhận thuốc");
			System.out.println("");

		} else if (khoa == 3) {
			System.out.println("______________________________");
			System.out.println("| đây là khoa tai Mũi họng:  |");
			System.out.println("|____________________________|");
			System.out.println("");
			String gioiTinh = null;
			System.out.println("Nhập giới tính: ");
			gioiTinh = scanner.nextLine();
			try {
//ghichu 01
			} catch (InputMismatchException e) {
				System.out.println("Vui Lòng Nhập Đúng");
			}
//nhom mau
			String nhomMau = null;
			System.out.println("nhập nhóm máu: ");
			nhomMau = scanner.nextLine();

//can nang
			float canNang = 0;
			System.out.println("nhập cân nặng: ");
			try {
				canNang = scanner.nextFloat();
				scanner.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("vui lòng nhập số: ");
				e.printStackTrace();
			}

//chieu cao
			float chieuCao = 0;
			System.out.println("nhập chiều cao: ");
			try {
				chieuCao = scanner.nextFloat();
				scanner.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("vui lòng nhập số: ");
				e.printStackTrace();
			}

//nhip timString 
			double nhipTim = 0;
			System.out.println("nhập nhịp tim: ");
			try {
				nhipTim = scanner.nextDouble();
				scanner.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("vui lòng nhập số: ");
				e.printStackTrace();
				thongTinBenhNhan = new KhoaTaiMuiHong(hoVaTen, diaChiNha, ngaySinh, soDienThoaiBenhNhan,
						soDienThoaiNguoiThan, khoa, gioiTinh, nhomMau, canNang, chieuCao, nhipTim);

			}
			System.out.println("đến quầy thanh toán và nhận thuốc");
			System.out.println("");

		}
		return thongTinBenhNhan;
	}

	public ThongTinBenhNhan suaThongTin_BenhNhan(String hoVaTen) {
		ThongTinBenhNhan thongTinBenhNhan = null;
//		
		String diaChiNha = null;
		System.out.println("nhập địa chỉ nhà: ");
		diaChiNha = scanner.nextLine();
//		
		String ngaySinh = null;
		System.out.println("nhập ngày sinh: ");
		ngaySinh = scanner.nextLine();
//		
		String soDienThoai = null;
		System.out.println("nhập số điện thoại bệnh nhân: ");
		soDienThoai = scanner.nextLine();
//		
		String soDienThoaiNguoiThan = null;
		System.out.println("nhập số điện thoại Ngừi thân Bệnh Nhân: ");
		soDienThoaiNguoiThan = scanner.nextLine();
//		
		System.err.println("bạn muốn chọn khoa nào? ");
		System.out.println("1. khoa tim mạch");
		System.out.println("2. khoa xương khớp");
		System.out.println("3. khoa tai mũi họng");
//
		int loai = scanner.nextInt();
		scanner.nextLine();

		if (loai == 1) {

			System.out.println("khoa tim mạch ");
			String gioiTinh = null;
			System.out.println("Nhập giới tính: ");
			System.out.println("nhập nhóm máu: ");
			gioiTinh = scanner.nextLine();
			try {
//ghichu 01
			} catch (InputMismatchException e) {
				System.out.println("Vui Lòng Nhập Đúng");
			}
//nhom mau
			String nhomMau = null;
			System.out.println("nhập nhóm máu: ");
			nhomMau = scanner.nextLine();

//can nang
			float canNang = 0;
			System.out.println("nhập cân nặng: ");
			try {
				canNang = scanner.nextFloat();
				scanner.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("vui lòng nhập số: ");
				e.printStackTrace();
			}

//chieu cao
			float chieuCao = 0;
			System.out.println("nhập chiều cao: ");
			try {
				chieuCao = scanner.nextFloat();
				scanner.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("vui lòng nhập số: ");
				e.printStackTrace();
			}

//nhip timString 
			double nhipTim = 0;
			System.out.println("nhập nhịp tim: ");
			try {
				nhipTim = scanner.nextDouble();
				scanner.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("vui lòng nhập số: ");
				e.printStackTrace();
				thongTinBenhNhan = new ThongTinYTe(hoVaTen, diaChiNha, ngaySinh, loai, loai, loai, gioiTinh, nhomMau,
						canNang, chieuCao, nhipTim);
			}
		} else if (loai == 2) {
			System.out.println("khoa xương khớp: ");
			String gioiTinh = null;
			System.out.println("Nhập giới tính: ");
			System.out.println("nhập nhóm máu: ");
			gioiTinh = scanner.nextLine();
			try {
//ghichu 01
			} catch (InputMismatchException e) {
				System.out.println("Vui Lòng Nhập Đúng");
			}
//nhom mau
			String nhomMau = null;
			System.out.println("nhập nhóm máu: ");
			nhomMau = scanner.nextLine();

//can nang
			float canNang = 0;
			System.out.println("nhập cân nặng: ");
			try {
				canNang = scanner.nextFloat();
				scanner.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("vui lòng nhập số: ");
				e.printStackTrace();
			}

//chieu cao
			float chieuCao = 0;
			System.out.println("nhập chiều cao: ");
			try {
				chieuCao = scanner.nextFloat();
				scanner.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("vui lòng nhập số: ");
				e.printStackTrace();
			}

//nhip timString 
			double nhipTim = 0;
			System.out.println("nhập nhịp tim: ");
			try {
				nhipTim = scanner.nextDouble();
				scanner.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("vui lòng nhập số: ");
				e.printStackTrace();
				thongTinBenhNhan = new ThongTinYTe(hoVaTen, diaChiNha, ngaySinh, loai, loai, loai, gioiTinh, nhomMau,
						canNang, chieuCao, nhipTim);

			}
		} else if (loai == 3) {
			System.out.println("khoa tai Mũi họng: ");
			String gioiTinh = null;
			System.out.println("Nhập giới tính: ");
			System.out.println("nhập nhóm máu: ");
			gioiTinh = scanner.nextLine();
			try {
//ghichu 01
			} catch (InputMismatchException e) {
				System.out.println("Vui Lòng Nhập Đúng");
			}
//nhom mau
			String nhomMau = null;
			System.out.println("nhập nhóm máu: ");
			nhomMau = scanner.nextLine();

//can nang
			float canNang = 0;
			System.out.println("nhập cân nặng: ");
			try {
				canNang = scanner.nextFloat();
				scanner.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("vui lòng nhập số: ");
				e.printStackTrace();
			}

//chieu cao
			float chieuCao = 0;
			System.out.println("nhập chiều cao: ");
			try {
				chieuCao = scanner.nextFloat();
				scanner.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("vui lòng nhập số: ");
				e.printStackTrace();
			}

//nhip timString 
			double nhipTim = 0;
			System.out.println("nhập nhịp tim: ");
			try {
				nhipTim = scanner.nextDouble();
				scanner.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("vui lòng nhập số: ");
				e.printStackTrace();
			}
			thongTinBenhNhan = new ThongTinYTe(hoVaTen, diaChiNha, ngaySinh, loai, loai, loai, gioiTinh, nhomMau,
					canNang, chieuCao, nhipTim);

		}

		return thongTinBenhNhan;

	}
}
