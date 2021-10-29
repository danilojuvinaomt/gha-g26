/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gha.g26;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author juvinao
 */
public class Clase1Test {
    
    public Clase1Test() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of suma method, of class Clase1.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        Clase1 instance = new Clase1();
        int result = instance.suma(4, 5);
        assertEquals(9, result);
    }
    
    @Test
    public void testSuma2(){
        Clase1 c1 = new Clase1();
        int result = c1.suma(-4, -8);
        assertEquals(12, result);
    }
    
    @Test
    public void testSuma3(){
        Clase1 c1 = new Clase1();
        int result = c1.suma(100, 200);
        assertEquals(300, result);
    }
    
}
