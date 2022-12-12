import hello.ScheduledTasks;
import org.springframework.boot.SpringApplication;

// печатать текущее время каждые пять секунд
// при помощи использования Spring-аннотации @Scheduled
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(ScheduledTasks.class, args);
    }
}
