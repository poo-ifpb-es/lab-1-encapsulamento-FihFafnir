class Circulo {
    final private float PI = 3.14159f;
    private float raio;
    private float area;
    private float circunferencia;
    
    public Circulo(float raio) {
        this.setRaio(raio);    
    }

    public void setRaio(float novoRaio) {
        this.raio = novoRaio;
        this.area = this.PI * novoRaio * novoRaio;
        this.circunferencia = 2f * this.PI * novoRaio;
    }

    public float getRaio() {
        return this.raio;
    }

    public float getCircunferencia() {
        return this.circunferencia;
    }

    public float getArea() {
        return this.area;
    }
}