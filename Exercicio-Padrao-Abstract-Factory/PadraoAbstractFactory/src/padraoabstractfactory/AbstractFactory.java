package padraoabstractfactory;
public interface AbstractFactory {
    AbstractPonto criaPonto();
    AbstractCirculo criaCirculo();
    AbstractRetangulo criaRetangulo();
    AbstractTriangulo criaTriangulo();
}
