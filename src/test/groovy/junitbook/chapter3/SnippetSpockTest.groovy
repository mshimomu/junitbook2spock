package junitbook.chapter3

import org.junit.Test
import spock.lang.Specification

/**
 * Created by mshimomura on 2017/03/26.
 */
class SnippetSpockTest extends Specification{

    // リスト3.5
    def addで要素を追加するとサイズが1となりgetで取得できる() {
         when:
         def sut = new ArrayList<String>()
         sut.add("Hello")

         then:
         sut.size() == 1
         sut.get(0) == "Hello"
    }
}
