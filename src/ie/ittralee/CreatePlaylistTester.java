/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.ittralee;

/**
 *
 * @author 
 */
public class CreatePlaylistTester {
    
    public static void main (String[] args){
        Playlist playlist = new Playlist();
    initializePlaylist(playlist);

    Video search= new Video("V1", "Bench Press", "Prpoper Bench Press", 
                                      "Chest", 5);
    
    Video video = playlist.search(search);
    if (video != null) {
      System.out.println("Relative Video(s) \n" +
        video.getVideoTitle() +  " " + "Video:\n"+
        video.getVideoDescription() + " Description:\n   " +
        video.getVideoCategory() + " Category:\n   " +
        video.getExerciseLevel()+ " Level "); 
      if(search!=null){
          
          
          
      }
    } else {
      System.out.println("Sorry, Can't Find Video");
    }
  }

    
  private static void initializePlaylist(Playlist playlist) {
    playlist.addVideo("V1","Bench Press", "Prpoper Bench Press", "Chest", 5);
    playlist.addVideo("V2","Arm Curl", "Arm Curl Video", "Arms", 3);
    playlist.addVideo("V3","Shrugs", "Strenghten Neck and Shoulder", "Shoulders", 4);
    playlist.addVideo("V4","Seated Rows", "Seated Rows Technique", "Back", 5);
    playlist.addVideo("V5","leg Curl", "Maxiummise your leg workout", "Leg", 2);
  
  }
    
    
}
