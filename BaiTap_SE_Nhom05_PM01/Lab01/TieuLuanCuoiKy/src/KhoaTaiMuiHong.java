
public class KhoaTaiMuiHong extends ThongTinYTe {

	public KhoaTaiMuiHong(String hoVaTen, String diaChiNha, String ngaySinh, double soDienThoaiBenhNhan,
			double soDienThoaiNguoiThan, double loaiThe, String gioiTinh, String nhomMau, float canNang, float chieuCao,
			double nhipTim) {
		super(hoVaTen, diaChiNha, ngaySinh, soDienThoaiBenhNhan, soDienThoaiNguoiThan, loaiThe, gioiTinh, nhomMau,
				canNang, chieuCao, nhipTim);
		// TODO Auto-generated constructor stub
	}

	public String toString_thongTinYTe() {
		return "KhoaTimMach [gioiTinh=" + gioiTinh + ", nhomMau=" + nhomMau + ", canNang=" + canNang + ", chieuCao="
				+ chieuCao + ", nhipTim=" + nhipTim + "]";
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
		return null;
	}
}
