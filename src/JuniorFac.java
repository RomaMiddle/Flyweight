import java.util.HashMap;
import java.util.Map;

public class JuniorFac {
    private static final Map<String, Junior> juniors = new HashMap<>();

    public Junior getJuniorBySpecialty(String specialty){
        Junior junior = juniors.get(specialty);

        if (junior == null){
            switch (specialty){
                case "java":
                    System.out.println("Hiring Java junior");
                    junior = new JavaJunior();
                    break;
                case "python":
                    System.out.println("Hiring Python junior");
                    junior = new PythonJunior();
            }
            juniors.put(specialty, junior);
        }
        return junior;
    }
}
