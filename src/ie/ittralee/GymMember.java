package ie.ittralee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by t00185369 on 10/12/2015.
 */

public class GymMember{
    private String userEmail;
    private String userName;
    private int Weight;
    private List<Playlist> memberPlaylist;

    private List<Video> videosLibrary;

    private VideoLibrary library;

    public void GymMember(String userE, String userN, int nbF, int W){
        List<Playlist> memberPlaylist = new ArrayList<Playlist>();
        userEmail=userE;
        userName=userN;
        Weight=W;

        videosLibrary= VideoLibrary.getVideos();
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

    public List<Playlist> getMemberPlaylist(){
        return memberPlaylist;
    }

    public void createPlaylist(){

    }

    public void search(){

    }
}