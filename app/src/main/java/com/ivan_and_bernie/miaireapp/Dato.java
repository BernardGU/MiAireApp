package com.ivan_and_bernie.miaireapp;

public class Dato {
    public Dato() {
    }

    public Dato(String fecha, String sensor, String medicion) {
            this.fecha = fecha;
            this.sensor = sensor;
            this.medicion = medicion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getSensor() {
        return sensor;
    }

    public void setSensor(String sensor) {
        this.sensor = sensor;
    }

    public String getMedicion() {
        return medicion;
    }

    public void setMedicion(String medicion) {
        this.medicion = medicion;
    }

    private String fecha;
    private String sensor;
    private String medicion;
}
