public class TestSprint17 {

    static void traiterReponse(Object valeur) throws Exception {
        if (valeur instanceof String) {
            System.out.println("[PrintWriter] " + valeur);
        } else if (valeur instanceof ModelView) {
            ModelView mv = (ModelView) valeur;
            if (mv.getRedirect() != null) {
                // Equivalent de resp.sendRedirect(...) : le navigateur change vraiment d'URL
                System.out.println("[sendRedirect vers] " + mv.getRedirect());
                return;
            }
            System.out.println("[forward interne vers] /" + mv.getUrl());
        }
    }

    public static class MonControleur {
        // Equivalent de methodeVoalohany() sur "/" dans le vrai Controller1
        public ModelView racine() {
            ModelView mv = new ModelView();
            mv.setRedirect("page_accueil?nom=Diary");
            return mv;
        }
        public ModelView pageAccueil(String nom) {
            ModelView mv = new ModelView();
            mv.addObject("nom", nom);
            mv.setUrl("page/accueil.jsp");
            return mv;
        }
    }

    public static void main(String[] args) throws Exception {
        MonControleur ctrl = new MonControleur();
        traiterReponse(ctrl.racine());
        traiterReponse(ctrl.pageAccueil("Diary"));
    }
}
