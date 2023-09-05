import java.lang.*;

class CarroIndisponivelException extends RuntimeException {
    public CarroIndisponivelException() {
        super("O carro está indisponível.");
    }
}

class CarroDisponivelException extends RuntimeException {
    public CarroDisponivelException() {
        super("O carro está disponível.");
    }
}

class CarroNaoPagoException extends RuntimeException {
    public CarroNaoPagoException() {
        super("O carro não foi pago.");
    }
}

class CarroAluguel {
    private boolean disponivel = true, sinistro = false;
    private float valorPorKm = 0f;
    private int distancia = 0;

    public CarroAluguel(float valorPorKm) {
        this.valorPorKm = valorPorKm;
    }

    void setValorPorKm(float valor) {
        this.valorPorKm = valor;
    }

    void setSinistro(boolean s) {
        this.sinistro = s;
    }

    float getValorPorKm() {
        return this.valorPorKm;
    }

    void setDistanciaPercorrida(int distancia) {
        this.distancia = distancia;
    }

    int getDistanciaPercorrida() {
        return this.distancia; 
    }

    void alugar() {
        if (this.disponivel)
            this.disponivel = false;
        else throw new CarroIndisponivelException();
    }

    void devolver() {
        if (this.disponivel)
            throw new CarroDisponivelException();
        if (this.getDebito() != 0) 
            throw new CarroNaoPagoException();
        this.sinistro = false;
        this.disponivel = true;
        this.distancia = 0;
    }

    boolean isDisponivel() {
        return this.disponivel;
    }

    boolean hasSinistro() {
        return this.sinistro;
    }

    float getDebito() {
        return this.valorPorKm * this.distancia * (this.sinistro ? 1.6f : 1);
    }

    void pagar() {
        if (this.disponivel) 
            throw new CarroDisponivelException();
        this.distancia = 0;
    }
}