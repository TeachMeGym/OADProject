package  ie.ittralee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by t00185369 on 10/12/2015.
 */
public class Video{
    private String videoId;
    private String videoTitle, videoDescription, videoCategory;
    private int exerciseLevel;

    public Video(String videoId, String videoTitle, String videoDescription, String videoCategory, int exerciseLevel) {
         this.videoId = videoId;
         this.videoTitle = videoTitle;
         this.videoDescription = videoDescription;
         this.videoCategory =videoCategory;
         this.exerciseLevel = exerciseLevel; 
    }
 
  //  public void Video(String videoTitle, String videoDescription, String videoCategory, int exerciseLevel ){
      //  List<Video> playlistvideo = new ArrayList<Video>();
     // this.videoTitle = videoTitle;
     // this.videoCategory = videoDescription;
     // this.VideoCategory =videoCategory;
     // this.exerciseLevel = exerciseLevel;             
   // }

   public Video() {
        
    }

 
     public String getVideoId(){
        return videoId;
    }  
   
    public String getVideoTitle(){
        return videoTitle;
    }
    
     public void setVideoTitle(String title) {
    this.videoTitle = title;
     }
         
    public String getVideoDescription(){
        return videoDescription;
    }
    
     public void setVideoDescription(String desc) {
    this.videoDescription = desc;
     }

    public String getVideoCategory(){
        return videoCategory;
    }
    
    public void setVideoCategory(String category) {
    this.videoCategory = category;
     }

    public int getExerciseLevel(){
        return exerciseLevel;
    }
    
    public void setExerciseLevel(int level) {
    this.exerciseLevel = level;
     }
}
