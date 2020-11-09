package com.mycompany.mavenproject1;

import junit.framework.TestCase;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

/**
 *
 * @author USER-PC
 */
public class OperacionesMockito extends TestCase{
    private Operaciones operaciones;
    

    public void test() {
        operaciones = Mockito.mock(Operaciones.class);
    }
    
     @Test
    public void Suma(double a, double b) {
         when(operaciones.Suma(2, 2)).thenReturn(4.0);
    }

    @Test
    public void Resta(double a, double b) {
        when(operaciones.Resta(4, 2)).thenReturn(2.0);
    }

    @Test
    public void Multiplicacion(double a, double b) {
        when(operaciones.Multiplicacion(2, 2)).thenReturn(4.0);
    }

    @Test
    public void Division(double a, double b) {
        when(operaciones.Division(4, 2)).thenReturn(2.0);
    }

    @Test
    public void Exponencia(double a, double b) {
        when(operaciones.Exponencia(1, 2)).thenReturn(2.0);
    }
}
