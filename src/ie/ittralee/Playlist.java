package ie.ittralee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by t00185369 on 10/12/2015.
 */
public class Playlist{
    private String playlistName;
    private String playlistDescription;
    private String playlistCategory;
    private String playlistLevel;
    private ArrayList<Video> playlistVideos;

    public void Playlist(String nameP, String playlistD, String playlistC, String playlistL){

        List<Video> playlistVideos = new ArrayList<Video>();

        playlistName = nameP;
        playlistDescription = playlistD;
        playlistCategory = playlistC;
        playlistLevel = playlistL;
    }

    public String getPlaylistName(){
        return playlistName;
    }

    public String getPlaylistDescription(){
        return playlistDescription;
    }

    public String getPlaylistCategory(){
        return playlistCategory;
    }

    public String getPlaylistLevel(){
        return playlistLevel;
    }

    public ArrayList<Video> getPlaylistVideos(){
        return playlistVideos;
    }

    public void addVideo(Video video){
        playlistVideos.add(video);
    }
}
