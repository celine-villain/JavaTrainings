package academy.learnprogramming;

public abstract class ListItem {
    protected ListItem previousItem = null;
    protected ListItem nextItem = null;

    protected Object value;

    //constructor
    public ListItem(Object value) {
        this.value = value;
    }

    //moves
    abstract ListItem next();
    abstract ListItem setNext(ListItem item);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item);
    abstract int compareTo(ListItem item);

    //getter & setter for value

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
