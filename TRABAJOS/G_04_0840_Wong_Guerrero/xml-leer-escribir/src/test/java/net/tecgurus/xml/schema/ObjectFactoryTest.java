package net.tecgurus.xml.schema;

import static org.junit.Assert.*;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.junit.Test;

import net.tecgurus.xml.schema.Clientes.Cliente;

public class ObjectFactoryTest {

	@Test
	public void testCreateClientes() throws JAXBException {
		Clientes clientes = new ObjectFactory().createClientes();
		
		Cliente cliente = new Cliente();
		cliente.setId(99);
		cliente.setNombre("Tec");
		cliente.setApaterno("Gurus");
		
		clientes.getCliente(); //Si la lista es null, crea un ArrayList
		
		clientes.cliente.add(cliente);
		
		
		Cliente cliente2 = new Cliente();
		cliente2.setId(100);
		cliente2.setNombre("Java");
		cliente2.setApaterno("Gurus");
		
		clientes.cliente.add(cliente2);
		
		JAXBContext jaxbContext = JAXBContext.newInstance(Clientes.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		jaxbMarshaller.marshal(clientes, System.out);
		
		jaxbMarshaller.marshal(clientes, new File("c:/tecgurus/prueba.xml"));
	}
	
	
	@Test
	public void testUnMarshal() throws JAXBException {
		File file = new File("c:/tecgurus/prueba.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(Clientes.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Clientes clientes = (Clientes) jaxbUnmarshaller.unmarshal(file);
		for (Cliente cliente : clientes.cliente) {
			System.out.println(cliente.getId());
			System.out.println(cliente.getNombre());
			System.out.println(cliente.getApaterno());
		}
		
	}

}
