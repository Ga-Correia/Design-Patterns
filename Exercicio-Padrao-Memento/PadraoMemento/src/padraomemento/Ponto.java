package padraomemento;
public class Ponto {
    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void mostraPonto(){
        System.out.println("Ponto: ("+x+", "+y+")");
    }
    public Memento createMemento(){
        return new Memento(x, y);
    }
    public void setMemento(Memento memento){
        this.x = memento.getSavedEstado_x();
        this.y = memento.getSavedEstado_y();
        System.out.println("Ponto anterior do Memento: ("+x+", "+y+")");
    }
    
    public static class Memento {
        private int estado_x;
        private int estado_y;

        public Memento(int x, int y){
            this.estado_x = x;
            this.estado_y = y;
        }
        public int getSavedEstado_x() {
            return estado_x;
        }

        public void setEstado_x(int x) {
            this.estado_x = x;
        }

        public int getSavedEstado_y() {
            return estado_y;
        }

        public void setEstado_y(int y) {
            this.estado_y = y;
        }
    }
}
