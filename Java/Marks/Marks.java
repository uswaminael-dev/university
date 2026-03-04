package Marks;

public class Marks {
    private int biology;
    private int chemistry;
    private int physics;

    //CONSTRUCTORS
    public Marks(){
        biology = 46;
        physics = 34;
        chemistry = 23;
    }

    public Marks(int biology , int chemistry , int physics){
        if(biology<=50 && biology >=0){
        this.biology = biology;}
        else{ System.exit(0);}
        if(chemistry<=50 && chemistry >=0){
        this.chemistry = chemistry;}
        else{ System.exit(0);}
        if(physics<=50 && physics >=0){
        this.physics = physics;}
        else{ System.exit(0);}
        
    }


    //GETTERS
    public int getBiology(){
        return biology;
    }
    public int getPhysics(){
        return physics;
    }
    public int getChemistry(){
        return chemistry;
    }


    //SETTERS
    public void setBiology(int biology){
        if(biology<=50 && biology>=0){
            this.biology = biology;
        }
        else{System.exit(1);}
    }

    public void setPhysics(int physics){
        if(physics<=50 && physics>=0){
            this.physics = physics;
        }
        else{System.exit(1);}
    }

    public void setChemistry(int chemistry){
        if(chemistry<=50 && chemistry>=0){
            this.chemistry = chemistry;
        }
        else{System.exit(1);}
    }

    //DISPLAY METHOD
    public void display(){
        System.out.println("Biology : " + biology );
        System.out.println("Physics : " + physics );
        System.out.println("Chemistry : " + chemistry );
    }

}
