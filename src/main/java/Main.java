public class Main {
    public static void main(String[] args) {
        // Parte 1: Cronómetro Cósmico
        TimeConverter timeConverter = new TimeConverter();
        CosmicClock cosmicClock = new CosmicClock(timeConverter);
        cosmicClock.displayTime();

        // Parte 2: Recursos y Suministros
        int[] resourceConsumption = {10, 15, 20, 25, 30}; // Ejemplo de consumo de recursos
        int[] resourceLevels = {100, 90, 80, 70, 60}; // Ejemplo de niveles de recursos

        // Crear una instancia de ResourceCalculator y realizar cálculos y estadísticas
        ResourceCalculator calculator = new ResourceCalculator(resourceConsumption);
        int totalConsumption = calculator.calculateTotalConsumption();
        double averageConsumption = calculator.calculateAverageConsumption();
        int minConsumption = calculator.calculateMinConsumption();
        int maxConsumption = calculator.calculateMaxConsumption();

        // Crear una instancia de ResourceAlerts y gestionar alertas de recursos
        ResourceAlerts alerts = new ResourceAlerts(resourceLevels);
        boolean isBelowThreshold = alerts.isBelowThreshold(70);

        // Mostrar los resultados de la parte de Recursos y Suministros
        System.out.println("\n-- Recursos y Suministros --");
        System.out.println("Total de consumo de recursos: " + totalConsumption);
        System.out.println("Consumo promedio de recursos: " + averageConsumption);
        System.out.println("Consumo mínimo de recursos: " + minConsumption);
        System.out.println("Consumo máximo de recursos: " + maxConsumption);
        System.out.println("¿Los niveles de recursos están por debajo del umbral seguro? " + isBelowThreshold);
    }
}