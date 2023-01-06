public class Kembalian implements Layanan{
        private double uang;
        private double total;
        Kembalian(){}
        Kembalian(double uang,double total){
            this.uang=uang;
            this.total=total;
        }
        public double getUang() {
            return uang;
        }
        public double getTotal() {
            return total;
        }
        @Override
        public double Kembalian() {
            return (total-uang);
        }
}
