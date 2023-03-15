package java10tdh;

import java.util.Scanner;

public class Bt1 {
    public static void main(String[] args) {
         int nam;
        System.out.println("nhap vao nam");
        Scanner scanner =new Scanner(System.in);
        nam= scanner.nextInt();
//        Calendar calendar = Calendar.getInstance();
//        int currentYear = calendar.get(Calendar.YEAR);
//        System.out.println("Năm hiện tại là " + currentYear);
        String can = "", chi = "";

        // tìm can bằng cách lấy năm đó chia lấy dư cho 10
        switch (nam % 10) {
            case 0:
                can="Canh";
                break;
            case 1:
                can="Tân";
                break;
            case 2:
                can="Nhâm";
                break;
            case 3:
                can="Quý";
                break;
            case 4:
                can="Giáp";
                break;
            case 5:
                can="Ất";
                break;
            case 6:
                can="Bính";
                break;
            case 7:
                can="Đinh";
                break;
            case 8:
                can="Mậu";
                break;
            case 9:
                can="Kỷ";
                break;
        }

        // tìm chi bằng cách lấy năm đó chia lấy dư cho 12
        switch(nam % 12){
            case 0:
                chi="Thân";
                break;
            case 1:
                chi="Dậu";
                break;
            case 2:
                chi="Tuất";
                break;
            case 3:
                chi="Hợi";
                break;
            case 4:
                chi="Tý";
                break;
            case 5:
                chi="Sửu";
                break;
            case 6:
                chi="Dần";
                break;
            case 7:
                chi="Mẹo";
                break;
            case 8:
                chi="Thìn";
                break;
            case 9:
                chi="Tỵ";
                break;
            case 10:
                chi="Ngọ";
                break;
            case 11:
                chi="Mùi";
                break;
        }

        System.out.println("Can chi của năm " + nam + " là " + (can + " " + chi));
    }
}
