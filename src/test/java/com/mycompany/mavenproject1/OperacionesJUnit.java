/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import junit.framework.TestCase;
import org.junit.Test;

/**
 *
 * @author USER-PC
 */
public class OperacionesJUnit extends TestCase {

    private Operaciones operaciones;

    public void test() {
        operaciones = new Operaciones();
    }

    @Test
    public void Suma(double a, double b) {
        assertEquals(6, operaciones.Suma(2, 2));
    }

    @Test
    public void Resta(double a, double b) {
        assertTrue(operaciones.Resta(4, 2) == (4 - 2));
    }

    @Test
    public void Multiplicacion(double a, double b) {
        assertTrue(operaciones.Multiplicacion(2, 2) == (2 * 2));
    }

    @Test
    public void Division(double a, double b) {
        assertTrue(operaciones.Division(4, 2) == (4 / 2));
    }

    @Test
    public void Exponencia(double a, double b) {
        assertTrue(operaciones.Exponencia(2, 2) == (Math.pow(2, 2)));
    }
}
