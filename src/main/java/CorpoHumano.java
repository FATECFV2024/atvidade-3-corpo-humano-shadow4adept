package main.java;

public class CorpoHumano {
    private float massa;
    private float densidade;
    private float volume;
    public CorpoHumano(float massa, float volume) {
        this.massa = massa;
        this.volume = volume;
        this.densidade = calcularDensidade();
    }
    public float getMassa() {
        return massa;
    }
    public float getDensidade() {
        return densidade;
    }
    public float getVolume() {
        return volume;
    }
    public void setMassa(float massa) {
        this.massa = massa;
        this.densidade = calcularDensidade();
    }
    private float calcularDensidade() {
        return massa / volume;
    }
    public void setVolume(float volume) {
        this.volume = volume;
        this.densidade = calcularDensidade();
    }
}
