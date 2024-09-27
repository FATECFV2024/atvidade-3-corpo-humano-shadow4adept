package main.java;

public class CorpoHumano {
    private float massa;
    private float volume;
    private float densidade;
    public CorpoHumano(float massa, float volume) {
        this.massa = massa;
        this.volume = volume;
        this.densidade = calcularDensidade();
    }
    public float getMassa() {
        return massa;
    }
    public float getVolume() {
        return volume;
    }
    public float getDensidade() {
        return densidade;
    }
    public void setMassa(float massa) {
        this.massa = massa;
        this.densidade = calcularDensidade();
    }
    public void setVolume(float volume) {
        this.volume = volume;
        this.densidade = calcularDensidade();
    }
    private float calcularDensidade() {
        return massa / volume;
    }
}
