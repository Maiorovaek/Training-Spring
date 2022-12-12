package hello;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@EnableScheduling //гарантирует, что фоновые задачи создадуться
@Component
public class ScheduledTasks {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    //настраивает, когда конкретный метод будет запущен. С интервалом 5000 секунд,
    // начиная с момента начала работы каждого из вызовов этого метода
    public void reportCurrentTime(){
        System.out.println("The time is now " + dateFormat.format(new Date()));
    }
}
