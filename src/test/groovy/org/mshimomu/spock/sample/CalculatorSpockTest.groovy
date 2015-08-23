package org.mshimomu.spock.sample

import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by Masaya SHIMOMURA on 2015/08/24.
 */
class CalculatorSpockTest extends Specification {

    def multiplyで3と4の乗算結果が取得できる() {
        when:
        Calculator calc = new Calculator();
        int expected = 12;
        int actual = calc.multiply(3, 4);

        then:
        expected == actual
    }

    @Unroll("multiplyで#xと#yの乗算結果#expectedが取得できる")
    def multiplyで乗算結果が取得できる() {
        when:
        Calculator calc = new Calculator();

        then:
        expected == calc.multiply(x, y)

        where:
        x | y || expected
        3 | 4 || 12
        3 | 5 || 15

    }
}
