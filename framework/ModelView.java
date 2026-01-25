import java.util.HashMap;

/**
 * Sprint 17 : ajout de l'attribut redirect a ModelView, pour un VRAI
 * sendRedirect() cote navigateur au lieu d'un simple forward interne.
 */
public class ModelView {
    String url;
    String redirect;
    HashMap<String, Object> data = new HashMap<>();

    public void setUrl(String url) { this.url = url; }
    public String getUrl() { return url; }
    public void setRedirect(String redirect) { this.redirect = redirect; }
    public String getRedirect() { return redirect; }
    public void addObject(String cle, Object valeur) { data.put(cle, valeur); }
    public HashMap<String, Object> getData() { return data; }
}
