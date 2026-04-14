import java.util.Random;
public enum DadoStandard {
    D4(4), D6(6), D8(8), D10(10), D12(12), D20(20);

    private final int facce;

    DadoStandard(int facce) {
        this.facce = facce;
    }

    public int LancioDadoStandard(){
        return Random.nextInt(facce) + 1;

    }

    public int getFacce() {
        return facce;
    }
}