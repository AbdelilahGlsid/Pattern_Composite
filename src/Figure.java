public abstract class Figure {
    public abstract void dessiner(int niveauIndentation);

    protected void imprimerIndentation(int niveau) {
        for (int i = 0; i < niveau; i++) {
            System.out.print("\t"); // Ajoute une indentation de 4 espaces
        }
    }
}
