package ie.ittralee;

import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by t00185369 on 10/12/2015.
 */

public class Playlist{
    private List videos;
    
   /* private String playlistName;
    private String playlistDescription;
    private String playlistCategory;
    private String playlistLevel;
    private ArrayList<Video> playlistVideos;*/

    public Playlist(){
        videos = new ArrayList();
    }
    
    public void addVideo(String videoId, String title,String desc, String category, int level){
        Video video = new Video (videoId, title, desc, category,level);
                              
    videos.add(video);
        //List<Video> playlistVideos = new ArrayList<Video>();

       // playlistName = namePlaylist;
       // playlistDescription = playlistDescription;
       // Category = Category;
      //  playlistLevel = exerciseLevel;
    }
    
   public Video getVideo(String videoId){
        for (Iterator i = videos.iterator(); i.hasNext(); ) {
      Video video = (Video)i.next();
      if (video.getVideoTitle().equals(videoId)) {
        return video;
      }
    }
    return null;
    }
  
public Video search(Video searchVideo){

    for (Iterator i = videos.iterator(); i.hasNext(); ) {
      Video video = (Video)i.next();
      String title = searchVideo.getVideoTitle();
      if ((title != null) && (!title.equals("")) &&
          (!title.equals(video.getVideoTitle())))
        continue;
      String desc = searchVideo.getVideoDescription();
      if ((desc != null) && (!desc.equals("")) &&
          (!desc.equals(video.getVideoDescription())))
        continue;
      String category = searchVideo.getVideoCategory();
      if ((category != null) && (!category.equals("")) &&
          (!category.equals(video.getVideoCategory())))
        continue;   
      /* int level = searchVideo.getExerciseLevel();
      if ((level != null) && (!level.equals("")) &&
          (!category.equals(video.getExerciseLevel())))
        continue; */
    return video;
    }
    return null;
}
   
}
