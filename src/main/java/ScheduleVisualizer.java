import java.util.Map;

public class ScheduleVisualizer {
    public void displaySchedule(Map<String, String> taskSchedule) {
        // Visualizar los horarios y las cargas de trabajo
        System.out.println("Horario de tareas:");
        for (Map.Entry<String, String> entry : taskSchedule.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}