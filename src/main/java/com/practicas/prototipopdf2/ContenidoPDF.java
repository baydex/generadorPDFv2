/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practicas.prototipopdf2;

import com.itextpdf.forms.PdfAcroForm;
import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.borders.SolidBorder;
import com.itextpdf.layout.element.Paragraph;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Set;

/**
 *
 * @author PRACTICAS
 */
public class ContenidoPDF {

    Set<Persona.DatosPersona> datosPersona;
    PdfAcroForm formulario;
    Document document;

    public ContenidoPDF(Set<Persona.DatosPersona> datosPersona, PdfAcroForm formulario) throws IOException {
        this.datosPersona = datosPersona;
        this.formulario = formulario;
    }

    public void insertar() throws IOException {
        document = new Document(formulario.getPdfDocument());

        for (Persona.DatosPersona dato : datosPersona) {
            agregarEtiqueta(dato);
        }
        document.close();
    }

    private void agregarEtiqueta(Persona.DatosPersona dato) throws IOException {
        agregarContenido(dato);
    }
    
    private void agregarContenido(Persona.DatosPersona dato) throws IOException{
        if (dato.tipo.equals("texto")){
            agregarTexto(dato);
        }
        else if(dato.tipo.equals("imagen")){
            agregarImagen(dato);
        }
    }
    
    private void agregarTexto(Persona.DatosPersona dato) throws IOException{
        Paragraph contenido = new Paragraph(dato.contenido);
            contenido.setFont(PdfFontFactory.createFont(StandardFonts.HELVETICA));
            contenido.setFontSize(dato.fontSize);
            contenido.setFixedPosition(dato.x, dato.y, dato.width);
            contenido.setHeight(dato.height);
            /*
            SolidBorder border = new SolidBorder(1);
            contenido.setBorder(border);
            */
            document.add(contenido);
    }
    private void agregarImagen(Persona.DatosPersona dato) throws MalformedURLException{
        PdfDocument documento = formulario.getPdfDocument();
        ImageData imageData = ImageDataFactory.create(dato.contenido);

        PdfCanvas canvas = new PdfCanvas(documento.getFirstPage());
        Rectangle rect = new Rectangle(dato.x, dato.y, dato.width, dato.height);
        canvas.addImageFittedIntoRectangle(imageData, rect, true);
    }

}
