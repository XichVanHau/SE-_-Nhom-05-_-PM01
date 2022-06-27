import java.io.Serializable;

public abstract class ThongTinBenhNhan implements Serializable {

	private String hoVaTen;
	private String diaChiNha;
	private String ngaySinh;
	private double soDienThoaiBenhNhan;
	private double soDienThoaiNguoiThan;
	private double loaiThe;
//	final float theBaoHiemLoai_01 = 100000;
//	final float theBaoHiemLoai_02 = 300000;

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		if (hoVaTen != null) {
			this.hoVaTen = hoVaTen;
		} else {
			System.out.println("Họ Và Tên Không Được Để Trống");
		}

	}

	public String getDiaChiNha() {
		return diaChiNha;
	}

	public void setDiaChiNha(String diaChiNha) {
		if (diaChiNha != null) {
			this.diaChiNha = diaChiNha;
		} else {
			System.out.println("Địa Chỉ Nhà Không Được Để Trống");
		}

	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		if (ngaySinh != null) {
			this.ngaySinh = ngaySinh;
		} else {
			System.out.println("Ngày Sinh Không Được Để Trống");
		}

	}

	public double getSoDienThoaiBenhNhan() {
		return soDienThoaiBenhNhan;
	}

	public void setSoDienThoaiBenhNhan(double soDienThoaiBenhNhan) {
		if (soDienThoaiBenhNhan > 0) {
			this.soDienThoaiBenhNhan = soDienThoaiBenhNhan;
		} else {
			System.out.println("Số Điện Thoại Không Được Để Trống");
		}

	}

	public double getSoDienThoaiNguoiThan() {
		return soDienThoaiNguoiThan;
	}

	public void setSoDienThoaiNguoiThan(double soDienThoaiNguoiThan) {
		if (soDienThoaiBenhNhan > 0) {
			this.soDienThoaiNguoiThan = soDienThoaiNguoiThan;
		} else {
			System.out.println("Số Điện Thoại Không Được Để Trống");
		}

	}
	//ây chết tiệc... ... ...
	
	public double getloaiThe() {
		return loaiThe;
	}

	public void setloaiThe(double loaiThe) {
		if (loaiThe >= 100000) {
			System.out.println("Thẻ Bảo Hiểm Giảm 50%");
			this.loaiThe = loaiThe;
		} else if (loaiThe >= 300000) {
			System.out.println("Thẻ Bảo Hiểm Giảm 80%");
			this.loaiThe = loaiThe;
		}else {
			System.out.println("Loại Thẻ Chưa Tồn Tại / Nhập Sai");
		}
	}

	public ThongTinBenhNhan(String hoVaTen, String diaChiNha, String ngaySinh, double soDienThoaiBenhNhan,
			double soDienThoaiNguoiThan, double loaiThe) {
		this.hoVaTen = hoVaTen;
		this.diaChiNha = diaChiNha;
		this.ngaySinh = ngaySinh;
		this.soDienThoaiBenhNhan = soDienThoaiBenhNhan;
		this.soDienThoaiNguoiThan = soDienThoaiNguoiThan;
		this.loaiThe = loaiThe;
	}

	public String toString_thongtinBenhNhan() {
		return "ThongTinBenhNhan [Họ Và Tên: " + hoVaTen + ", Địa Chỉ Nhà: " + diaChiNha + ", Ngày Sinh: " + ngaySinh
				+ ", Số Điện Thoại Bênh Nhân: " + soDienThoaiBenhNhan + ", Số Điện Thoại Người Thân: "
				+ soDienThoaiNguoiThan + "]";
	}

	public abstract String noiDangKyKham();

	public abstract String phongKham();

	public abstract String noiPhatThuocVaThuNgan();

	public String toString_thongTinYTe() {
		// TODO Auto-generated method stub
		return null;
	}
}
