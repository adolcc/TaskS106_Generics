package level1.exercise1;

public class NoGenericMethods {

    private Object item1;
    private Object item2;
    private Object item3;

    public NoGenericMethods(Object item1, Object item2, Object item3) {

        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;

    }

    public void setItem(int position, Object item) {

        switch (position) {

            case 1:
                this.item1 = item;
                break;
            case 2:
                this.item2 = item;
                break;
            case 3:
                this.item3 = item;
                break;
            default:
                System.out.println("Invalid position. Please choose 1, 2, or 3.");

        }
    }

    public Object getItem(int position) {

        switch (position) {
            case 1:
                return this.item1;
            case 2:
                return this.item2;
            case 3:
                return this.item3;
            default:
                System.out.println("Invalid position. Please choose 1, 2, or 3.");
                return null;

        }
    }
}