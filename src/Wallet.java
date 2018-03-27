import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Wallet {
    public static void main(String[] args) {
        List<Integer> myWallet = new ArrayList();
//        List myWallet = new Wallet();
        myWallet.add(5);
        myWallet.add(1);
        myWallet.add(20);
        myWallet.add(200);
        myWallet.add(50);
        myWallet.add(10);
        myWallet.add(1);
        myWallet.add(500);
        myWallet.add(20);
        myWallet.add(100);
        myWallet.add(200);
        myWallet.add(1000);

// Then, when we print all the elements:

        Collections.sort(myWallet);
        for(Integer banknote: myWallet) {
            System.out.println(banknote);
        }
    }
}
