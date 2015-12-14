package ie.ittralee;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by t00185369 on 10/12/2015.
 */

public class Playlist{
    private List videos;
    
    private String playlistName;
    private String playlistDescription;
    private String playlistCategory;
    private int playlistLevel;
    private ArrayList<Media> playlistMedias;

    public Playlist(String playlistName,String playlistDescription, String playlistCategory, int playlistLevel){
        this.playlistName =playlistName;
        this.playlistDescription = playlistDescription;
        this.playlistCategory = playlistCategory;
        this.playlistLevel = playlistLevel;
        videos = new ArrayList();
    }
    
    public void addVideo(Media newMedia){
        videos.add(newMedia);
    }
    
    public Media getVideo(int videoId){

        for (Iterator i = videos.iterator(); i.hasNext(); ) {
            Media media = (Media)i.next();
            if (videoId == media.getMediaId()) {
                return media;
            }
        }
        return null;
    }

    public List search(Media searchMedia) {
        List matchingMedia = new LinkedList();

        for (Iterator i = videos.iterator(); i.hasNext(); ) {
            Media media = (Media) i.next();
            if (media.matches(searchMedia)) {
                matchingMedia.add(media);
            }
            return matchingMedia;
        }
        return null;
    }
}
