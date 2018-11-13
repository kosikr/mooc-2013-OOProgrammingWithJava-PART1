
public class Reformatory {

    private int measuredTimes;
    
    public Reformatory() {
        this.measuredTimes = 0;
    }

    public int weight(Person person) {
        // return the weight of the person
        this.measuredTimes++;
        return person.getWeight();
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);

    }

    public int totalWeightsMeasured() {
        return measuredTimes;

    }
}
