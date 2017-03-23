package junitbook.chapter3

import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by mshimomura on 2017/03/24.
 */
class UserFormSpockTest extends Specification {

    @Unroll
    "isValidは#userNameと#passwordが空でない場合に#expectedを返す"(){
        when:
        def sut = new UserForm(userName, password)

        then:
        expected == sut.isValid()

        where:
        userName | password || expected
        "user01" | "1234" || true
    }
}
