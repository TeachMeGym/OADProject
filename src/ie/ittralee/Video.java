package  ie.ittralee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by t00185369 on 10/12/2015.
 */
public class Video{
    private String videoId;
     
    VideoSpec spec; 

    public Video(String videoId, VideoSpec spec) {
         this.videoId = videoId;
         this.spec =spec;
         

    }

  //  public void Video(String videoTitle, String videoDescription, String videoCategory, int exerciseLevel ){
      //  List<Video> playlistvideo = new ArrayList<Video>();
     // this.videoTitle = videoTitle;
     // this.videoCategory = videoDescription;
     // this.VideoCategory =videoCategory;
     // this.exerciseLevel = exerciseLevel;             
   // }

    Video(String title, String desc, String category, int level) {
        
    }

     public String getVideoId(){
        return videoId;
    }  
     
     public VideoSpec getSpec(){
         return spec;
     }
}
