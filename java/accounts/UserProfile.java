package accounts;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "users")
public class UserProfile implements Serializable {
    private static final long serialVersionUID = -8706689714326132798L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "login", updatable = false)
    private String login;
    @Column(name = "pass", updatable = false)
    private String pass;

    @SuppressWarnings("UnusedDeclaration")
    public UserProfile() {
    }

    public UserProfile(String login, String pass) {
        this.id = -1;
        this.login = login;
        this.pass = pass;
    }

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }

    @Override
    public String toString() {
        return "UserProfile{ " +
                "id=" + id +
                ", login='" + login + '\'' +
                ", pass='" + pass + '\'' +
                " }";
    }
}
