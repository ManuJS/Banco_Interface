/**
 * Created by emanu on 07/06/2017.
 */
public class ContaCorrente extends Conta implements Tributavel {

    float saldo;

    public float getSaldo() {
        return saldo;
    }

    @Override
    public double calculaTributos() {
        return this.getSaldo() * 0.01;
    }

    public void deposita(int valor) {

        this.saldo += valor;
    }
}
