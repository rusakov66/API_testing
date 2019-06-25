import org.junit.jupiter.api.Test;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ApiTestWithJackson {
    @Test
    public void getRequestFromGithubTest() throws ParseException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectMapper mapper2 = new ObjectMapper();
        ApiStructure a = new ApiStructure();
        mapper.writeValue(new File("target/Api.json"), a); // write instance into file
        ApiStructure b = mapper.readValue(new URL("https://api.github.com/users/rusakov66"), ApiStructure.class); //read api responce into var
        System.out.println(b.login + "*******************");
        assertThat(b.login, is("rusakov667"));
        assertThat(b.node_id, is("MDQ6VXNlcjE2NzA1Mzk4"));
    }
}
