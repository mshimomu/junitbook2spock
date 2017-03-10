package junit.tutorial

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

    @Unroll
    def "multiplyで#xと#yの乗算結果#expectedが取得できる"() {
        when:
        Calculator calc = new Calculator();

        then:
        expected == calc.multiply(x, y)

        where:
        x | y || expected
        3 | 4 || 12
        5 | 7 || 35

    }

    @Unroll
    def "divideで#xと#yの除算結果#expectedが取得できる"() {
        when:
        Calculator calc = new Calculator()

        then:
        expected == calc.divide(x, y)

        where:
        x | y || expected
        3 | 2 || 1.5f

    }


}
