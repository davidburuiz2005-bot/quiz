
        public class GestorPedidos {

    ItemMenu[] lista;
    int contador;

    public GestorPedidos() {
        lista = new ItemMenu[5];
        contador = 0;
    }

    public void agregar(ItemMenu item) {
        if (contador < lista.length) {
            lista[contador] = item;
            contador++;
        } else {
            System.out.println("No se pueden agregar mas cosas");
}
}

    public void agregarItemMenu() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agregarItemMenu'");
    }
}





