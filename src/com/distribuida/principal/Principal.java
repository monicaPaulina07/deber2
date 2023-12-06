package com.distribuida.principal;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.entities.Autor;
import com.distribuida.entities.Categoria;
import com.distribuida.entities.Cliente;
import com.distribuida.entities.DatosEmpresa;
import com.distribuida.entities.DetalleFactura;
import com.distribuida.entities.Factura;
import com.distribuida.entities.Libro;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		Cliente cliente = context.getBean("cliente",Cliente.class);
		Factura factura = context.getBean("factura",Factura.class);
		DetalleFactura detalleFactura = context.getBean("detalleFactura",DetalleFactura.class);
		Libro libro = context.getBean("libro",Libro.class);
		Categoria categoria = context.getBean("categoria",Categoria.class);
		Autor autor = context.getBean("autor",Autor.class);
		DatosEmpresa datosEmpresa= context.getBean("datosEmpresa", DatosEmpresa.class);
		
		//CLIENTE
		cliente.setIdCliente(1);
		cliente.setCedula("1755065974");
		cliente.setNombre("Monica");
		cliente.setApellido("Pinenla");
		cliente.setDireccion("Quito, Checa");
		cliente.setTelefono("0987200371");
		cliente.setCorreo("monica2002paulina@gmail.com");
		
		//FACTURA
		factura.setIdFactura(1);
		factura.setNumFactura("001");
		factura.setFecha("06/12/23");
		factura.setTotalNeto(20);
		factura.setIva(12);
		factura.setTotal(factura.getTotalNeto()*factura.getIva());
		
		//LIBRO
		libro.setIdLibro(1);
		libro.setTitulo("un mundo feliz");
		libro.setEditorial("desconocido");
		libro.setNumPaginas(256);
		libro.setEdicion(2);
		libro.setIdioma("Español");
		libro.setFechaPublicacion("2013");
		libro.setDescripcion("");
		libro.setNumEjemplares(400);
		libro.setPortada("Original");
		libro.setPresentacion("");
		libro.setPrecio(15.75);
		
		
		//CATEGORIA
		categoria.setIdCategoria(1);
		categoria.setCategoria("Aventura");
		categoria.setDescripcion("un mundo feliz");
		
		//AUTOR
		autor.setIdAutor(1);
		autor.setNombre("Aldous Leonard  ");
		autor.setApellido("Huxley");
		autor.setPais("	Británica");
		autor.setDireccion("s/n");
		autor.setTelefono("07845");
		autor.setCorreo("aldous22@hotmail.com");
		
		
		//IMPRIMIR
		System.out.println(datosEmpresa.toString());
		System.out.println(autor.toString());
		System.out.println(categoria.toString());
		System.out.println(libro.toString());
		System.out.println(factura.toString());
		System.out.println(cliente.toString());
		System.out.println(detalleFactura.toString());
		
		context.close();
	}

}
