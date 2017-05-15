import com.wei.spring.service.PersonService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.sql.SQLException;


/**
 * Created by WEI on 2017/5/15.
 */
public class JDBCTest {
    @Test
    public void addTest() throws SQLException {
        ApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonService personService=(PersonService)context.getBean("personService");
        personService.add("insert into person (name,age) values ('wei',21)");
    }

}
