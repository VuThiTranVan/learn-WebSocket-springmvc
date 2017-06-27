package framgia.vn.edu.report.java.train.config;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan(basePackages = "framgia.vn.edu.report.java.train", excludeFilters = {
    @ComponentScan.Filter(value = Controller.class, type = FilterType.ANNOTATION),
    @ComponentScan.Filter(value = Configuration.class, type = FilterType.ANNOTATION)
})
public class AppConfig {

}
