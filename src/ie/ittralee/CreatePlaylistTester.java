/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.ittralee;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Sean Hayes
 */
public class CreatePlaylistTester {
    
    public static void main (String[] args){
        Playlist playlist = new Playlist();
    initializePlaylist(playlist);

    VideoSpec gymMemberSearch = new VideoSpec( "Olympic Bar Bench Press", "Proper Way to Bench Press", 
                                      Category.CHEST, 5);
    
    List matchingVideos = playlist.search(gymMemberSearch);
    if (!matchingVideos.isEmpty()) {
      System.out.println("Relative Video(s) " );
      for (Iterator i = matchingVideos.iterator(); i.hasNext();){
          Video video = (Video)i.next();
          VideoSpec spec = video.getSpec();
          System.out.println("Videos found" + "" +
          spec.getVideoTitle() + "" + spec.getVideoDescription() + "" + "description"
                  + spec.getCategory() + "" + "Category"
                  + spec.getExerciseLevel() + "level" );
      }
      
    } else {
      System.out.println("Sorry, Can't Find Video");
    }
  }

  private static void initializePlaylist(Playlist playlist)
  {
    playlist.addVideo("V1", new VideoSpec("Bicep Curl", "Video on Bicep workout", Category.ARMS, 5));
    playlist.addVideo("V2", new VideoSpec("leat Pull Down", "Back Work Out", Category.BACK, 4));
    playlist.addVideo("V3", new VideoSpec("Fly Pecs ", "Best way to Fly pec", Category.CHEST, 3));
    playlist.addVideo("V4", new VideoSpec("Leg Press","Increse your Reps", Category.LEGS, 4));
    playlist.addVideo("V5", new VideoSpec("Shoulder Raises","Maxiumise you Workout", Category.SHOULDERS, 4));

  }
   
}
