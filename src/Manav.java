import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        int elma,armut,muz,domates,patlican;
        Scanner input=new Scanner(System.in);
        System.out.print("elma kaç kilo=");
         elma= input.nextInt();


        System.out.print("armut kaç kilo=");
        armut= input.nextInt();


        System.out.print("muz kaç kilo=");
        muz= input.nextInt();


        System.out.print("domates kaç kilo=");
        domates= input.nextInt();


        System.out.print("patlıcan kaç kilo=");
        patlican= input.nextInt();


        double toplam =(elma*3.67)+(armut*2.14)+(muz*0.95)+(patlican*5)+(domates*1.11);
        System.out.print("toplam tutar="+toplam);



    }
}
