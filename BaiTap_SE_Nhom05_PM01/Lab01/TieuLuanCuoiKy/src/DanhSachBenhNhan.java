import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DanhSachBenhNhan<E> {
	private List<ThongTinBenhNhan> danhSach = new ArrayList<>();


//so sánh loại thẻ: nguyên = tắc cuois họ + đầu tên + loại thẻ
	// vd: xich van Hau = xnloaithe01

/*	public boolean soSanhLoaiThe(String loaiThe) {
		boolean daTrungLoaiThe = false;
		for (ThongTinBenhNhan thongTinBenhNhan : danhSach) {
			if (loaiThe.equals(thongTinBenhNhan.getloaiThe())) {
				daTrungLoaiThe = true;
			}
		}
		return daTrungLoaiThe;
	}
*/
	public void them(ThongTinBenhNhan thongTinBenhNhan) {
		this.danhSach.add(thongTinBenhNhan);
	}

	public void inDanhSach_BN() {
		for (ThongTinBenhNhan thongTinBenhNhan : danhSach) {
			System.out.println(thongTinBenhNhan);
			System.out.println("");
		}
	}

	public void inDanhSach() {
		for (ThongTinBenhNhan thongTinYTe : danhSach) {
			System.out.println(thongTinYTe);
			System.err.println("");
		}
	}

	public void xoaBenhNhan(ThongTinBenhNhan thongTinBenhNhan) {
		this.danhSach.remove(thongTinBenhNhan);
	}

	public ThongTinBenhNhan timBenhNhanTheoTen(String benhNhan) {
		ThongTinBenhNhan thongTinBenhNhan = null;
		for (ThongTinBenhNhan thongTinBenhNhan1 : danhSach) {
			if (thongTinBenhNhan.getHoVaTen().toString().equalsIgnoreCase(benhNhan)) {
				thongTinBenhNhan = thongTinBenhNhan1;
			}
		}
		return thongTinBenhNhan;
	}

	// danh sách

	public void danhSach_BenhNhan() {
		
		System.out.println("thông tin y tế");
		System.out.println("______________________________");
		
		danhSach.add(new KhoaTimMach("Nguyễn Thành Sang", "68 phú quốc", "1999", 969704991, 923248041, 1,"nam", "máu A", 60, 167, 10));
		danhSach.add(new KhoaTimMach("Vũ Đình Phú", "63 tiền giang", "2000", 969704992, 923248042, 2,"nam", "máu B", 65, 170, 12));
		danhSach.add(new KhoaTimMach("Nguyễn Thị Mai Thư", "72 bà rịa - vũng tàu", "2001", 969704993, 923248043, 3,"nam", "máu AB", 45, 172, 13));
		
		danhSach.add(new KhoaTaiMuiHong("phan yến nhi", "85 ninh thuận", "28/12/2001", 969704995, 923248042, 2, "nữ", "B", 70, 170, 13));
		danhSach.add(new KhoaTaiMuiHong("lê ngọc tuyền", "71 bến tre", "28/12/2001", 969704995, 923248042, 2, "nữ", "B", 70, 170, 13));
		danhSach.add(new KhoaTaiMuiHong("trịnh hoàng sơn", "61 bình dương", "28/12/2001", 969704995, 923248042, 2, "nữ", "B", 70, 170, 13));

		danhSach.add(new KhoaXuongKhop("huỳnh thị lan anh", "86 bình thuận", "2000", 969704993, 923248042, 1, "nam", "máu AB", 57, 168, 15));
		danhSach.add(new KhoaXuongKhop("nguyễn việt dũng", "60 đồng nai", "2000", 969704993, 923248042, 1, "nam", "máu AB", 57, 168, 15));
		danhSach.add(new KhoaXuongKhop("đặng xuân bình", "72 bà rịa - vũng tàu", "2000", 969704993, 923248042, 1, "nam", "máu AB", 57, 168, 15));
		

	}
	public void ghiFileDanhSachBenhNhan(String tenFile){
        try {
            FileOutputStream outFile = new FileOutputStream(tenFile);
            ObjectOutputStream objOut = new ObjectOutputStream(outFile);
            objOut.writeObject(danhSach);
            objOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	public void docFileDanhSachBenhNhan(String tenFile){
        try {
            FileInputStream inFile = new FileInputStream(tenFile);
            ObjectInputStream objIn = new ObjectInputStream(inFile);
            danhSach = (List) objIn.readObject();
            objIn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
