/**
 * Created by BelSi1731422 on 2018-03-19.
 */
public class ArrayList<T> implements List<T> {

    private int tailleTableau=10;
    private int tailleListe=0;
    private T[] tableau = (T[])new Object[tailleTableau];


    public void add(T contenue){
        if (tailleListe==tailleTableau){
            grow();
        }
        tableau[tailleListe] = contenue;
        tailleListe++;
    }
    public void add(int index,T contenue){
        if (index>tailleListe){
            System.out.println("Il est impossible de créer dans cette position");
        }
        else if (index==tailleListe){
            add(contenue);
        }
        else if (index<tailleListe){
            if (tailleListe==tailleTableau){
                grow();
            }
            for (int i = tailleListe;i>index;i--){
                tableau[i]=tableau[(i-1)];
            }
            tableau[index]=contenue;
            tailleListe++;
        }
    }
    private void grow(){
        tailleTableau = 2*tailleTableau;
        T[] tableau2 = (T[])new Object[tailleTableau];
        for (int i=0;i<tailleListe;i++){
            tableau2[i] = tableau[i];
        }
        tableau = tableau2;
    }
    public void set(int index,T contenue){
        if (index>=tailleListe){
            System.out.println("Il est impossible de remplacer dans cette position");
        }
        else if (index<tailleListe){
            tableau[index]=contenue;
        }
    }
    public T get(int index){
        return tableau[index];
    }
    public void remove(int index){
        if (index>=tailleListe){
            System.out.println("Il est impossible de supprimer dans cette position");
        }
        else if (index<tailleListe){
            for (int i=index;i<tailleListe;i++){
                if (i==(tailleListe-1)){
                    tableau[i]=null;
                    tailleListe--;
                }
                else{
                    tableau[i]=tableau[(i+1)];
                }
            }
        }
    }
    public void clear(){
        for (int i=0;i<tailleListe;i++){
            remove(0);
            if (i==(tailleListe-1)){
                tailleListe=0;
            }
        }
    }
    public int size(){
        return tailleListe;
    }
}
