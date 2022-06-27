
public class KhoaTimMach extends ThongTinYTe {

	public KhoaTimMach(String hoVaTen, String diaChiNha, String ngaySinh, double soDienThoaiBenhNhan,
			double soDienThoaiNguoiThan, double loaiThe, String gioiTinh, String nhomMau, float canNang, float chieuCao,
			double nhipTim) {
		super(hoVaTen, diaChiNha, ngaySinh, soDienThoaiBenhNhan, soDienThoaiNguoiThan, loaiThe, gioiTinh, nhomMau,
				canNang, chieuCao, nhipTim);
		// TODO Auto-generated constructor stub
	}

	public String toString_thongTinYTe() {
		return "Khoa Tim Mạch: [Giới Tính = " + gioiTinh + ", Nhóm Máu = " + nhomMau + ", Cân Nặng = " + canNang + ", Chiều Cao = "
				+ chieuCao + ", Nhịp Tim = " + nhipTim + "]";
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
/*	public double tinhTongTien_KhoaTimMach () {
		if (this.getloaiThe() >= 100000) {
			return tongTien = ;
		}
	}
*/
	/*
	 * public KhoaTimMach(String hoVaTen, String diaChiNha, String ngaySinh, double
	 * soDienThoaiBenhNhan, double soDienThoaiNguoiThan, double loaiThe) {
	 * super(hoVaTen, diaChiNha, ngaySinh, soDienThoaiBenhNhan,
	 * soDienThoaiNguoiThan, loaiThe); // TODO Auto-generated constructor stub }
	 * 
	 * @Override public String noiDangKyKham() { // TODO Auto-generated method stub
	 * return null; }
	 * 
	 * @Override public String phongKham() { // TODO Auto-generated method stub
	 * return null; }
	 * 
	 * @Override public String noiPhatThuocVaThuNgan() { // TODO Auto-generated
	 * method stub return null; }
	 */

