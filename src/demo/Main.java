package demo;

public class Main {
    public static void main(String[] args) {
        //Khai bao
//
        int soCanKT;
//        //gan gia tri
//        soCanKT = 6;
//        //khai bao
//        boolean ketQua;
//        ketQua = true;
//        //gan gia tri
//        for (int i = 2; i <soCanKT/2; i ++){
//            if (soCanKT%i==0){
//                ketQua =false;
//            }
//        }
//        System.out.println(ketQua);
//    }
        SNT sNT = new SNT();
        sNT.soKT = 10;
        sNT.kiemTra();

        System.out.println("Ket qua:" + sNT.ketQua);
        SNT nt2 = new SNT();
        nt2.soKT = 5;
        sNT.kiemTra();
        System.out.println("Ket qua:" + nt2.ketQua);

    }
}
