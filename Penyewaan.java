import java.util.Scanner;
public class Penyewaan {
    private double uang;
    int harga;
    int hari;
    int Manual;
    double Matic;
    String no_mobil;
    Scanner input = new Scanner(System.in);
    //konstruktor overloading penyewaan manual
    public Penyewaan(int Manual){
        this.Manual=Manual;
        this.hari=hari;
        int byr = Manual*harga;
        System.out.println("sewa perhari : "+byr);
    }
    //konstruktor overloading penyewaan matic
    public Penyewaan(int Matic, int hari){
        this.Matic=Matic;
        this.hari=hari;
        int byr = Matic*harga;
        System.out.println("sewa perhari : "+byr);
    }
    public static void pilihan(){
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Silahkan pilih jenis Transmisi mobil : ");
        System.out.println("1. Manual ");
        System.out.println("2. Matic ");
        System.out.println("Masukkan pilihan anda : ");
        int pilih = input.nextInt();
        switch (pilih){
            case 1:
                Penyewaan.Manual();
                break;
            case 2:
                Penyewaan.Matic();
                break;
        }
    }
    //method manual
    public static void Manual(){
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("------------------------------");
        System.out.println("Pilih jenis merk mobil manual");
        System.out.println("------------------------------");
        System.out.println("1. Toyota Avanza ");
        System.out.println("2. Innova Reborn ");
        System.out.println("3. Honda Brio ");
        System.out.println("4. Honda Jazz ");
        System.out.println("5. Honda Mobilio");
        System.out.println("Masukkan pilihan anda : ");
        int pilih1=input.nextInt();
        switch(pilih1){
            case 1:
                Penyewaan Avanza=new Penyewaan(250000);
                System.out.println("Toyota Avanza Manual");
                System.out.println("AB 1210 GV ");
                Avanza.tampilManual();
                break;
            case 2:
                Penyewaan Innova=new Penyewaan(325000);
                System.out.println("Innova Reborn Manual");
                Innova.tampilManual();
                break;
            case 3:
                Penyewaan Brio=new Penyewaan(200000);
                System.out.println("Honda Brio Manual");
                Brio.tampilManual();
                break;
            case 4:
                Penyewaan Jazz=new Penyewaan(225000);
                System.out.println("Honda Jazz Manual");
                Jazz.tampilManual();
                break;
            case 5:
                Penyewaan Mobilio=new Penyewaan(250000);
                Mobilio.tampilManual();
                break;
        }

    }
    //method matic
    public static void Matic(){
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("------------------------------");
        System.out.println("Pilih jenis merk mobil matic");
        System.out.println("------------------------------");
        System.out.println("1. Toyota Fortuner ");
        System.out.println("2. Honda City ");
        System.out.println("3. Toyota Yaris GR ");
        System.out.println("4. Daihatsu Ayla ");
        System.out.println("5. Honda HRV ");
        System.out.println("Masukkan Pilihan anda : ");
        int pilih2=input.nextInt();
        switch (pilih2){
            case 1:
                Penyewaan Fortuner= new Penyewaan(370000,1);
                System.out.println("Toyota Fortuner Matic");
                Fortuner.tampilmatic();
                break;
            case 2:
                Penyewaan City= new Penyewaan(270000,1);
                System.out.println("Honda City Matic");
                City.tampilmatic();
                break;
            case 3:
                Penyewaan Yaris = new Penyewaan(260000,1);
                System.out.println("Toyota Yaris GR");
                Yaris.tampilmatic();
                break;
            case 4:
                Penyewaan Ayla = new Penyewaan(185000,1);
                System.out.println("Daihatsu Ayla Matic ");
                Ayla.tampilmatic();
                break;
            case 5:
                Penyewaan HRV = new Penyewaan(300000,1);
                System.out.println("Honda HRV Matic");
                HRV.tampilmatic();
                break;
        }

    }
    void tampilManual() {
        int jumlahhariManual;
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Lama Sewa: ");
        int jmhari=input.nextInt();
        jumlahhariManual=jmhari*Manual;
        System.out.println("Anda memilih jenis transmisi manual");
        System.out.println("Dengan Harga sewa : "+jumlahhariManual);
    }
    void tampilmatic(){
        int jumlahhari;
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("lama sewa: ");
        int jmhari=input.nextInt();
        jumlahhari=(int) (jmhari+Matic*hari);
        System.out.println("Anda memilih jenis Transmisi Matic");
        System.out.println("Dengan harga sewa :"+jumlahhari);

    }
}
