package junitbook.chapter3;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by mshimomura on 2017/03/26.
 */
public class SnippetTest {
    // リスト3.5
    @Test
    public void addで要素を追加するとサイズが1となりgetで取得できる() throws Exception{
        ArrayList<String> sut = new ArrayList<>();
        sut.add("Hello");
        assertThat(sut.size(), is(1));
        assertThat(sut.get(0), is("Hello"));
    }

    @Test
    public void 要素が2つ追加された状態で要素をremoveするとsizeが1になる() throws Exception {
        // Setup
        ArrayList<String> sut = new ArrayList<>();
        sut.add("Hello");
        sut.add("World");
        // Exercise
        sut.remove(0);
        // Verify
        assertThat(sut.size(), is(1));
        assertThat(sut.get(0), is("World"));
    }
}
