package  ie.ittralee;

/**
 * Created by t00185369 on 10/12/2015.
 */
public class Video{
    private static int countId =0;
    private int videoId;
    private String videoTitle;
    private String videoDescription;
    private Category category;
    private int exerciseLevel;
    private int ratings;

    public Video(String title, String desc, Category category, int level, int ratings) {
        setVideoId(++countId);
        this.videoTitle = title;
        this.videoDescription =desc;
        this.category = category;
        this.exerciseLevel=level;
        this.ratings=ratings;
    }

    public int getVideoId(){

        return videoId;
    }

    public void setVideoId(int index){

        this.videoId=index;
    }

    public String getVideoTitle(){
        return videoTitle;
    }


    public String getVideoDescription(){
        return videoDescription;
    }

    public Category getCategory(){
        return category;
    }

    public int getExerciseLevel(){
        return exerciseLevel;
    }

    public int getVideoRatings(){
        return ratings;
    }

    public boolean matches(Video otherVideo){

        if((otherVideo.getVideoTitle() != null) && (!otherVideo.getVideoTitle().equals("")) &&
                     (!videoTitle.toLowerCase().equals(otherVideo.videoTitle.toLowerCase())))
            return false;

        if((otherVideo.getVideoDescription() != null) && (!otherVideo.getVideoDescription().equals("")) &&
                     (!videoDescription.toLowerCase().equals(otherVideo.videoDescription.toLowerCase())))
            return false;

        if((otherVideo.getCategory() != null) && (category!=otherVideo.category))
            return false;

        if((otherVideo.getExerciseLevel() != 0) && (exerciseLevel!=otherVideo.getExerciseLevel()))
            return false;

        if((otherVideo.getVideoRatings() != 0) && (ratings!=otherVideo.getVideoRatings()))
            return false;

        return true;
    }
}
