/**
 * Created by emanu on 07/06/2017.
 */
public class TestaTributavel {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.deposita(100);
        System.out.println("valor tributos: " + cc.calculaTributos());

        // testando polimorfismo:
        Tributavel t = cc;
        System.out.printf("O saldo é: %.2f", cc.getSaldo());
        System.out.println("valor tributos: " + t.calculaTributos());
    }
}
