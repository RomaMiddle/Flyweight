import java.util.ArrayList;
import java.util.List;

public class ProdClient {
    public static void main(String[] args) {
      JuniorFac juniorFac = new JuniorFac();
      List<Junior> juniors = new ArrayList<>();

        juniors.add(juniorFac.getJuniorBySpecialty("java"));
        juniors.add(juniorFac.getJuniorBySpecialty("java"));
        juniors.add(juniorFac.getJuniorBySpecialty("java"));
        juniors.add(juniorFac.getJuniorBySpecialty("java"));
        juniors.add(juniorFac.getJuniorBySpecialty("java"));
        juniors.add(juniorFac.getJuniorBySpecialty("java"));
        juniors.add(juniorFac.getJuniorBySpecialty("java"));
        juniors.add(juniorFac.getJuniorBySpecialty("python"));
        juniors.add(juniorFac.getJuniorBySpecialty("python"));
        juniors.add(juniorFac.getJuniorBySpecialty("python"));
        juniors.add(juniorFac.getJuniorBySpecialty("python"));
        juniors.add(juniorFac.getJuniorBySpecialty("python"));


        for (Junior junior: juniors){
            junior.writeCode();
        }
    }
}
