package junitbook.chapter3;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by mshimomura on 2017/03/24.
 */
public class UserFormTest {

    @Test
    public void isValidはuserNameとpasswordが空でない場合にtrueを返す(){
        UserForm sut = new UserForm("user01", "1234");
        assertThat(sut.isValid(), is(true));
    }
}