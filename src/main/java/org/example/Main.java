package org.example;

public class Main {
    public static class Persona {
        private String nombre;
        private int edad;

        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        public void saludar() {
            System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        Persona persona = new Persona("Juan", 30);
        persona.saludar();

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}
