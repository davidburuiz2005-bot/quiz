public class Bebida extends ItemMenu {
    
    private double volumen; // en ml

    public Bebida(String id, String nombre, double precio,  double volumen) {
        super(id, nombre, precio);
        this.volumen = volumen;
    }
    @Override
    public String obtenerDetalles() {
        String detallesBase = super.obtenerDetalles();
        return detallesBase + "| Volumen: " + volumen + "ml";
    }
}