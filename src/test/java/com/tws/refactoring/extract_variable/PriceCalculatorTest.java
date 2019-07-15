package com.tws.refactoring.extract_variable;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PriceCalculatorTest {

    @Test
    void should_return_4975_when_getPrice_given_1000_and_500(){
        //given
        PriceCalculator priceCalculator = new PriceCalculator();
        int quantity = 1000;
        int itemPrice = 5;
//        when
        double result = priceCalculator.getPrice(quantity,itemPrice);


//        then
        Assertions.assertEquals(result,4975);
    }
}

