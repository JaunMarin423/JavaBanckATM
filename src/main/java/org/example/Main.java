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

    public static class Calculadora{
        public int sumar(int a, int b) {
            return a+b;
        }

        public int multiplicar(int a, int b) {
            return a*b;
        }

        public int division(int a, int b) {
            if (b == 0) {
                System.out.println("El divisor es igual a " + b );
            }
            return a/b;
        }
        public int resta(int a, int b) {
            return a-b;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        Persona persona = new Persona("Juan", 30);
        persona.saludar();

        Calculadora calculadora = new Calculadora();

        int sum = calculadora.sumar(5, 10);
        int mul = calculadora.multiplicar(5, 10);
        int div = calculadora.division(5, 2);
        int res = calculadora.resta(5, 1);

        System.out.println("El valor de la suma "+ sum + " El valor de la multiplicación es "+ mul +" el valor de la div es " + div + " el valor de la resta es " + res);
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}
