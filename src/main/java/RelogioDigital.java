class RelogioDigital {
    private int hora, minuto;
    
    public RelogioDigital() {
        this.hora = 12;
        this.minuto = 20;
    }

    public RelogioDigital(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    void tick() {
        this.minuto++;
        if (this.minuto >= 60) {
            this.hora++;
            this.minuto = 0;
        }

        if (this.hora >= 24) 
            this.hora = 0;
    }

    int getHora() {
        return this.hora;
    }

    int getMinuto() {
        return this.minuto;
    }

    void setHora(int novaHora) {
        this.hora = novaHora;
    }

    void setMinuto(int novoMinuto) {
        this.minuto = novoMinuto;
    }


}