package java_8;
import java.util.Optional;

public class Optionalclassdemo {
    public static void main(String[] args) {
        Optional<String> name = Optional.ofNullable(null);

        System.out.println(name.orElse("Default Name"));
    }
}
