public class Documento {
    private String nombre;
    private String tamaño;

    public Documento(String nombre, String tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
    }

    public static Documento generateDocumento(String nombre, String tamaño) {
        return new Documento(nombre, tamaño);
    }

    @Override
    public String toString() {
        return "Product{" +
                "nombre='" + nombre + '\'' +
                ", tamaño=" + tamaño +
                '}';
    }

}
