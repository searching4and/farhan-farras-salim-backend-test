import java.util.HashSet;

public class program {
    public static int selfNumber(int i){
        int jumlah = i;
        while (i > 0){
            jumlah += i % 10;
            i /= 10;
        }
        return jumlah;
    }

    public static void main(String[] args){
        int limit = 5000;
        HashSet<Integer> nonSelf = new HashSet<>();

        for(int i=1; i<=limit; i++){
            int self = selfNumber(i);
            if (self <= limit){
                nonSelf.add(self);
            }
        }

        int jumlahSelfNumb = 0;
        System.out.println("self-numbers dari rentang bilangan 1 sampai dengan " +limit+ " :");
        for (int i=1; i<=limit; i++){
            if(!nonSelf.contains(i)){
                System.out.println(i+" ");
                jumlahSelfNumb += i;
            }
        }
        System.out.println("Hasil penjumlahan kelompok self-numbers dengan limit " +limit+ " adalah " +jumlahSelfNumb);
    }
}
