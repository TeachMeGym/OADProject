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
        MediaLibrary.setLibrary();
        initializeLibrary();

        GymMember newGymMember = new GymMember("gymMember@gmail.com", "bob",70);

        newGymMember.createPlaylist("Bench press","Different way to use the bensh press","Fat burn",5);
    }

  private static void initializeLibrary() {
      MediaLibrary.addVideo(new Media("Bicep Curl", "Bicep Curl", Category.ARMS, 5,1));
      MediaLibrary.addVideo(new Media("leat Pull Down", "Back Work Out", Category.BACK, 4,5));
      MediaLibrary.addVideo(new Media("Fly Pecs ", "Best way to Fly pec", Category.CHEST, 3,2));
      MediaLibrary.addVideo(new Media("Leg Press", "Increase your Reps", Category.LEGS, 4,3));
      MediaLibrary.addVideo(new Media("Shoulder Raises", "Maximise you Workout part1", Category.SHOULDERS, 4,4));
      MediaLibrary.addVideo(new Media("Shoulder Raises2", "Maximise you Workout part2", Category.SHOULDERS, 4,2));
  }
}
