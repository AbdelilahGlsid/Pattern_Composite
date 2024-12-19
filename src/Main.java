//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Figure cercle1 = new Cercle();
        Figure rectangle1 = new Rectangle();

        Groupe groupe1 = new Groupe();
        groupe1.ajouter(cercle1);
        groupe1.ajouter(rectangle1);

        Groupe sousGroupe = new Groupe();
        sousGroupe.ajouter(new Cercle());
        sousGroupe.ajouter(new Rectangle());

        groupe1.ajouter(sousGroupe);

        groupe1.dessiner(0);
    }
}