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

        System.out.println("Ket qua 1:" + sNT.ketQua);
        SNT sNT2 = new SNT();
        sNT2.soKT = 11;
        sNT2.kiemTra();
        System.out.println("Ket qua:" + sNT2.ketQua);
        System.out.println("AAAAA")
    }
}
