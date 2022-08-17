package Island;

public class Island {

    //Пока здесь закидываем координаты
    public final int length;
    public final int width;
    private final Location[][] location;

    public Island(int length, int windth) {
        this.length = length;
        this.width = windth;
        this.location = new Location[length][width];
    }

    public void initialize() {
        for (int i = 0; i < location.length; i++) {
            for (int j = 0; j < location[i].length; j++) {
                location[i][j] = new Location();
            }
        }
    }
}
