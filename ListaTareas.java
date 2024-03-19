package com.example.project;

import java.util.ArrayList;

public class ListaTareas {
ArrayList<String> tareas = new ArrayList<>();
	
public void agregarTarea (String tarea) {
	
	 tareas.add(tarea);
	
}

public int marcarTareaComoCompletada(int num) {
	tareas.remove(num);
	 
	return tareas.size();
}




public int obtenerNumeroTareasPendientes() {
	
	return tareas.size();
	
}
	
}
