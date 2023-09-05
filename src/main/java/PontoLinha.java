class Ponto {
    private double x, y;
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }
    
    public double getY() {
        return this.y;
    }

    public void setX(double novoX) {
        this.x = novoX;
    }
    
    public void setY(double novoY) {
        this.y = novoY;
    }

    public void setXY(double novoX, double novoY) {
        this.x = novoX;
        this.y = novoY;
    }
}

class Linha {
    Ponto inicio;
    Ponto fim;

    public Linha(Ponto inicio, Ponto fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    public Ponto getInicio() {
        return this.inicio;
    }

    public void setInicio(Ponto novoInicio) {
        this.inicio = novoInicio;
    }

    public Ponto getFim() {
        return this.fim;
    }

    public void setFim(Ponto novoFim) {
        this.fim = novoFim;
    }

    public double getComprimento() {
        double deltaX = this.inicio.getX() - this.fim.getX();
        double deltaY = this.inicio.getY() - this.fim.getY();
        return Math.sqrt(deltaX*deltaX + deltaY*deltaY);
    }
}