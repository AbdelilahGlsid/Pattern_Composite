public class Rectangle extends Figure {
    @Override
    public void dessiner(int niveauIndentation) {
        imprimerIndentation(niveauIndentation);
        System.out.println("Dessin d'un rectangle.");
    }
}
