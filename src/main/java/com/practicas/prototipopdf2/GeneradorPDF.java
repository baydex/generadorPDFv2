/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practicas.prototipopdf2;

import com.itextpdf.forms.PdfAcroForm;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author PRACTICAS
 */
public class GeneradorPDF {
    ContenidoPDF contenidoPDF;
    PdfDocument documento;
    PdfAcroForm formulario;
    String rutaPlantilla;
    Persona persona;
    
    public GeneradorPDF(Persona persona, String rutaPlantilla){
        this.rutaPlantilla = rutaPlantilla;
        this.persona = persona;
    }
    
    public void autoCompletarPDF(String rutaGuardadoDocumento){
        rutaGuardadoDocumento += "76121";
        try {
            cargarDocumento(rutaGuardadoDocumento);
            cargarFormulario();
            cargarContenidoPDF();
            insertarContenidoPDF();
            cerrarDocumento();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
    
    private void cargarDocumento(String rutaGuardadoDocumento) throws IOException {
        String rutaGuardadoDocumentoSeBusca = rutaGuardadoDocumento + "_SeBusca.pdf";
        File plantilla = new File(this.rutaPlantilla);
        File archivoFinal = new File(rutaGuardadoDocumentoSeBusca);

        documento = new PdfDocument(new PdfReader(plantilla), new PdfWriter(archivoFinal));
    }

    private void cargarFormulario() {
        boolean crearSiNoExiste = true;
        formulario = PdfAcroForm.getAcroForm(documento, crearSiNoExiste);
    }
    
    private void cargarContenidoPDF() throws IOException{ 
        contenidoPDF = new ContenidoPDF(persona.datos, formulario);   
    }
    
    private void insertarContenidoPDF() throws IOException{
        contenidoPDF.insertar();
    }
    
    private void cerrarDocumento() throws IOException {
        documento.close();
    }
    
}
