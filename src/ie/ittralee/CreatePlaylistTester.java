/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.ittralee;

/**
 *
 * @author Sean Hayes
 */
public class CreatePlaylistTester {
    
    public static void main (String[] args) {
        VideoLibrary.setLibrary();
        initializeLibrary();

        GymMember newGymMember = new GymMember("gymMember@gmail.com", "bob",70);

        newGymMember.createPlaylist("Bench press","Different way to use the bensh press","Fat burn",5);
    }

  private static void initializeLibrary() {
      VideoLibrary.addVideo(new Video("Bicep Curl", "Bicep Curl", Category.ARMS, 5,1));
      VideoLibrary.addVideo(new Video("leat Pull Down", "Back Work Out", Category.BACK, 4,5));
      VideoLibrary.addVideo(new Video("Fly Pecs ", "Best way to Fly pec", Category.CHEST, 3,2));
      VideoLibrary.addVideo(new Video("Leg Press", "Increase your Reps", Category.LEGS, 4,3));
      VideoLibrary.addVideo(new Video("Shoulder Raises", "Maximise you Workout part1", Category.SHOULDERS, 4,4));
      VideoLibrary.addVideo(new Video("Shoulder Raises2", "Maximise you Workout part2", Category.SHOULDERS, 4,2));
  }
}
