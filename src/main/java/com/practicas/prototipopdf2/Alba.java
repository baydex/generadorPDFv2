/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practicas.prototipopdf2;


/**
 *
 * @author PRACTICAS
 */
public class Alba extends Persona{


    DatosPersona nombre;
    DatosPersona edad;
    DatosPersona sexo;
    DatosPersona lugarNacimiento;
    DatosPersona fechaNacimiento;
    DatosPersona fechaHechos;
    DatosPersona lugarHechos;
    DatosPersona nacionalidad;
    DatosPersona cabelloColor;
    DatosPersona cabelloTipo;
    DatosPersona cabelloLongitud;
    DatosPersona ojosColor;
    DatosPersona ojosTamaño;
    DatosPersona boca;
    DatosPersona labios;
    DatosPersona estatura;
    DatosPersona peso;
    DatosPersona complexion;
    DatosPersona tez;
    DatosPersona ocupacion;
    DatosPersona vestimenta;
    DatosPersona senias;
    DatosPersona hechos;
    DatosPersona foto;

    public Alba() {
        super();
        
        inicializarCampos();
        guardarContenidos();
        configurarCampos();
        agregarCampos();

    }

    private void guardarContenidos() {

        nombre.contenido = "MARIA CRISTINA BENEDICTA MONTEJANO MERLOS";
        edad.contenido = "23 años";
        sexo.contenido = "Mujer";
        lugarNacimiento.contenido = "Querétaro";
        fechaNacimiento.contenido = "14 de Julio del 2000";
        fechaHechos.contenido = "29 de Marzo de 2023";
        lugarHechos.contenido = "Santiago de Querétaro";
        nacionalidad.contenido = "Mexicana";
        cabelloColor.contenido = "Negro";
        cabelloTipo.contenido = "Quebrado";
        cabelloLongitud.contenido = "Corto";
        ojosColor.contenido = "Negro";
        ojosTamaño.contenido = "Alargados";
        boca.contenido = "Mediana";
        labios.contenido = "Delgados";
        estatura.contenido = "1.78 metros";
        peso.contenido = "63 kilos";
        complexion.contenido = "Delgado";
        tez.contenido = "Moreno";
        ocupacion.contenido = "Estudiante";
        vestimenta.contenido = "asdadasdasdasd";
        senias.contenido = "asdasdasdasd";
        hechos.contenido = "renglon1\nrenglon2\nrenglon3\nrenglon4 sdasdasdasdasd";
        foto.contenido = "C:\\Users\\PRACTICAS\\Documents\\proyectos\\generarPDF\\profile.jpg";
    }

    private void inicializarCampos(){
        nombre = new DatosPersona();
        edad = new DatosPersona();
        sexo = new DatosPersona();
        lugarNacimiento = new DatosPersona();
        fechaNacimiento = new DatosPersona();
        fechaHechos = new DatosPersona();
        lugarHechos = new DatosPersona();
        nacionalidad = new DatosPersona();
        cabelloColor = new DatosPersona();
        cabelloTipo = new DatosPersona();
        cabelloLongitud = new DatosPersona();
        ojosColor = new DatosPersona();
        ojosTamaño = new DatosPersona();
        boca = new DatosPersona();
        labios = new DatosPersona();
        estatura = new DatosPersona();
        peso = new DatosPersona();
        complexion = new DatosPersona();
        tez = new DatosPersona();
        ocupacion = new DatosPersona();
        vestimenta = new DatosPersona();
        senias = new DatosPersona();
        hechos = new DatosPersona();
        foto = new DatosPersona();
    }
    
    private void configurarCampos() {
        nombre.guardarDatos(350, 630, 200);
        edad.guardarDatos(325, 617, 200, 14, 10);
        sexo.guardarDatos(325, 603, 200, 14, 10);
        lugarNacimiento.guardarDatos(405, 589, 200, 14, 10);
        fechaNacimiento.guardarDatos(405, 575, 200, 14, 10);
        fechaHechos.guardarDatos(405, 561, 200, 14, 10);
        lugarHechos.guardarDatos(405, 547, 200, 14, 10);
        nacionalidad.guardarDatos(370, 533, 200, 14, 10);
        cabelloColor.guardarDatos(345, 518, 200, 14, 10);
        cabelloTipo.guardarDatos(325, 503, 200, 14, 10);
        cabelloLongitud.guardarDatos(340, 490, 200, 14, 10);
        ojosColor.guardarDatos(370, 475, 200, 14, 10);
        ojosTamaño.guardarDatos(340, 461, 200, 14, 10);
        boca.guardarDatos(325, 447, 200, 14, 10);
        labios.guardarDatos(340, 433, 200, 14, 10);
        estatura.guardarDatos(350, 419, 200, 14, 10);
        peso.guardarDatos(330, 404, 200, 14, 10);
        complexion.guardarDatos(360, 389, 200, 14, 10);
        tez.guardarDatos(320, 375, 200, 14, 10);
        ocupacion.guardarDatos(355, 360, 200, 14, 10);
        vestimenta.guardarDatos(35, 191, 550, 53, 9);
        senias.guardarDatos(35, 281, 550, 53, 9);
        hechos.guardarDatos(35, 105, 550, 53, 9);
        foto.guardarDatos(30, 380, 250,250);
        foto.tipo = "imagen";
    }

    private void agregarCampos() {
        datos.add(nombre);
        datos.add(edad);
        datos.add(sexo);
        datos.add(lugarNacimiento);
        datos.add(fechaNacimiento);
        datos.add(fechaHechos);
        datos.add(lugarHechos);
        datos.add(nacionalidad);
        datos.add(cabelloColor);
        datos.add(cabelloTipo);
        datos.add(cabelloLongitud);
        datos.add(ojosColor);
        datos.add(ojosTamaño);
        datos.add(boca);
        datos.add(labios);
        datos.add(estatura);
        datos.add(peso);
        datos.add(complexion);
        datos.add(tez);
        datos.add(ocupacion);
        datos.add(vestimenta);
        datos.add(senias);
        datos.add(hechos);
        datos.add(foto);

    }

}
