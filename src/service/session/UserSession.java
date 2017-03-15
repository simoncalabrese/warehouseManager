package service.session;

/**
 * Created by simon on 12/03/17.
 */
public class UserSession {

    private Long idUser;
    private String desUser;
    private String username;

    public static UserSession thisSession;

    public UserSession(Long idUser, String desUser, String username) {
        this.idUser = idUser;
        this.desUser = desUser;
        this.username = username;
        thisSession = new UserSession(idUser,desUser,username);
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getDesUser() {
        return desUser;
    }

    public void setDesUser(String desUser) {
        this.desUser = desUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
