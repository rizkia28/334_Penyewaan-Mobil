import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BufferedReader input1 = new BufferedReader(new InputStreamReader(System.in));
        int pass = 0;
        int noHandphone = 0;
        try {
            System.out.println();
            System.out.println("Masukkan no Handphone : ");
            noHandphone=Integer.parseInt(input1.readLine());
            System.out.println("Masukkan Password : ");
            pass=Integer.parseInt(input1.readLine());
        } catch (IOException a){
            a.printStackTrace();
        }
        if (noHandphone == 334 && pass == 2828){
            Penyewaan.pilihan();
            Kembalian k = new Kembalian();
            int x,y;
            System.out.println("Total : ");
            x=input.nextInt();
            System.out.println("Bayar : ");
            y=input.nextInt();
            k = new Kembalian(x,y);
            System.out.println("Kembalian "+k.Kembalian());
            System.out.println("Apakah ingin Transaksi lagi : ");
            System.out.println("1. Ya");
            System.out.println("2. Tidak");
            int pilih=input.nextInt();
            if(pilih==1){
                //pemanggilan method dan class
                //nama class.nama method
            } else if (pilih==2) {
                System.out.println("Terimakasih sudah menggunakan jasa kami");

            }

        }else {
            System.out.println("NoHandphone atau Password salah, transaksi Gagal");
        }
    }
}