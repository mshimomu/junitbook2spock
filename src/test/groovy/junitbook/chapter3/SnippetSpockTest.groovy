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

    // リスト3.6
    def 要素が2つ追加された状態で要素をremoveするとsizeが1になる() {
        // Setup
        when:
        def sut = new ArrayList<>()
        sut.add("Hello")
        sut.add("World")
        // Exercise
        sut.remove(0)
        then:
        sut.size() == 1
        sut.get(0) == "World"
    }


}
