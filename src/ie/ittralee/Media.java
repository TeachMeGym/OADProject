package  ie.ittralee;

/**
 * Created by t00185369 on 10/12/2015.
 */
public class Media {
    private static int countId =0;
    private int mediaId;
    private String mediaTitle;
    private String mediaDescription;
    private Category mediaCategory;
    private int exerciseLevel;
    private int mediaRatings;

    public Media(String title, String desc, Category mediaCategory, int level, int ratings) {
        setMediaId(++countId);
        this.mediaTitle = title;
        this.mediaDescription =desc;
        this.mediaCategory = mediaCategory;
        this.exerciseLevel=level;
        this.mediaRatings =ratings;
    }

    public int getMediaId(){

        return mediaId;
    }

    public void setMediaId(int index){

        this.mediaId =index;
    }

    public String getMediaTitle(){
        return mediaTitle;
    }


    public String getMediaDescription(){
        return mediaDescription;
    }

    public Category getMediaCategory(){
        return mediaCategory;
    }

    public int getExerciseLevel(){
        return exerciseLevel;
    }

    public int getVideoRatings(){
        return mediaRatings;
    }

    public boolean matches(Media otherMedia){

        if((otherMedia.getMediaTitle() != null) && (!otherMedia.getMediaTitle().equals("")) &&
                     (!mediaTitle.toLowerCase().equals(otherMedia.mediaTitle.toLowerCase())))
            return false;

        if((otherMedia.getMediaDescription() != null) && (!otherMedia.getMediaDescription().equals("")) &&
                     (!mediaDescription.toLowerCase().equals(otherMedia.mediaDescription.toLowerCase())))
            return false;

        if((otherMedia.getMediaCategory() != null) && (mediaCategory != otherMedia.mediaCategory))
            return false;

        if((otherMedia.getExerciseLevel() != 0) && (exerciseLevel!= otherMedia.getExerciseLevel()))
            return false;

        if((otherMedia.getVideoRatings() != 0) && (mediaRatings != otherMedia.getVideoRatings()))
            return false;

        return true;
    }
}
