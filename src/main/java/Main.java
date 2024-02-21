import java.util.List;

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


        // Crear una instancia de PrimeNumberDetector y encontrar los primeros 10 números primos
        PrimeNumberDetector primeNumberDetector = new PrimeNumberDetector();
        List<Integer> firstPrimes = primeNumberDetector.findFirstNPrimes(10);
        System.out.println("Los primeros 10 números primos son: " + firstPrimes);

        // Crear una instancia de ComplexProblemDecomposer y descomponer un número en factores primos
        ComplexProblemDecomposer complexProblemDecomposer = new ComplexProblemDecomposer();
        int numberToDecompose = 60; // Ejemplo de número a descomponer
        List<Integer> primeFactors = complexProblemDecomposer.decomposeIntoPrimeFactors(numberToDecompose);
        System.out.println("Los factores primos de " + numberToDecompose + " son: " + primeFactors);


        // Ejemplo de uso del planificador de tareas y visualizador de horarios
        TaskPlanner taskPlanner = new TaskPlanner();
        ScheduleVisualizer scheduleVisualizer = new ScheduleVisualizer();

        // Distribuir tareas y optimizar la carga de trabajo
        taskPlanner.distributeTasks();

        // Visualizar los horarios y las cargas de trabajo
        scheduleVisualizer.displaySchedule(taskPlanner.getTaskSchedule());


        SpaceNavigator spaceNavigator = new SpaceNavigator();
        TerrainSimulator terrainSimulator = new TerrainSimulator();
        RouteVisualizer routeVisualizer = new RouteVisualizer();

        // Calcular y visualizar rutas de exploración y expansión de la base
        int[][] terrainMap = terrainSimulator.generateTerrainMap();
        int[][] routeMap = spaceNavigator.calculateRoute(terrainMap);
        routeVisualizer.visualizeRoute(routeMap);


        // Ejemplo de uso del Comunicador Interplanetario
        InterplanetaryCommunicator communicator = new InterplanetaryCommunicator();

        // Ejemplo de envío y recepción de mensajes
        String messageToEarth = "Saludos desde la base en el planeta X";
        String receivedMessage = communicator.sendMessageToEarth(messageToEarth);
        System.out.println("Mensaje enviado a la Tierra: " + messageToEarth);
        System.out.println("Mensaje recibido de la Tierra: " + receivedMessage);

        String messageToBase = "Hola, ¿cómo están?";
        String receivedResponse = communicator.sendMessageToBase(messageToBase);
        System.out.println("Mensaje enviado a la base: " + messageToBase);
        System.out.println("Respuesta recibida de la base: " + receivedResponse);

        // Ejemplo de análisis de mensajes
        String message = "Able was I ere I saw Elba";
        System.out.println("Cantidad de vocales en el mensaje: " + communicator.countVowels(message));
        System.out.println("¿El mensaje es un palíndromo? " + communicator.isPalindrome(message));
        System.out.println("Mensaje invertido: " + communicator.reverseMessage(message));
    }
    }
    }
