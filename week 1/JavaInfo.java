// This program prints information about the Java runtime.
public class JavaInfo {
    public static void main(String[] args) {

        String version = System.getProperty("java.version");
        String javaHome = System.getProperty("java.home");
        String osName = System.getProperty("os.name");

        System.out.println("Java Version: " + version);
        System.out.println("Java Home: " + javaHome);
        System.out.println("Operating System: " + osName);
    }
}