package com.uis.simon.citricos.modelo;

import java.util.List;

public class ResultadoRiego {
    private List<Integer> controlRiego;
    private String objetivo;
    private Modelo control;

    public ResultadoRiego(List<Integer> controlRiego, String objetivo, Modelo control) {
        this.controlRiego = controlRiego;
        this.objetivo = objetivo;
        this.control = control;
    }

    // Getters y setters
    public List<Integer> getControlRiego() {
        return controlRiego;
    }

    public void setControlRiego(List<Integer> controlRiego) {
        this.controlRiego = controlRiego;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public Modelo getControl() {
        return control;
    }

    public void setControl(Modelo control) {
        this.control = control;
    }

}
