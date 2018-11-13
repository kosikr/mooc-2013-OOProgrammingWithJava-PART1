
public class Reformatory {

    private int measuredTimes;

    public int weight(Person person) {
        // return the weight of the person
        measuredTimes++;
        return person.getWeight();
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);

    }

    public int totalWeightsMeasured() {
        return measuredTimes;

    }
}
