/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practicas.prototipopdf2;

/**
 *
 * @author PRACTICAS
 */
public class Amber extends Persona{
    
    DatosPersona reporte;
    DatosPersona edad;
    DatosPersona genero;
    DatosPersona fecha;
    DatosPersona lugar;
    DatosPersona nacionalidad;
    DatosPersona estatura;
    DatosPersona complexion;
    DatosPersona tez;
    DatosPersona cara;
    DatosPersona ojos;
    DatosPersona boca;
    DatosPersona labios;
    DatosPersona cabello;
    DatosPersona vestimenta;
    DatosPersona senias;
    DatosPersona hechos;
    DatosPersona foto;
    DatosPersona nombre;
    
    public Amber(){
        super();
        
        inicializarCampos();
        guardarContenidos();
        configurarCampos();
        agregarCampos();
    }
    
    private void guardarContenidos(){
        
        reporte.contenido = "76121";

        edad.contenido = "22 años";

        genero.contenido = "Hombre";

        fecha.contenido = "29 de Marzo de 2023";

        lugar.contenido = "Tequisquiapan, Querétaro";

        nacionalidad.contenido = "Mexicana";

        estatura.contenido = "1.78 m";

        complexion.contenido = "Delgado";

        tez.contenido = "Moreno";

        cara.contenido = "Alargada";

        ojos.contenido = "Alargados, café oscuro";

        boca.contenido = "Mediana";

        labios.contenido = "Delgados";

        cabello.contenido = "Corto, negro, quebrado";
        
        
        String vestimentaTexto = "Lorem ipsum dolor sit amet consectetur adipisicing elit. Quos inventore adipisci beatae! Voluptatem esse tenetur assumenda recusandae quia saepe doloremque voluptatibus similique ad. Laudantium veniam ratione accusamus obcaecati, ab molestiae.";
        
        String tabulacion = ".\t\t\t\t\t\t\t\t";
        vestimenta.contenido = tabulacion + vestimentaTexto;

        String seniasTexto = "Lorem ipsum dolor sit amet consectetur adipisicing elit. Quos inventore adipisci beatae! Voluptatem esse tenetur assumenda recusandae quia saepe doloremque voluptatibus similique ad. Laudantium veniam ratione accusamus obcaecati, ab molestiae.";
        
        tabulacion = ".\t\t\t\t\t\t\t\t\t\t\t\t\t";
        senias.contenido = tabulacion + seniasTexto;
        
        String hechosTexto = "Lorem\n ipsum\n dolor \nsit \namet \nconsectetur \nadipisicing \nelit. \nQuos inventore adipisci beatae! Voluptatem esse tenetur assumenda recusandae quia saepe doloremque voluptatibus similique ad. Laudantium veniam ratione accusamus obcaecati, ab molestiae.";
        
        tabulacion = ".\t\t\t\t\t\t";
        hechos.contenido = tabulacion + hechosTexto;
          
        nombre.contenido = "Maria Cristina Benedicta Montejano Merlos";

        foto.contenido = "C:\\Users\\PRACTICAS\\Documents\\proyectos\\generarPDF\\profile.jpg";
    }
    
    private void inicializarCampos(){
        reporte = new DatosPersona();
        edad = new DatosPersona();
        genero = new DatosPersona();
        fecha = new DatosPersona();
        lugar = new DatosPersona();
        nacionalidad = new DatosPersona();
        estatura = new DatosPersona();
        complexion = new DatosPersona();
        tez = new DatosPersona();
        cara = new DatosPersona();
        ojos = new DatosPersona();
        boca = new DatosPersona();
        labios = new DatosPersona();
        cabello = new DatosPersona();
        vestimenta = new DatosPersona();
        senias = new DatosPersona();
        hechos = new DatosPersona();
        nombre = new DatosPersona();
        foto = new DatosPersona();
    }
    
    private void configurarCampos(){
        reporte.guardarDatos(425, 703, 100);
        edad.guardarDatos(310, 630, 80);
        genero.guardarDatos(470, 630, 90);
        fecha.guardarDatos(430, 604, 150);
        lugar.guardarDatos(430, 578, 150);
        nacionalidad.guardarDatos(380, 552, 150);
        estatura.guardarDatos(345, 525, 50);
        complexion.guardarDatos(510, 525, 80);
        tez.guardarDatos(300, 500, 80);
        cara.guardarDatos(450, 500, 80);
        ojos.guardarDatos(310, 474, 250);
        boca.guardarDatos(310, 448, 80);
        labios.guardarDatos(465, 448, 100);
        cabello.guardarDatos(340, 420, 250);
        vestimenta.guardarDatos(260, 330, 340, 83, 11);
        senias.guardarDatos(260, 253, 340, 81, 11);
        hechos.guardarDatos(85, 90, 520, 160,  11);
        nombre.guardarDatos(50, 260, 200, 180, 30);
        foto.guardarDatos(50, 450, 200, 200,  11);
        foto.tipo = "imagen";
    }
    
    private void agregarCampos(){
        datos.add(reporte);
        datos.add(edad);
        datos.add(genero);
        datos.add(fecha);
        datos.add(lugar);
        datos.add(nacionalidad);
        datos.add(estatura);
        datos.add(complexion);
        datos.add(tez);
        datos.add(cara);
        datos.add(ojos);
        datos.add(boca);
        datos.add(labios);
        datos.add(cabello);
        datos.add(vestimenta);
        datos.add(senias);
        datos.add(hechos);
        datos.add(foto);
        datos.add(nombre);
    }
    
}
