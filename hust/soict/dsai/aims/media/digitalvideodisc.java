public class digitalvideodisc extends disc implements playable {
    public digitalvideodisc(int id, String title, String category, String director, int length, float cost) {
        super(id, title, category, cost, length, director);
    }
    
    @Override
    public void play() {
        if (getLength() > 0) {
            System.out.println("Playing DVD: " + getTitle());
            System.out.println("DVD Length: " + getLength());
        } else {
            System.out.println("ERROR: DVD length is invalid!");
        }
    }
}
