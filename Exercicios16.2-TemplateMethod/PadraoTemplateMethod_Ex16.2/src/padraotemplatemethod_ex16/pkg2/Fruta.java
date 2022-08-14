package padraotemplatemethod_ex16.pkg2;
public abstract class Fruta {
    public void comer(){
        descascarFruta();
        saborFruta();
        jogarRestosFora();
    }
    public abstract void descascarFruta();
    public abstract void saborFruta();
    public void jogarRestosFora(){
        System.out.println("Jogando a casca e outros restos da fruta no lixo");
    }
    
    
}
