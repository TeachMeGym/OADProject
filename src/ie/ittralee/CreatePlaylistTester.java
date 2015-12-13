/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.ittralee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static ie.ittralee.VideoLibrary.*;

/**
 *
 * @author Sean Hayes
 */
public class CreatePlaylistTester {
    
    public static void main (String[] args) {
        VideoLibrary.setLibrary();
        initializeLibrary();

        VideoSpec gymMemberSearch = new VideoSpec("Bicep Curl", null, Category.ARMS, 5);

        GymMember newGymMember = new GymMember("gymMember@gmail.com", "bob",70);

        newGymMember.createPlaylist("Bench press","Different way to use the bensh press","Fat burn",5);

    }

  private static void initializeLibrary() {
      VideoLibrary.addVideo("V1", new VideoSpec("Bicep Curl", "Bicep Curl", Category.ARMS, 5));
      VideoLibrary.addVideo("V2", new VideoSpec("leat Pull Down", "Back Work Out", Category.BACK, 4));
      VideoLibrary.addVideo("V3", new VideoSpec("Fly Pecs ", "Best way to Fly pec", Category.CHEST, 3));
      VideoLibrary.addVideo("V4", new VideoSpec("Leg Press", "Increase your Reps", Category.LEGS, 4));
      VideoLibrary.addVideo("V5", new VideoSpec("Shoulder Raises", "Maximise you Workout part1", Category.SHOULDERS, 4));
      VideoLibrary.addVideo("V6", new VideoSpec("Shoulder Raises2", "Maximise you Workout part2", Category.SHOULDERS, 4));
  }
}
