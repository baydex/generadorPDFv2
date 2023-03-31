/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.practicas.prototipopdf2;

/**
 *
 * @author PRACTICAS
 */
public class PrototipoPDF2 {

    public static void main(String[] args) {
        String rutaPlantillaAlba = "C:\\Users\\PRACTICAS\\Documents\\proyectos\\generarPDF\\plantillaAlbaEtiquetas.pdf";
        String rutaPlantillaAmber = "C:\\Users\\PRACTICAS\\Documents\\proyectos\\generarPDF\\plantillaAmberEtiquetas.pdf";
        
        String rutaGuardadoDocumento = "C:\\Users\\PRACTICAS\\Documents\\proyectos\\generarPDF\\";
        
        
        Persona persona = new Alba();
        GeneradorPDF generadorPDF;
        generadorPDF = new GeneradorPDF(persona, rutaPlantillaAlba);
        generadorPDF.autoCompletarPDF(rutaGuardadoDocumento);
    }
}
