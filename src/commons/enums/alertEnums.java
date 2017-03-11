package commons.enums;

/**
 * Created by simon on 11/03/17.
 */
public enum alertEnums {
    LOGINERROR_MISSING("ERRORE NEL LOGIN","Dati mancanti","Attenzione! Inserire tutti i dati"),
    LOGINERROR_VALUES("ERRORE NEL LOGIN","Dati inseriti errati","Attenzione! Dati inseriti non validi");

    private String title;
    private String header;
    private String footer;
    alertEnums(String title,String header,String footer) {
        this.title=title;
        this.header= header;
        this.footer=footer;
    }

    public String getTitle() {
        return title;
    }

    public String getHeader() {
        return header;
    }

    public String getFooter() {
        return footer;
    }
}
