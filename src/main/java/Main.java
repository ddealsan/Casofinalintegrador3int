public class Main {
    public static void main(String[] args) {
        // Crear una instancia de TimeConverter
        TimeConverter timeConverter = new TimeConverter();

        // Crear una instancia de CosmicClock pasando la instancia de TimeConverter
        CosmicClock cosmicClock = new CosmicClock(timeConverter);

        // Llamar a métodos de CosmicClock para mostrar el tiempo en diferentes formatos
        cosmicClock.displayTime();
    }
}