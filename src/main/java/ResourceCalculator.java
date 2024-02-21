import java.util.Arrays;

public class ResourceCalculator {
    private int[] resourceConsumption; // Array para almacenar el consumo de recursos

    public ResourceCalculator(int[] resourceConsumption) {
        this.resourceConsumption = resourceConsumption;
    }

    public int calculateTotalConsumption() {
        int total = 0;
        for (int consumption : resourceConsumption) {
            total += consumption;
        }
        return total;
    }

    public double calculateAverageConsumption() {
        return calculateTotalConsumption() / (double) resourceConsumption.length;
    }

    public int calculateMinConsumption() {
        Arrays.sort(resourceConsumption);
        return resourceConsumption[0];
    }

    public int calculateMaxConsumption() {
        Arrays.sort(resourceConsumption);
        return resourceConsumption[resourceConsumption.length - 1];
    }

    // Otros métodos para calcular la predicción de necesidades futuras y generar estadísticas
}