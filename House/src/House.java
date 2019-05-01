import java.util.Date;

/**
 * introduction-java-programming-comprehensive-11th-global (Page 544)
 */
public class House implements Cloneable, Comparable<House> {
    private int id;
    private double area;
    private java.util.Date whenBuilt;

    public House(int id, double area) {
        this.id = id;
        this.area = area;
        whenBuilt = new Date();
    }

    public int getId() {
        return id;
    }

    public double getArea() {
        return area;
    }

    public Date getWhenBuilt() {
        return whenBuilt;
    }

    @Override
    /** Override the protected clone method defined in
     *  the Object class, and strengthen its accessibility */
    public Object clone() throws CloneNotSupportedException {
        // Perform a shallow copy
        House houseClone = new House(id, area);

        // Deep copy on whenBuilt
        houseClone.whenBuilt = new Date();
        houseClone.getWhenBuilt().setTime(whenBuilt.getTime());

        return houseClone;
    }

    @Override
    // Implement the compareTo method defined in Comparable
    public int compareTo(House o) {
        if (area > o.area) {
            return 1;
        } else if (area < o.area) {
            return -1;
        } else
            return 0;
    }

}