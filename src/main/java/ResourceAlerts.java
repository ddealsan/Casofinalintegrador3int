public class ResourceAlerts {
    private int[] resourceLevels; // Array para almacenar los niveles de recursos

    public ResourceAlerts(int[] resourceLevels) {
        this.resourceLevels = resourceLevels;
    }

    public boolean isBelowThreshold(int threshold) {
        for (int level : resourceLevels) {
            if (level < threshold) {
                return true;
            }
        }
        return false;
    }

    // Otros métodos relacionados con la gestión de alertas de recursos
}