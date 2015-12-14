package ie.ittralee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by t00185369 on 10/12/2015.
 */

public class GymMember{
    private String userEmail;
    private String userName;
    private int Weight;
    private List<Playlist> memberPlaylists;

    public GymMember(String userE, String userN, int W) {
        memberPlaylists = new ArrayList<Playlist>();
        userEmail=userE;
        userName=userN;
        Weight=W;
    }

    public String getUserEmail(){

        return userEmail;
    }

    public String getUserName(){

        return userName;
    }

    public int getWeight(){

        return Weight;
    }

    public List<Playlist> getMemberPlaylists(){

        return memberPlaylists;
    }

    public void createPlaylist(String playlistName, String playlistDescription,
                               String playlistCategory, int playlistLevel){

        Playlist newPlaylist = new Playlist(playlistName,playlistDescription,playlistCategory,playlistLevel);

        System.out.println("Do you want to do a new search ? (Y/N) \n ");
        Scanner scanner = new Scanner(System.in);
        String doSearch = scanner.nextLine();

        while (doSearch.compareTo("Y")==0) {

            Video searchVideo = inputSearchVideo();

            List<Video> search = VideoLibrary.search(searchVideo);

            int i = 0;

            for (Video video : search) {

                System.out.println("Insert this video ? (Y/N)\n");
                System.out.println(video.getVideoTitle());
                scanner = new Scanner(System.in);

                String answer = scanner.nextLine();
                String index = Integer.toString(i);

                if (answer == "Y") {
                    newPlaylist.addVideo(video);
                }
                i++;
            }

            System.out.println("Do a new search ? (Y/N) \n ");
            scanner = new Scanner(System.in);
            doSearch = scanner.nextLine();

        }

        memberPlaylists.add(newPlaylist);
    }

    public void search(Video gymMemberSearch){

        List matchingVideos = VideoLibrary.search(gymMemberSearch);

        if (!matchingVideos.isEmpty()) {
            System.out.println("Relative Video(s) " );

            for (Object matchingVideo : matchingVideos) {
                Video video = (Video) matchingVideo;
                System.out.println("Videos found" + "" + video.getVideoTitle() + ""
                        + video.getVideoDescription() + "" + "description"
                        + video.getCategory() + "" + "Category"
                        + video.getExerciseLevel() + "level"
                        + video.getVideoRatings() + "ratings");
            }
        } else {
            System.out.println("Sorry, Can't Find Video");
        }
    }

    public Video inputSearchVideo(){
        System.out.println("Enter your video title:\n ");
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();

        System.out.println("Enter your video description: \n");
        scanner = new Scanner(System.in);
        String description = scanner.nextLine();

        System.out.println("Enter your video category: \n");
        System.out.println("1  ARMS, 2 BACK, 3 CHEST, 4 LEGS, 5 SHOULDERS, 0 NONE");
        scanner = new Scanner(System.in);
        int categoryChoice = scanner.nextInt();

        Category category = null;

        if (categoryChoice == 1) {
            category = Category.ARMS;

        } else if (categoryChoice == 2) {
            category = Category.BACK;

        } else if (categoryChoice == 3) {
            category = Category.CHEST;

        } else if (categoryChoice == 4) {
            category = Category.LEGS;

        } else if (categoryChoice == 5) {
            category = Category.SHOULDERS;
        }else{
            category=null;
        }

        System.out.println("Enter your video level (0 for none)");
        scanner = new Scanner(System.in);
        int level = scanner.nextInt();

        System.out.println("Enter your video rating (0 for none) ");
        scanner = new Scanner(System.in);
        int ratings = scanner.nextInt();

        Video videoSpec = new Video(title, description, category, level,ratings);

        return videoSpec;
    }

}