public class RouteVisualizer {
    public void visualizeRoute(int[][] routeMap) {
        // Aquí iría la lógica para visualizar las rutas calculadas
        // Por simplicidad, aquí solo se imprime el mapa de rutas en la consola
        System.out.println("Mapa de rutas:");
        for (int[] row : routeMap) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}