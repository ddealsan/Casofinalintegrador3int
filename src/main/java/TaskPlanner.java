
import java.util.HashMap;
import java.util.Map;

public class TaskPlanner {
    private Map<String, String> taskSchedule;

    public TaskPlanner() {
        this.taskSchedule = new HashMap<>();
    }

    public void distributeTasks() {
        // Aquí iría la lógica para distribuir y optimizar las tareas diarias
        // Por ejemplo, asignar tareas a cada miembro de la tripulación y calcular la carga de trabajo óptima
        // Esto podría implicar el cálculo del producto escalar entre los recursos y las tareas
        // También podrías ajustar las tareas en tiempo real según el rendimiento y disponibilidad de la tripulación
        // Por simplicidad, aquí solo agregamos algunas tareas de ejemplo al horario
        taskSchedule.put("Astronauta 1", "Realizar experimentos científicos");
        taskSchedule.put("Astronauta 2", "Conducir mantenimiento de la nave");
        taskSchedule.put("Astronauta 3", "Realizar reparaciones en la estación");
    }

    public Map<String, String> getTaskSchedule() {
        return taskSchedule;
    }
}