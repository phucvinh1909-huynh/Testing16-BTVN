public class baitap5cap1 {
}
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Nhap mot chuoi cac tu: ");
    String chuoiTu = input.nextLine();
    String[] cacTu = chuoiTu.split(" ");

    for (int i = 0; i < cacTu.length; i++) {
        String chuoiTuHienTai = cacTu[i];

        if (!chuoiTuHienTai.isEmpty()) {
            char chuDau = chuoiTuHienTai.charAt(0);
            char chuVietHoa = Character.toUpperCase(chuDau);

            System.out.print(chuVietHoa + " ");
        }
    }
}