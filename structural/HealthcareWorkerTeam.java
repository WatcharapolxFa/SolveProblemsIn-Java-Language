
import java.util.ArrayList;
import java.util.List;

public class HealthcareWorkerTeam implements HealthcareServiceable{

    private List<HealthcareServiceable> Listheal = new ArrayList<HealthcareServiceable>();
    @Override
    public void service() {
        for(HealthcareServiceable item : Listheal){
            item.service();
        }
    }

    @Override
    public double getPrice() {
        int totalPrice = 0;
        for(HealthcareServiceable item : Listheal){
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public void addMember(HealthcareServiceable Member){
        Listheal.add(Member);
    }

    public void removeMember(HealthcareServiceable Member){
        Listheal.remove(Member);
    }

}
