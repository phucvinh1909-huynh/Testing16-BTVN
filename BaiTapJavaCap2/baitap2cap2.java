public class baitap2cap2 {
}
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Nhap vao mot chuoi tu: ");
    String chuoiTu = input.nextLine();
        chuoiTu = chuoiTu.toLowerCase();

    boolean chuoiDoiXung = true;
    int doDaiChuoi = chuoiTu.length();

    for (int i = 0; i < doDaiChuoi / 2; i++) {
        char kyTuDau = chuoiTu.charAt(i);
        char kyTuCuoi = chuoiTu.charAt(doDaiChuoi - 1 - i);

        if (kyTuDau != kyTuCuoi) {
            chuoiDoiXung = false;
        }
    }

    System.out.println("Ket qua la: " + chuoiDoiXung);
}
