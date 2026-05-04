package WildLifeDataTracker;

public class WildlifeTrack {
    private int trackID;
    private String animalName;
    private String rangerName;
    private int activityScore;

    //constructors
    public WildlifeTrack() {
        this.trackID = 234;
        this.animalName = "Zebra";
        this.rangerName = "Usman";
        this.activityScore = 4;
    }

    public WildlifeTrack(int trackID, String animalName, String rangerName, int activityScore) {
        if ((trackID < 0) || (activityScore < 0) || (animalName == null) || (rangerName == null)) {
            System.out.println("Invalid input...");
        }
        else {
        this.trackID = trackID;
        this.animalName = animalName;
        this.rangerName = rangerName;
        this.activityScore = activityScore;}
    }

    //getters
    public int getTrackID() {
        return trackID;
    }
    public String getAnimalName() {
        return animalName;
    }
    public String getRangerName() {
        return rangerName;
    }
    public int getActivityScore() {
        return trackID;
    }

    //setters
    public void setTrackID(int trackID){
        if(trackID < 0){
            System.out.println("Invalid input...");
        }
        else {
        this.trackID = trackID;}
    }
    public void setAnimalName(String animalName){
        if(animalName == null){
            System.out.println("Invalid input...");
        }
        else {
        this.animalName = animalName;}
    }
    public void setRangerName(String rangerName){
        if(rangerName == null){
            System.out.println("Invalid input...");
        }
        else {
        this.rangerName = rangerName;}
    }
    public void setActivityScore(int activityScore){
        if(activityScore < 0){
            System.out.println("Invalid input...");
        }
        else {
        this.activityScore = activityScore;}
    }

    //methods
    public void display(){
        System.out.println();
        System.out.println("-----Tracking ID " + getTrackID() + "-----");
        System.out.println("Animal: " + getAnimalName());
        System.out.println("Ranger: " + getRangerName());
        System.out.println("Activity Score: " + getActivityScore());
    }
    
    

}
