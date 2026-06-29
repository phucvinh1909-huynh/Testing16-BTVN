
public class baitap4cap1 {
}
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Nhap mot chuoi cac tu: ");
    String chuoiTu = input.nextLine();

    if (chuoiTu.isEmpty()) {
        System.out.println("Chua nhap chuoi cac tu: ");
        return;
    }
    int soKhoangCach = 0;

    for (int i = 0; i < chuoiTu.length(); i++) {
        if (chuoiTu.charAt(i) == ' ' && chuoiTu.charAt(i + 1) != ' ') {
            soKhoangCach++;
        }
    }
    int soTu = soKhoangCach + 1;
    System.out.println("So tu trong chuoi la: " + soTu);
}


