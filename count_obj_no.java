
class counting {
    static int count = 0;

    counting() {
        count++;
        // System.out.println(count);
    }

}

public class count_obj_no {
    public static void main(String[] args) {
    new counting();
    new counting();
    new counting();
        System.out.println(counting.count);
    }

}
