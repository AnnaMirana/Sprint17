# Sprint 17 — Redirection HTTP

**Preuve dans le code :** `ModelView.setRedirect()/getRedirect()`,
`FrontController.ModelViewtoJsp()` (`if (mv.getRedirect()!=null) { resp.sendRedirect(...) }`),
`Controller1.methodeVoalohany()` sur `/`.

**Ce qu'apporte ce sprint :** l'attribut `redirect` sur `ModelView`. Si present,
le dispatcher fait un vrai redirect (le navigateur change d'URL) plutot qu'un
forward interne (transparent pour le navigateur).

**Pour tester :** `cd sprint17/test && javac *.java && java TestSprint17`
