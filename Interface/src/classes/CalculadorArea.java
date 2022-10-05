package classes;

public class CalculadorArea {
    
    /**
     * Recebendo dois objetos
     * @param figuraA Primeiro Parametro
     * @param figuraB Segundo Parametro
     * @return retorna a variavel que está o "total"
     */
    public double somarAreas(FiguraGeometrica figuraA, FiguraGeometrica figuraB) {
        double areaTotal = figuraA.calcularArea() + figuraB.calcularArea();
        return areaTotal;
    }

}
