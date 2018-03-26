package Collection;

/**
 * Created by BelSi1731422 on 2018-03-19.
 */
public class LinkedList<T> implements List<T> {

    private Node head;
    private Node tail;
    private int tailleListe=0;

    public void add(T contenue){
        if (tailleListe==0){
            tail=new Node(contenue);
            head=tail;
        }
        else if (tailleListe!=0){
            Node newNode = new Node(contenue);
            tail.setNext(newNode);
            tail=newNode;

        }
        tailleListe++;
    }
    public void add(int index,T contenue){
        int i=0;
        if (index>tailleListe||index<0){
            System.out.println("Il est impossible de créer dans cette position");
        }
        else if (index==tailleListe){
            add(contenue);
        }
        else if (index<tailleListe){
            Node avant = head;
            while(i<index-1){
                avant=avant.getNext();
                i++;
            }
            Node apres = avant.getNext();
            avant.setNext(new Node(contenue));
            avant.getNext().setNext(apres);
        }
        tailleListe++;
    }
    public void remove(int index){
        int i=0;
        if (index==0){
            head=head.getNext();
        }
        else if (index>tailleListe){
            System.out.println("Il est impossible de créer dans cette position");
        }
        else if (index==tailleListe){
            Node avant = head;
            while(i<index-1){
                avant=avant.getNext();
                i++;
            }
            avant.setNext(null);
            tail=avant;
        }
        else if (index<tailleListe){
            Node avant = head;
            while(i<index-1){
                avant=avant.getNext();
                i++;
            }
            Node apres = avant.getNext();
            avant.setNext(apres.getNext());
            apres.setNext(null);
            apres.setContenu(null);
        }
        tailleListe--;
    }
    public T get(int index){
        int i=0;
        if (index>=tailleListe||index<0){
            System.out.println("Il est impossible de créer dans cette position");
            return null;
        }
        else{
            Node node = head;
            while(i<index){
                node=node.getNext();
                i++;
            }
            return (T)node.getContenu();
        }
    }
    public void set(int index,T contenu){
        int i=0;
        if (index>tailleListe){
            System.out.println("Il est impossible de créer dans cette position");
        }
        else if (index==tailleListe){
            add(index, contenu);
        }
        else{
            Node node = head;
            while(i<index){
                node=node.getNext();
                i++;
            }
            node.setContenu(contenu);
        }
    }
    public void clear(){
        tailleListe=0;
    }
    public int size(){
        return tailleListe;
    }
}
