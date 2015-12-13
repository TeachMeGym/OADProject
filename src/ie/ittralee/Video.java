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

     public String getVideoId(){
        return videoId;
    }  
     
     public VideoSpec getSpec(){
         return spec;
     }
}
