/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XSD;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.*;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import java.util.List;
import java.io.*;
import java.util.LinkedList;

/**
 *
 * @author David
 */
public class ValidaconEsquemaXSD {
    public static void main(String [] args) throws Exception
    {
        try {
         //XML a validar
         Source xmlFile = new StreamSource(new File("D:\\EGCC\\Proyectos\\ProyectoXML\\Archivos XML\\depto01.xml"));
        
         //Esquema con el que comparar
         Source schemaFile = new StreamSource(new File("D:\\EGCC\\Proyectos\\ProyectoXML\\XSD\\departamento.xsd"));

         //Preparación del esquema
         SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
         Schema schema = schemaFactory.newSchema(schemaFile);
         
         //Creación del validador
         Validator validator = schema.newValidator();

         //Definición del manejador de excepciones del validador
         final List exceptions = new LinkedList();
         validator.setErrorHandler(new ErrorHandler()
          {
          @Override
          public void warning(SAXParseException exception) throws SAXException
          {
           exceptions.add(exception);
          }

          @Override
          public void fatalError(SAXParseException exception) throws SAXException
          {
           exceptions.add(exception);
          }

          @Override
          public void error(SAXParseException exception) throws SAXException
          {
           exceptions.add(exception);
          }
          });

         //Validación del XML
         validator.validate(xmlFile);
         
         //Resultado de la validación. Si hay errores se detalla el error y la posición exacta en el XML
         if (exceptions.isEmpty()) {
          System.out.println("FILE " + xmlFile.getSystemId() + " IS VALID");
         } else {
          System.out.println("FILE " + xmlFile.getSystemId() + " IS INVALID");
          System.out.println("NUMBER OF ERRORS: "+exceptions.size());
              for(int i = 0; i < exceptions.size(); i++) {
               i=i+1;
               System.out.println("Error # "+i+":");
               i=i-1;
          //   System.out.println("    - Line: "+exceptions.get(i).getLineNumber());
          //   System.out.println("    - Column: "+exceptions.get(i).getColumnNumber());
          //   System.out.println("    - Error message: "+exceptions.get(i).getLocalizedMessage());
               System.out.println("------------------------------");
                         }
                 }
          } catch (SAXException e) {
           e.printStackTrace();
          } catch (IOException e) {
          e.printStackTrace();
         }
    }
}
