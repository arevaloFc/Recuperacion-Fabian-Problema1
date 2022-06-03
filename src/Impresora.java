public class Impresora {
    private String name;
    private Queue<Documento> documentos = new Queue<Documento>();


    public Impresora(String name) {
        this.name = name;
    }

    public void addDocumento(String nombre, String tamanio) {
        documentos.enqueue(Documento.generateDocumento(nombre,tamanio));
    }

    public void mostrar(){
        documentos.mostrar();
    }

    public void eliminarDocumentos() {
        int lista = documentos.getLength();
        for (int i = 0; i < lista; i++) {
            documentos.mostrar();
            System.out.println("----------------");
            documentos.dequeue();
        }
    }


}
