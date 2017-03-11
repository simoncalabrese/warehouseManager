package commons.enums;

/**
 * Created by simon on 01/03/17.
 */
public enum fxmlPathNames {
    LOGIN("controller/LoginView.fxml"),
    ROOT("controller/Root.fxml");
    private String path;

    fxmlPathNames(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
