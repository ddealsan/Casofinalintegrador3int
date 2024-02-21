public class CosmicClock {
    private TimeConverter timeConverter;

    public CosmicClock(TimeConverter timeConverter) {
        this.timeConverter = timeConverter;
    }

    public void displayTime() {
        double earthTime = 1000; // Tiempo en la Tierra en segundos
        double planetTime = timeConverter.convertEarthToPlanetTime(earthTime);
        System.out.println("Tiempo en el nuevo planeta: " + planetTime + " segundos");

        double convertedBackToEarthTime = timeConverter.convertPlanetToEarthTime(planetTime);
        System.out.println("Tiempo convertido de regreso a la Tierra: " + convertedBackToEarthTime + " segundos");
    }
}