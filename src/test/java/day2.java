import org.testng.annotations.*;



public class day2 {


@Parameters({"URL"})
@Test
public void aFastTest(String url) {
    System.out.println(url);
}}