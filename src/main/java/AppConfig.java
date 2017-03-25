import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by fatimam on 21/03/2017.
 */
@Configuration
public class AppConfig
{
    @Bean(name="colourNameAndID")
    public ColourInterface getService()
    {
        return new ColourServiceImpl();
    }


}
