package java10tdh;

import java.util.Scanner;

public class Bt2 {
    public static String Tamgiac(int a,int b,int c) {

        if( a<b+c && b<a+c && c<a+b ){
            if( a*a==b*b+c*c || b*b==a*a+c*c || c*c== a*a+b*b)
                return "<<Day la tam giac vuong;";
            else if(a==b && b==c)
                return "Đây là tam giác đều";
            else if(a==b || a==c || b==c)
                return "Đây là tam giác cân";
            else if(a*a > b*b+c*c || b*b > a*a+c*c || c*c > a*a+b*b)
                return "Đây là tam giác tù có 1 góc lớn hơn 90 độ";
            else
               return "đây là tam giác nhọn";
        }
        else
            return "Không phải là ba cạnh của tam giác";

    }
}
