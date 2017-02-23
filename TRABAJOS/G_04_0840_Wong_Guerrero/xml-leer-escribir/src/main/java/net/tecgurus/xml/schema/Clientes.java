//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2016.08.28 a las 07:36:22 PM CDT 
//


package net.tecgurus.xml.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cliente" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="apaterno" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="amaterno" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cliente"
})
@XmlRootElement(name = "clientes")
public class Clientes {

    @XmlElement(required = true)
    protected List<Clientes.Cliente> cliente;

    /**
     * Gets the value of the cliente property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cliente property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCliente().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Clientes.Cliente }
     * 
     * 
     */
    public List<Clientes.Cliente> getCliente() {
        if (cliente == null) {
            cliente = new ArrayList<Clientes.Cliente>();
        }
        return this.cliente;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="apaterno" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="amaterno" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "nombre",
        "apaterno",
        "amaterno"
    })
    public static class Cliente {

        @XmlElement(required = true)
        protected String nombre;
        @XmlElement(required = true)
        protected String apaterno;
        @XmlElement(required = true)
        protected String amaterno;
        @XmlAttribute(name = "id")
        protected Integer id;

        /**
         * Obtiene el valor de la propiedad nombre.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNombre() {
            return nombre;
        }

        /**
         * Define el valor de la propiedad nombre.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNombre(String value) {
            this.nombre = value;
        }

        /**
         * Obtiene el valor de la propiedad apaterno.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApaterno() {
            return apaterno;
        }

        /**
         * Define el valor de la propiedad apaterno.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApaterno(String value) {
            this.apaterno = value;
        }

        /**
         * Obtiene el valor de la propiedad amaterno.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAmaterno() {
            return amaterno;
        }

        /**
         * Define el valor de la propiedad amaterno.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAmaterno(String value) {
            this.amaterno = value;
        }

        /**
         * Obtiene el valor de la propiedad id.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getId() {
            return id;
        }

        /**
         * Define el valor de la propiedad id.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setId(Integer value) {
            this.id = value;
        }

    }

}
