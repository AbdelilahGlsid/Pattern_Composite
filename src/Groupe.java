import java.util.ArrayList;
import java.util.List;

public class Groupe extends Figure {

    private final List<Figure> figures = new ArrayList<>();

    public void ajouter(Figure figure) {
        figures.add(figure);
    }

    public void supprimer(Figure figure) {
        figures.remove(figure);
    }

    @Override
    public void dessiner(int niveauIndentation) {
        imprimerIndentation(niveauIndentation);
        System.out.println("Dessin du groupe de figures :");
        for (Figure figure : figures) {
            figure.dessiner(niveauIndentation + 1); // Augmente l'indentation pour chaque sous-figure
        }
    }
}
