package com.cristhian.inversioncontrol;


public class DirectorEmpleado implements Empleados {
	
	private ICreacionInformes informeNuevo;
	
	public DirectorEmpleado(ICreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la nomina de la empresa";
	}

	public String getInforme() {
		return "Informe creado por el director" + informeNuevo.getInforme();
	}

}
