package com.tws.refactoring.extract_method;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class OwingPrinterTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void printOwing() {
        //given
        OwingPrinter owingPrinter = new OwingPrinter();
        Order order1 = new Order(10);
        Order order2 = new Order(20);
        List<Order> orderList = new ArrayList<>();
        orderList.add(order1);
        orderList.add(order2);

//        when
        owingPrinter.printOwing("cola",orderList);


//        then

        String result = "*****************************\r\n" + "****** Customer totals ******\r\n*****************************\r\n";
        result += "name: cola\r\n";
        result += "amount: 30.0\r\n";

        assertEquals(result, outContent.toString());

    }
}