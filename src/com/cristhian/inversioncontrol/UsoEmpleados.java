package com.cristhian.inversioncontrol;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		
		//Creación de objetos de tipo empleado
		//Empleados empleado1 = new DirectorEmpleado();
		// Uso de objetos creados
		//System.out.println(empleado1.getTareas());
		
		//Cargar XML
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		// Solicitar el Bean
		Empleados Cristhian = (Empleados) contexto.getBean("miEmpleado", Empleados.class);
		// Utilizar el bean
		System.out.println(Cristhian.getTareas());
		//System.out.println(Cristhian.getInforme());
		//Cerrar el bean
		contexto.close();
	}

}
