
public class baitap3cap1 {
}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập so nguyen: ");
        int soNguyen = input.nextInt();

        int ketQua = 0;
        for (int so = 0; so <= soNguyen; so++) {
            if (so % 2 == 0) {
                ketQua = ketQua + so;
            }
        }
        System.out.println("Tong tat ca so chan la: " + ketQua);
    }

