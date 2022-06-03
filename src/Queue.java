import java.util.ArrayList;

public class Queue <T>{
    private final int POSICION_INICIO = 0;
    private ArrayList<T> colletion = new ArrayList<T>();

    public void enqueue(T element){
        colletion.add(element);
    }


    public T dequeue(){
        return colletion.remove(POSICION_INICIO);
    }

    public void mostrar(){
        for (int i = 0; i <colletion.size() ; i++) {
            System.out.println("Documento: " + ( i + 1 ) + " " + colletion.get(i));
        }
    }

    public int getLength() {
        return colletion.size();
    }

    @Override
    public String toString() {
        String out = "Top -> ";
        for (T element: colletion) {
            out += element.toString() + " | ";
        }
        return out;

    }
}
