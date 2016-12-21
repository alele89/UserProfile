public class TestUtils {

    public static String readJsonSnippet(String path) {
        return IOUtils.toString(TestUtils.class.getClassLoader().getResourceAsStream(path));
    }

}