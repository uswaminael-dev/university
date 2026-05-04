package WildLifeDataTracker;

public class WildlifeDataManager {
    private int averageScore =0;
    WildlifeTrack[] tracks = new WildlifeTrack[100];


    
    //adding a new tracking record
    public void addTrack(WildlifeTrack track) {
        
        for (int i = 0; i < tracks.length; i++) {
            if (tracks[i] == null) {
                tracks[i] = track;
                break;
            }
        }
    }
    
    


    //removing a track record
    public void removeTrack(int trackID){
    for(int i=0 ; i<tracks.length ; i++){
        if((tracks[i].getTrackID() == trackID) && (tracks[i]!=null)){
            tracks[i] = tracks[i+1];
            break;}
    }

    for(int i=0 ; i<tracks.length ; i++){
        if(tracks[i]!= null){
            System.out.println("Track ID " + tracks[i].getTrackID() + " removed...");
        }
    }


}


    //calculating and returning average activity score
    public int calculateAverage(WildlifeDataManager data){
        for(int i=0 ; i<tracks.length ; i++){
            if(tracks[i]!= null){
                averageScore = averageScore + tracks[i].getActivityScore();
            }
            System.out.println("Average activity score is " + averageScore);
            return averageScore ;

        }
        return averageScore;
    }

    public int highestActivityScore(WildlifeDataManager data){
        int highestScore = 0;
        for(int i=0 ; i<tracks.length ; i++){
            if(tracks[i]!= null){
                if(tracks[i].getActivityScore() > highestScore){
                    highestScore = tracks[i].getActivityScore();
                }
            }
        }
        System.out.println("Highest activity score is " + highestScore);
        return highestScore;
    }

    //displaying all the tracking records
    public void displayAllTracks(){
        for(int i=0 ; i<tracks.length ; i++){
            if(tracks[i]!= null){
                tracks[i].display();
            }
        }
    }



}
