package WildLifeDataTracker;

public class Runner {
    public static void main(String[] args) {
        WildlifeTrack track1 = new WildlifeTrack();
        track1.display();
        WildlifeTrack track2 = new WildlifeTrack(256 , "Giraffee" , "Umer" , 10);
        track2.display();
        WildlifeTrack track3 = new WildlifeTrack(298 , "Giraffee" , "Umer" , 10);
        track3.display();

        WildlifeDataManager data1 = new WildlifeDataManager();
        data1.addTrack(track1);
        data1.addTrack(track2);
        data1.addTrack(track3);

        data1.removeTrack(track2.getTrackID());
        System.out.println(data1.calculateAverage(data1));
        data1.displayAllTracks();
        data1.highestActivityScore(data1);





    }


}
