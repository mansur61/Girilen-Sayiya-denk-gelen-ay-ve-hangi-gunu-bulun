import java.util.Scanner;

public class Main {

   private static String[] aylar= {"Ocak","Şubat","Mart","Nisam","Mayıs","Haziran","Temmuz","Ağustos","Eylül","Ekim","Kasım","Aralık"};
   private static int aylardakiGunSayisi[] ={31,28,31,30,31,30,31,31,30,31,30,31};//ayların gün sayıları

public static  void main(String[] args){

    int topla=0;
    //System.out.println(new Main().aylardakiGunSayisi[0]);
    for(int i=0;i<new Main().aylardakiGunSayisi.length;i++){topla += new Main().aylardakiGunSayisi[i];}
    //System.out.println(topla);
    System.out.println("Merak eylediğiniz herhangi bir sayının ,hangi gün ve aya denk geldiğini öğrenmek istiyor iseniz bir sayı giriiniz");
    Scanner s = new Scanner(System.in);//kullancıdan ver alır
    int sayı=s.nextInt();
    System.out.println("Girdiğiniz sayı :"+sayı);
    int sayac=0;
    boolean durum=true;
    while(durum==true){

        if(sayı >= (topla+1)){   sayı = sayı - 365;}
        if (sayı <= topla) {
            if(1<=sayı & sayı<=31){/*ocak*/ System.out.println("Bulunan Gün ve Ay :"+sayı+" OCAK");durum=false;}
            if(32<=sayı & sayı<=59){/*şubat*/System.out.println("Bulunan Gün ve Ay :"+(sayı-31)+" ŞUBAT");durum=false;}
            if(60<=sayı & sayı<=90){/*mart*/System.out.println("Bulunan Gün ve Ay :"+(sayı-59)+" MART");durum=false;}
            if(91<=sayı & sayı<=120){/*nisan*/System.out.println("Bulunan Gün ve Ay :"+(sayı-90)+" NİSAN");durum=false;}
            if(121<=sayı & sayı<=151){/*mayıs*/System.out.println("Bulunan Gün ve Ay :"+(sayı-120)+" MAYIS");durum=false;}
            if(152<=sayı & sayı<=181){/*Haziran*/System.out.println("Bulunan Gün ve Ay :"+(sayı-151)+" HAZİRAN");durum=false;}
            if(182<=sayı & sayı<=212){/*Temmuz*/System.out.println("Bulunan Gün ve Ay :"+(sayı-181)+" TEMMUZ");durum=false;}
            if(213<=sayı  & sayı<=243){/*Ağustos*/System.out.println(""+(sayı-212)+" AĞUSTOS");durum=false;}
            if(244<=sayı & sayı<=273){/*Eylül*/System.out.println("Bulunan Gün ve Ay :"+(sayı-243)+" EYLÜL");durum=false;}
            if(274<=sayı & sayı<=304){/*Ekim*/ System.out.println("Bulunan Gün ve Ay :"+(sayı-273)+" EKİM");durum=false;}
            if(305<=sayı & sayı<=334){/*kasım*/ System.out.println("Bulunan Gün ve Ay :"+(sayı-304)+" KASIM");durum=false;}
            if(335<=sayı & sayı<=365){/*aralık*/ System.out.println("Bulunan Gün ve Ay :"+(sayı-334)+" ARALIK");durum=false;}


        }
        sayac++;
    }
    //System.out.println(sayac);
}

}
