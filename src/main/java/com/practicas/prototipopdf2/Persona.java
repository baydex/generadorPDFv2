/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practicas.prototipopdf2;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author PRACTICAS
 */
public abstract class Persona {

    Set<DatosPersona> datos;
    
    
    public Persona() {
        datos = new HashSet<>();

    }

    public class DatosPersona {

        public float x = 0;
        public float y = 0;
        public float width = 100;
        public float height = 17;
        public float fontSize = 12;
        public String tipo = "texto";
        public String contenido = "";
        public String titulo = "";

        public void guardarDatos(float x, float y, float width, float heigth,  float fontSize) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.fontSize = fontSize;
            this.height=heigth;
        }

        public void guardarDatos(float x, float y, float width ) {
            guardarDatos(x, y, width, 17, 12);
        }
        public void guardarDatos(float x, float y, float width, float height ) {
            guardarDatos(x, y, width, height, 12);
        }
    }
    
}
