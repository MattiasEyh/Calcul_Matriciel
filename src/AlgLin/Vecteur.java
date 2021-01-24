package AlgLin;

import java.util.Arrays;

public class Vecteur extends Matrice{

    protected double[] coefficient;

    Vecteur(int nbcolonne) {
        super(1, nbcolonne);
    }

    Vecteur(double[] tableau) {
        //JSP
        this.coefficient = tableau;
    }

    Vecteur(String fichier) {
        super(fichier);
    }

    @Override
    public int nbColonne() {
        return super.nbColonne();
    }

    @Override
    public double getCoef(int ligne, int colonne) {
        return super.getCoef(0, colonne);
    }

    public void setCoefficient(int indice, double nouveauCoef){
        if (indice > 0 && indice < this.coefficient.length)
            this.coefficient[indice] = nouveauCoef;
    }

    @Override
    public String toString() {
        return "Vecteur{" +
                "coefficient=" + Arrays.toString(coefficient) +
                '}';
    }

    private int getTaille(){
        return this.coefficient.length;
    }

    private static double produitScalaire(Vecteur v1, Vecteur v2){
        double scalaire = 0.0;
        try{
            if (v1.getTaille() != v2.getTaille())
                System.out.println("Vecteurs de taille différentes !");
            else if (v1.getTaille() == 0 && v2.getTaille() == 0) {
                System.out.println("Taille nulle !");
            }
            else
                for(int i = 0; i < v1.getTaille(); i++) {
                    scalaire += v1.getCoef(0, i) * v2.getCoef(0, i);
                }
        }catch (Exception e){e.printStackTrace();}

        return scalaire;
    }
}
