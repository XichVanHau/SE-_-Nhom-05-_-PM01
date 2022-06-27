
public class ThongTinYTe extends ThongTinBenhNhan {
	protected String gioiTinh;
	protected String nhomMau;
	protected float canNang;
	protected float chieuCao;
	protected double nhipTim;

	public ThongTinYTe(String hoVaTen, String diaChiNha, String ngaySinh, double soDienThoaiBenhNhan,
			double soDienThoaiNguoiThan, double loaiThe, String gioiTinh, String nhomMau, float canNang, float chieuCao,
			double nhipTim) {
		super(hoVaTen, diaChiNha, ngaySinh, soDienThoaiBenhNhan, soDienThoaiNguoiThan, loaiThe);
		this.gioiTinh = gioiTinh;
		this.nhomMau = nhomMau;
		this.canNang = canNang;
		this.chieuCao = chieuCao;
		this.nhipTim = nhipTim;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		if (gioiTinh != null) {
			this.gioiTinh = gioiTinh;
		} else {
			System.out.println("Giới Tính Không Được Để Trống!");
		}
	}

	public String getNhomMau() {
		return nhomMau;
	}

	public void setNhomMau(String nhomMau) {
		if (gioiTinh != null) {
			this.nhomMau = nhomMau;
		} else {
			System.out.println("Nhóm Máu Không Được Để Trống!");
		}
	}

	public float getCanNang() {
		return canNang;
	}

	public void setCanNang(float canNang) {
		if (gioiTinh != null) {
			this.canNang = canNang;
		} else {
			System.out.println("Cân Nặng Không Được Để Trống!");
		}
	}

	public float getChieuCao() {
		return chieuCao;
	}

	public void setChieuCao(float chieuCao) {
		if (gioiTinh != null) {
			this.chieuCao = chieuCao;
		} else {
			System.out.println("Chiều Cao Không Được Để Trống!");
		}
	}

	public double getNhipTim() {
		return nhipTim;
	}

	public void setNhipTim(double nhipTim) {
		if (gioiTinh != null) {
			this.nhipTim = nhipTim;
		} else {
			System.out.println("Nhịp Tim Không Được Để Trống!");
		}
	}

	@Override
	public String noiDangKyKham() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String phongKham() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String noiPhatThuocVaThuNgan() {
		// TODO Auto-generated method stub
		System.out.println("phòng ABC");
		return null;
	}

	@Override
	public String toString() {
		return "Thông Tin Y Tế: [Giới Tính = " + gioiTinh + ", Nhóm Máu = " + nhomMau + ", Cân Nặng = " + canNang + ", Chiều Cao = "
				+ chieuCao + ", Nhịp Tim = " + nhipTim + "]";
	}

}
