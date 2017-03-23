package junitbook.chapter3;

/**
 * Created by mshimomura on 2017/03/24.
 */
public class UserForm {

    private String userName;
    private String password;

    public UserForm(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public boolean isValid() {
        return (this.userName != null && !"".equals(this.userName)) &&
                (this.password != null && !"".equals(this.password));
    }
}
