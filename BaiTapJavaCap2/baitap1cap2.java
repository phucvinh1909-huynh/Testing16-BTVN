public class baitap1cap2 {
}
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    input.useLocale(Locale.US);
    System.out.print("Nhap so tien thu nhap cua ban: ");
    double soThuNhap = input.nextDouble();
    double soThue = 0;

    if (soThuNhap <= 5) {
        soThue = soThuNhap * 0.05;
    }
    else if (soThuNhap <= 10) {
        soThue = soThuNhap * 0.10;
    }
    else if (soThuNhap <= 18) {
        soThue = soThuNhap * 0.15;
    }
    else if (soThuNhap <= 32) {
        soThue = soThuNhap * 0.20;
    }
    else if (soThuNhap <= 52) {
        soThue = soThuNhap * 0.25;
    }
    else if (soThuNhap <= 80) {
        soThue = soThuNhap * 0.30;
    }
    else {
        soThue = soThuNhap * 0.35;
    }

    System.out.println("So tien thue phai tra la: " + soThue + " trieu ");

}