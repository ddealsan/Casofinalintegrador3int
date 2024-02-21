public class TerrainSimulator {
    public int[][] generateTerrainMap() {
        // Aquí iría la lógica para simular terrenos y obstáculos mediante matrices
        // Para planificar construcciones y optimizar rutas
        // Por simplicidad, aquí se genera un mapa de terreno aleatorio
        int[][] terrainMap = {
                {0, 0, 1, 1, 0},
                {0, 1, 0, 1, 0},
                {1, 0, 0, 0, 1},
                {1, 1, 0, 1, 1},
                {0, 0, 1, 0, 0}
        };
        return terrainMap;
    }
}